import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideWait;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class TestCase extends BaseTest {
    /**
     * Базовый адрес для открытия страницы
     */
    private final static String BASE_URL = "http://192.168.7.54/test";
    /**
     * Логин для ввода в поле "Имя пользователя" на странице авторизации
     */
    private final static String LOGIN_VALUE = "admin";
    /**
     * Пароль для ввода в поле "Пароль" на странице авторизации
     */
    private final static String PASSWORD_VALUE = "11";


    @BeforeEach
/**
 * TEST-2918 Авторизация в WEB амбулатория (Зелёный WHC).
 */
    public void Authorization2918() {
        Configuration.browserSize = "1920x1080";
        AuthorizationPage authorizationPage = new AuthorizationPage(BASE_URL);
        authorizationPage.AuthorizationEnter(LOGIN_VALUE, PASSWORD_VALUE);
        System.out.println("авторизация");

    }

    @Test
    /**
     * Запись пациента с типом записи "Предварительно" через личный кабинет. TEST-2177
     */
    public void preRegistration() {
        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.PersonalСabinetEnter();
        PersonalСabinet personalСabinet = new PersonalСabinet();
        personalСabinet.recordPatientPreliminaryType();
    }
    @Test
    /**
     * Запись пациента с типом записи "Первичный" через личный кабинет. TEST-2178
     */
    public void primaryRecord() {
        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.PersonalСabinetEnter();
        PersonalСabinet personalСabinet = new PersonalСabinet();
        personalСabinet.primaryPatientTypeRecord();
    }

    @Test
    /**
     * Запись пациента с типом записи "Повторный" через личный кабинет. TEST-2179
     */
    public void repeatedRecord() {
        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.PersonalСabinetEnter();
        PersonalСabinet personalСabinet = new PersonalСabinet();
        personalСabinet.repeatedPatientTypeRecord();

    }
    @Test
    public void  directionRecord() {
        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.PersonalСabinetEnter();
        PersonalСabinet personalСabinet = new PersonalСabinet();
        personalСabinet.directionPatientTypeRecord();
    }





}
