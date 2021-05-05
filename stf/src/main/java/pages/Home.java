package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Home {
    private WebDriver driver;

    public Home(WebDriver driver) {
        this.driver = driver;
    }

    public SignInPage clickSignIn() {
        clickXpath("//*[@id=\"__next\"]/div/header/div[3]/div/div/section[1]/nav/ul/li[2]/div[1]/span/a\n");
        return new SignInPage(driver);
    }

    public Faq clickFaq() {
        clickLink("FAQ");
        return new Faq(driver);
    }

    public SearchPage clickSearch() {
        clickXpath("//*[@id=\"__next\"]/div/header/div[3]/div/div/section[1]/nav/ul/li[4]/button");
        return new SearchPage(driver);
    }


    private void clickXpath(String xpath) {
        WebDriverWait wait = new WebDriverWait(driver, 2000);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(xpath))));
        driver.findElement(By.xpath(xpath)).click();
    }

    private void clickLink(String linkText) {
        WebDriverWait wait = new WebDriverWait(driver, 2000);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.linkText(linkText))));
        driver.findElement(By.linkText(linkText)).click();
    }


}
