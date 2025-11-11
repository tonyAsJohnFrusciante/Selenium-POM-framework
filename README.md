# Selenium TestNG Automation Framework

## Overview
This project is a **UI Test Automation Framework** built using **Selenium WebDriver**, **TestNG**, and **Maven**.  
It demonstrates modern automation testing practices, including Page Object Model (POM) design, reusable utilities, and clean test structure.

The purpose of this project is to **showcase practical knowledge of software testing and automation engineering**, including:
- Writing maintainable Selenium tests in Java  
- Structuring a project with Maven and TestNG  
- Executing tests across two websites ([DemoQA](https://demoqa.com/) and [SauceDemo](https://www.saucedemo.com)  

---

## Tech Stack

| Tool / Framework | Purpose |
|------------------|----------|
| **Java 21** | Programming language |
| **Selenium 4.36.0** | Web UI automation |
| **TestNG 7.10.2** | Test management and reporting |
| **Maven** | Build and dependency management |

---

## Project Structure

├── pom.xml # Maven configuration and dependencies

├── src/

│ ├── main/

│ │ ├── java/

│ │ │ └── com/

│ │ │ └── utilities/ # Helper classes, base setup, screenshot logic, page objects

│ │ └── resources/ # Configuration files

│ └── test/

│ └── java/

│ └── com/

│ ├── demoqa/ # Test cases for DemoQA website

│ └── saucedemo/ # Test cases for SauceDemo website

├── .gitignore

└── README.md

---

## How to Run Tests

mvn clean test
