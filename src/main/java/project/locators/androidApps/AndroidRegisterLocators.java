package project.locators.androidApps;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public interface AndroidRegisterLocators {
    By TEXT_TITLE = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.support.v7.widget.LinearLayoutCompat/android.widget.ImageView");
    By BUTTON_REGISTER_PAGE = MobileBy.id("textViewLinkRegister");
    By BUTTON_REGISTER = MobileBy.id("appCompatButtonRegister");
    By TEXT_ERRORNAME_MESSAGE = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.support.v7.widget.LinearLayoutCompat/TextInputLayout[1]/android.widget.LinearLayout/android.widget.TextView");
    By TEXT_ERROREMAIL_MESSAGE = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.support.v7.widget.LinearLayoutCompat/TextInputLayout[2]/android.widget.LinearLayout/android.widget.TextView");
    By TEXT_ERRORPASS_MESSAGE = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.support.v7.widget.LinearLayoutCompat/TextInputLayout[3]/android.widget.LinearLayout/android.widget.TextView");
    By TEXT_ERRORCONPASS_MESSAGE = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.support.v7.widget.LinearLayoutCompat/TextInputLayout[4]/android.widget.LinearLayout/android.widget.TextView");
    By POP_UP_MESSAGE = MobileBy.id("snackbar_text");

    // Edit Text
    By INPUT_NAME = MobileBy.id("textInputEditTextName");
    By INPUT_EMAIL = MobileBy.id("textInputEditTextEmail");
    By INPUT_PASSWORD = MobileBy.id("textInputEditTextPassword");
    By INPUT_CONFITMPASSWORD = MobileBy.id("textInputEditTextConfirmPassword");
}
