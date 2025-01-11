package tests;

import org.junit.jupiter.api.Test;

public class RegistrationFormTests extends TestBase {

    @Test
    void successfulRegistrationTest() {

        String firstName = "John";
        String lastName = "Smith";
        String userEmail = "johnsmith@mail.com";
        String gender = "Male";
        String userNumber = "1234567890";
        String subject = "Math";
        String hobby = "Music";
        String picture = "img/1.png";
        String currentAddress = "Some address";
        String state = "NCR";
        String city = "Delhi";

        registrationPage.openPage()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(userEmail)
                .setGender(gender)
                .setPhoneNumber(userNumber)
                .setBirthDate("May", "30", "1997")
                .setSubject(subject)
                .setHobby(hobby)
                .setPicture(picture)
                .setAddress(currentAddress)
                .setState(state)
                .setCity(city)
                .submit();

        registrationPage.verifyResultModalAppears()
                .verifyResult("Student Name", firstName + " " + lastName)
                .verifyResult("Student Email", userEmail)
                .verifyResult("Gender", gender)
                .verifyResult("Mobile", userNumber)
                .verifyResult("Date of Birth", "30 May,1997");
    }
}
