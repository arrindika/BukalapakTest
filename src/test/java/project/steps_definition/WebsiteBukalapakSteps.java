package project.steps_definition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import project.pages.WebsiteBukalapak;

public class WebsiteBukalapakSteps {

    WebsiteBukalapak websiteBukalapak = new WebsiteBukalapak();

    @Given("User open login page bukalapak")
    public void userOpenLoginPageBukalapak() {
        websiteBukalapak.openLoginPage();
    }

    @When("User input email {string} on email field")
    public void userInputEmailOnEmailField(String email) {
        websiteBukalapak.inputEmail(email);
    }

    @And("User input password {string} on password field")
    public void userInputPasswordOnPasswordField(String pass) {
        websiteBukalapak.inputPassword(pass);
    }

    @And("User click Login on login page")
    public void userClickLoginOnLoginPage() {
        websiteBukalapak.clickLogin();
    }

    @Then("User is on Homepage")
    public void userIsOnHomepage() {
    }

    @When("User search with keyword {string} on search field")
    public void userSearchWithKeywordOnSearchField(String keyword) {
        websiteBukalapak.inputKeyword(keyword);
    }

    @And("User click search icon for search the keyword")
    public void userClickSearchIconForSearchTheKeyword() {
        websiteBukalapak.clickSearch();
    }

    @And("User got the result of keyword {string} on page")
    public void userGotTheResultOfKeywordOnPage(String arg0) {
    }

    @When("User choose the first item")
    public void userChooseTheFirstItem() {
        websiteBukalapak.clickChooseItem();
    }

    @And("User click add to cart button")
    public void userClickAddToCartButton() {
        websiteBukalapak.clickAddToCart();
    }

    @And("User click see the cart")
    public void userClickSeeTheCart() {
        websiteBukalapak.clickSeeCart();
    }

    @Then("User see the item in the cart")
    public void userSeeTheItemInTheCart() {
    }
}
