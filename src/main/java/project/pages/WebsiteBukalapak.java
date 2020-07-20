package project.pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import project.driver.WebDriverInstance;
import project.locators.webBukalapak.WebsiteBukalapakLocators;

public class WebsiteBukalapak {
    public void openLoginPage() {
        WebDriverInstance.webdriver.get("https://www.bukalapak.com/login");
    }
    public void inputEmail(String email) {
        WebElement inputSearch = WebDriverInstance.webdriver.findElement(WebsiteBukalapakLocators.INPUT_EMAIL);
        inputSearch.sendKeys(email);
    }
    public void inputPassword(String password) {
        WebElement inputSearch = WebDriverInstance.webdriver.findElement(WebsiteBukalapakLocators.INPUT_PASSWORD);
        inputSearch.sendKeys(password);
    }
    public void inputKeyword(String keyword) {
        WebElement inputSearch = WebDriverInstance.webdriver.findElement(WebsiteBukalapakLocators.INPUT_KEYWORD);
        inputSearch.sendKeys(keyword);
    }
    public void clickLogin() {
        WebElement buttonLogin = WebDriverInstance.webdriver.findElement(WebsiteBukalapakLocators.CLICK_LOGIN);
        buttonLogin.click();
    }
    public void clickSearch() {
        WebElement buttonSearch = WebDriverInstance.webdriver.findElement(WebsiteBukalapakLocators.CLICK_SEARCH);
        buttonSearch.click();
    }
    public void clickChooseItem() {
        WebElement buttonChooseItem = WebDriverInstance.webdriver.findElement(WebsiteBukalapakLocators.CLICK_CHOOSE_ITEM);
        buttonChooseItem.click();
    }
    public void clickAddToCart() {
        WebElement buttonAddToCart = WebDriverInstance.webdriver.findElement(WebsiteBukalapakLocators.CLICK_ADD_TO_CART);
        buttonAddToCart.click();
    }
    public void clickSeeCart() {
        WebElement buttonSeeCart = WebDriverInstance.webdriver.findElement(WebsiteBukalapakLocators.CLICK_SEE_CART);
        buttonSeeCart.click();
    }
}
