package cucumber.stepdefs;

import io.cucumber.java.en.And;
import pages.LoginPage;

import static com.codeborne.selenide.Selenide.page;
import static constants.Constants.LOGIN_ERROR_MESSAGE;
import static org.junit.Assert.assertEquals;

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
        assertEquals("Error message doesn't match", LOGIN_ERROR_MESSAGE, loginPage.getErrorMessageText());
    }
}
