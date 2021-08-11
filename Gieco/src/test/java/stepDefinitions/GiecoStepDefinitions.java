package stepDefinitions;

import common.WebAPI;
import homePage.GiecoHomePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import homePage.GiecoHomePage;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

public class GiecoStepDefinitions extends WebAPI {

    GiecoHomePage amar;

    @BeforeStep
    public void getInit() {
        amar = PageFactory.initElements(driver, GiecoHomePage.class);
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


    @Given("I am in Gieco Home Page")
    public void i_am_in_gieco_home_page() throws IOException {
        openBrowser("https://www.geico.com/");
    }

    @Given("I click On Start Quote Button")
    public void i_click_on_start_quote_button() {
        amar.checkStartQuoteButton();
    }

    @Then("I should see {string} Text")
    public void i_should_see_required_information_text(String expectedResult) {
        amar.checkText1("\"" + expectedResult + "\"");


    }

    @Given("I click on Auto button")
    public void i_click_on_auto_button() {
        amar.checkAutoButton();
    }

    @Then("I should see {string} displayed in the left of the homepage")
    public void i_should_see_auto_displayed_in_the_left_of_the_homepage(String expectedResult) {
        amar.verifyAutoText(expectedResult);
    }

    @Given("I click on Renters Button")
    public void i_click_on_renters_button() {
        amar.checkAutoButton();
    }

    @Then("I should see {string} Text displayed in the left of the homepage")
    public void i_should_see_text_displayed_in_the_left_of_the_homepage(String expectedResult) {
        amar.verifyBoatText(expectedResult);
    }

    @Given("I click on Boat Button")
    public void i_click_on_boat_button() {
        amar.checkBoatButton();
    }

    @Then("I should see {string} Text displayed in  the homepage")
    public void i_should_see_text_displayed_in_the_homepage(String expectedResult) {
        amar.verifyBoatText(expectedResult);
    }

    @Given("I click on HomeOwner Button")
    public void i_click_on_home_owner_button() {
        amar.checkHomeOwnerButton();

    }

    @Then("I should see HomeOwner Text displayed in  the homepage")
    public void i_should_see_home_owner_text_displayed_in_the_homepage() {
        amar.verifyHomeOwnerText();
    }

    @Given("click on Log In button in the HomePage")
    public void click_on_log_in_button_in_the_home_page() {
        amar.verifyHomePageLogInButton();
    }

    @Given("click on LogIn button in the LoginPage")
    public void click_on_log_in_button_in_the_login_page() {
        amar.verifyLogInPageLogInButton();
    }

    @Then("I should see Please enter your password.")
    public void i_should_see_please_enter_your_password() {
        amar.verifyLogInErrorText();
    }

    @Given("I enter UserId in UserId field")
    public void i_enter_user_id_in_user_id_field(DataTable dataTable) {
        List<List<String>> data = dataTable.asLists(String.class);
        String userId = data.get(0).get(0);
        amar.enterUserName(userId);
    }

    @Then("I click On login Button found  in The LogIn page")
    public void i_click_on_login_button_found_in_the_log_in_page() {
        amar.verifyLogInPageLogInButton();
    }

    @Then("I should see LogIn Error Message")
    public void i_should_see_log_in_error_message() {
        amar.verifyLogInErrorText();
    }

    @Given("I enter PassWord is PassWord Field")
    public void i_enter_pass_word_is_pass_word_field(DataTable dataTable) {
        List<List<String>> password = dataTable.asLists(String.class);
        String passWord1 = password.get(1).get(0);
        System.out.println(passWord1);
        amar.enterPassWord(passWord1);
    }

    @Then("I should see Error Message")
    public void i_should_see_error_message() {
        amar.verifyLogInErrorText1();
    }

    @Given("I click on Menu Button")
    public void i_click_on_menu_button() {
        amar.checkMenuBar();
    }

    @Given("I click On Insurance Panel")
    public void i_click_on_insurance_panel() {
        amar.checkInsurancePanel();
    }

    @Given("I chose Vehicle Insurance Panel")
    public void i_chose_vehicle_insurance_panel() {
        amar.checkVehicleInsurancePanel();
    }

    @Then("I click on Auto Link")
    public void i_click_on_auto_link() {
        amar.checkAutoPanel();
    }

    @Then("I should see Car Insurance displayed On the Page")
    public void i_should_see_car_insurance_displayed_on_the_page() {
        amar.verifyAutoInsuranceText();
    }

    @Then("I click on MotorCycle Link")
    public void i_click_on_motor_cycle_link() {
        amar.checkMotorcyclePanel();
    }

    @Then("I should see MotorCycle Insurance displayed On the Page")
    public void i_should_see_motor_cycle_insurance_displayed_on_the_page() {
        amar.verifyMotorcycleInsuranceText();
    }

    @Then("I click on ATV Link")
    public void i_click_on_atv_link() {
        amar.checkATVInsurancePanel();
    }

    @Then("I should see ATV Insurance displayed On the Page")
    public void i_should_see_atv_insurance_displayed_on_the_page() {
        amar.verifyATVInsuranceText();
    }

    @Then("I click on RV Link")
    public void i_click_on_rv_link() {
        amar.checkRVInsurancePanel();
    }

    @Then("I should see RV Insurance displayed On the Page")
    public void i_should_see_rv_insurance_displayed_on_the_page() {
        amar.verifyRVInsuranceText();
    }

    @Then("I click on Boat\\/PWC Link")
    public void i_click_on_boat_pwc_link() {
        amar.verifyBoat_PWC_InsuranceText();
    }

    @Then("I should see Boat\\/PWC Insurance displayed On the Page")
    public void i_should_see_boat_pwc_insurance_displayed_on_the_page() {
        amar.verifyBoat_PWC_InsuranceText();
    }

    @Then("I click on Collector Auto Link")
    public void i_click_on_collector_auto_link() {
        amar.checkCollectorAutoPanelLocator();

    }

    @Then("I should see Collector Auto Insurance displayed On the Page")
    public void i_should_see_collector_auto_insurance_displayed_on_the_page() {
        amar.verifyCollectorAutoInsuranceText();
    }

    @Then("I click on Rideshare Link")
    public void i_click_on_rideshare_link() {
        amar.checkRideSharePanel();
    }

    @Then("I should see Rideshare Insurance displayed On the Page")
    public void i_should_see_rideshare_insurance_displayed_on_the_page() {
        amar.verifyRideShareInsuranceText();
    }

    @Then("I click on Commercial Auto Link")
    public void i_click_on_commercial_auto_link() {
        amar.checkCommercialAutoPanel();
    }

    @Then("I should see Commercial Auto Insurance displayed On the Page")
    public void i_should_see_commercial_auto_insurance_displayed_on_the_page() {
        amar.verifyCommercialAutoInsuranceText();
    }


    @Given("I click On Information  Panel")
    public void i_click_on_information_panel() {
        amar.checkInformationPanel();
    }

    @Given("I chose My Account Panel")
    public void i_chose_my_account_panel() {
        amar.checkMyAccount1Panel();
    }

    @Then("I click on Add A Vehicle Link")
    public void i_click_on_add_a_vehicle_link() {

        amar.checkAddAVehiclePanel();
    }

    @Then("I should see Add or Replace a Vehicle displayed")
    public void i_should_see_add_or_replace_a_vehicle_displayed() {
        amar.verifyAddAVehicleText();
    }

    @Then("I click on Make a Payment Link")
    public void i_click_on_make_a_payment_link() {
        amar.checkMakeAPaymentPanel();
    }

    @Then("I should see Pay with GEICO Express Services displayed")
    public void i_should_see_pay_with_geico_express_services_displayed() {
        amar.verifyMakeAPaymentText();
    }

    @Then("I click on Go Paperless Link")
    public void i_click_on_go_paperless_link() {
        amar.checkSGoPaperlessPanel();
    }

    @Then("I should see Save paper and simplify your life displayed")
    public void i_should_see_save_paper_and_simplify_your_life_displayed() {
        amar.verifyGoPaperlessText();
    }

    @Given("I chose Contact Us Panel")
    public void i_chose_contact_us_panel() {
        amar.checkContactUsPanel();
    }

    @Then("I should see What do you need help with today? displayed")
    public void i_should_see_what_do_you_need_help_with_today_displayed() {
        amar.verifyContactUsText();
    }

    @Given("I scroll down until visible")
    public void i_scroll_down_until_visible() {
        amar.scrollDown();
    }

    @Given("I click on the Searching Loop")
    public void i_click_on_the_searching_loop() {
amar.checkSearchingLoop();
    }

    @Given("I enter {string} Name")
    public void i_enter_a_valid_insurance_name(String InsuranceName) {
    amar.checkSearchBox( InsuranceName);
    }

    @Given("I click on Search Button")
    public void i_click_on_search_button() {
  amar.checkSearchButton();
    }

    @Then("I should see {string} Searched Displayed")
    public void i_should_see_the_insurance_searched_displayed() {

    }

    @Then("I should see {string} Displayed")
    public void i_should_see_displayed(String ExpectedInsurance) {
        if (ExpectedInsurance == "MotorCycle Insurance") {
            amar.checkExpectedResult();
        } else if (ExpectedInsurance == "Car Insurance") {
            amar.checkExpectedResult1();
        } else if (ExpectedInsurance == "Home Insurance") {
            amar.checkExpectedResult2();
        } else {
            System.out.println("Method not Working");
        }


    }
    @Given("I enter {string} in SearchBox")
    public void i_enter_in_search_box(String NonValidInsuranceName) {
        amar. SearchBox.sendKeys(NonValidInsuranceName);
    }

    @Then("I should see No Results Text Message")
    public void i_should_see_no_results_text_message() {
    amar.VerifyNoResultText();
    }

}