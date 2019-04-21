# About
This project covers the test of Bank APIs. It is a maven project written java by using TestNG. TestNG test classes can be created by test data files.

# Generate TestNG test classes
Use command ```sh generate_test_cases.sh``` to generate Java classes. Please run command in Linux or Mac.

# Test data format
Test data is written in JSON files. Each file contains fields:
* payload
Post payload
* expected
Expected result. **status_code** is the HTTP response status code. error/success is for response message.
* description
Used for write log when the Test method is executed.
* group
Specify Categories in the report.

# How to build it
* Prerequisites:
  * Install Java 8.0
  * Install maven 3.6.1
* Build:
  Under the root folder, run command
  ```
  mvn clean package
  ```

# How to run the test cases
* In the console:
If you have already built an executable jar file after previous step, you just need to run command
```
java -jar target/httpApi-0.0.1-SNAPSHOT.jar -testjar target/httpApi-0.0.1-SNAPSHOT.jar
```
By default, the tested base endpoint is http://preview.airwallex.com:30001. You may also customise the base endpoint by setting an environment *BASE_URL*
```
BASE_URL="http://{{your_base_domain}}" java -jar target/httpApi-0.0.1-SNAPSHOT.jar -testjar target/httpApi-0.0.1-SNAPSHOT.jar
```
* In Eclipse:
  * Install TestNG plugin. Refer to https://www.ecanarys.com/Blogs/ArticleID/169/How-to-Install-TestNG-framework-Step-by-Step-installation-process.
  * Set TestNG listener. Go to Preference, select TestNG, Disable Default Listener and set Pre Defined Listeners to be bank.api.ExtentReporterNG.


# View result
Go to folder *test-output*, use browser to open file ExtentReportsTestNG.html.
