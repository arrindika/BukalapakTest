package project.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import project.driver.AndroidDriverInstance;

public class AndroidLogin {

    public boolean isOnLoginPage(){
        WebDriverWait wait = new WebDriverWait(AndroidDriverInstance.androidDriver, 30);
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.id("btnSignIn"))).isDisplayed();
    }
    public void inputEmail(String email){
        WebElement inputEmail = AndroidDriverInstance.androidDriver.findElement();
        inputEmail.sendKeys(email);
    }
    public void inputPassword(String password){
        WebElement inputPassword = AndroidDriverInstance.androidDriver.findElement();
        inputPassword.sendKeys(password);
    }
    public void clickLogin() {
        AndroidDriverInstance.androidDriver.findElement(By.id("btnSignIn")).click();
    }
    public boolean isSuccess(){
        WebDriverWait wait = new WebDriverWait(AndroidDriverInstance.androidDriver, 30);
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.id("btnSignIn"))).isDisplayed();
    }
}
