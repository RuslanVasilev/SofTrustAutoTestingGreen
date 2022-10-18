
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import org.openqa.selenium.By;


import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class PatientRecord extends BaseTest {
    /**
     * Создаём коллекцию свободных ячеек
     */
    private final ElementsCollection freeScheduleCells = $$x("//div[@cell_dvt_id='0']/div[@style='background-color:#508132;border-color:#508132;color:#FFFFFF']");


    /**
     * Локатор поля поиска пациетов в форме выбора для записи
     */
    private final SelenideElement patientSearchForRecording = $x("//input[@id='sinpnwdSelectorMkab']");

    /**
     * Локатор кнопки выбора МКАБ в расписании
     */
    //private final SelenideElement btnselnwdSelectorMkab = $x("//button[@id='btnselnwdSelectorMkab']");


    /**
     * Создаём коллекциюю пациентов из формы выбора для записи на ячейку
     */
    private final ElementsCollection patientCollectionForRecording = $$x("//td[@aria-describedby='nwdSelectorMkab_Patient.Family'][contains(text(),'Соф')]");


    /**
     * Создаём коллекцию ТАПов из формы выбора ТАПов для повторной записи на ячейку
     */
    private final ElementsCollection TAPsCollectionForRecording = $$x("//td[@aria-describedby='tapGridForDialog_Patient.Person.Family']");


    /**
     * Локатор кнопки "Выбрать" в форме выбота ТАПов для записи повторный
     */
    private final SelenideElement selectTAPButton = $x("//*[@id='SCH_SelectTAP']");

    /**
     * Локатор выбора типа приёма "Предварительный" в форме записи пациента на приём
     */
    private final SelenideElement SelectingPreliminaryRecordType = $x("//button[@id='{2}'][@visid='1']");
    /**
     * Локатор выбора типа приёма "Превичный" в форме записи пациента на приём
     */
    private final SelenideElement SelectingPrimaryRecordType = $x("//button[@id='{2}'][@visid='5']");


    /**
     * Локатор выбора типа приёма "Повторный" в форме записи пациента на приём
     */
    private final SelenideElement SelectingRepeatedRecordType = $x("//*[@id='{2}'][@visid='2']");


    /**
     * Коллекция ячеек с типом записи "Предварительный"
     */
    private final ElementsCollection preliminaryScheduleCells = $$x("//div[@class='fc-event fc-event-skin fc-event-vert fc-corner-top fc-corner-bottom pntr bigtext VisitIsset ui-draggable']");


    /**
     * Локатор чтобы задать сложность приёма
     */
    private final SelenideElement receptionDifficultyField = $x("//*[@id='dif']");


    /**
     * Локатор чекбокса CITO в форме "Запись пациента"
     */
    private final SelenideElement receptionCheckboxCITO = $x("//*[@id='cito']");


    /**
     * Локатор поля ввода "Комментарий" в форме "Запись пациента"
     */
    private final SelenideElement receptionCommentField = $x("//*[@id='visitComment']");


    /**
     * Локатор выбора типа приёма "Записать по направлению" в форме записи пациента на приём
     */
    private final SelenideElement SelectingDirectionRecordType = $x("//*[@id='rtbtnDirectionVisit'][@code='-900']");


    /**
     * Локатор кнопки "Создать направление" на форме "Выбор направления"
     */
    private final SelenideElement buttonCreateDirection = $x("//button[@id='SCH_CreateDirection']");


    /**
     * Локатор поля "Номер телефона" на форме "Направление" при создании
     */
    private final SelenideElement phoneNumberInCreateDirection = $x("//input[@id='Phone']");


    /**
     * Локатор поля "Диагноз" на форме "Направление" при создании
     */
    private final SelenideElement MKBSelectorInCreateDirection = $x("//input[@gridid='DirectionForm_MKBSelector']");


    /**
     * Локатор подсказки поля "Диагноз" на форме "Направление" при создании
     */
    private final SelenideElement menuItemMKBSelectorInCreateDirection = $x("//li[@class='ui-menu-item']");


    /**
     * Локатор лупы выбора ТАП справа от поля "ТАП" на форме "Направление" при создании
     */
    private final SelenideElement magnifierTapSelectorInCreateDirection = $x("//a[@id='Tap_Name_ah']/img");


    /**
     * Коллекция локаторов форме выбора ТАП из формы "Направление" при создании
     */
    private final ElementsCollection TapFormSelectorInCreateDirection = $$x("//*[@id='DirectionForm_TAPSelector']/tbody/tr");


    /**
     * Локатор поля "Причина направления" в форме "Направление" при создании Reasondirection
     */
    private final SelenideElement reasonDirectionInCreateDirection = $x("//textarea[@id='Reason']");


    /**
     * Локатор кнопки сохраниения направления при записи в расписании
     */
    private final SelenideElement buttonSaveDirectionInCreateDirection = $x("//button[@type='button']/span[text()='Сохранить']");

    /**
     * Локатор ячейки записи по направлению в расписании с комментарием 'Записать по направлению'
     */
    private final SelenideElement directionScheduleCells = $x("//div[contains(text(),'Записать по направлению')]");


    /**
     * Локатор поля "Вне расписания"
     */
    private final SelenideElement offScheduleField = $x("//span[contains(text(),'Вне расписания')]");

    /**
     * //span[contains(text(),'Вакцинация от COVID-19')]
     */
    private final SelenideElement selectingCovidVaccinationRecordType = $x("//span[contains(text(),'Вакцинация от COVID-19')]");


    /**
     * Локатор ячеки записанной через вне расписание на вакцинацию от COVID-19
     */
    private final SelenideElement offScheduleСovidVaccinationCell = $x("//div[contains(text(),'Запись Вне расписания')]");


    /**
     * Локатор кнопки "Найти" в форме выбора пациента
     */
    private final SelenideElement btnfindnwdSelectorMkab = $x("//input[@id='btnfindnwdSelectorMkab']");


    /**
     * Личный кабинет. Выбираем из свободных ячеек первую для записи, поиск пациента №1,
     * записываем предварительно первого из списка TEST-2177
     */
    public void recordPatientPreliminaryType() {
        $(By.xpath("//div[@cell_dvt_id='0']/div[@style='background-color:#508132;border-color:#508132;color:#FFFFFF']"))
                .shouldBe(visible, Duration.ofSeconds(30));
        $(By.xpath("//div[@cell_dvt_id='0']")).shouldBe(visible, Duration.ofSeconds(30));
        freeScheduleCells.first().click();
        patientSearchForRecording.shouldBe(visible, Duration.ofSeconds(30))
                .setValue("соф").shouldBe(visible, Duration.ofSeconds(5)).pressEnter();
        btnfindnwdSelectorMkab.shouldBe(visible).click();
        patientCollectionForRecording.first().shouldBe(visible, Duration.ofSeconds(30)).click();
        patientCollectionForRecording.first().doubleClick();
        $(By.xpath("//button[@code='-100']")).shouldBe(visible, Duration.ofSeconds(30));
        receptionDifficultyField.setValue("2");
        receptionCheckboxCITO.click();
        receptionCommentField.setValue("Запись 'Предварительный' (AutoTest TEST-2177)");
        SelectingPreliminaryRecordType.click();
        switchTo().window(1).close();
        switchTo().window(0);
    }

    /**
     * Личный кабинет. Выбираем из свободных ячеек первую для записи, поиск пациента №2,
     * записываем первично второго из списка TEST-2178
     */
    public void primaryPatientTypeRecord() {
        $(By.xpath("//div[@cell_dvt_id='0']/div[@style='background-color:#508132;border-color:#508132;color:#FFFFFF']"))
                .shouldBe(visible, Duration.ofSeconds(30));
        freeScheduleCells.first().doubleClick();
        patientSearchForRecording.shouldBe(visible, Duration.ofSeconds(30)).setValue("соф").pressEnter();
        btnfindnwdSelectorMkab.click();
        patientCollectionForRecording.get(2).click();
        patientCollectionForRecording.get(2).doubleClick();
        receptionDifficultyField.shouldBe(visible, Duration.ofSeconds(30)).setValue("2");
        receptionCheckboxCITO.click();
        receptionCommentField.setValue("Запись 'Первичный' (AutoTest TEST-2178)");
        SelectingPrimaryRecordType.click();


    }

    /**
     * Личный кабинет. Выбираем из свободных ячеек первую для записи, поиск пациента №3,
     * записываем повторно третьего из списка TEST-2179
     */
    public void repeatedPatientTypeRecord() {
        $(By.xpath("//div[@cell_dvt_id='0']")).shouldBe(visible, Duration.ofSeconds(30));
        freeScheduleCells.first().click();
        patientSearchForRecording.shouldBe(visible, Duration.ofSeconds(30)).setValue("соф").pressEnter();
        btnfindnwdSelectorMkab.click();
        patientCollectionForRecording.get(3).click();
        patientCollectionForRecording.get(3).doubleClick();
        $(By.xpath("//button[@code='-100']")).shouldBe(visible, Duration.ofSeconds(30));
        receptionDifficultyField.setValue("2");
        receptionCheckboxCITO.click();
        receptionCommentField.setValue("Запись 'Повторный' (AutoTest TEST-2179)");
        SelectingRepeatedRecordType.click();
        $(By.xpath("//td[@aria-describedby='tapGridForDialog_Patient.Person.Family']"))
                .shouldBe(visible, Duration.ofSeconds(30));
        TAPsCollectionForRecording.first().click();
        TAPsCollectionForRecording.first().click();
        selectTAPButton.click();
        switchTo().window(1).close();
        switchTo().window(0);

    }



    /**
     * Личный кабинет. Выбираем из свободных ячеек первую для записи, поиск пациента №4,
     * записываем по направлению четвёртого из списка TEST-2179
     */
    public void directionPatientTypeRecord() {
        $(By.xpath("//div[@cell_dvt_id='0']/div[@style='background-color:#508132;border-color:#508132;color:#FFFFFF']"))
                .shouldBe(visible, Duration.ofSeconds(30));
        freeScheduleCells.first().click();
        $(By.xpath("//input[@id='sinpnwdSelectorMkab']"))
                .shouldBe(visible, Duration.ofSeconds(30));
        patientSearchForRecording.shouldBe(visible, Duration.ofSeconds(30)).setValue("соф").pressEnter();
        btnfindnwdSelectorMkab.click();
        $(By.xpath("//td[contains(text(),'Соф')]"))
                .shouldBe(visible, Duration.ofSeconds(30));
        patientCollectionForRecording.get(4).click();
        patientCollectionForRecording.get(4).doubleClick();
        $(By.xpath("//button[@code='-100']")).shouldBe(visible, Duration.ofSeconds(30));
        receptionDifficultyField.shouldBe(visible).clear();
        receptionDifficultyField.setValue("2");
        receptionCheckboxCITO.click();
        receptionCommentField.setValue("Запись 'Записать по направлению' (AutoTest TEST-2185)");
        SelectingDirectionRecordType.click();
        buttonCreateDirection.click();
        phoneNumberInCreateDirection.shouldBe(visible, Duration.ofSeconds(30)).click();
        phoneNumberInCreateDirection.sendKeys("9511112233");
        MKBSelectorInCreateDirection.sendKeys("Холера неуточненная");
        menuItemMKBSelectorInCreateDirection.shouldBe(visible, Duration.ofSeconds(30)).click();
        magnifierTapSelectorInCreateDirection.click();
        TapFormSelectorInCreateDirection.get(1).shouldBe(visible).click();
        TapFormSelectorInCreateDirection.get(1).doubleClick();
        reasonDirectionInCreateDirection.sendKeys("Запись 'Записать по направлению' (AutoTest TEST-2185)");
        buttonSaveDirectionInCreateDirection.shouldBe(visible).click();
        directionScheduleCells.shouldBe(visible, Duration.ofSeconds(30));

    }

    /**
     * Запись пациента "Вне расписания"
     */
    public void offSchedulePatientTypeRecord() {
        offScheduleField.shouldBe(visible, Duration.ofSeconds(30)).click();
        patientSearchForRecording.shouldBe(visible, Duration.ofSeconds(30)).setValue("соф").pressEnter();
        btnfindnwdSelectorMkab.click();
        $(By.xpath("//td[contains(text(),'Соф')]"))
                .shouldBe(visible, Duration.ofSeconds(30));
        patientCollectionForRecording.get(5).click();
        patientCollectionForRecording.get(5).doubleClick();
        receptionCheckboxCITO.shouldBe(visible, Duration.ofSeconds(30)).click();
        receptionCommentField.setValue("Запись Вне расписания (AutoTest TEST-2180)");
        selectingCovidVaccinationRecordType.click();
        offScheduleСovidVaccinationCell.shouldBe(visible, Duration.ofSeconds(30));

    }


}
