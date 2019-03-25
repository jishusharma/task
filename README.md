## Prerequisites 
Java must be installed in your system

## Steps
### 1. Specify the absolute path for the chromedriver.exe in your POM file
##### Example
###### <properties>
    <webdriver.chrome>D:\project\task\chromedriver.exe</webdriver.chrome>
</properties>

### 2. Run:
mvn clean test surefire-report:report

#### Note: 
Html test report will be generated inside the folder \\task\target\site
