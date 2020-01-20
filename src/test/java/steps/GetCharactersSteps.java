package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.is;

public class GetCharactersSteps {
    @Given("^I perform Get Operations for \"([^\"]*)\"$")
    public void iPerformGetOperationsFor(String url) throws Throwable {
        given().contentType(ContentType.JSON);
    }
    @And("^I perform Get for the Character number \"([^\"]*)\"$")
    public void iPerformGetForTheCharacterNumber(String ch) throws Throwable {
        GetMethods.SimpleGetMethod(ch);
    }
    @Then("^I should see Character's name as \"([^\"]*)\"$")
    public void iShouldSeeCharacterSNameAs(String arg0) throws Throwable {
    }

    @Then("^I should see verify GET parameter$")
    public void ıShouldSeeVerifyGETParameter() {
        GetMethods.PerformQueryParam();
    }
}
