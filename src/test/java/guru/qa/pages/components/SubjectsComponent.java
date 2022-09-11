package guru.qa.pages.components;

import static com.codeborne.selenide.Selenide.$;

public class SubjectsComponent {

    public SubjectsComponent setSubject(String firstSubject, String secondSubject) {
        $("#subjectsInput").setValue(firstSubject).pressEnter();
        $("#subjectsInput").setValue(secondSubject).pressEnter();

        return this;
    }
}