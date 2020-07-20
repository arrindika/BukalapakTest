package project.steps_definition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import project.pages.AndroidLogin;

public class AndroidLoginSteps {

    AndroidLogin androidLogin = new AndroidLogin();

    @Given("User is on Login Page")
    public void userIsOnLoginPage() {
        boolean actual = androidLogin.isOnLoginPage();
        Assert.assertTrue(actual);
    }

    @When("User input email {string} on email text field")
    public void userInputEmailOnEmailTextField(String email) {
        androidLogin.inputEmail(email);
    }

    @Given("User input password {string} on password text field")
    public void userInputPasswordOnPasswordTextField(String password) {
        androidLogin.inputPassword(password);
    }

    @And("User click login button on Login page")
    public void userClickLoginButtonOnLoginPage() {
        androidLogin.clickLogin();
    }

    @Then("User login success")
    public void userLoginSuccess() {
        boolean actual = androidLogin.isSuccess();
        Assert.assertTrue(actual);
    }

    @Then("User see error that {string}")
    public void userSeeErrorThat(String message) {
        String text = androidLogin.toastmessage();
        Assert.assertTrue(text.contains(message));
    }

    @Then("User see error message field that {string}")
    public void userSeeErrorMessageFieldThat(String message) {
        String errorText = androidLogin.getWarningText();
        Assert.assertEquals(errorText, message);
    }
}
