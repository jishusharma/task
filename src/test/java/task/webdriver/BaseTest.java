package task.webdriver;


import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class BaseTest {

    private static WebDriver driver;

    @BeforeClass
    public static void before() {
        System.setProperty("webdriver.chrome.driver", "D:\\tools\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().fullscreen();
    }

    @AfterClass
    public static void after() {
        if(null != driver) {
            driver.manage().deleteAllCookies();
            driver.close();
            driver.quit();
        }
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
