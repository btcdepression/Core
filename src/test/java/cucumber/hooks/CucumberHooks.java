package cucumber.hooks;


import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;

import static driver.ConfigurationManager.closeDriver;
import static driver.ConfigurationManager.getDriver;

public class CucumberHooks {

    @BeforeAll
    public static void beforeAll() {
        getDriver();
    }

    @AfterAll
    public static void afterAll() {
        closeDriver();
    }
}
