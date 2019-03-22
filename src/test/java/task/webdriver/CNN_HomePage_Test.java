package task.webdriver;

import org.junit.*;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CNN_HomePage_Test extends BaseTest {
    static CNN_HomePage cNN_HomePage;

    @BeforeClass
    public static void init(){
        WebDriver dr = getDriver();
        cNN_HomePage = new CNN_HomePage(dr);
    }

    @Test
    public void a_homepageTests() {
        cNN_HomePage.goToHome();
        Assert.assertEquals("Title check failed!", "CNN International - Breaking News, US News, World News and Video", getDriver().getTitle());
    }

    @Test
    public void b_resultTests_success() {
        String searchFor =  "NFL";
        cNN_HomePage.enterAndSearch(searchFor);
        Assert.assertTrue("At least something must be found for  " + searchFor ,cNN_HomePage.searchResultsDisplayed());
    }

    @Test
    public void c_resultTests_fail() {
        String searchFor =  "NFLFake";
        cNN_HomePage.enterAndSearch(searchFor);
        Assert.assertFalse("Nothing must be found for " + searchFor,cNN_HomePage.searchResultsDisplayed());
    }
}
