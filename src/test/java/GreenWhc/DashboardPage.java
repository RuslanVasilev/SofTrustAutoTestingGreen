package GreenWhc;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class DashboardPage extends BaseTest {
    /**
     * Блок "Личный кабинет", "Администрирование", "Сообщения"
      */

    private final SelenideElement personalСabinet = $x("//*[@id='top']/div/div[2]/a/img");
    private final SelenideElement administration = $x("//*[@id='top']/div/div[3]/a/span");
    private final SelenideElement messages = $x("//*[@id='top']/div/div[4]/a/span");


    /**
     * Блок "Управление потоками клиентов"
     */
    private final SelenideElement schedule = $x("//*[@id='Portlet_2']/div[2]/div[1]/a/span");
    private final SelenideElement scheduleAdd = $x("//*[@id='Portlet_2']/div[2]/div[2]/a/span");
    private final SelenideElement waitingList = $x("//*[@id='Portlet_2']/div[2]/div[3]/a/span");
    private final SelenideElement mkab = $x("//*[@id='Portlet_2']/div[2]/div[4]/a/span");
    private final SelenideElement scheduleMove = $x("//*[@id='Portlet_2']/div[2]/div[5]/a/span");
    private final SelenideElement statementOfDirections = $x("//*[@id='Portlet_2']/div[2]/div[6]/a/span");
    private final SelenideElement observationDispensary  = $x("//*[@id='Portlet_2']/div[2]/div[7]/a/span");
    private final SelenideElement scheduleAddAuto = $x("//*[@id='Portlet_2']/div[2]/div[8]/a/span");




    public void PersonalСabinetEnter () {
        System.out.println("Переход в личный кабинет");
        personalСabinet.click();

    }




}










