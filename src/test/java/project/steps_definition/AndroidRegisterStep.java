package project.steps_definition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import project.pages.AndroidRegister;

public class AndroidRegisterStep {

    AndroidRegister androidRegister = new AndroidRegister();

    @When("User click register button on Login page")
    public void userClickRegisterButtonOnLoginPage() {
        androidRegister.clickRegisterPage();
    }

    @Given("User is on Register Page")
    public void userIsOnRegisterPage() {
        boolean actual = androidRegister.isOnRegisterPage();
        Assert.assertTrue(actual);
    }

    @When("User input new name {string} on name text field")
    public void userInputNewNameOnNameTextField(String name) {
        androidRegister.inputName(name);
    }

    @And("User input new email {string} on name text field")
    public void userInputNewEmailOnNameTextField(String email) {
        androidRegister.inputEmail(email);
    }

    @And("User input new password {string} on new password text field")
    public void userInputNewPasswordOnNewPasswordTextField(String pass) {
        androidRegister.inputPassword(pass);
    }

    @And("User input confirmation password {string} on confirmation password text field")
    public void userInputConfirmationPasswordOnConfirmationPasswordTextField(String pass) {
        androidRegister.inputConfirmPass(pass);
    }

    @And("User click Register button")
    public void userClickRegisterButton() {
        androidRegister.clickRegister();
    }

    @Then("User register complete with messagge {string}")
    public void userRegisterCompleteWithMessagge(String message) {
        String text = androidRegister.toastmessage();
        Assert.assertTrue(text.contains(message));
    }

    @Then("User register uncomplete with message {string}")
    public void userRegisterUncompleteWithMessage(String message) {
        String text = androidRegister.toastmessage();
        Assert.assertTrue(text.contains(message));
    }

    @Then("User see error message {string}")
    public void userSeeErrorMessage(String message) {
        String errorText = androidRegister.getWarningText();
        Assert.assertEquals(errorText, message);
    }
}
