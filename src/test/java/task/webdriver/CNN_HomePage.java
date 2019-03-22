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

    @FindBy(className = "cnn-search__results-count")
    private WebElement searchCount;


    public CNN_HomePage(WebDriver driver) {
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

    public boolean searchResultsDisplayed(){
        if (searchCount.isDisplayed()){
            searchCount.getText().contains("Displaying results");
            return true;
        }
        else {
            return false;
        }
    }
}
