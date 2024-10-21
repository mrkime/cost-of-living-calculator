# Cost of Living Calculator

## Description
This web application calculates equivalent salaries across US cities based on cost of living. It helps users estimate salary needs when relocating, featuring an intuitive UI, RESTful API, and comprehensive city data.

## Technologies Used
- Backend: Java Spring Boot
- Frontend: Bootstrap
- Build Tool: Maven

## Features
- Calculate equivalent salaries between two cities
- User-friendly interface for easy input and clear results
- Comprehensive database of US cities and their cost of living indices
- RESTful API for potential expansion and third-party use

## Setup
### Prerequisites
- Java JDK 11 or higher
- Node.js and npm
- Maven

### Backend Setup
1. Clone the repository:
   ```
   git clone https://github.com/yourusername/cost-of-living-calculator.git
   ```
2. Navigate to the project directory:
   ```
   cd cost-of-living-calculator
   ```
3. Install Maven dependencies:
   ```
   mvn install
   ```
4. Set up your database and update `application.properties` with your database credentials.
5. Run the Spring Boot application:
   ```
   mvn spring-boot:run
   ```

### Frontend Setup
1. Navigate to the frontend directory:
   ```
   cd frontend
   ```
2. Install npm packages:
   ```
   npm install
   ```
3. Start the React development server:
   ```
   npm start
   ```

## Usage
1. Open your browser and go to `http://localhost:8080` (or the port you've configured).
2. Enter your current city, state, and salary.
3. Enter your target city and state.
4. Click "Calculate" to see the equivalent salary in the target city.

## API Endpoints
- POST `/api/calculate`: Calculate equivalent salary
  - Request body: `{ "currentLocation": "City, State", "targetLocation": "City, State", "salary": 50000 }`
  - Response: `{ "equivalentSalary": 60000 }`

## Contributing
Contributions are welcome! Please feel free to submit a Pull Request.

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## License
This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details.

## Acknowledgments
- Data sources: [List your data sources for cost of living indices]
- Any libraries or tools you want to give credit to

## Contact
Andrew Kime - [@drewrkime](www.linkedin.com/in/drewrkime) - andrew@ETHYRA.org

Project Link: [https://github.com/yourusername/cost-of-living-calculator](https://github.com/yourusername/cost-of-living-calculator)
