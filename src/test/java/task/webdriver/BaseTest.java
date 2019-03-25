package task.webdriver;


import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriverService;



public class BaseTest {

    private static WebDriver driver;

    @BeforeClass
    public static void before() {
		final ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.setHeadless(true);
		chromeOptions.addArguments("window-size=1600,1200");
		final ChromeDriverService service = new ChromeDriverService.Builder()
            .usingAnyFreePort()
            .build();

        driver = new ChromeDriver(service,chromeOptions);
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

    static WebDriver getDriver() {
        return driver;
    }
}
