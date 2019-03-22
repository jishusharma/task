# Prerequisites 
1. Java must be installed in your system
2. Download and note the absolute path for "ChromeDriver - WebDriver for Chrome"

# Steps
1. Specify the absolute path for the chromedriver.exe in your 'BaseTest.java' file
Example - 
System.setProperty("webdriver.chrome.driver", "D:\\tools\\chromedriver_win32\\chromedriver.exe");

2. Run:
mvn clean test surefire-report:report

# Note: 
Html test report will be generated inside the folder \\target\site
