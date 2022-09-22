package SofTrustWHC.Authorization;


import Core.BaseSeleniumPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class DashboardPage extends BaseSeleniumPage {
    @FindBy (how = How.XPATH, using = "//div[contains(@class,'ui-dialog')]//button")
    private WebElement divCovidInformation;
    @FindBy (xpath = "//*[@id='top']/div/div[2]/a/span")
    private  WebElement personalСabinet;

    public DashboardPage(){
        PageFactory.initElements(driver, this);
    }
    public DashboardPage stepsOnDashboard(){



        divCovidInformation.click();

        personalСabinet.click();

        return this;
    }
}
