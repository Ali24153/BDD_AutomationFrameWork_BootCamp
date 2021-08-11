package stepDefinitions;

import common.WebAPI;
import io.cucumber.java.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import krogerHomePage.KrogerHomePage;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.List;

public class KrogerStepDefinitions extends WebAPI {

    KrogerHomePage homePage;

    @BeforeStep
    public void getInit(){
        homePage= PageFactory.initElements(driver,KrogerHomePage.class);
    }
    @After
    public void closeBrowser() {
        cleanUp();
    }

    @AfterStep
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            //take screen shot
            final byte[] screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot, "image/png", "demo1"); //embed in the reports
        }
    }


    @Given("I am On Kroger HomePage")
    public void i_am_on_kroger_home_page() throws IOException {
      openBrowser("https://www.kroger.com/");
    }
    @Given("I enter A valid {string} Name In the search box")
    public void i_enter_a_valid_name_in_the_search_box(String product) {
        homePage.enterTextInSearchBox(product);
    }
    @Given("I click On Searching Button")
    public void i_click_on_searching_button() {
homePage.clickOnLoop();
    }
    @Then("I should see the Product name displayed as searched {string}")
    public void i_should_see_the_product_name_displayed_as_searched(String result) throws InterruptedException {
        Thread.sleep(2000);
homePage.verifyTextResult(result);
    }


    @Given("I enter A Invalid {string} Name In the search bon")
    public void i_enter_a_invalid_name_in_the_search_bon(String product) {
       homePage.enterTextInSearchBox(product);
    }
    @Then("I should see No results text displayed as searched {string}")
    public void i_should_see_no_results_text_displayed_as_searched(String result) {

    }

    @Given("I click On Sign In Arrow on the right corner of Kroger homePage")
    public void i_click_on_sign_in_arrow_on_the_right_corner_of_kroger_home_page() throws InterruptedException {
        Thread.sleep(3000);
     homePage.clickOnSignInArrow();
    }
    @Given("Click on sign In button Under Sign In Arrow")
    public void click_on_sign_in_button_under_sign_in_arrow() throws InterruptedException {
        Thread.sleep(3000);
homePage.clickOnSignInButton1();
    }
    @Given("I click on sign In Button")
    public void i_click_on_sign_in_button() {
    homePage.clickOnSignInButton2();
    }
    @Then("I should see an error message saying please enter a valid Email Address")
    public void i_should_see_an_error_message_saying_please_enter_a_valid_email_address() {
homePage.verifyMissingEmailText();
    }
    @Given("I enter a wrong Email Address")
    public void i_enter_a_wrong_email_address(io.cucumber.datatable.DataTable dataTable) {
        List<List<String>> data=dataTable.asLists(String.class);
        String email=data.get(1).get(0);
        homePage.checkEmailAddressField(email);
    }
    @Given("I enter a Correct Email Address")
    public void i_enter_a_correct_email_address(io.cucumber.datatable.DataTable dataTable) {
       List<List<String>> data=dataTable.asLists(String.class);
       String email=data.get(1).get(0);
       homePage.checkEmailAddressField(email);
    }
    @Given("I enter wrong password")
    public void i_enter_wrong_password(io.cucumber.datatable.DataTable dataTable) {
       List<List<String>> data=dataTable.asLists(String.class);
    String password=data.get(1).get(0) ;
    homePage.checkPassWordField(password);}

    @Then("I should see an error message saying please enter a valid password")
    public void i_should_see_an_error_message_saying_please_enter_a_valid_password() {
      homePage.verifyMissingPassWordText();
    }

    @Given("I enter Correct password")
    public void i_enter_correct_password(io.cucumber.datatable.DataTable dataTable) {
        List<List<String>> data=dataTable.asLists(String.class);
        String password=data.get(1).get(0) ;
        homePage.checkPassWordField(password);}
    }







