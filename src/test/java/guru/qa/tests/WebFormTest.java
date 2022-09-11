package guru.qa.tests;

import guru.qa.pages.WebFormPage;
import org.junit.jupiter.api.Test;

import static guru.qa.tests.TestData.*;

public class WebFormTest extends TestBase {
    WebFormPage webFormPage = new WebFormPage();

    @Test
    void fillFormTest() {
        webFormPage.openPage()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setUserEmail(userEmail)
                .setGender(gender)
                .setUserNumber(number)
                .setDate(day, month, year)
                .setSubject(firstSubjects, secondSubject)
                .setHobby(firstHobby, secondHobby)
                .setAddress(address)
                .setStateAndCity(state, city)
                .uploadPicture(picture)
                .clickSubmit();

        webFormPage.checkVisible()
                .checkResults("Student Name", String.format("%s %s", firstName, lastName))
                .checkResults("Student Email", userEmail)
                .checkResults("Gender", gender)
                .checkResults("Mobile", number)
                .checkResults("Date of Birth", String.format("%s %s,%s", day, month, year))
                .checkResults("Subjects", firstSubjects + ", " + secondSubject)
                .checkResults("Hobbies", firstHobby + ", " + secondHobby)
                .checkResults("Picture", picture)
                .checkResults("Address", address)
                .checkResults("State and City", state + " " + city);
    }
}
