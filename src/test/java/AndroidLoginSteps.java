import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AndroidLoginSteps {
    @Given("User is on Login Page")
    public void userIsOnLoginPage() {

    }

    @When("User input email {string} on email text field")
    public void userInputEmailOnEmailTextField(String arg0) {

    }

    @Given("User input password {string} on password text field")
    public void userInputPasswordOnPasswordTextField(String arg0) {
    }

    @And("User click login button on Login page")
    public void userClickLoginButtonOnLoginPage() {
    }

    @Then("User login success")
    public void userLoginSuccess() {
    }

    @Then("User see error that {string}")
    public void userSeeErrorThat(String arg0) {
    }

    @Then("User see error message field that {string}")
    public void userSeeErrorMessageFieldThat(String arg0) {
    }
}
