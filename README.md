## Prerequisites
    Java must be installed in your system

## Steps
    1. Download or clone the project
    2. Open project directory in command prompt, 
        Run:
        mvn clean test surefire-report:report

##### Note: 
    1. Html "surefire-report" will be generated inside the folder \\task\target\site
    2. Currently the chrome driver is running in 'headless' mode. 
       We can see the browser action by setting this "chromeOptions.setHeadless(false);" in the BaseTest.java file