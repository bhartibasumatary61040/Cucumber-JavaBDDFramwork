# Selenium Cucumber Java BDD Automation Framework

project:
  name: Selenium-Cucumber-Java-BDD-Framework
  description: >
    A scalable and maintainable Automation Testing Framework
    developed using Selenium WebDriver, Java, and Cucumber (BDD).
    This framework follows the Page Object Model (POM) design pattern
    and supports Behaviour Driven Development for better collaboration
    between technical and non-technical stakeholders.
    
#OBJECTIVE: >
  To build a structured and reusable automation framework
  using BDD approach that ensures readability, maintainability,
  and scalability for web application testing.

# Tech Stack

technology_stack:
  programming_language: Java
  automation_tool: Selenium WebDriver
  bdd_framework: Cucumber
  build_tool: Maven
  design_pattern: Page Object Model (POM)
 
Architecture:

  design_principle:
    - Separation of concerns
    - Reusability
    - Maintainability
    - Scalability

  execution_flow:
    - Feature File (Gherkin)
    - Step Definitions
    - Page Classes
    - WebDriver Actions
    - Hooks (@Before / @After)

# Project Structure:
  CucumberJavapro:

    src/test/java:

      StepDefinitions:
        purpose: >
          Contains implementation of Gherkin steps
          written in feature files.

      StepsForBackground:
        purpose: >
          Contains reusable background steps
          executed before scenarios.

      StepsForHooks:
        purpose: >
          Contains setup and teardown methods
          using Cucumber Hooks annotations.

      pages:
        purpose: >
          Page Object classes that store WebElements
          and reusable page methods.

      pagefactory:
        purpose: >
          Implements Selenium PageFactory
          for initializing WebElements.

    src/test/resources:
      purpose: >
        Contains feature files written in Gherkin
        language describing test scenarios.

    pom.xml:
      purpose: >
        Manages project dependencies and plugins
        using Maven.

# Key Features:
  - Behaviour Driven Development (BDD) implementation
  - Page Object Model architecture
  - Reusable Hooks for browser management
  - Clean and organized folder structure
  - Maven dependency management
  - Easy to extend and maintain
  - Structured separation between test logic and page logic

dependencies:

  - Selenium WebDriver
  - Cucumber Java
  - Cucumber JUnit / TestNG (if integrated)
  - WebDriverManager (if used)
  - Maven Surefire Plugin

# How To Execute :
  method_1:
    description: Run via IDE
    steps:
      - Import project as Maven Project
      - Update Maven dependencies
      - Run Cucumber Runner class

  method_2:
    description: Run via Maven command
    command: mvn clean test

# Benefits of This Framework:

  - Easy collaboration between QA and Business teams
  - Readable feature files for non-technical stakeholders
  - Reduced code duplication
  - High reusability
  - Scalable for enterprise-level projects

# Future Enhancements:
  - Integration with Extent Reports
  - Screenshot capture on failure
  - CI/CD integration (Jenkins/GitHub Actions)
  - Parallel execution support
  - Data-driven testing implementation
  - Cross-browser execution


