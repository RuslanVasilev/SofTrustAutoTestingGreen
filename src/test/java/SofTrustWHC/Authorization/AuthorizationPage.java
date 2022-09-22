package SofTrustWHC.Authorization;

import Core.BaseSelenium;

import Core.BaseSeleniumPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.*;


public class AuthorizationPage extends BaseSeleniumPage {
    @FindBy(xpath = "//input[@id='Login']")
    private WebElement login;
    @FindBy(xpath = "//*[@id='Password']")
    private WebElement password;
    @FindBy(xpath = "//input[@id='Remember']")
    private WebElement remember;

    @FindBy(xpath = "//input[@id='loginBtn']")
    private WebElement enterBtn;

    public AuthorizationPage() {


        driver.get("http://192.168.7.54/test");

        PageFactory.initElements(driver, this);
    }

    public AuthorizationPage wrightInFields(String loginValue, String passwordValue) {

        login.sendKeys(loginValue);

        password.sendKeys(passwordValue);

        remember.click();

        enterBtn.click();



        return this;
    }
}
