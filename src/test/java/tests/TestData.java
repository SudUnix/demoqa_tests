package tests;

import com.github.javafaker.Faker;

import java.text.SimpleDateFormat;

public class TestData {

    static Faker faker = new Faker();
    String name = faker.name().fullName();
    String firstName = faker.name().firstName();
    String lastName = faker.name().lastName();
    String email = faker.internet().emailAddress();
    String address = faker.address().streetAddress();
    String phone = faker.phoneNumber().subscriberNumber(10);
    String date = faker.date().birthday().toString();
    String gender = faker.options().option("Male", "Female", "Other");
    String subject = faker.options().option("math", "physics", "art", "hindi", "english", "biology");
    String hobby = faker.options().option("Sports", "Reading", "Music");
    String state = faker.options().option("NCR", "Uttar Pradesh", "Haryana", "Rajasthan");

    public static String[] birthDayGenerator(int minAge, int maxAge) {
        String formattedDate = new SimpleDateFormat("dd MMMM yyyy").format(faker.date().birthday(minAge, maxAge));
        return formattedDate.split(" ");
    }

    public static String cityGenerator(String state) {
        String city = null;
        switch (state) {
            case "NCR":
                city = faker.options().option("Delhi", "Gurgaon", "Noida");
                break;
            case "Uttar Pradesh":
                city = faker.options().option("Agra", "Lucknow", "Merrut");
                break;
            case "Haryana":
                city = faker.options().option("Karnal", "Panipat");
                break;
            case "Rajasthan":
                city = faker.options().option("Jaipur", "Jaiselmer");
                break;
        }
        return city;
    }
}


