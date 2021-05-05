package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignInPage {

    private WebDriver driver;
    private By emailField = By.xpath("//*[@id=\"account-username-username\"]");
    private By passwordField = By.xpath("//*[@id=\"account-password-password\"]");
    private By button = By.xpath("//*[@id=\"__next\"]/div/div[2]/main/div/div/div[1]/div/div[2]/form/div[3]/div/button");
    private By errors = By.xpath("//*[@id=\"__next\"]/div/div[2]/main/div/div/div[1]/div/div[2]/form/div[1]/div[2]");
    private By mailerror = By.xpath("//*[@id=\"__next\"]/div/div[2]/main/div/div/div[1]/div/div[2]/form/div[1]/div[2]/span");
    private By forgot = By.xpath("//*[@id=\"__next\"]/div/div[2]/main/div/div/div[1]/div/div[2]/form/a");
    private By register = By.xpath("//*[@id=\"__next\"]/div/div[2]/main/div/div/div[2]/div/a/span");

    public SignInPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setEmailField(String email) {
        WebDriverWait wait = new WebDriverWait(driver, 1000);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(emailField)));
        driver.findElement(emailField).sendKeys(email);
    }

    public void setPasswordField(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void submit() {
        driver.findElement(button).click();
    }

    public boolean errorExists() {
        return !driver.findElements(errors).isEmpty();
    }

    public boolean mailerrorExists() {
        return !driver.findElements(mailerror).isEmpty();
    }

    public ForgotPassword goForgotPassword() {
        WebDriverWait wait = new WebDriverWait(driver, 1000);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(forgot)));
        driver.findElement(forgot).click();
        return new ForgotPassword(driver);
    }

    public Register goRegister() {
        WebDriverWait wait = new WebDriverWait(driver, 1000);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(register)));
        driver.findElement(register).click();
        return new Register(driver);
    }

    public SecureAreaPage clickLoginButton(){
        driver.findElement(button).click();
        return new SecureAreaPage(driver);
    }
}