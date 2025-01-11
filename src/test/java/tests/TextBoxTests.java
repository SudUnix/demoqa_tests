package tests;

import org.junit.jupiter.api.Test;

public class TextBoxTests extends TestBase {

    @Test
    void fillFormTest() {
        String userName = "John Smith";
        String userEmail = "johnsmith@mail.com";
        String currentAddress = "Some address";
        String permanentAddress = "Other address";

        textBoxPage.openPage()
                .setName(userName)
                .setEmail(userEmail)
                .setCurrentAddress(currentAddress)
                .setPermanentAddress(permanentAddress)
                .submit()
                .verifyResult(userName, userEmail, currentAddress, permanentAddress);
    }
}
