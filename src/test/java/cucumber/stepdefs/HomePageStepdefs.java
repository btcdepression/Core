package cucumber.stepdefs;

import common.login.HomePage;
import io.cucumber.java.en.And;

import static com.codeborne.selenide.Selenide.page;

public class HomePageStepdefs {

    HomePage homePage = page(HomePage.class);

    @And("^customer checks current url$")
    public void checkCurrentUrl() {
        homePage.checkPageUrl();
    }

    @And("^customer checks current main title$")
    public void checkMainTitle() {
        homePage.pageTitleMatches();
    }
}
