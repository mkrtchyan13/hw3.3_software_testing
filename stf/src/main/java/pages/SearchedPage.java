package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchedPage {
    private WebDriver driver;
    private By box = By.xpath("//*[@id=\"__next\"]/div/header/article/div/div[2]/div/div[2]/div");
    private By filter = By.xpath("//*[@id=\"__next\"]/div/header/article/div/div[1]/div/div[3]/ul/li[1]/button");

    public SearchedPage(WebDriver driver) {
        this.driver = driver;
    }
    public Entity clickEntity() {
        driver.findElement(box).click();
        return new Entity(driver);
    }
    public void clickFilterOffer() {
        WebDriverWait wait = new WebDriverWait(driver, 1000);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(filter)));
        driver.findElement(filter).click();
    }
}
