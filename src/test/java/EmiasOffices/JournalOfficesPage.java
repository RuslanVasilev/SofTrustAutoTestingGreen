package EmiasOffices;

import com.codeborne.selenide.*;
import net.bytebuddy.utility.RandomString;

import java.time.Duration;
import java.util.Random;
import java.util.RandomAccess;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class JournalOfficesPage extends BaseTest {


    /**
     * Куда журнал кабинетов
     */
    private final static String OFFISES = "lpustruct/room/journal";

    // Юрл для входа в журнал кабинетов
    TestCase testCase = new TestCase();
    String url = testCase.BASE_URL + OFFISES + testCase.KEY;
    /**
     * Кнопка добавить кабинет в Журнале кабинетов
     */
    private final SelenideElement addCabinetButton = $x("//button[@class='btn-blue-square btn-no-left-margin']");
    /**
     * Поле Номер кабинета в Добавлении кабинета
     */
    private final SelenideElement numberCabinetField = $x("//input[@formcontrolname='number']");
    /**
     * Поле Этаж кабинета в Добавлении кабинета
     */
    private final SelenideElement numberFloorCabinetField =
            $x("//input[@formcontrolname='floor']");
    /**
     * Поле Описание кабинета в Добавлении кабинета
     */
    private final SelenideElement descriptionCabinetField =
            $x("//input[@formcontrolname='description']");
    /**
     * Крестик для очистки поля Описание в кабинете
     */
    private final SelenideElement crossClearingDescriptionField =
            $x("//div[@class='mat-form-field-suffix ng-tns-c73-31 ng-star-inserted']");
    /**
     * Поле Мед организация кабинета в Добавлении кабинета
     */
    private final SelenideElement medicalOrganizationCabinetField = $x("//input[@id='mat-input-6']");
    /**
     * Выбор МО из подсказок в поле Мед организация кабинета в Добавлении кабинета
     */
    private final SelenideElement selectionFromMenuMedicalOrganizationCabinetField =
            $x("//span[@class='mat-option-text'][contains(text(), 'Детская поликлиника (ГБУЗ МО \"Талдомская ЦРБ\")')]");
    /**
     * Выбор Отделения из подсказок в поле Отделение кабинета в Добавлении кабинета
     */
    private final SelenideElement selectionFromMenuDepartmentCabinetField =
            $x("//span[@class='mat-option-text'][contains(text(), 'Кабинет ЭКГ')]");

    /**
     * Поле Отделение кабинета в Добавлении кабинета
     */
    private final SelenideElement departmentCabinetField = $x("//input[@id='mat-input-7']");
    /**
     * Кнопка "Сохранить" в форме добавления кабинета
     */
    private final SelenideElement saveButtonCabinet = $x("//button[text()= ' Сохранить ']");
    /**
     * Кнопка открытия левого меню в форме добавления кабинета
     */
    private final SelenideElement openLeftMenuButtonCabinet = $x("//div[@class='toggle-btn__content']");
    /**
     * Кнопка "Журнал кабинетов" для перехода в журнал кабинетов
     */
    private final SelenideElement journalOfOfficesButtonCabinet = $x("//h3[text()=' Журнал кабинетов ']");
    /**
     * Добавленный кабинет в списке журнала кабинетов
     */
    private final SelenideElement addedCabinetInJournalOfOffices =
            $x("//td[@role='gridcell'][text()=' Автотест добавления кабинета ']");
    /**
     * Отредактированный кабинет в списке журнала кабинетов
     */
    private final SelenideElement editedCabinetInJournalOfOffices =
            $x("//td[@role='gridcell'][text()=' Автотест редактирования кабинета ']");
    /**
     * Поле поиска в журнале кабинетов
     */
    private final SelenideElement findFieldInJournalOfOffices =
            $x("//input[@formcontrolname='termNameCtrl']");

    /**
     * Кнопка "Найти" в журнале кабинетов
     */
    private final SelenideElement findButtonInJournalOfOffices =
            $x("//span[@class='icon-search-icon']");
    /**
     * Массив карандашиков у кабинетов в гриде журнала кабинетов
     */
    private final ElementsCollection arrayPencilOfCabinetsInJournalOfOffices =
            $$x("//span[@aria-describedby='cdk-describedby-message-5']");

    /**
     * Вход в журнал кабинетов
     */
    public void EnterJournalOfficesPage() {
        Configuration.browserSize = "1280x1024";
        Selenide.open(url);

    }

    public void AddCabinet() {
        EnterJournalOfficesPage();
        addCabinetButton.shouldBe(Condition.visible, Duration.ofSeconds(20));
        addCabinetButton.click();
        numberCabinetField.shouldBe(Condition.visible, Duration.ofSeconds(30)).setValue(String.valueOf(Math.abs(new Random().nextInt())));
        numberFloorCabinetField.setValue("2");
        descriptionCabinetField.setValue("Автотест добавления кабинета");
        medicalOrganizationCabinetField.setValue("Детская поликлиника (ГБУЗ МО \"Талдомская ЦРБ\")");
        selectionFromMenuMedicalOrganizationCabinetField.shouldBe(Condition.visible, Duration.ofSeconds(30)).click();
        departmentCabinetField.setValue("Кабинет ЭКГ");
        selectionFromMenuDepartmentCabinetField.shouldBe(Condition.visible, Duration.ofSeconds(30)).click();
        saveButtonCabinet.click();
        openLeftMenuButtonCabinet.click();
        journalOfOfficesButtonCabinet.click();
        addedCabinetInJournalOfOffices.shouldBe(Condition.visible);
    }

    public void EditCabinet() {
        AddCabinet();
        findFieldInJournalOfOffices.setValue("Автотест добавления кабинета");
        findButtonInJournalOfOffices.click();
        arrayPencilOfCabinetsInJournalOfOffices.get(0).click();
        crossClearingDescriptionField.click();
        descriptionCabinetField.setValue("Автотест редактирования кабинета");
        saveButtonCabinet.click();
        openLeftMenuButtonCabinet.click();
        journalOfOfficesButtonCabinet.click();
        editedCabinetInJournalOfOffices.shouldBe(Condition.visible);
    }
}
