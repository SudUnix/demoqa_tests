package tests;

import org.junit.jupiter.api.Test;

import static tests.TestData.birthDayGenerator;
import static tests.TestData.cityGenerator;

public class RegistrationFormTests extends TestBase {

    @Test
    void successfulRegistrationTest() {

        String firstName = testData.firstName;
        String lastName = testData.lastName;
        String userEmail = testData.email;
        String gender = testData.gender;
        String userNumber = testData.phone;
        String[] dateOfBirth = birthDayGenerator(17, 95);
        String subject = testData.subject;
        String hobby = testData.hobby;
        String picture = "img/1.png";
        String currentAddress = testData.address;
        String state = testData.state;
        String city = cityGenerator(state);

        registrationPage.openPage()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(userEmail)
                .setGender(gender)
                .setPhoneNumber(userNumber)
                .setBirthDate(dateOfBirth[0], dateOfBirth[1], dateOfBirth[2])
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
                .verifyResult("Date of Birth", String.format(dateOfBirth[0], dateOfBirth[1], dateOfBirth[2]))
                .verifyResult("Subjects", subject)
                .verifyResult("Hobbies", hobby)
                .verifyResult("Picture", "1.png")
                .verifyResult("Address", currentAddress)
                .verifyResult("State and City", state + " " + city);
    }
}
