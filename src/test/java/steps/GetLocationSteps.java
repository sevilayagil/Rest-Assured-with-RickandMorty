package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;

public class GetLocationSteps {
    @Given("^I perform Get operations for Location$")
    public void ıPerformGetOperationsForLocation() {
        given().contentType(ContentType.JSON);
    }
    @Then("^I should see verify wrong Location$")
    public void ıShouldSeeVerifyWrongLocation() {
        GetMethods.Location();
    }
}
