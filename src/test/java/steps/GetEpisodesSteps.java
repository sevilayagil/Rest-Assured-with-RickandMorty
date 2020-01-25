package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;

public class GetEpisodesSteps {
    @Given("^I perform Get operations for episodes$")
    public void ıPerformGetOperationsForEpisodes() {
        given().contentType(ContentType.JSON);
    }
    @Then("^I should see verify name as \"([^\"]*)\"$")
    public void ıShouldSeeVerifyNameAs(String arg0) throws Throwable {
        GetMethods.Episode();
    }
}
