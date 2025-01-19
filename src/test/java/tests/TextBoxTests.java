package tests;

import org.junit.jupiter.api.Test;

public class TextBoxTests extends TestBase {

    @Test
    void fillFormTest() {



        textBoxPage.openPage()
                .setName(testData.name)
                .setEmail(testData.email)
                .setCurrentAddress(testData.address)
                .setPermanentAddress(testData.address)
                .submit()
                .verifyResult(testData.name, testData.email, testData.address, testData.address);
    }
}
