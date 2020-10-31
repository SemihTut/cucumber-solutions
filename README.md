
# README 
​
Hi!
this is the readme file of the *Visma Solutions - test automation challenge.*  I have automated the API.  
​
## Overview
This project is designed for API automation testing totally suitable for CI/CD process in Jenkins and parallel testing. The framework is setup on Maven build tool, therefore all the dependency and libraries are managed through pom.xml file. I used Java as a programming language (including OOP and Collections), Selenium as a Webdriver, Cucumber BDD, Gherkin language, Cucumber-Junit for Assertions, Cucumber HTML reporting and surefire plugin. All the details of the Framework(FW) will be explained  below.
​
## Short intro and benefits
I can describe my framework as **easy to maintain, scalable and highly reusable** because of the following reasons:
- I am using **Page Object Model**, which separates test scripts and web element locators. By that way even if there is a change in a web element which is used in many places, I am changing it in a central one place.  
- I am using **Configuration Properties** files so that all the system variable are in central place. Thus, changing an url or credential in overall system is quite easy.
- It has **highly reusable** because of Cucumber scenario methods. tha same method can be used for many test cases.  Write once and use it many times. (see my step definitions and feature files.)
- I am separating locators, data, features and test scripts. Hence it is very **scalable**. The framework that I prepared can be used even thousands of data or test cases.
- Thanks to the **singleton pattern** and **driver pool** structures that I used in my framework, I can run *regular tests, parallel tests, as well as cross browser/cross platform tests (including web, mobile, remote and parallel)*
- By adding necessary dependencies I can test **front-end and back-end** simultaneously (i.e. comparison of all UI, API and DB values ) through JDBC and REST Assured libraries.
​
#### p.s. : you can see explanations of each classes in the project too
​
## Reports and screenshots
> In the **HTML_Cucumber_Report** folder, you can see the detailed report and failed test cases *screenshots* under the hooks tab. I left few failing test cases to show you the reports.
​
####Test RUN
Notes: To run all Scenarios, use @anyTag tag in the CukesRunner class/Cucumber Options

1. Way:
Clone the projects
Import maven dependencies from POM
Go src -> test > java > runners > CukesRunner and RUN
To generate "HTML Maven Cucumber Report" ;
Open Maven right side panel Double Click Project's Lifecycle Click "verify"
​
#### Alternatively:
You can run projects from maven lifecycle: edit the browser from configuration.properties file (see available drivers in Driver class file) and then type suitable tag in CukesRunner class. Then you can run test suite by clicking *maven lifecycle test or verify*
​
​
## Framework and Patterns
In a maven project I have the following structure: 
### root files
- **pom.xml file:** to manage java version, dependency and libraries, and plugins
- **configuration.properties file:** I use this file to centralize system-wide variables such as urls, connnection strings, credentials, test environment adresses, browser names etc. by this way any change in any system variable can be effective in overall framework
### packages
-  **pages package:** this package contains an abstract page (base page) for the *whole application* which contains the ***Page Object Model constructor***,  common menus, webelements and methods. Moreover, the package contains Page class for every page in the web app, which centralizes the locatorss and methods related to the page. 
- **runners package:** this package contains runner classes which uses cucumber runner method. 
- **step definitions package:** this package contains the test script methods. test scripts usess objects created from the page classes.
- **utilities package:** this page contains general important tools
- - ***Driver class:*** it has ***Singleton Pattern*** therefore supplies only one driver per thread so that the same driver is used.  Moreover, I designed it with driver pool structure to use in parallel testing.(for UI and mobile)
- - ***ConfigurationReader class:*** I use this class to read data from configuration.properties file.
​
- **resources directory:** I save my cucumber feature files, non-java files, and other necessary 3rd party drivers etc. into resources directory
