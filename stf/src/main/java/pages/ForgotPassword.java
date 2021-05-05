package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPassword {
    private WebDriver driver;
    private By path = By.xpath("//*[@id=\"__next\"]/div/div[2]/main/form/h1");
    public ForgotPassword(WebDriver driver) {
        this.driver = driver;
    }
    public String getTitleText () {
        return driver.findElement(path).getText();
    }

}