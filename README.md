# Customized template for using [SHAFT_Engine](https://github.com/shafthq/SHAFT_ENGINE)
<img src="https://github.com/ShaftHQ/SHAFT_ENGINE/raw/main/src/main/resources/images/shaft.png" alt="SHAFT_ENGINE" style="display:block; margin-left:auto; margin-right:auto;"/>

<a id="quick-start-guide"></a>
## I. Quick Start Guide 🏃
### Step 1: Setting up your project
- Click the blue button above that says "Use this template" > "Create a new repository"
- From your new repository click the blue button that says "<> Code" > "Open with GitHub Desktop"
- From your GitHub Desktop click the button that says "Open in JetBrains IntelliJ Idea Community Edition"
- Due to a known issue with IntelliJ you need to edit your run configuration templates before running your tests by following these steps:
  - Open 'Edit Run/Debug Configurations' dialog > Edit Configurations... > Edit configuration templates...
  - Select <b>TestNG</b> > Listeners > and add this listener:
    <br/>`com.shaft.listeners.TestNGListener`
  - Select <b>Cucumber Java</b> > Program Arguments > and add this argument:
  <br/>`--plugin --plugin com.shaft.listeners.CucumberFeatureListener`
  - After saving the changes, remember to delete any old test runs you may have triggered by mistake before adding the needed config.

### Step 2: Running some Tests
- Navigate to the module that you want to play with. For example ```GUI_Web```
- Navigate to any test class. For example ```src/test/java/TestPackage/TestClass.java```
- Press the green play button next to the class name to run the entire class, or next to a test method to run only that method.
- Test execution will begin, and you'll see the browser opening and the test running.
- The Test execution report will open automatically in your default web browser after the test run is completed.

<img src="https://github.com/allure-framework/allure2/raw/master/.github/allure-report-gif.gif" alt="Allure Report" style="display:block; margin-left:auto; margin-right:auto;"/>

## II. What's next?
### Configuration and User Guide
- Change the target browser, operating system, timeouts, and other configurations using the ⚙️ [Configuration Manager](https://ShaftHQ.github.io/SHAFT_ENGINE/).
- Learn more about using SHAFT_Engine from the 👤 [User Guide](https://ShaftHQ.github.io/SHAFT_Engine_Docusaurus/) and 📚 [Javadocs](https://ShaftHQ.github.io/SHAFT_ENGINE/apidocs/index.html).
- <b>Join</b> our ![GitHub Repo stars](https://img.shields.io/github/stars/shafthq/shaft_engine?logoColor=black&style=social) to get notified by email when a new release is pushed out.
- After upgrading your Engine it is sometimes recommended to delete the properties folder ```src\main\resources\properties``` and allow SHAFT to regenerate the defaults by running any test method.

### CI/CD & DevOps
- This template comes preloaded with some Selenium grid 4 powered CI/CD pipelines to get you started!
- Navigate to "Actions" and then select "Desktop Browser Tests" from the side menu
- Click "Run workflow" and confirm your choice.
- You will notice that the pipeline has started building, and you can download the execution reports once the execution is completed.

<img src="https://github.githubassets.com/images/modules/site/actions/pr-checks-final.png" alt="GitHub Actions" style="display:block; margin-left:auto; margin-right:auto;"/>


### Stop Reinventing the wheel! Start using SHAFT!

📝 Project Features:

Java, Selenium Webdriver, TestNG, Allure Report, Extent Reports, Remote Execution (Selenium Grid4 & Docker Compose)



🏗️ Project Design:

Page Object Model (POM) design pattern, Data Driven framework, Fluent design approach, Java Docs



🔍️ Covered Test cases in this project:

✅Test Case 1: Register User

1-Launch browser
2-Navigate to url
3-✏️Verify that Currency, price, bundle type are valid
