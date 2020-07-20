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
        if (message == "1") {
            String errorText = androidRegister.getWarningNameText();
            Assert.assertEquals(errorText, "Enter Full Name");
        }
        else if (message == "2"){
            String errorText = androidRegister.getWarningEmailText();
            Assert.assertEquals(errorText, "Enter Valid Email");
        }
        else if (message == "3") {
            String errorText = androidRegister.getWarningPassText();
            Assert.assertEquals(errorText, "Enter Password");
        }
        else if (message == "4"){
            String errorText = androidRegister.getWarningConPassText();
            Assert.assertEquals(errorText, "Password Does Not Matches");
        }
    }
}
