package EmiasOffices;

import GreenWhc.BaseTest;
import GreenWhc.*;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class TestCase extends BaseTest {

    /**
     * Базовый адрес для открытия страницы белого EMIAS
     */
    public String BASE_URL = "https://mis.2dr.ru/test/";

    /**
     * Ключ для входа после BASE_URL + куда (прописан будет в методе теста)
     */
    public String KEY =
            "?ticket=Ff7BU7cplJCzl8hMOe9skUdo3ylE2QRYT8My7Dh%2FaOZ%2FaV8jIyWDxfDoBDDsSTYYuEm4wtCqkLZKxBexHgD%2Bj3Cbf4XxQSWwt4HsA0ODaOBORHtU4gaZb8I1XcBgLbbRViVVymaBuEQfdcWQRtIAc2LEFMcz%2F0MYjdAZoCh%2Fkh1LZHD9b65RtOoLpm7p75nw3IDLHFgQZ4JSyUkQbiNhISIRWUSatv7XsJZ5m3qu9iLkLo4Mm4Uj5wskfQbb%2BYlCLA5dw%2BwA0QdLBDDvLsesTcsa24aILc%2BhoP332WiVhEbxwmZ4KdaEaLgEpFTZue7o3GRH4w%3D%3D&DocPrvdId=333&MisUrl=http:%2F%2F192.168.7.54%2Ftest&ReturnUrl=http:%2F%2F192.168.7.54%2Ftest%2FMain%2FDefault";
    ;


    /**
     * Вход на страницу Журнал кабинетов (белый мис)
     */
    @Test
    public void EnterJournalOfficesPage() {
        JournalOfficesPage journalOfficesPage = new JournalOfficesPage();
        journalOfficesPage.EnterJournalOfficesPage();
    }

    /**
     * Добавление кабинета
     */
    @Test
    public void AddCabinet() {
        JournalOfficesPage journalOfficesPage = new JournalOfficesPage();
        journalOfficesPage.AddCabinet();
    }
    /**
     * Редактирование кабинета (Описание)
     */
    @Test
    public void EditCabinet() {
        JournalOfficesPage journalOfficesPage = new JournalOfficesPage();
        journalOfficesPage.EditCabinet();
    }


}
