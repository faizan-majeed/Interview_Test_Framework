package StepDefinitions;

import BaseTest.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import Pages.DashBoardPage;
import Pages.HomePage;
import Pages.LoginPage;

public class LoginAndAddNote extends BaseTest {
    HomePage homePage=new HomePage();
    LoginPage loginPage=new LoginPage();
    DashBoardPage dashBoardPage=new DashBoardPage();

    @Given("I open the {string}")
    public void i_open_the(String url) {
        openUrl(url);
    }

    @And("I accept all cookies")
    public void i_accept_all_cookies() {
        homePage.clickAcceptCookies();
    }

    @And("I click on login button")
    public void click_on_login_button() {
        homePage.clickLogin();
    }

    @Then("I should see {string} on the login page")
    public void i_should_see_on_the_login_page(String expectedTitle) {
        String actualTitle=loginPage.getTitle();
        Assert.assertEquals("Title did not match",expectedTitle,actualTitle);
    }

    @When("I enter {string} and {string}")
    public void i_enter_and(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.clickContinueToLogin();
        loginPage.enterPassword(password);
    }
    @And("I click on sign in button")
    public void i_click_on_sign_in_button() {
        loginPage.clickSignInBtn();
    }

    @Then("I should be on dashboard and verify {string} is granted")
    public void i_should_be_on_dashboard_and_verify_is_granted(String expectedUser) {
        String actualUser=dashBoardPage.getUserFromDashBoard();
        Assert.assertEquals("User is not granted access",expectedUser,actualUser);
        closeBrowser();
    }
    @When("I enter {string} and click continue button")
    public void i_enter_and_click_continue_button(String username) {
        loginPage.enterUsername(username);
        loginPage.clickContinueToLogin();
    }
    @Then("I should see {string}")
    public void i_should_see_message_login_page(String expectedMessage) {
        String actualErrorMessage= loginPage.getErrorMessage();
        Assert.assertEquals("Error message is not verified",expectedMessage,actualErrorMessage);
        closeBrowser();
    }
    @When("I create a note with {string} and {string}")
    public void i_create_a_note_with_and(String title, String noteText) {
        dashBoardPage.clickCreateNewNote();
        dashBoardPage.enterTitle(title);
        dashBoardPage.enterNoteText(noteText);
        dashBoardPage.clickNotebook();
    }

    @When("I logout from the account")
    public void i_logout_from_the_account() {
        try{
            Thread.sleep(10000);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        dashBoardPage.clickHomeButton();
        dashBoardPage.clickUserForMoreOptions();
        dashBoardPage.clickSignOut();


    }

    @Then("I should be able to view the previously created note with content {string} and {string}")
    public void i_should_be_able_to_view_the_previously_created_note_with_content
            (String expectedNote,String noteTitle) {
        String actualNoteTitle= dashBoardPage.getCreatedNoteTitle();
        String actualNoteText= dashBoardPage.getCreatedNoteText();
        Assert.assertEquals("Title does not match",noteTitle,actualNoteTitle);
        Assert.assertEquals("Note text does not match",expectedNote,actualNoteText);
        dashBoardPage.clickCreatedNote();
        dashBoardPage.clickNoteActions();
        dashBoardPage.clickMoveToTrash();
        dashBoardPage.clickTrash();
        dashBoardPage.clickNoteActions();
        dashBoardPage.clickDeletePermanently();
        dashBoardPage.clickDeleteButton();
    }

}
