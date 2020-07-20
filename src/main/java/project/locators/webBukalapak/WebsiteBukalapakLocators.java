package project.locators.webBukalapak;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public interface WebsiteBukalapakLocators {
    By INPUT_EMAIL = By.id("user_session_username");
    By INPUT_PASSWORD = By.id("user_session_password");
    By INPUT_KEYWORD = By.id("v-omnisearch__input");

    By CLICK_LOGIN = By.xpath("//i[contains(@class,'c-btn--spinner__icon')]");
    By CLICK_SEARCH = By.xpath("//button[@class='v-omnisearch__submit']//*[local-name()='svg']//button[@class='v-omnisearch__submit']//*[local-name()='svg']");
    By CLICK_CHOOSE_ITEM = By.xpath("(//a)[1]");
    By CLICK_ADD_TO_CART = By.xpath("//button[@class='c-main-product__action__cart bl-button bl-button--outline bl-button--medium']");
    By CLICK_SEE_CART = By.xpath("//button[@class='c-cart-dialog__cart-button c-btn c-btn--default c-btn--default c-btn--default']");
}
