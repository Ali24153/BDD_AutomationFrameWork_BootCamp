package homePage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static homePage.ProgressiveWebElementHomePage.*;

public class ProgressiveHomePage extends WebAPI {


    @FindBy(how = How.XPATH, using = AutoButtonLocator)
    public WebElement AutoButton;
    @FindBy(how = How.XPATH, using = AutoTextLocator)
    public WebElement AutoText;
    @FindBy(how = How.XPATH, using = Auto_Home_Button_Locator)
    public WebElement Auto_Home_Button;
    @FindBy(how = How.XPATH, using = Auto_Home_Text_Locator)
    public WebElement Auto_Home_Text;
    @FindBy(how = How.XPATH, using = HomeButtonLocator)
    public WebElement HomeButton;
    @FindBy(how = How.XPATH, using = HomeTextLocator)
    public WebElement HomeText;
    @FindBy(how = How.XPATH, using = LifeButtonLocator)
    public WebElement LifeButton;
    @FindBy(how = How.XPATH, using = LifeTextLocator)
    public WebElement LifeText;
    @FindBy(how = How.XPATH, using = MotorcycleButtonLocator)
    public WebElement MotorcycleButton;
    @FindBy(how = How.XPATH, using = MotorcycleTextLocator)
    public WebElement MotorcycleText;
    @FindBy(how = How.XPATH, using = RentersButtonLocator)
    public WebElement RentersButton;
    @FindBy(how = How.XPATH, using = RentersTextLocator)
    public WebElement RentersText;
    @FindBy(how = How.XPATH, using = CondoButtonLocator)
    public WebElement CondoButton;
    @FindBy(how = How.XPATH, using = CondoTextLocator)
    public WebElement CondoText;
    @FindBy(how = How.XPATH, using = Boat_PWC_button_Locator)
    public WebElement BoatButton;
    @FindBy(how = How.XPATH, using = Boat_PWC_Text_Locator)
    public WebElement BoatText;
    @FindBy(how = How.XPATH, using = RVTrailerButtonLocator)
    public WebElement RVTrailerButton;
    @FindBy(how = How.XPATH, using = RVTrailerTextLocator)
    public WebElement RVTrailerText;
    @FindBy(how = How.XPATH, using = Auto_CondoButtonLocator)
    public WebElement Auto_CondoButton;
    @FindBy(how = How.XPATH, using = Auto_CondoTextLocator)
    public WebElement Auto_CondoText;
    @FindBy(how = How.XPATH, using = MoreChoicesButtonLocator)
    public WebElement MoreChoicesButton;
    @FindBy(how = How.XPATH, using = MoreChoicesTextLocator)
    public WebElement MoreChoicesText;
    @FindBy(how = How.XPATH, using = ATVButtonLocator)
    public WebElement ATVButton;
    @FindBy(how = How.XPATH, using = ATVTextLocator)
    public WebElement ATVText;
    @FindBy(how = How.XPATH, using = CarShoppingButtonLocator)
    public WebElement CarShoppingButton;
    @FindBy(how = How.XPATH, using = CarShoppingTextLocator) public WebElement CarShoppingText;
    @FindBy(how = How.XPATH, using = ClassicCarButtonLocator) public WebElement ClassicCarButton;
    @FindBy(how = How.XPATH, using = ClassicCarTextLocator) public WebElement ClassicCarText;
    @FindBy(how = How.XPATH, using = CommercialButtonLocator) public WebElement CommercialButton;
    @FindBy(how = How.XPATH, using = CommercialTextLocator) public WebElement CommercialText;
    @FindBy(how = How.XPATH, using = DentalButtonLocator) public WebElement DentalButton;
    @FindBy(how = How.XPATH, using = DentalTextLocator) public WebElement DentalText;
    @FindBy(how = How.XPATH, using = ElectronicDeviceButtonLocator) public WebElement ElectronicDeviceButton;
    @FindBy(how = How.XPATH, using = ElectronicDeviceTextLocator) public WebElement ElectronicDeviceText;
    @FindBy(how = How.XPATH, using = FloodButtonLocator) public WebElement FloodButton;
    @FindBy(how = How.XPATH, using = FloodTextLocator) public WebElement FloodText;
    @FindBy(how = How.XPATH, using = GolfCartButtonLocator) public WebElement GolfCartButton;
    @FindBy(how = How.XPATH, using = GolfCartTextLocator) public WebElement GolfCartText;
    @FindBy(how = How.XPATH, using = HealthButtonLocator) public WebElement HealthButton;
    @FindBy(how = How.XPATH, using = HealthTextLocator) public WebElement HealthText;
    @FindBy(how = How.XPATH, using = PersonalLoansButtonLocator) public WebElement PersonalLoansButton;
    @FindBy(how = How.XPATH, using = PersonalLoansTextLocator) public WebElement PersonalLoansText;
    @FindBy(how = How.XPATH, using = IDTheftButtonLocator) public WebElement IDTheftButton;
    @FindBy(how = How.XPATH, using = IDTheftTextLocator) public WebElement IDTheftText;
    @FindBy(how = How.XPATH, using = LogInLinkLocator) public WebElement LogInLink;
    @FindBy(how = How.XPATH, using = LogInButtonLocator) public WebElement LogInButton;
    @FindBy(how = How.XPATH, using = ErrorLogInText) public WebElement ErrorText;
    @FindBy(how = How.XPATH, using = UserIdFieldLocator) public WebElement UserIdField;
    @FindBy(how = How.XPATH, using = PassWordFieldLocator) public WebElement PassWordField;


    public void checkFloodButton() { GolfCartButton.click(); }
    public void checkLogInLink() { LogInLink.click(); }
    public void checkUserIdField(String UserID) { UserIdField.sendKeys(UserID); }
    public void checkPassWordField(String Password) { PassWordField.sendKeys(Password); }
    public void checkIDTheftButton() { IDTheftButton.click(); }
    public void checkLogInButton() { LogInButton.click(); }
    public void verifyErrorLogInText() {
        String actualResult = ErrorText.getText();
        String expectedResult = "The login information you entered does not match our records. Please try again.";
        Assert.assertEquals(actualResult, expectedResult, "Text Don't Match, Test Step Failed");
    }

    public void verifyIDTheftText() {
        String actualResult = IDTheftText.getText();
        String expectedResult = "ID THEFT";
        Assert.assertEquals(actualResult, expectedResult, "Text Don't Match, Test Step Failed");
    }
    public void checkPersonalLoansTextButton() { PersonalLoansButton.click(); }

    public void verifyPersonalLoansText() {
        String actualResult = PersonalLoansText.getText();
        String expectedResult = "PERSONAL LOANS";
        Assert.assertEquals(actualResult, expectedResult, "Text Don't Match, Test Step Failed");
    }
    public void checkHealthButton() { HealthButton.click(); }

    public void verifyHealthText() {
        String actualResult = HealthText.getText();
        String expectedResult = "Select type of health insurance";
        Assert.assertEquals(actualResult, expectedResult, "Text Don't Match, Test Step Failed");
    }
    public void checkGolfCartButton() { FloodButton.click(); }

    public void verifyGolfCartText() {
        String actualResult = GolfCartText.getText();
        String expectedResult = "GOLF CART";
        Assert.assertEquals(actualResult, expectedResult, "Text Don't Match, Test Step Failed");
    }

    public void verifyFloodText() {
        String actualResult = FloodText.getText();
        String expectedResult = "FLOOD";
        Assert.assertEquals(actualResult, expectedResult, "Text Don't Match, Test Step Failed");
    }
    public void checkClassicCarButton() { ClassicCarButton.click(); }
    public void checkElectronicDeviceButton() { ElectronicDeviceButton.click(); }
    public void checkDentalButton() { DentalButton.click(); }
    public void checkCommercialButton() { CommercialButton.click(); }

    public void verifyElectronicDeviceText() {
        String actualResult = ElectronicDeviceText.getText();
        String expectedResult = "ELECTRONIC DEVICE";
        Assert.assertEquals(actualResult, expectedResult, "Text Don't Match, Test Step Failed");
    }

    public void verifyDentalText() {
        String actualResult = DentalText.getText();
        String expectedResult = "Select type of health insurance";
        Assert.assertEquals(actualResult, expectedResult, "Text Don't Match, Test Step Failed");
    }
    public void verifyCommercialText() {
        String actualResult = CommercialText.getText();
        String expectedResult = "Select type of commercial insurance";
        Assert.assertEquals(actualResult, expectedResult, "Text Don't Match, Test Step Failed");
    }

    public void verifyClassicCarText() {
        String actualResult = ClassicCarText.getText();
        String expectedResult = "CLASSIC CAR";
        Assert.assertEquals(actualResult, expectedResult, "Text Don't Match, Test Step Failed");
    }
    public void checkCarShoppingButton() { CarShoppingButton.click(); }

    public void verifyCarShoppingText() {
        String actualResult = CarShoppingText.getText();
        String expectedResult = "Find a new ride or sell your current vehicle";
        Assert.assertEquals(actualResult, expectedResult, "Text Don't Match, Test Step Failed");
    }
    public void checkMoreChoicesButton() {
        MoreChoicesButton.click();
    }

    public void checkATVButton() {
        ATVButton.click();
    }

    public void checkAutoButton() {
        AutoButton.click();
    }

    public void verifyATVText() {
        String actualResult = ATVText.getText();
        String expectedResult = "ATV";
        Assert.assertEquals(actualResult, expectedResult, "Text Don't Match, Test Step Failed");
    }

    public void verifyMoreChoicesText() {
        String actualResult = MoreChoicesText.getText();
        String expectedResult = "Bundle and save an average of 4% on auto!Δ(See Disclosure)";
        Assert.assertEquals(actualResult, expectedResult, "Text Don't Match, Test Step Failed");
    }

    public void checkAutoCondoButton() {
        Auto_CondoButton.click();
    }

    public void verifyAutoCondoText() {
        String actualResult = Auto_CondoText.getText();
        String expectedResult = "AUTO + CONDO";
        Assert.assertEquals(actualResult, expectedResult, "Text Don't Match, Test Step Failed");
    }

    public void checkRVTrailerButton() {
        RVTrailerButton.click();
    }

    public void verifyRVTrailerText() {
        String actualResult = RVTrailerText.getText();
        String expectedResult = "RV/TRAILER";
        Assert.assertEquals(actualResult, expectedResult, "Text Don't Match, Test Step Failed");
    }

    public void checkBoatButton() {
        BoatButton.click();
    }

    public void verifyBoatText() {
        String actualResult = BoatText.getText();
        String expectedResult = "BOAT";
        Assert.assertEquals(actualResult, expectedResult, "Text Don't Match, Test Step Failed");
    }

    public void checkCondoButton() {
        CondoButton.click();
    }

    public void verifyCondoText() {
        String actualResult = CondoText.getText();
        String expectedResult = "CONDO";
        Assert.assertEquals(actualResult, expectedResult, "Text Don't Match, Test Step Failed");
    }

    public void checkRentersButton() {
        RentersButton.click();
    }

    public void verifyRentersText() {
        String actualResult = RentersText.getText();
        String expectedResult = "RENTERS";
        Assert.assertEquals(actualResult, expectedResult, "Text Don't Match, Test Step Failed");
    }

    public void checkMotorcycleButton() {
        MotorcycleButton.click();
    }

    public void checkLifeButton() {
        LifeButton.click();
    }

    public void verifyMotorcycleText() {
        String actualResult = MotorcycleText.getText();
        String expectedResult = "MOTORCYCLE";
        Assert.assertEquals(actualResult, expectedResult, "Text Don't Match, Test Step Failed");
    }

    public void verifyLifeText() {
        String actualResult = LifeText.getText();
        String expectedResult = "Select type of life insurance";
        Assert.assertEquals(actualResult, expectedResult, "Text Don't Match, Test Step Failed");
    }

    public void checkHomeButton() {
        HomeButton.click();
    }

    public void verifyHomeText() {
        String actualResult = HomeText.getText();
        String expectedResult = "Homeowners";
        Assert.assertEquals(actualResult, expectedResult, "Text Don't Match, Test Step Failed");
    }

    public void checkAuto_Home_Button() {
        Auto_Home_Button.click();
    }

    public void verifyAuto_Home_Text() {
        String actualResult = Auto_Home_Text.getText();
        String expectedResult = "Auto + Home";
        Assert.assertEquals(actualResult, expectedResult, "Text Don't Match, Test Step Failed");
    }

    public void verifyAutoText() {
        String actualResult = AutoText.getText();
        String expectedResult = "AUTO";
        Assert.assertEquals(actualResult, expectedResult, "Text Don't Match, Test Step Failed");
    }


}
