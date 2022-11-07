package GreenWhc;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class SessionPatient extends BaseTest {
    /**
     * Коллекция предварительных записей в расписании
     */
    private final ElementsCollection preRegistration = $$x("//div[@style='background-color:#DB3F23;border-color:#DB3F23;color:#FFFFFF']");
    /**
     * Коллекция первичных записей в расписании
     */
    private final ElementsCollection nonappearance = $$x("//div[@style='background-color:#3366CC;border-color:#3366CC;color:#FFFFFF']");
/**
 * //div[@style="background-color:#DB3F23;border-color:#DB3F23;color:#FFFFFF"]/div/div[contains(text(),'Вне расписания')]
 */
private  final  SelenideElement offScheduleRecord = $x("//div[@style='background-color:#DB3F23;border-color:#DB3F23;color:#FFFFFF']/div/div[contains(text(),'Вне расписания')]");
    /**
     * Кнопка "Пригласить пациента"
     */
    private final SelenideElement rtbtncallPatient = $("#rtbtncallPatient");
    /**
     * Кнопка "Неявка пациента"
     */
    private final SelenideElement rtbtnNoPatient = $("#rtbtnNoPatient");


    /**
     * Кнопка "Начать" в форме управления приёмом
     */
    private final SelenideElement buttonStartPatient = $x("//button[@title='Начать']");

    /**
     * Кнопка "Отмена" в ТАП
     */
    private final SelenideElement cancelBtnTAPFaceSheet = $x("//div[@class='ui-dialog-buttonset']/button[3]");

    /**
     * Окно предупреждения "Текущий ТАП не будет сохранен и не будет связан с ячейкой посещения. Продолжить?"
     */
    private final SelenideElement whcDialog = $x("//div[@aria-labelledby='ui-dialog-title-whcdialog']/div/div/button[1]");

    /**
     * Кнопка "Завершить приём" в форме управления приёмом
     */
    private final SelenideElement buttonEndPatient = $x("//div[@id=contains(text(),'qtip')]//div/span[2]/button[2]");
    /**
     * Кнопка "Да" в окне предупреждения "Дальнейшая работа с записью на приём будет невозможна. Продолжить?"
     */
    private final SelenideElement warningNonappearanceYes = $x("//div[@class='ui-dialog-buttonset']//button[1]");

    /**
     * Выполнение вызова пациента и завершение без создания ТАП предварительной записи
     */
    public void SessionPatient() {
        preRegistration.first().shouldBe(visible, Duration.ofSeconds(30)).click();
        rtbtncallPatient.shouldBe(visible).click();
        buttonStartPatient.should(visible, Duration.ofSeconds(30)).click();
        cancelBtnTAPFaceSheet.should(visible).click();
        whcDialog.shouldBe(visible, Duration.ofSeconds(30)).click();
        buttonEndPatient.shouldBe(visible, Duration.ofSeconds(30)).doubleClick();


    }

    /**
     * Неявка первичной записи в личном кабинете
     */
    public void NonappearancePatient() {
        nonappearance.first().shouldBe(visible, Duration.ofSeconds(30)).click();
        rtbtnNoPatient.shouldBe(visible).click();
        warningNonappearanceYes.shouldBe(visible, Duration.ofSeconds(30)).click();

    }
    /**
     * Перенос предварительной записи из вне расписания
     */
    public void TransferringRecord() {
        offScheduleRecord.shouldBe(visible,Duration.ofSeconds(30)).click();
        int a = 6;
    }
}


