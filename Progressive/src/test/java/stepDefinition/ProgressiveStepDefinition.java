package stepDefinition;

import common.WebAPI;
import homePage.ProgressiveHomePage;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import org.seleniumhq.jetty9.util.security.Password;

import java.io.IOException;

public class ProgressiveStepDefinition extends WebAPI {

    ProgressiveHomePage homePage;

@BeforeStep
public  void getInit(){
    homePage= PageFactory.initElements(driver,ProgressiveHomePage.class);
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



    @Given("I am in Progressive Home Page")
    public void i_am_in_progressive_home_page() throws IOException {
       openBrowser("https://www.progressive.com/");
    }
    @Given("I click On Auto Button")
    public void i_click_on_auto_button() {
    homePage.checkAutoButton();
    }
    @Then("I should See Auto text displayed On the next Page")
    public void i_should_see_auto_text_displayed_on_the_next_page() {
homePage.verifyHomeText();
    }
    @Given("I click on Auto+home Button")
    public void i_click_on_auto_home_button() {
      homePage.checkAuto_Home_Button();
    }
    @Then("I should see Auto+Home Displayed on the next Page")
    public void i_should_see_auto_home_displayed_on_the_next_page() {
       homePage.verifyAuto_Home_Text();
    }
    @Given("I click on Home Button")
    public void i_click_on_home_button() {
       homePage.checkHomeButton();
    }
    @Then("I should see HomeOwners Displayed on the next Page")
    public void i_should_see_home_owners_displayed_on_the_next_page() {
        homePage.verifyHomeText();
    }
    @Given("I click on Life Button")
    public void i_click_on_life_button() {
        homePage.checkLifeButton();
    }




    @Then("I should see Select type of life insurance Displayed on the next Page")
    public void i_should_see_select_type_of_life_insurance_displayed_on_the_next_page() {
       homePage.verifyLifeText();
    }

    @Given("I click on Motorcycle Button")
    public void i_click_on_motorcycle_button() {
  homePage.checkMotorcycleButton();
    }
    @Then("I should see Motorcycle Displayed on the next Page")
    public void i_should_see_motorcycle_displayed_on_the_next_page() {
homePage.verifyMotorcycleText();
    }

    @Given("I click on Renters Button")
    public void i_click_on_renters_button() {
      homePage.checkRentersButton();
    }
    @Then("I should see Renters Displayed on the next Page")
    public void i_should_see_renters_displayed_on_the_next_page() {
     homePage.verifyRentersText();
    }

    @Given("I click on Condo Button")
    public void i_click_on_condo_button() {
    homePage.checkCondoButton();
    }
    @Then("I should see Condo Displayed on the next Page")
    public void i_should_see_condo_displayed_on_the_next_page() {
homePage.verifyCondoText();
    }


    @Given("I click on Boat\\/PWC  Button")
    public void i_click_on_boat_pwc_button() {
  homePage.checkBoatButton();
    }
    @Then("I should see Boat\\/PWC  Displayed on the next Page")
    public void i_should_see_boat_pwc_displayed_on_the_next_page() {
   homePage.verifyBoatText();
    }

    @Given("I click on RV\\/Trailer   Button")
    public void i_click_on_rv_trailer_button() {
homePage.checkRVTrailerButton();
    }
    @Then("I should see RV\\/Trailer   Displayed on the next Page")
    public void i_should_see_rv_trailer_displayed_on_the_next_page() {
homePage.verifyRVTrailerText();
    }

    @Given("I click on Auto_Condo   Button")
    public void i_click_on_auto_condo_button() {
homePage.checkAutoCondoButton();
    }
    @Then("I should see Auto_Condo   Displayed on the next Page")
    public void i_should_see_auto_condo_displayed_on_the_next_page() {
homePage.verifyAutoCondoText();
    }


    @Given("I click on More choices button")
    public void i_click_on_more_choices_button() {
homePage.checkMoreChoicesButton();
    }
    @Then("I should See Bundle and save an average of {int}% on auto! text displayed")
    public void i_should_see_bundle_and_save_an_average_of_on_auto_text_displayed(Integer int1) {
homePage.verifyMoreChoicesText();
    }
    @Then("I click on ATV  Button")
    public void i_click_on_atv_button() {
homePage.checkATVButton();
    }
    @Then("I should see ATV Text Displayed")
    public void i_should_see_atv_text_displayed() throws InterruptedException {
    Thread.sleep(3000);
homePage.verifyATVText();
    }

    @Then("I click on Car Shopping  Button")
    public void i_click_on_car_shopping_button() {
      homePage.checkCarShoppingButton();
    }
    @Then("I should see Find a new ride or sell your current vehicle Text Displayed")
    public void i_should_see_find_a_new_ride_or_sell_your_current_vehicle_text_displayed() {
     homePage.verifyCarShoppingText();
    }

    @Then("I click on Classic Car  Button")
    public void i_click_on_classic_car_button() {
      homePage.checkClassicCarButton();
    }
    @Then("I should see Classic Car Text Displayed")
    public void i_should_see_classic_car_text_displayed() throws InterruptedException {
        Thread.sleep(3000);
     homePage.verifyClassicCarText();
    }

    @Then("I click on Commercial  Button")
    public void i_click_on_commercial_button() {
       homePage.checkCommercialButton();
    }
    @Then("I should see Commercial Text Displayed")
    public void i_should_see_commercial_text_displayed() throws InterruptedException {
    Thread.sleep(3000);
    homePage.verifyCommercialText();
    }

    @Then("I click on Dental  Button")
    public void i_click_on_dental_button() {
homePage.checkDentalButton();
    }
    @Then("I should see Select type of health insurance Text Displayed")
    public void i_should_see_select_type_of_health_insurance_text_displayed() {
homePage.verifyDentalText();
    }

    @Then("I click on Electronic Device  Button")
    public void i_click_on_electronic_device_button() {
homePage.checkElectronicDeviceButton();
    }
    @Then("I should see  Electronic Device Text Displayed")
    public void i_should_see_electronic_device_text_displayed() throws InterruptedException {
    Thread.sleep(3000);
homePage.verifyElectronicDeviceText();
    }

    @Then("I click on FLOOD  Button")
    public void i_click_on_flood_button() {
homePage.checkFloodButton();
    }
    @Then("I should see  FLOOD Text Displayed")
    public void i_should_see_flood_text_displayed() throws InterruptedException {
 Thread.sleep(2000);
 homePage.verifyFloodText();
    }

    @Then("I click on  Golf Cart  Button")
    public void i_click_on_golf_cart_button() {
  homePage.checkGolfCartButton();
    }
    @Then("I should see  Golf Cart Text Displayed")
    public void i_should_see_golf_cart_text_displayed() throws InterruptedException {
    Thread.sleep(2000);
      homePage.verifyGolfCartText();
    }

    @Then("I click on   Health  Button")
    public void i_click_on_health_button() {
 homePage.checkHealthButton();
    }
    @Then("I should see   Health Text Displayed")
    public void i_should_see_health_text_displayed() {
homePage.verifyHealthText();
    }

    @Then("I click on Personal Loans Button")
    public void i_click_on_personal_loans_button() {
homePage.checkPersonalLoansTextButton();
    }
    @Then("I should see Personal Loans Text Displayed")
    public void i_should_see_personal_loans_text_displayed() throws InterruptedException {
    Thread.sleep(2000);
homePage.verifyPersonalLoansText();
    }

    @Then("I click on ID Theft Button")
    public void i_click_on_id_theft_button() {
homePage.checkIDTheftButton();
    }
    @Then("I should see ID Theft Text Displayed")
    public void i_should_see_id_theft_text_displayed() throws InterruptedException {
Thread.sleep(2000);
homePage.verifyIDTheftText();
    }


    @Given("I click on LogIn Link")
    public void i_click_on_log_in_link() {
homePage.checkLogInLink();
    }
    @Then("I click on LogIn Button")
    public void i_click_on_log_in_button() {
homePage.checkLogInButton();
    }

    @Then("I should see The login information you entered does not match our records. Please try again. text displayed")
    public void i_should_see_the_login_information_you_entered_does_not_match_our_records_please_try_again_text_displayed() {
homePage.verifyErrorLogInText();

    }

    @Given("I enter a correct {string}")
    public void i_enter_a_correct_user_id(String UserID) {
homePage.checkUserIdField(UserID);
    }

    @Given("I enter wrong PassWord {string}")
    public void i_enter_wrong_pass_word(String Password) {
        homePage.checkPassWordField(Password);
    }



    @Given("I enter a incorrect {string}")
    public void i_enter_a_incorrect(String UserID) {
        homePage.checkUserIdField(UserID);
    }
    @Given("I enter Correct PassWord {string}")
    public void i_enter_correct_pass_word(String password) {
        homePage.checkPassWordField(password);
    }





















}
