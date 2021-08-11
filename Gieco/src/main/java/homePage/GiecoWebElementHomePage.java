package homePage;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

public class GiecoWebElementHomePage extends WebAPI {



    public static final  String StartQuoteButtonLocator="//button[normalize-space()='Start Quote']";
    public static final  String VerifyText1Locator="//h2[normalize-space()='Required Information:']";
    public static final  String AutoButtonLocator="//div[@class='auto card']/p[.='Auto']";
    public static final  String AutoTextLocator="//span[@id='icon-text' and .='Auto']";
    public static final  String RentersButtonLocator="//div[@class='renters card']/p[.='Renters']";
    public static final  String RentersTextLocator="//span[@id='icon-text' and .='Renters']";
    public static final  String BoatButtonLocator="//div[@class='boat card']/p[.='Boat']";
    public static final  String BoatTextLocator="//span[@id='icon-text' and .='Boat']";
    public static final  String HomeOwnerButtonLocator="//div[@class='homeowners card']/p[.='Homeowners']]";
    public static final  String HomeOwnerTextLocator="//span[@id='icon-text' and .='Homeowners']";
    public static final  String HomePageLogInButtonLocator="//div[@class='large_only']//button[@id='manageSubmit']";
    public static final  String LogInPageLogInButtonLocator="//button[@name='SubmitButtonComponent-1']";
    public static final  String LogInErrorTextLocator="//span[contains(text(),'Please enter your password.')]";
    public static final  String User_ID_Email_Policy_NumberLocator="//input[@id='TextInputComponent-1']";
    public static final  String PassWordFieldLocator="//input[@id='TextInputComponent-2']";
    public static final  String  MenuBarLocator="//span[@class='header-link' and .='Menu' ]";
    public static final  String  InsurancePanelLocator="//a[@class='nav-menu-item' and .='Insurance']";
    public static final  String  VehicleInsurancePanelLocator="//span[@class='geico-icon geico-icon--actionable icon-vehicle']";
    public static final  String AutoPanelLocator="//span[@class='geico-nav-menu-item' and .='Auto']";
    public static final  String AutoInsuranceTextLocator="//div[@class='hero-panel-wrap']//h1[contains(text(),'Car Insurance')]";
    public static final  String MotorcyclePanelLocator="//span[@class='geico-nav-menu-item' and text()='Motorcycle']";
    public static final  String MotorcycleInsuranceTextLocator=" //*[ contains(text(),'Welcome to Great Motorcycle Insurance Coverage')]";
    public static final  String ATVPanelLocator=" //span[@class='geico-nav-menu-item' and text()='ATV']";
    public static final  String ATVInsuranceTextLocator="  //*[ contains(text(),'ATV Insurance Quote')]";
    public static final  String RVPanelLocator="  //span[@class='geico-nav-menu-item' and text()='RV']";
    public static final  String RVInsuranceTextLocator="   //*[ contains(text(),'Insurance for your RV, camper, or motor home.')]";
    public static final  String Boat_PWC_InsuranceTextLocator="//*[ contains(text(),'Boat Insurance')] ";
    public static final  String Boat_PWC_PanelLocator=" //span[@class='geico-nav-menu-item' and text()='Boat/PWC']";
    public static final  String CollectorAutoPanelLocator=" //span[@class='geico-nav-menu-item' and text()='Collector Auto']";
    public static final  String CollectorAutoInsuranceTextLocator=" //*[ contains(text(),'Classic Car Insurance')] ";
    public static final  String RideShareInsuranceTextLocator=" //*[ contains(text(),'One policy covers personal use plus driving for Uber, Lyft, and other rideshare companies.')] ";
    public static final  String RideSharePanelLocator="//span[@class='geico-nav-menu-item' and text()='Rideshare'] ";
    public static final  String CommercialAutoPanelLocator="//span[@class='geico-nav-menu-item' and text()='Commercial Auto'] ";
    public static final  String CommercialAutoInsuranceTextLocator="//*[ contains(text(),'Commercial auto insurance covers you for'  ";
    public static final  String InformationPanelLocator="//a[@class='nav-menu-item' and text()='Information'] ";
    public static final  String MyAccount1PanelLocator="//h3[ text()='My Account'] ";
    public static final  String AddVehiclePanelLocator="//span[ @class='geico-nav-menu-item' and text()='Add A Vehicle']";
    public static final  String AddAVehicleTextLocator="//p[ text()='Policy number and VIN are required.']";
    public static final  String MakeAPaymentPanelLocator="//span[ @class='geico-nav-menu-item' and text()='Make a Payment']";
    public static final  String MakeAPaymentTextLocator="//p[ contains(text(),'Pay with GEICO Express Services')]";
    public static final  String GoPaperlessPanelLocator="//span[ @class='geico-nav-menu-item' and text()='Go Paperless']";
    public static final  String GoPaperlessTextLocator="//p[ contains(text(),'Save paper and simplify your life.')]";
    public static final  String ContactUsPanelLocator="//span[@class='geico-icon geico-icon--actionable icon-contact']";
    public static final  String  ContactUsTextLocator="//h3[@id='radioquestion' and text()='What do you need help with today?']";
    public static final  String  SearchLoopLocator="//span[@class='icon-search right-icons-separator' ]";
    public static final  String  SearchFieldLocator="//input[@name='term' ]";
    public static final  String  SearchButtonLocator="//button[@class='btn btn--secondary pull-right' ]";
    public static final  String  VerifyTextLocator="//div[@class='coveo-results-header pagination' ]//span[ text()='Motorcycle Insurance']";
    public static final  String  VerifyTextLocator1="//div[@class='coveo-results-header pagination' ]//span[ text()='Car Insurance']";
    public static final  String  VerifyTextLocator2="//div[@class='coveo-results-header pagination' ]//span[ text()='Home Insurance']";
    public static final  String  VerifyNoResultTextLocator="//div[@class='coveo-summary-section totals']/span[@class='CoveoQueryDuration']";
}
