package cucumber.stepdefs;

import io.cucumber.java.en.And;
import pages.HomePage;

import static com.codeborne.selenide.Selenide.page;

public class HomePageStepdefs {

    HomePage homePage = page(HomePage.class);

    @And("^customer checks current url$")
    public void checkCurrentUrl() {
        homePage.checkPageUrl();
    }
}
