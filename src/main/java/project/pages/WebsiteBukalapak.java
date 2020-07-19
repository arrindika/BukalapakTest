package project.pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import project.driver.WebDriverInstance;

public class WebsiteBukalapak {
    public void openLoginPage() {
        WebDriverInstance.webdriver.get("https://www.bukalapak.com/login");
    }
    public void inputEmail(String email) {
        WebElement inputSearch = WebDriverInstance.webdriver.findElement(By.name("q"));
        inputSearch.sendKeys(email);
    }
    public void inputPassword(String password) {
        WebElement inputSearch = WebDriverInstance.webdriver.findElement(By.name("q"));
        inputSearch.sendKeys(password);
    }
    public void inputKeyword(String keyword) {
        WebElement inputSearch = WebDriverInstance.webdriver.findElement(By.name("q"));
        inputSearch.sendKeys(keyword);
    }
    public void clickLogin() {
        WebElement buttonLogin = WebDriverInstance.webdriver.findElement(By.id("fab_edit_task_done"));
        buttonLogin.click();
    }
    public void clickSearch() {
        WebElement buttonSearch = WebDriverInstance.webdriver.findElement(By.id("fab_edit_task_done"));
        buttonSearch.click();
    }
    public void clickChooseItem() {
        WebElement buttonChooseItem = WebDriverInstance.webdriver.findElement(By.id("fab_edit_task_done"));
        buttonChooseItem.click();
    }
    public void clickAddToCart() {
        WebElement buttonAddToCart = WebDriverInstance.webdriver.findElement(By.id("fab_edit_task_done"));
        buttonAddToCart.click();
    }
    public void clickSeeCart() {
        WebElement buttonSeeCart = WebDriverInstance.webdriver.findElement(By.id("fab_edit_task_done"));
        buttonSeeCart.click();
    }
}
