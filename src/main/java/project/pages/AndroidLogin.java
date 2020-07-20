package project.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import project.driver.AndroidDriverInstance;
import project.locators.androidApps.AndroidLoginLocators;
import project.locators.androidApps.AndroidRegisterLocators;

public class AndroidLogin {

    public boolean isOnLoginPage(){
        WebDriverWait wait = new WebDriverWait(AndroidDriverInstance.androidDriver, 30);
        return wait.until(ExpectedConditions.presenceOfElementLocated(AndroidLoginLocators.TEXT_TITLE)).isDisplayed();
    }
    public void inputEmail(String email){
        WebElement inputEmail = AndroidDriverInstance.androidDriver.findElement(AndroidLoginLocators.INPUT_EMAIL);
        inputEmail.sendKeys(email);
    }
    public void inputPassword(String password){
        WebElement inputPassword = AndroidDriverInstance.androidDriver.findElement(AndroidLoginLocators.INPUT_PASSWORD);
        inputPassword.sendKeys(password);
    }
    public void clickLogin() {
        AndroidDriverInstance.androidDriver.findElement(AndroidLoginLocators.BUTTON_LOGIN).click();
    }
    public boolean isSuccess(){
        WebDriverWait wait = new WebDriverWait(AndroidDriverInstance.androidDriver, 30);
        return wait.until(ExpectedConditions.presenceOfElementLocated(AndroidLoginLocators.SUCCESS)).isDisplayed();
    }
    public String toastmessage(){
        WebElement errorMessage = AndroidDriverInstance.androidDriver.findElement(AndroidLoginLocators.POP_UP_MESSAGE);
        return errorMessage.getAttribute("name");
    }
    public String getWarningEmailText(){
        WebElement warningText = AndroidDriverInstance.androidDriver.findElement(AndroidLoginLocators.TEXT_ERROREMAIL_MESSAGE);
        return warningText.getText();
    }
    public String getWarningPassText(){
        WebElement warningText = AndroidDriverInstance.androidDriver.findElement(AndroidLoginLocators.TEXT_ERRORPASS_MESSAGE);
        return warningText.getText();
    }
}
