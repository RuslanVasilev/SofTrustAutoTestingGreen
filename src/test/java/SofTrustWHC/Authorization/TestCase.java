package SofTrustWHC.Authorization;

import Core.BaseSelenium;
import SofTrustWHC.Authorization.Authorization.AuthorizationPage2918;
import SofTrustWHC.Authorization.PersonalCabinet.PersonalCabinetEnter2919;
import org.junit.Test;

public class TestCase extends BaseSelenium {
    @Test
    public void checkTicket() {
        String loginValue = "admin";
        String passwordValue = "11";
        AuthorizationPage2918 authorizationPage = new AuthorizationPage2918();
        authorizationPage.wrightInFields(loginValue, passwordValue);
        PersonalCabinetEnter2919 personalCabinetEnter = new PersonalCabinetEnter2919();
        personalCabinetEnter.personalCabinetEnter();

    }

}
