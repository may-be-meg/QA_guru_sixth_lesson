package guru.qa.tests;

import com.github.javafaker.Faker;

public class TestData {
    static Faker faker = new Faker();
    static String
            firstName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            userEmail = faker.internet().emailAddress(),
            gender = "Female",
            number = faker.phoneNumber().subscriberNumber(10),
            day = faker.number().numberBetween(10, 31) + "",
            month = "October",
            year = faker.number().numberBetween(1991, 2003) + "",
            firstSubjects = "Arts",
            secondSubject = "Social Studies",
            firstHobby = "Reading",
            secondHobby = "Music",
            picture = "1-161.jpg",
            address = faker.address().fullAddress(),
            state = "NCR",
            city = "Noida";
}
