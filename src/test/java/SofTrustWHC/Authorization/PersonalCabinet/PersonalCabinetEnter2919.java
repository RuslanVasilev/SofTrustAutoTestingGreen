package SofTrustWHC.Authorization.PersonalCabinet;


import Core.BaseSeleniumPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonalCabinetEnter2919 extends BaseSeleniumPage {


    @FindBy(xpath = "//*[@id='top']/a[1]/img")
    private WebElement logo;

    @FindBy(xpath = "//*[@id='top']/div/div[2]/a/span")
    private WebElement personalСabinet;





    public PersonalCabinetEnter2919() {
        PageFactory.initElements(driver, this);
    }

    public PersonalCabinetEnter2919 personalCabinetEnter() {
        logo.click();
        personalСabinet.click();



        return this;
    }
}
