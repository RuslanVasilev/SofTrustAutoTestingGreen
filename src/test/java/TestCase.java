import com.codeborne.selenide.Configuration;
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

// Скриншоты после каждого теста
//    @RegisterExtension
//    static ScreenShooterExtension screenshotEmAll = new ScreenShooterExtension(true)
//            .to("target/screenshots");

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
        PatientRecord personalСabinet = new PatientRecord();
        personalСabinet.recordPatientPreliminaryType();
    }
    @Test
    /**
     * Запись пациента с типом записи "Первичный" через личный кабинет. TEST-2178
     */
    public void primaryRecord() {
        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.PersonalСabinetEnter();
        PatientRecord personalСabinet = new PatientRecord();
        personalСabinet.primaryPatientTypeRecord();
    }

    @Test
    /**
     * Запись пациента с типом записи "Повторный" через личный кабинет. TEST-2179
     */
    public void repeatedRecord() {
        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.PersonalСabinetEnter();
        PatientRecord personalСabinet = new PatientRecord();
        personalСabinet.repeatedPatientTypeRecord();

    }
    @Test
    public void  directionRecord() {
        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.PersonalСabinetEnter();
        PatientRecord personalСabinet = new PatientRecord();
        personalСabinet.directionPatientTypeRecord();
    }
    @Test
    public void offScheduleRecord() {
        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.PersonalСabinetEnter();
        PatientRecord personalСabinet = new PatientRecord();
        personalСabinet.offSchedulePatientTypeRecord();
    }
    @Test
    public void SessionPatient() {
        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.PersonalСabinetEnter();
        SessionPatient sessionPatient = new SessionPatient();
        sessionPatient.SessionPatient();
    }
    @Test
    public void NonappearancePatient() {
        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.PersonalСabinetEnter();
        SessionPatient sessionPatient = new SessionPatient();
        sessionPatient.NonappearancePatient();
    }





}
