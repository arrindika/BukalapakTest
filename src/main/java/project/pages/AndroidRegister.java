package project.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import project.driver.AndroidDriverInstance;
import project.locators.androidApps.AndroidRegisterLocators;

public class AndroidRegister {
    public void clickRegisterPage() {
        AndroidDriverInstance.androidDriver.findElement(AndroidRegisterLocators.BUTTON_REGISTER_PAGE).click();
    }
    public boolean isOnRegisterPage(){
        WebDriverWait wait = new WebDriverWait(AndroidDriverInstance.androidDriver, 30);
        return wait.until(ExpectedConditions.presenceOfElementLocated(AndroidRegisterLocators.TEXT_TITLE)).isDisplayed();
    }
    public void inputName(String name){
        WebElement inputEmail = AndroidDriverInstance.androidDriver.findElement(AndroidRegisterLocators.INPUT_NAME);
        inputEmail.sendKeys(name);
    }
    public void inputEmail(String email){
        WebElement inputEmail = AndroidDriverInstance.androidDriver.findElement(AndroidRegisterLocators.INPUT_EMAIL);
        inputEmail.sendKeys(email);
    }
    public void inputPassword(String password){
        WebElement inputPassword = AndroidDriverInstance.androidDriver.findElement(AndroidRegisterLocators.INPUT_PASSWORD);
        inputPassword.sendKeys(password);
    }
    public void inputConfirmPass(String password){
        WebElement inputPassword = AndroidDriverInstance.androidDriver.findElement(AndroidRegisterLocators.INPUT_CONFITMPASSWORD);
        inputPassword.sendKeys(password);
    }
    public void clickRegister() {
        AndroidDriverInstance.androidDriver.findElement(AndroidRegisterLocators.BUTTON_REGISTER).click();
    }
    public String getWarningNameText(){
        WebElement warningText = AndroidDriverInstance.androidDriver.findElement(AndroidRegisterLocators.TEXT_ERRORNAME_MESSAGE);
        return warningText.getText();
    }
    public String getWarningEmailText(){
        WebElement warningText = AndroidDriverInstance.androidDriver.findElement(AndroidRegisterLocators.TEXT_ERROREMAIL_MESSAGE);
        return warningText.getText();
    }
    public String getWarningPassText(){
        WebElement warningText = AndroidDriverInstance.androidDriver.findElement(AndroidRegisterLocators.TEXT_ERRORPASS_MESSAGE);
        return warningText.getText();
    }
    public String getWarningConPassText(){
        WebElement warningText = AndroidDriverInstance.androidDriver.findElement(AndroidRegisterLocators.TEXT_ERRORCONPASS_MESSAGE);
        return warningText.getText();
    }
    public String toastmessage(){
        WebElement errorMessage = AndroidDriverInstance.androidDriver.findElement(AndroidRegisterLocators.POP_UP_MESSAGE);
        return errorMessage.getAttribute("name");
    }
}
