package SofTrustWHC.Authorization;

import Core.BaseSelenium;
import org.junit.Test;

public class TestCase extends BaseSelenium {
    @Test
    public void checkTicket() {
        String loginValue = "admin";
        String passwordValue = "11";
        AuthorizationPage authorizationPage = new AuthorizationPage();
        authorizationPage.wrightInFields(loginValue, passwordValue);
        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.stepsOnDashboard();

    }

}
