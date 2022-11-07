package GreenWhc;

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
     * Запись пациента с типом записи "Предварительно" через личный кабинет и проведение записи. TEST-2177
     */
    public void preRegistration() {
        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.PersonalСabinetEnter();
        PatientRecord personalСabinet = new PatientRecord();
        personalСabinet.recordPatientPreliminaryType();
        SessionPatient sessionPatient = new SessionPatient();
        sessionPatient.SessionPatient();
    }
    @Test
    /**
     * Запись пациента с типом записи "Первичный" через личный кабинет и проставление невки. TEST-2178
     */
    public void primaryRecord() {
        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.PersonalСabinetEnter();
        PatientRecord personalСabinet = new PatientRecord();
        personalСabinet.primaryPatientTypeRecord();
        SessionPatient sessionPatient = new SessionPatient();
        sessionPatient.NonappearancePatient();
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

    /**
     * Запись по направлению в личном кабинете
     */
    @Test
    public void  directionRecord() {
        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.PersonalСabinetEnter();
        PatientRecord personalСabinet = new PatientRecord();
        personalСabinet.directionPatientTypeRecord();
    }

    /**
     * Запись вне расписания в личном кабинете
     */
    @Test
    public void offScheduleRecord() {
        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.PersonalСabinetEnter();
        PatientRecord personalСabinet = new PatientRecord();
        personalСabinet.offSchedulePatientTypeRecord();
    }

    /**
     * Перенос записи предварительной из вне расписания
     */
    @Test
    public void  TransferringRecord() {
        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.PersonalСabinetEnter();
        SessionPatient sessionPatient = new SessionPatient();
        sessionPatient.TransferringRecord();
    }





}
