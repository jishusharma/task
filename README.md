## Prerequisites
    Java must be installed in your system

## Steps
    1. Download project
    2. Open project directory in command prompt, 
        Run:
        mvn clean test surefire-report:report

##### Note: 
    1. To verify that the tests are indeed asserting error message, change input text to 'NFLFake' in b_results_Displayed_With_Valid_Keyword and 'NFL' in c_required_Text_Displayed_With_Invalid_Keyword  
    2. Html "surefire-report" will be generated inside the folder \\task\target\site
    3. Currently the chrome driver is running in 'headless' mode. 
       We can see the browser action by setting this "chromeOptions.setHeadless(false);" in the BaseTest.java file