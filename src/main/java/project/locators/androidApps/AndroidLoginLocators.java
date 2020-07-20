package project.locators.androidApps;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public interface AndroidLoginLocators {
    By TEXT_TITLE = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.support.v7.widget.LinearLayoutCompat/android.widget.TextView[1]");
    By TEXT_ERROREMAIL_MESSAGE = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.support.v7.widget.LinearLayoutCompat/TextInputLayout[1]/android.widget.LinearLayout/android.widget.TextView");
    By TEXT_ERRORPASS_MESSAGE = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.support.v7.widget.LinearLayoutCompat/TextInputLayout[2]/android.widget.LinearLayout/android.widget.TextView");
    By POP_UP_MESSAGE = MobileBy.id("snackbar_text");
    By SUCCESS = MobileBy.id("recyclerViewUsers");

    // Edit Text
    By INPUT_EMAIL = MobileBy.id("textInputEditTextEmail");
    By INPUT_PASSWORD = MobileBy.id("textInputEditTextPassword");

    // Button
    By BUTTON_LOGIN = MobileBy.id("appCompatButtonLogin");

}
