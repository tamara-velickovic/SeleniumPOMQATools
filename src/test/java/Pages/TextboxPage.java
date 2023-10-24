package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextboxPage {
    public WebDriver driver;
    public WebDriverWait wait;
    WebElement fullnameField;
    WebElement emailField;
    WebElement permanentAddressField;
    WebElement currentAddressField;
    WebElement submitButton;
    WebElement resultName;
    WebElement resultEmail;
    WebElement resultPermanentAddress;
    WebElement resultCurrentAddress;
    WebElement output;

    public TextboxPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public WebElement getFullnameField() {
        return driver.findElement(By.id("userName"));
    }

    public WebElement getEmailField() {
        return driver.findElement(By.id("userEmail"));
    }

    public WebElement getPermanentAddressField() {
        return driver.findElement(By.id("permanentAddress"));
    }

    public WebElement getCurrentAddressField() {
        return driver.findElement(By.id("currentAddress"));
    }

    public WebElement getSubmitButton() {
        return driver.findElement(By.id("submit"));
    }

    public WebElement getResultName() {
        return driver.findElement(By.id("name"));
    }

    public WebElement getResultEmail() {
        return driver.findElement(By.id("email"));
    }

    public WebElement getResultPermanentAddress() {
        return driver.findElement(By.id("permanentAddress"));
    }

    public WebElement getResultCurrentAddress() {
        return driver.findElement(By.id("currentAddress"));
    }

    public WebElement getOutput() {
        return driver.findElement(By.id("output"));
    }

    //-------------------------

    public String outputText() {
        return getOutput().getText();
    }

    public void inputFullname(String fullname) {
        getFullnameField().clear();
        getFullnameField().sendKeys(fullname);
    }

    public void inputEmail(String email) {
        getEmailField().clear();
        getEmailField().sendKeys(email);
    }

    public void inputPermanentAddress(String permanentAddress) {
        getPermanentAddressField().clear();
        getPermanentAddressField().sendKeys(permanentAddress);
    }

    public void inputCurrentAddress(String currentAddress) {
        getCurrentAddressField().clear();
        getCurrentAddressField().sendKeys(currentAddress);
    }

    public void clickOnSubmit() {
        getSubmitButton().click();
    }

}
