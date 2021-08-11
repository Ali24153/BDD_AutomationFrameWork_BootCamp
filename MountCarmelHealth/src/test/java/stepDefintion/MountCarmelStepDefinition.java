package stepDefintion;

import common.WebAPI;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import mountCarmelHomePage.MountCarmelHomePage;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.List;

public class MountCarmelStepDefinition extends WebAPI {
    static MountCarmelHomePage homePage;

    @BeforeStep
    public static void getInit() {
        homePage = PageFactory.initElements(driver, MountCarmelHomePage.class);
    }

    @After
    public void closeBrowser() {
        cleanUp();
    }

    //cucumber hook
    @AfterStep
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            //take screen shot
            final byte[] screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot, "image/png", "demo1"); //embed in the reports
        }
    }

    @Given("I am In Mount Carmel Health Home Page")
    public void i_am_in_mount_carmel_health_home_page() throws IOException {
        openBrowser("https://www.mountcarmelhealth.com/");
    }

    @Given("I click on Find A Doctor Button")
    public void i_click_on_find_a_doctor_button() {
        homePage.clickOnFindDoctorLink();
    }

    @Given("I enter A {string} On the search Field")
    public void i_enter_a_on_the_search_field(String Speciality) {
        homePage.enterTitleOnSearchField(Speciality);
    }

    @Given("I click On the Searching Loop")
    public void i_click_on_the_searching_loop() {
        homePage.clickOnLoopButton();
    }

    @Then("I should see the {string} which is  Doctors names Specialized on the searched KeyWord displayed")
    public void i_should_see_the_which_is_doctors_names_specialized_on_the_searched_key_word_displayed(String ExpectedResults) {
        homePage.verifyText(ExpectedResults);
    }


    @Given("I enter A Non Valid {string}")
    public void i_enter_a_non_valid(String KeyWord) {
        homePage.enterTitleOnSearchField(KeyWord);
    }

    @Then("Patient Should see Zero Doctors & Providers Found")
    public void patient_should_see_zero_doctors_providers_found() {
        homePage.verifyNonValidKeyWordText();
    }

    @Given("I click on Pay My Bill Button")
    public void i_click_on_pay_my_bill_button() {
      homePage.clickOnPayMyBillButton();
    }

    @Then("The Page Title should be Billing & Insurance, Mount Carmel Health, Columbus, OH")
    public void the_page_title_should_be_billing_insurance_mount_carmel_health_columbus_oh() {
      homePage.verifyPayBillPageTitle();
    }

    @Given("I click on Access My Medical Records Button")
    public void i_click_on_access_my_medical_records_button() {
    homePage.clickOnAccessMyMedicalRecordsButton();
    }
    @Then("I should see Medical Records Text Displayed")
    public void i_should_see_medical_records_text_displayed() {
homePage.verifyMedicalRecordsText();
    }
    @Given("I click on get an estimate  Button")
    public void i_click_on_get_an_estimate_button() {
homePage.clickOnGetAnEstimateButton();
    }
    @Then("I should see Price Estimates & Lists Text Displayed")
    public void i_should_see_price_estimates_lists_text_displayed() {
       homePage.verifyGetAnEstimateText();
    }


    @Given("I click On Log In Into My Account Button")
    public void i_click_on_log_in_into_my_account_button() {
homePage. clickOnLogInIntoMyAccount();
    }
    @Then("I should See Welcome To My Health")
    public void i_should_see_welcome_to_my_health() {
homePage.verifyLogInWelcomingText();
    }
    @Then("I Click On Sign In Button")
    public void i_click_on_sign_in_button() {
        homePage.clickOnLogInButton();
    }
    @Then("I should see the same Text Before click In On Sign In Button")
    public void i_should_see_the_same_text_before_click_in_on_sign_in_button() {
homePage.verifyLogInWelcomingText();
    }

    @Then("I enter a correct UserID")
    public void i_enter_a_correct_user_id(io.cucumber.datatable.DataTable dataTable) {
        List<List<String>> data=dataTable.asLists(String.class);
        String userId=data.get(1).get(0);
        System.out.println(userId);
        homePage.enterUserName(userId);
    }

    @Then("I should see the Login Fail Text")
    public void i_should_see_the_login_fail_text() {
   homePage.verifyLogInFailTextText();
    }

    @Then("I enter a correct Password")
    public void i_enter_a_correct_password(io.cucumber.datatable.DataTable dataTable) {
    List<List<String>>data=dataTable.asLists(String.class);
    String password=data.get(1).get(0);
    homePage.enterPassWord(password);
    }
    @Then("I enter a Incorrect Password")
    public void i_enter_a_incorrect_password(io.cucumber.datatable.DataTable dataTable) {
       List<List<String>> data= dataTable.asLists(String.class);
       String password=data.get(1).get(0);
       homePage.enterPassWord(password);
    }
    @Then("I enter a Incorrect UserID")
    public void i_enter_a_incorrect_user_id(io.cucumber.datatable.DataTable dataTable) {
        List<List<String>>data=dataTable.asLists(String.class);
        String userId=data.get(1).get(0);
        homePage.enterUserName(userId);
    }
    @Given("I enter Valid {string} in the search box")
    public void i_enter_valid_in_the_search_box(String keyWord) {
 homePage.enterKeyWordInSearchField(keyWord);
    }
    @Given("I click On search button")
    public void i_click_on_search_button() {
homePage.clickOnSearchButton();
    }
    @Then("I should see the right pagination displayed")
    public void i_should_see_the_right_pagination_displayed() throws InterruptedException {
        Thread.sleep(2000);
       homePage.checkRightPagination();
    }

    @Given("I enter Invalid {string} in the search box")
    public void i_enter_invalid_in_the_search_box(String keyWord) {
       homePage.enterKeyWordInSearchField(keyWord);
    }
    @Then("I should see No entries found as search result")
    public void i_should_see_no_entries_found_as_search_result() {
homePage.verifyNonValidTextText();
    }








}

