package mountCarmelHomePage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static mountCarmelHomePage.MountCarmelWebElement.*;

public class MountCarmelHomePage extends WebAPI {


    @FindBy(how = How.XPATH, using = FindDoctorLinkLocator)
    public WebElement FindDoctorLink;
    @FindBy(how = How.XPATH, using = TitleSearchFieldLocator)
    public WebElement TitleSearchField;
    @FindBy(how = How.XPATH, using = SearchingLoopButtonLocator)
    public WebElement SearchingLoopButton;
    @FindBy(how = How.XPATH, using = PulmonaryMedicineTextLocator)
    public WebElement PulmonaryMedicine;
    @FindBy(how = How.XPATH, using = FamilyDoctorTextLocator)
    public WebElement FamilyDoctor;
    @FindBy(how = How.XPATH, using = CardiologyTextLocator)
    public WebElement Cardiology;
    @FindBy(how = How.XPATH, using = PainMedicineTextLocator)
    public WebElement PainMedicine;
    @FindBy(how = How.XPATH, using = NeurologicalSurgeryTextLocator)
    public WebElement NeurologicalSurgery;
    @FindBy(how = How.XPATH, using = NonValidKeyWordTextLocator)
    public WebElement NonValidKeyWordText;
    @FindBy(how = How.XPATH, using = PayMyBillButtonLocator)
    public WebElement PayMyBillButton;
    @FindBy(how = How.XPATH, using = AccessMyMedicalRecordsButtonLocator)
    public WebElement AccessMyMedicalRecordsButton;
    @FindBy(how = How.XPATH, using = MedicalRecordsTextLocator)
    public WebElement MedicalRecordsText;
    @FindBy(how = How.XPATH, using = GetAnEstimateButtonLocator)
    public WebElement GetAnEstimateButton;
    @FindBy(how = How.XPATH, using = GetAnEstimateTextLocator)
    public WebElement GetAnEstimateText;
    @FindBy(how = How.XPATH, using = LogInIntoMyAccountLocator)
    public WebElement LogInIntoMyAccount;
    @FindBy(how = How.XPATH, using = LogInButtonLocator)
    public WebElement LogInButton;
    @FindBy(how = How.XPATH, using = LogInWelcomingTXT1Locator) public WebElement LogInWelcomingText;
    @FindBy(how = How.XPATH, using = UserNameFieldLocator) public WebElement UserNameField;
    @FindBy(how = How.XPATH, using = LogInFailTextLocator) public WebElement  LogInFailText;
    @FindBy(how = How.XPATH, using = PassWordFieldLocator) public WebElement  PassWordField;
    @FindBy(how = How.XPATH, using = SearchBoxFieldLocator) public WebElement  SearchBoxField;
    @FindBy(how = How.XPATH, using = SearchButtonFieldLocator) public WebElement  SearchButton;
    @FindBy(how = How.XPATH, using = RightPaginationLocator) public WebElement  RightPagination;
    @FindBy(how = How.XPATH, using = NonValidTextLocator) public WebElement  NonValidText;


    public void clickOnFindDoctorLink() {
        FindDoctorLink.click();
    }
    public void checkRightPagination() {
        RightPagination.isDisplayed();
    }
    public void clickOnSearchButton() {
        SearchButton.click();
    }
    public void enterKeyWordInSearchField(String keyWord) {
        SearchBoxField.sendKeys(keyWord);
    }
    public void enterPassWord(String password) {
        PassWordField.sendKeys(password);
    }
    public void enterUserName(String userID) {
        UserNameField.sendKeys(userID);
    }
    public void verifyNonValidTextText() {
        String actualResult = NonValidText.getText();
        String expectedResult = "No entries found.";
        Assert.assertEquals(actualResult, expectedResult, "Text don't Match!!!, check again");
    }
    public void verifyLogInFailTextText() {
        String actualResult = LogInFailText.getText();
        String expectedResult = "Login failed, please try again.";
        Assert.assertEquals(actualResult, expectedResult, "Text don't Match!!!, check again");
    }

    public void clickOnLogInIntoMyAccount() {
        LogInIntoMyAccount.click();
    }

    public void clickOnLogInButton() {
        LogInButton.click();
    }

    public void clickOnGetAnEstimateButton() {
        GetAnEstimateButton.click();
    }

    public void verifyLogInWelcomingText() {
        String actualResult = LogInWelcomingText.getText();
        String expectedResult = "Welcome to myHealth";
        Assert.assertEquals(actualResult, expectedResult, "Text don't Match!!!, check again");
    }

    public void verifyGetAnEstimateText() {
        String actualResult = GetAnEstimateText.getText();
        String expectedResult = "Price Estimates & Lists";
        Assert.assertEquals(actualResult, expectedResult, "Text don't Match!!!, check again");
    }

    public void clickOnAccessMyMedicalRecordsButton() {
        AccessMyMedicalRecordsButton.click();
    }

    public void verifyMedicalRecordsText() {
        String actualResult = MedicalRecordsText.getText();
        String expectedResult = "Medical Records";
        Assert.assertEquals(actualResult, expectedResult, "Text don't Match!!!, check again");
    }

    public void clickOnPayMyBillButton() {
        PayMyBillButton.click();
    }

    public void verifyPayBillPageTitle() {
        String actualResult = driver.getTitle();
        String expectedResult = "Billing & Insurance, Mount Carmel Health, Columbus, OH";
        Assert.assertEquals(actualResult, expectedResult, "Text don't Match!!!, check again");
    }

    public void enterTitleOnSearchField(String speciality) {
        TitleSearchField.sendKeys(speciality);
    }

    public void clickOnLoopButton() {
        SearchingLoopButton.click();
    }

    public void verifyNonValidKeyWordText() {
        String actualResult = NonValidKeyWordText.getText();
        String expectedResult = "0 Doctors & Providers Found";
        Assert.assertEquals(actualResult, expectedResult, "Text don't Match!!!, check again");
    }

    public void verifyText(String expectedResults) {
        if (expectedResults == "Pulmonary Medicine") {
            String actualResult = PulmonaryMedicine.getText();
            String expectedResult = "Pulmonary Medicine";
            Assert.assertEquals("", "", "Text don't Match!!!!!, try again");
        } else if (expectedResults == "Family Doctor") {

            String actualResult = FamilyDoctor.getText();
            String expectedResult = "Family Doctor";
            Assert.assertEquals("", "", "Text don't Match!!!!!, try again");
        } else if (expectedResults == "Cardiology") {
            String actualResult = Cardiology.getText();
            String expectedResult = "Cardiology";
            Assert.assertEquals("", "", "Text don't Match!!!!!, try again");
        } else if (expectedResults == "Pain Medicine") {
            String actualResult = PainMedicine.getText();
            String expectedResult = "Pain Medicine";
            Assert.assertEquals("", "", "Text don't Match!!!!!, try again");
        } else if (expectedResults == "Neurological Surgery") {
            String actualResult = NeurologicalSurgery.getText();
            String expectedResult = "Neurological Surgery";
            Assert.assertEquals("", "", "Text don't Match!!!!!, try again");
        }

    }
}