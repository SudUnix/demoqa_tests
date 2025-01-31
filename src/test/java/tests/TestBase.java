package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import pages.AlertsPage;
import pages.RegistrationPage;
import pages.TextBoxPage;

public class TestBase {

    protected RegistrationPage registrationPage = new RegistrationPage();
    protected AlertsPage alertsPage = new AlertsPage();
    TextBoxPage textBoxPage = new TextBoxPage();
    TestData testData = new TestData();

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
    }
}
