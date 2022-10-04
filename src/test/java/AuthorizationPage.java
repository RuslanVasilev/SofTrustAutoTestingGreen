/**
 * Страница авторизации в МИС
 */

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;


public class AuthorizationPage extends BaseTest {
    private final SelenideElement login = $x("//input[@id='Login']");
    private final SelenideElement password = $x("//*[@id='Password']");
    private final SelenideElement remember = $x("//input[@id='Remember']");
    private final SelenideElement enterBtn = $x("//input[@id='loginBtn']");
    private final  SelenideElement infoWindow = $x("//div[@class='ui-dialog-buttonset']");

    public AuthorizationPage(String url){
        Selenide.open(url);
    }

    /**
     * Вводится логин и пароль, нажимаеться чекбокс "Запомнить меня" и далее кнопка "Войти" TEST-2918
     * @param loginValue значение логина
     * @param passwordValue значение пароля
     * @return
     */
    public AuthorizationPage AuthorizationEnter (String loginValue, String passwordValue){
        login.sendKeys(loginValue);

        password.sendKeys(passwordValue);

        remember.click();
        System.out.println("Клик на вход");

        enterBtn.click();

        infoWindow.click();

        return this;
    }
}
