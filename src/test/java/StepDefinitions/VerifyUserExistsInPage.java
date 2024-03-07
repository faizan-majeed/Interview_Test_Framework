package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.core.IsEqual.equalTo;

public class VerifyUserExistsInPage {
    String response;
    @Given("The user API endpoint is accessible")
    public void the_user_api_endpoint_is_accessible() {
        RestAssured.baseURI = "https://reqres.in/api/users";
    }
    
    @Then("The response status code should be {int}, users should be {int} on page {int}")
    public void the_response_status_code_should_be_users_should_be_on_page(Integer status, 
                                                                           Integer user_count, 
                                                                           Integer page_number) {
        given()
                .when()
                .get("?page="+page_number)
                .then()
                .statusCode(status)
                .body("data.size()", equalTo(user_count))
                .body("page", equalTo(page_number));
    }


    @Then("The response should contains {string},{string},{string},{string} based on {int}")
    public void the_response_should_contains_based_on(String firstName, String lastName, String email, String avatar,int page_number) {
        given()
                .when()
                .get("?page="+page_number)
                .then()
                .body("data.find { it.first_name == '"+firstName+"' }.last_name", equalTo(lastName))
                .body("data.find { it.first_name == '"+firstName+"' }.email", equalTo(email))
                .body("data.find { it.first_name == '"+firstName+"' }.avatar", equalTo(avatar));
    }

    @When("I make a GET request to the user endpoint")
    public void iMakeAGETRequestToTheUserEndpoint() {
    }
    @Then("Verify that data is empty on {int}")
    public void verify_that_data_is_empty_on(Integer page_number) {
        given()
                .when()
                .get("?page=" + page_number)
                .then()
                .body("data", empty());
    }
}
