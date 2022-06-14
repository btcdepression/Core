package cucumber.stepdefs;

import common.login.LoginPage;
import io.cucumber.java.en.And;
import org.junit.jupiter.api.Assertions;

import static com.codeborne.selenide.Selenide.page;
import static constants.Constants.ERROR_MESSAGE;

public class LoginPageStepdefs {

    LoginPage loginPage = page(LoginPage.class);

    @And("^open 'Login page'$")
    public void navigateLoginPage() {
        loginPage.navigate();
    }

    @And("^enter (.*) user name$")
    public void enterUserName(String userName) {
        loginPage.enterUsername(userName);
    }

    @And("^enter (.*) password$")
    public void enterPassword(String password) {
        loginPage.enterPassword(password);
    }

    @And("^click 'login' CTA$")
    public void clickLoginCta() {
        loginPage.clickLoginCTA();
    }

    @And("^customer sees error message")
    public void customerSeesErrorMessage() {
        Assertions.assertEquals(ERROR_MESSAGE, loginPage.getErrorMessageText(), "Error message doesn't match");
    }
}
