package task.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CNN_HomePage extends BasePage {

    @FindBy(xpath ="/html//div[@id='search-button']")
    private WebElement searchIcon;

    @FindBy(id="search-input-field")
    private WebElement searchInputField;

    @FindBy(xpath = "/html//button[@id='submit-button']")
    private WebElement searchButton;

    @FindBy(xpath = "/html/body/div[7]/div[@class='pg-no-rail pg-wrapper']//div[@class='cnn-search__results-count']")
    private WebElement searchCount;

    @FindBy(xpath = "/html/body/div[7]/div[@class='pg-no-rail pg-wrapper']/div[@class='cnn-search cnn-search--no-results']//h3")
    private WebElement searchResultIsEmpty;


    CNN_HomePage(WebDriver driver) {
        super(driver);
    }

    public void goToHome(){
        driver.navigate().to("https://edition.cnn.com/");
    }

    public void enterAndSearch(String searchText){
        searchIcon.click();
        searchInputField.clear();
        searchInputField.sendKeys(searchText);
        searchButton.click();
    }

    public boolean searchResultsDisplayed(String searchText){
        return searchCount.isDisplayed()
                && searchCount.getText().startsWith("Displaying results")
                && searchCount.getText().endsWith(searchText);
    }

    public boolean searchResultIsEmpty(String searchText){
        try {
            return searchResultIsEmpty.isDisplayed()
                    && searchResultIsEmpty.getText().contains("Your search for " + searchText + " did not match any documents.");
        }catch (org.openqa.selenium.NoSuchElementException e){

        }
        return false;
    }
}
