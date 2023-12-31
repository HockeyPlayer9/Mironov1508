package page;

import com.codeborne.selenide.SelenideElement;
import data.DataHelper;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    private static final SelenideElement loginField = $("[data-test-id= 'login'] input");
    private static final SelenideElement passwordField = $("[data-test-id= 'password'] input");
    private static final SelenideElement loginButton = $("[data-test-id= 'action-login']");

    public static VerificationPage validLogin(DataHelper.AuthInfo info) {
        loginField.setValue(info.getLogin());
        passwordField.setValue(info.getPassword());
        loginButton.click();
        return new VerificationPage();
    }

}
