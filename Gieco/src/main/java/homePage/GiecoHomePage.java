package homePage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import org.openqa.selenium.JavascriptExecutor;

import static homePage.GiecoWebElementHomePage.*;

public class GiecoHomePage extends WebAPI {


    @FindBy(how = How.XPATH, using = StartQuoteButtonLocator)
    public WebElement StartQuote;
    @FindBy(how = How.XPATH, using = VerifyText1Locator)
    public WebElement VerifyText1;

    @FindBy(how = How.XPATH, using = AutoButtonLocator)
    public WebElement AutoButton;
    @FindBy(how = How.XPATH, using = AutoTextLocator)
    public WebElement AutoText;
    @FindBy(how = How.XPATH, using = RentersButtonLocator)
    public WebElement RentersButton;
    @FindBy(how = How.XPATH, using = RentersTextLocator)
    public WebElement RentersText;
    @FindBy(how = How.XPATH, using = BoatButtonLocator)
    public WebElement BoatButton;
    @FindBy(how = How.XPATH, using = BoatTextLocator)
    public WebElement BoatText;
    @FindBy(how = How.XPATH, using = HomeOwnerButtonLocator)
    public WebElement HomeOwnerButton;
    @FindBy(how = How.XPATH, using = HomeOwnerTextLocator)
    public WebElement HomeOwnerText;
    @FindBy(how = How.XPATH, using = HomePageLogInButtonLocator)
    public WebElement HomePageLogInButton;
    @FindBy(how = How.XPATH, using = LogInPageLogInButtonLocator)
    public WebElement LogInPageLoginButton;
    @FindBy(how = How.XPATH, using = LogInErrorTextLocator)
    public WebElement LogInErrorText;
    @FindBy(how = How.XPATH, using = User_ID_Email_Policy_NumberLocator)
    public WebElement Email;
    @FindBy(how = How.XPATH, using = PassWordFieldLocator)
    public WebElement PassWord;
    @FindBy(how = How.XPATH, using = MenuBarLocator)
    public WebElement MenuBar;
    @FindBy(how = How.XPATH, using = InsurancePanelLocator)
    public WebElement InsurancePanel;
    @FindBy(how = How.XPATH, using = VehicleInsurancePanelLocator)
    public WebElement VehicleInsurancePanel;
    @FindBy(how = How.XPATH, using = AutoPanelLocator)
    public WebElement AutoPanel;
    @FindBy(how = How.XPATH, using = AutoInsuranceTextLocator)
    public WebElement AutoInsuranceText;
    @FindBy(how = How.XPATH, using = MotorcyclePanelLocator)
    public WebElement MotorcyclePanel;
    @FindBy(how = How.XPATH, using = MotorcycleInsuranceTextLocator)
    public WebElement MotorcycleInsuranceText;
    @FindBy(how = How.XPATH, using = ATVPanelLocator)
    public WebElement ATVInsurancePanel;
    @FindBy(how = How.XPATH, using = ATVInsuranceTextLocator)
    public WebElement ATVInsuranceText;
    @FindBy(how = How.XPATH, using = RVInsuranceTextLocator)
    public WebElement RVInsuranceText;
    @FindBy(how = How.XPATH, using = RVPanelLocator)
    public WebElement RVInsurancePanel;
    @FindBy(how = How.XPATH, using = Boat_PWC_PanelLocator)
    public WebElement Boat_PWC_InsurancePanel;
    @FindBy(how = How.XPATH, using = Boat_PWC_InsuranceTextLocator)
    public WebElement Boat_PWC_InsuranceText;
    @FindBy(how = How.XPATH, using = CollectorAutoPanelLocator)
    public WebElement CollectorAutoPanel;
    @FindBy(how = How.XPATH, using = CollectorAutoInsuranceTextLocator)
    public WebElement CollectorAutoInsuranceText;
    @FindBy(how = How.XPATH, using = RideSharePanelLocator)
    public WebElement RideSharePanel;
    @FindBy(how = How.XPATH, using = RideShareInsuranceTextLocator)
    public WebElement RideShareInsuranceText;
    @FindBy(how = How.XPATH, using = CommercialAutoPanelLocator)
    public WebElement CommercialAutoPanel;
    @FindBy(how = How.XPATH, using = CommercialAutoInsuranceTextLocator)
    public WebElement CommercialAutoInsuranceText;
    @FindBy(how = How.XPATH, using = InformationPanelLocator)
    public WebElement InformationPanel;
    @FindBy(how = How.XPATH, using = MyAccount1PanelLocator)
    public WebElement MyAccount1Panel;
    @FindBy(how = How.XPATH, using = AddVehiclePanelLocator)
    public WebElement AddAVehiclePanel;
    @FindBy(how = How.XPATH, using = AddAVehicleTextLocator)
    public WebElement AddAVehicleText;
    @FindBy(how = How.XPATH, using = MakeAPaymentPanelLocator)
    public WebElement MakeAPaymentPanel;
    @FindBy(how = How.XPATH, using = MakeAPaymentTextLocator)
    public WebElement MakeAPaymentText;
    @FindBy(how = How.XPATH, using = GoPaperlessPanelLocator)
    public WebElement GoPaperlessPanel;
    @FindBy(how = How.XPATH, using = GoPaperlessTextLocator)
    public WebElement GoPaperlessText;
    @FindBy(how = How.XPATH, using = ContactUsPanelLocator)
    public WebElement ContactUsPanel;
    @FindBy(how = How.XPATH, using = ContactUsTextLocator)
    public WebElement ContactUsText;
    @FindBy(how = How.XPATH, using = SearchLoopLocator)
    public WebElement Loop;
    @FindBy(how = How.XPATH, using = SearchFieldLocator)
    public WebElement SearchBox;
    @FindBy(how = How.XPATH, using = SearchButtonLocator)
    public WebElement SearchButton;
    @FindBy(how = How.XPATH, using = VerifyTextLocator)
    public WebElement TextResult;
    @FindBy(how = How.XPATH, using = VerifyTextLocator1)
    public WebElement TextResult1;
    @FindBy(how = How.XPATH, using = VerifyTextLocator2) public WebElement TextResult2;
    @FindBy(how = How.XPATH, using = VerifyNoResultTextLocator) public WebElement NoResultText;

    public void checkStartQuoteButton() {
        StartQuote.click();
    }

    public void checkSearchButton() {
        SearchButton.click();
    }

    public void checkSearchBox(String InsuranceName) {
        SearchBox.sendKeys(InsuranceName);
    }

    public void checkSearchingLoop() {
        Loop.click();
    }
    public void VerifyNoResultText() {
        String actualResult = NoResultText.getText();
        String expectedResult = "No results for.*";
        Assert.assertEquals(actualResult, expectedResult, "Text don't Match");

    }


    public void checkExpectedResult() {
        String actualResult = TextResult.getText();
        String expectedResult = "Motor Cycle Insurance";
        Assert.assertEquals(actualResult, expectedResult, "Text don't Match");

    }

    public void checkExpectedResult1() {
        String actualResult = TextResult1.getText();
        String expectedResult = "Car Insurance";
        Assert.assertEquals(actualResult, expectedResult, "Text don't Match");

    }

    public void checkExpectedResult2() {
        String actualResult = TextResult2.getText();
        String expectedResult = "Home Insurance";
        Assert.assertEquals(actualResult, expectedResult, "Text don't Match");

    }

    public void checkContactUsPanel() {
        ContactUsPanel.click();

    }

    public void checkSGoPaperlessPanel() {
        GoPaperlessPanel.click();
    }

    public void verifyContactUsText() {
        String actualResult = ContactUsText.getText();
        String expectedResult = "What do you need help with today?";
        Assert.assertEquals(actualResult, expectedResult, "Text don't Match");
    }

    public void verifyGoPaperlessText() {
        String actualResult = GoPaperlessText.getText();
        String expectedResult = "Save paper and simplify your life.";
        Assert.assertEquals(actualResult, expectedResult, "Text don't Match");
    }

    public void checkMakeAPaymentPanel() {
        MakeAPaymentPanel.click();
    }

    public void verifyMakeAPaymentText() {
        String actualResult = MakeAPaymentText.getText();
        String expectedResult = "Pay with GEICO Express Services";
        Assert.assertEquals(actualResult, expectedResult, "Text don't Match");
    }

    public void checkAddAVehiclePanel() {
        AddAVehiclePanel.click();
    }

    public void checkInformationPanel() {
        InformationPanel.click();
    }

    public void checkMyAccount1Panel() {
        MyAccount1Panel.click();
    }

    public void verifyAddAVehicleText() {
        String actualResult = AddAVehicleText.getText();
        String expectedResult = "Policy number and VIN are required.";
        Assert.assertEquals(actualResult, expectedResult, "Text don't Match");
    }

    public void checkCommercialAutoPanel() {
        CommercialAutoPanel.click();
    }

    public void verifyCommercialAutoInsuranceText() {
        String actualResult = CommercialAutoInsuranceText.getText();
        String expectedResult = "Commercial auto insurance covers you for ";
        Assert.assertEquals(actualResult, expectedResult, "Text don't Match");
    }

    public void checkRideSharePanel() {
        RideSharePanel.click();
    }

    public void verifyRideShareInsuranceText() {
        String actualResult = RideShareInsuranceText.getText();
        String expectedResult = "One policy covers personal use plus driving for Uber, Lyft, and other rideshare companies.";
        Assert.assertEquals(actualResult, expectedResult, "Text don't Match");
    }

    public void checkCollectorAutoPanelLocator() {
        CollectorAutoPanel.click();
    }

    public void checkBoat_PWC_InsurancePanel() {
        Boat_PWC_InsurancePanel.click();
    }

    public void checkRVInsurancePanel() {
        RVInsurancePanel.click();
    }

    public void checkATVInsurancePanel() {
        ATVInsurancePanel.click();
    }

    public void verifyCollectorAutoInsuranceText() {
        String actualResult = CollectorAutoInsuranceText.getText();
        String expectedResult = "Boat Insurance";
        Assert.assertEquals(actualResult, expectedResult, "Text don't Match");
    }

    public void verifyBoat_PWC_InsuranceText() {
        String actualResult = Boat_PWC_InsuranceText.getText();
        String expectedResult = "Boat Insurance";
        Assert.assertEquals(actualResult, expectedResult, "Text don't Match");
    }

    public void verifyRVInsuranceText() {
        String actualResult = RVInsuranceText.getText();
        String expectedResult = "Insurance for your RV, camper, or motor home.";
        Assert.assertEquals(actualResult, expectedResult, "Text don't Match");
    }

    public void verifyATVInsuranceText() {
        String actualResult = ATVInsuranceText.getText();
        String expectedResult = "ATV Insurance Quote";
        Assert.assertEquals(actualResult, expectedResult, "Text don't Match");
    }

    public void verifyAutoInsuranceText() {
        String actualResult = AutoInsuranceText.getText();
        String expectedResult = "Car Insurance";
        Assert.assertEquals(actualResult, expectedResult, "Text don't Match");
    }

    public void checkMotorcyclePanel() {
        MotorcyclePanel.click();
    }

    public void verifyMotorcycleInsuranceText() {
        String actualResult = MotorcycleInsuranceText.getText();
        String expectedResult = "Welcome to Great Motorcycle Insurance Coverage";
        Assert.assertEquals(actualResult, expectedResult, "Text don't Match");
    }

    public void checkAutoPanel() {
        AutoPanel.click();
    }

    public void checkVehicleInsurancePanel() {
        VehicleInsurancePanel.click();
    }

    public void checkInsurancePanel() {
        InsurancePanel.click();
    }

    public void checkMenuBar() {
        MenuBar.click();
    }


    public void checkText1(String expectedResult) {
        String actualResult = VerifyText1.getText();
        Assert.assertEquals(actualResult, expectedResult, "Text don't match");
    }

    public void checkAutoButton() {
        AutoButton.click();
    }

    public void verifyAutoText(String expectedResult) {
        String actualResult = AutoText.getText();
        Assert.assertEquals(actualResult, expectedResult, "Text don't match");
    }

    public void checkRentersButton() {
        RentersButton.click();
    }

    public void verifyRentersText(String expectedResult) {
        String actualResult = RentersText.getText();
        Assert.assertEquals(actualResult, expectedResult, "Text don't match");
    }

    public void checkBoatButton() {
        BoatButton.click();
    }

    public void verifyBoatText(String expectedResult) {
        String actualResult = BoatText.getText();
        Assert.assertEquals(actualResult, expectedResult, "Text don't match");
    }

    public void checkHomeOwnerButton() {
        HomeOwnerButton.click();
    }

    public void verifyHomeOwnerText() {
        String actualResult = HomeOwnerText.getText();
        String expectedResult = "Homeowners";
        Assert.assertEquals(actualResult, expectedResult, "Text don't match");
    }

    public void verifyHomePageLogInButton() {
        HomePageLogInButton.click();
    }

    public void verifyLogInPageLogInButton() {
        LogInPageLoginButton.click();
    }

    public void verifyLogInErrorText() {
        String actualResult = LogInErrorText.getText();
        String expectedResult = "Please enter your password.";
        Assert.assertEquals(actualResult, expectedResult, "Text Don't Match");
    }

    public void enterUserName(String userID) {
        Email.sendKeys(userID);
    }

    public void enterPassWord(String pass_Word) {
        PassWord.sendKeys(pass_Word);
    }

    public void verifyLogInErrorText1() {
        String actualResult = driver.getTitle();
        String expectedResult = "Online Service Center | GEICO";
        Assert.assertEquals(actualResult, expectedResult, "Text Don't Match");
    }

    public void scrollDown() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", ContactUsPanel);
    }


}

