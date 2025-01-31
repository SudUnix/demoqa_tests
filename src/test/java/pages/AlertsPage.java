package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class AlertsPage {

    private final SelenideElement
    alertInput = $("#alertButton"),
    alertWithDelayInput = $("#timerAlertButton"),
    alertConfirmInput = $("#confirmButton"),
    alertWithPromptInput = $("#promtButton");


    public AlertsPage openPage() {
        open("/alerts");
        return this;
    }

    public void clickAlertButton(){
        alertInput.click();
    }

    public void clickAlertWithDelayButton(){
        alertWithDelayInput.click();
    }

    public void clickAlertWithConfirmButton(){
        alertConfirmInput.click();
    }

    public void clickAlertWithPromptButton(){
        alertWithPromptInput.click();
    }
}
