package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Entity {
    private WebDriver driver;
    private By img = By.xpath("//*[@id=\"__next\"]/div/div[2]/main/div/article[1]/div/div/div/div[2]/ul/li[1]/div/div/img");
    public Entity(WebDriver driver) {
        this.driver = driver;
    }
    public boolean imgExists(){
       return !driver.findElements(img).isEmpty();
    }
    public void clickImage() {
        driver.findElement(img).click();
    }


}