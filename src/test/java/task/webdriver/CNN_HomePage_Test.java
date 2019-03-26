package task.webdriver;

import org.junit.*;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CNN_HomePage_Test extends BaseTest {
    private static CNN_HomePage cNN_HomePage;

    @BeforeClass
    public static void init(){
        cNN_HomePage = new CNN_HomePage(getDriver());
    }

    @Test
    public void a_homepage_Title_Check_Test() {
        cNN_HomePage.goToHome();
        Assert.assertEquals("Title check failed!", "CNN International - Breaking News, US News, World News and Video", getDriver().getTitle());
    }

    @Test
    public void b_results_Displayed_With_Valid_Keyword() {
        String searchFor =  "NFL";
        cNN_HomePage.enterAndSearch(searchFor);
        Assert.assertTrue("At least something must be found for  " + searchFor ,cNN_HomePage.searchResultsDisplayed(searchFor));
    }

    @Test
    public void c_required_Text_Displayed_With_Invalid_Keyword() {
        String searchFor =  "NFLFake";
        cNN_HomePage.enterAndSearch(searchFor);
        Assert.assertTrue("Nothing must be found for " + searchFor,cNN_HomePage.searchResultIsEmpty(searchFor));
    }
}
