package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Faq {
    private WebDriver driver;

    private By content = By.xpath("//*[@id=\"__next\"]/div/div[2]/main/div");

    public Faq(WebDriver driver) {
        this.driver = driver;
    }

    public boolean contentExists () {
        return !driver.findElements(content).isEmpty();
    }
}
