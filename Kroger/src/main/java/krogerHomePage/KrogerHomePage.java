package krogerHomePage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static krogerHomePage.KrogerWebElements.*;

public class KrogerHomePage extends WebAPI{




    @FindBy(how = How.XPATH,using = SearchResultTextLocator) public WebElement SearchResult;
    @FindBy(how = How.XPATH,using = SearchBoxLocator) public WebElement SearchBox;
    @FindBy(how = How.XPATH,using = SearchRLoopLocator) public WebElement SearchLoop;
    @FindBy(how = How.CSS,using = SignInArrowLocator) public WebElement SignInArrow;
    @FindBy(how = How.CSS,using = SignInButton1Locator) public WebElement SignInButton1;
    @FindBy(how = How.XPATH,using = EmailAddressFieldLocator) public WebElement EmailAddressField;
    @FindBy(how = How.XPATH,using = PassWordFieldLocator) public WebElement PassWordField;
    @FindBy(how = How.XPATH,using = SignInButton2Locator) public WebElement SignInButton2;
    @FindBy(how = How.XPATH,using = MissingEmailTextLocator) public WebElement MissingEmail;
    @FindBy(how = How.XPATH,using = MissingPasswordTextLocator) public WebElement MissingPassword;




    public void enterTextInSearchBox(String product){
        SearchBox.sendKeys(product);
    }
    public void clickOnSignInArrow()  {

        SignInArrow.click();
    }

    public void clickOnSignInButton1()  {

        SignInButton1.click();
    }
    public void checkPassWordField(String password){
        PassWordField.sendKeys(password);
    }
    public void checkEmailAddressField(String email){
        EmailAddressField.sendKeys( email);
    }
    public void clickOnSignInButton2(){
        SignInButton2.click();
    }

    public void verifyMissingEmailText(){
      String actualResult=MissingEmail.getText();
      String expectedResult="Please enter a valid email address";
      Assert.assertEquals(actualResult,expectedResult,"Text don't Match!!!!,Please Check Again");
    }

    public void verifyMissingPassWordText(){
        String actualResult=MissingPassword.getText();
        String expectedResult="Password is required";
        Assert.assertEquals(actualResult,expectedResult,"Text don't Match!!!!,Please Check Again");
    }
    public void clickOnLoop(){ SearchLoop.click(); }


    public void verifyTextResult(String expectedResult){
        String actualResult=SearchResult.getText();
        Assert.assertEquals(actualResult,expectedResult,"Text Don't match!!!!!!, Check again");
    }
}
