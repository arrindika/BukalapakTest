package project.locators.androidApps;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public interface AndroidRegisterLocators {
    By TEXT_TITLE = MobileBy.id("");
    By BUTTON_REGISTER_PAGE = MobileBy.id("");
    By BUTTON_REGISTER = MobileBy.id("");
    By TEXT_ERROR_MESSAGE = MobileBy.id("");
    By POP_UP_MESSAGE = MobileBy.id("");

    // Edit Text
    By INPUT_NAME = MobileBy.id("");
    By INPUT_EMAIL = MobileBy.id("");
    By INPUT_PASSWORD = MobileBy.id("");
    By INPUT_CONFITMPASSWORD = MobileBy.id("");
}
