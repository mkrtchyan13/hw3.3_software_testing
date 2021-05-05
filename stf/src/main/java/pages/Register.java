package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Register {
    private WebDriver driver;
    private By title = By.xpath("//*[@id=\"__next\"]/div/div[2]/main/div/div/div[1]/div[1]/p");
    public Register(WebDriver driver) {
        this.driver= driver;
    }
    public String getTitleText () {
        return driver.findElement(title).getText();
    }
}
