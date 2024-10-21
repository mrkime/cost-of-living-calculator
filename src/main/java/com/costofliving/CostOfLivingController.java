package main.java.com.costofliving;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import java.util.Map;
import java.util.HashMap;

// Add these imports
import main.java.com.costofliving.CityData;
import main.java.com.costofliving.CostOfLivingCalculator;

@RestController
@RequestMapping("/api")
public class CostOfLivingController {

    @PostMapping("/calculate")
    public ResponseEntity<?> calculateCostOfLiving(@RequestBody Map<String, Object> request) {
        String currentLocation = (String) request.get("currentLocation");
        String targetLocation = (String) request.get("targetLocation");
        double salary = Double.parseDouble(request.get("salary").toString());

        // Extract city and state/country
        String[] currentParts = currentLocation.split(", ");
        String[] targetParts = targetLocation.split(", ");

        String currentCity = formatCityRegion(currentParts[0], currentParts[1]);
        String targetCity = formatCityRegion(targetParts[0], targetParts[1]);

        double currentCityIndex = CityData.getCostOfLivingIndex().getOrDefault(currentCity, -1.0);
        double targetCityIndex = CityData.getCostOfLivingIndex().getOrDefault(targetCity, -1.0);

        if (currentCityIndex == -1.0 || targetCityIndex == -1.0) {
            Map<String, String> errorResponse = new HashMap<>();
            errorResponse.put("error", "One or both cities not found in our database.");
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponse);
        }

        double equivalentSalary = CostOfLivingCalculator.calculateEquivalentSalary(salary, currentCityIndex, targetCityIndex);

        Map<String, Object> response = new HashMap<>();
        response.put("equivalentSalary", equivalentSalary);
        response.put("currentCity", currentCity);
        response.put("targetCity", targetCity);

        return ResponseEntity.ok(response);
    }

    private String formatCityRegion(String city, String region) {
        return city + ", " + region.toUpperCase();
    }
}