# Gurukula Selenium Cucumber Framework

## 🔍 About

A Java‑based Selenium + Cucumber test automation framework designed to validate the Gurukula demo application. Ideal for behavior-driven testing, it supports CRUD scenarios for the ComputerDB app—making your automated acceptance tests readable, reusable, and easy to maintain.

---

## ⚙️ Key Features

- **BDD style test cases**: Uses Cucumber with Gherkin syntax for clear, business-readable scenarios.
- **Selenium WebDriver**: Automates browser interactions for end-to-end UI validation.
- **Maven project setup**: Simple `mvn test` execution, with dependency and build management.
- **Page Object Model (POM)**: Modular, maintainable, and scalable test structure.
- **Cross-browser support**: Easily configure Chrome, Firefox, etc.

---

## 📋 Project Structure

Gurukula_Selenium_Cucumber/
├── src/
│ ├── main/java/ ← Page objects and helpers
│ └── test/java/ ← Step definitions
├── src/test/resources/
│ ├── features/ ← .feature files (Gherkin syntax)
│ └── config.properties ← Test settings (e.g. browser, base URL)
├── pom.xml ← Build and test dependencies
└── README.md ← You are here 😊


## 🚀 Getting Started

1. **Clone the repo**  
   ```bash
   git clone https://github.com/pranjaldayama/Gurukula_Selenium_Cucumber.git
   cd Gurukula_Selenium_Cucumber

   
2. **Configure settings**
Update config.properties for:
base.url (e.g. http://localhost:8080)
browser (e.g. chrome, firefox)

3. **Run Tests**
   mvn clean test

4. ✅ View results in test output or generated reports.
