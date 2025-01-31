package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class NewTabsWindowsTests extends TestBase {
    @Test
    void openNewTabTest() {
        open("/browser-windows");
        $(".text-center").shouldHave(text("Browser Windows"));
        $("#tabButton").click();
        switchTo().window(1);
        $("#sampleHeading").shouldHave(text("This is a sample page"));
        closeWindow();
    }

    @Test
    void openNewWindowTest(){
        open("/browser-windows");
        $("#windowButton").click();
        switchTo().window(1);
        $("#sampleHeading").shouldHave(text("This is a sample page"));
        closeWindow();
    }
}
