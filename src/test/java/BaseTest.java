import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;


abstract public class BaseTest {


    public void setUp() {
        System.out.println("Открываю браузер");
        WebDriverManager.chromedriver().setup();
        Configuration.browser = "chrome";
        Configuration.driverManagerEnabled = true;
        Configuration.browserSize = "1920x1080";
        Configuration.headless = false;
    }


    @Before
    public void init() {
         setUp();
    }


    @After
    public void tearDown() {
        System.out.println("Закрываю");
       Selenide.closeWebDriver();
    }
}
