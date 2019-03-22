#Prerequisites 
1. Java must be installed in your system
2. Download ChromeDriver - WebDriver for Chrome or download it from this repository


# Steps
1. Specify the path for the chromedriver.exe in your 'BaseTest.java' file
Example - 
System.setProperty("webdriver.chrome.driver", "D:\\tools\\chromedriver_win32\\chromedriver.exe");

2. Run:
mvn clean test surefire-report:report

Note: 
Html test report will be generated in the inside folder \\target\site
