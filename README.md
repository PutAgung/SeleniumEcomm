# Selenium E-commerce Automation Framework

This is a Selenium-based automation framework for e-commerce web testing using Java, JUnit, and Cucumber. The project is organized with a clear directory structure to facilitate maintainability and readability.

## Project Hierarchy

```bash
src
|-- main
|   |-- java
|   |   |-- app            # Application-specific code
|   |-- resources
|       |-- drivers         # Browser webdriver collections
|       |-- cucumber.properties # Additional Cucumber settings
|-- test
|   |-- java
|   |   |-- Config         # Browser setup configurations
|   |   |-- Features       # Cucumber feature files
|   |   |-- PageFactory    # Page Object Models (POM)
|   |   |-- Steps          # Cucumber step definitions
|   |   |-- Testrunner     # JUnit Test Runner
```

## Setup

1. **Clone the repository:**
```bash
git clone https://github.com/PutAgung/SeleniumEcomm.git
```

2. **Install Dependencies:**
Ensure you have Java and Maven installed. You can install dependencies by running:
```bash
mvn clean install
```

3. **Running Tests**
Use the following command to run the tests:
```bash
mvn test
```

4. **Configuration**
Adjust browser configurations in the Config package according to your needs. You may find the configuration file at 
```bash
src/test/java/config/WebDriverConfig.java.
```
5. **Reporting**
Cucumber reports are generated automatically after each test run. You can find the reports in the 
```bash
target/cucumber-reports directory.
```
