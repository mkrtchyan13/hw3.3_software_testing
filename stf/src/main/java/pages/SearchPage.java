package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
    private WebDriver driver;
    public SearchPage(WebDriver driver) {
            this.driver = driver;
    }
    public SearchedPage clickSearched() {
        WebElement search = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/header/article/div/div[1]/div/div[2]/input"));
        search.click();
        search.sendKeys(Keys.RETURN);
        return new SearchedPage(driver);
    }
}
