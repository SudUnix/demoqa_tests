package pages.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class TextBoxPage {

    private static final String TITLE_TEXT = "Text Box";

    public TextBoxPage openPage() {
        open("/text-box");
        $(".text-center").shouldHave(text(TITLE_TEXT));
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
        return this;
    }

    private final SelenideElement
            nameInput = $("#userName"),
            emailInput = $("#userEmail"),
            currentAddressInput = $("#currentAddress"),
            permanentAddressInput = $("#permanentAddress"),
            submitInput = $("#submit");;


    public TextBoxPage setName(String value) {
        nameInput.setValue(value);
        return this;
    }

    public TextBoxPage setEmail(String value) {
        emailInput.setValue(value);
        return this;
    }

    public TextBoxPage setCurrentAddress(String value) {
        currentAddressInput.setValue(value);
        return this;
    }

    public TextBoxPage setPermanentAddress(String value) {
        permanentAddressInput.setValue(value);
        return this;
    }

    public TextBoxPage submit() {
        submitInput.click();
        return this;
    }

    public void verifyResult(String userName, String userEmail, String currentAddress, String permanentAddress) {
        $("#output").shouldBe(visible);
        $("#output #name").shouldHave(text(userName));
        $("#output #email").shouldHave(text(userEmail));
        $("#output #currentAddress").shouldHave(text(currentAddress));
        $("#output #permanentAddress").shouldHave(text(permanentAddress));
    }
}
