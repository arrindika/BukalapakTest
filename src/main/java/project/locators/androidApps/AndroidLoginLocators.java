package project.locators.androidApps;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public interface AndroidLoginLocators {
    By TEXT_TITLE = MobileBy.id("");
    By TEXT_ERROR_MESSAGE = MobileBy.id("");
    By POP_UP_MESSAGE = MobileBy.id("");
    By SUCCESS = MobileBy.id("");

    // Edit Text
    By INPUT_EMAIL = MobileBy.id("");
    By INPUT_PASSWORD = MobileBy.id("");

    // Button
    By BUTTON_LOGIN = MobileBy.id("");

}
