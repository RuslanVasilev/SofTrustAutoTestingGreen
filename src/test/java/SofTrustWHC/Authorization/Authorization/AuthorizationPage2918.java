package SofTrustWHC.Authorization.Authorization;

import Core.BaseSeleniumPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class AuthorizationPage2918 extends BaseSeleniumPage {
    @FindBy(xpath = "//input[@id='Login']")
    private WebElement login;
    @FindBy(xpath = "//*[@id='Password']")
    private WebElement password;
    @FindBy(xpath = "//input[@id='Remember']")
    private WebElement remember;

    @FindBy(xpath = "//input[@id='loginBtn']")
    private WebElement enterBtn;

    @FindBy (how = How.XPATH, using = "//div[contains(@class,'ui-dialog')]//button")
    private WebElement divCovidInformation;


    public AuthorizationPage2918() {


        driver.get("http://192.168.7.54/test");

        PageFactory.initElements(driver, this);
    }

    public AuthorizationPage2918 wrightInFields(String loginValue, String passwordValue) {

        login.sendKeys(loginValue);

        password.sendKeys(passwordValue);

        remember.click();

        enterBtn.click();

        divCovidInformation.click();






        return this;
    }
}
