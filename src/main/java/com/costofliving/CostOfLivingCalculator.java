package main.java.com.costofliving;

import java.util.HashMap;
import java.util.Scanner;

public class CostOfLivingCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Double> costOfLivingIndex = CityData.getCostOfLivingIndex();

        // Ask user if they want to choose US or International
        System.out.println("Would you like to pick a US city or an international city? (Enter 'US' or 'International')");
        String locationType = scanner.nextLine().trim().toLowerCase();

        String currentCity;
        String currentRegion;
        if (locationType.equals("us")) {
            // Input current city and state abbreviation
            System.out.println("Enter your current city: ");
            currentCity = scanner.nextLine().trim();
            System.out.println("Enter your current state abbreviation (e.g., MI): ");
            currentRegion = scanner.nextLine().trim().toUpperCase();
            currentCity = formatCityRegion(currentCity, currentRegion);
        } else {
            // Input current international city and country abbreviation
            System.out.println("Enter your current city: ");
            currentCity = scanner.nextLine().trim();
            System.out.println("Enter your current country abbreviation (e.g., AU for Australia): ");
            currentRegion = scanner.nextLine().trim().toUpperCase();
            currentCity = formatCityRegion(currentCity, currentRegion);
        }

        // Get and clean salary input
        System.out.println("Enter your current annual salary: ");
        String salaryInput = scanner.nextLine();
        salaryInput = salaryInput.replaceAll("[$,]", ""); // Remove $ and , from salary

        double currentSalary = 0;
        try {
            currentSalary = Double.parseDouble(salaryInput);
        } catch (NumberFormatException e) {
            System.out.println("Invalid salary format. Please enter a numeric value.");
            return;
        }

        // Ask if the target city is in the US or International
        System.out.println("Is the city you want to move to a US city or international city? (Enter 'US' or 'International')");
        locationType = scanner.nextLine().trim().toLowerCase();

        String targetCity;
        String targetRegion;
        if (locationType.equals("us")) {
            // Input target city and state abbreviation
            System.out.println("Enter the city you want to move to: ");
            targetCity = scanner.nextLine().trim();
            System.out.println("Enter the target state abbreviation (e.g., CA): ");
            targetRegion = scanner.nextLine().trim().toUpperCase();
            targetCity = formatCityRegion(targetCity, targetRegion);
        } else {
            // Input target international city and country abbreviation
            System.out.println("Enter the city you want to move to: ");
            targetCity = scanner.nextLine().trim();
            System.out.println("Enter the target country abbreviation (e.g., AU for Australia): ");
            targetRegion = scanner.nextLine().trim().toUpperCase();
            targetCity = formatCityRegion(targetCity, targetRegion);
        }

        // Validate cities
        if (!costOfLivingIndex.containsKey(currentCity) || !costOfLivingIndex.containsKey(targetCity)) {
            System.out.println("Sorry, cost of living data for one of the cities is unavailable.");
            return;
        }

        // Calculate equivalent salary
        double currentCityIndex = costOfLivingIndex.get(currentCity);
        double targetCityIndex = costOfLivingIndex.get(targetCity);

        double equivalentSalary = calculateEquivalentSalary(currentSalary, currentCityIndex, targetCityIndex);

        System.out.printf("To maintain the same standard of living, you need to earn %.2f in %s, %s compared to your current salary of %.2f in %s, %s.%n",
                equivalentSalary, targetCity.split(",")[0], targetRegion, currentSalary, currentCity.split(",")[0], currentRegion);
    }

    // Method to calculate the equivalent salary (updated to be public)
    public static double calculateEquivalentSalary(double currentSalary, double currentCityIndex, double targetCityIndex) {
        return currentSalary * (targetCityIndex / currentCityIndex);
    }

    // Helper method to format city and region (state or country abbreviation)
    private static String formatCityRegion(String city, String region) {
        return city + ", " + region;
    }
}