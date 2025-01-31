package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.switchTo;

public class AlertsTests extends TestBase {

    @Test
    void acceptAlertTest() {
        alertsPage.openPage().clickAlertButton();
        Alert alert = switchTo().alert();
        String alertText = alert.getText();
        Assertions.assertEquals(alertText, "You clicked a button");
        alert.accept();
    }

    @Test
    void acceptAlertWithDelayTest() {
        alertsPage.openPage().clickAlertWithDelayButton();
        Alert alert = switchTo().alert(Duration.ofDays(5000));
        String alertText = alert.getText();
        Assertions.assertEquals(alertText, "This alert appeared after 5 seconds");
        alert.accept();
    }

    @Test
    void acceptAlertConfirmTest() {
        alertsPage.openPage().clickAlertWithConfirmButton();
        Alert alert = switchTo().alert();
        String alertText = alert.getText();
        Assertions.assertEquals(alertText, "Do you confirm action?");
        alert.dismiss();
    }

    @Test
    void acceptAlertWithPromptTest() {
        alertsPage.openPage().clickAlertWithPromptButton();
        Alert alert = switchTo().alert();
        String alertText = alert.getText();
        Assertions.assertEquals(alertText, "Please enter your name");
        alert.sendKeys("Hello!!!");
        alert.accept();
    }
}
