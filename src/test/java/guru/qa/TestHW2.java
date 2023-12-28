package guru.qa;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestHW2 {

    @Test
    void successfulTest(){
        open("https://demoqa.com/automation-practice-form");
        $("[id=#firstName]").setValue("Andrey");
        $("[id=#lastName]").setValue("Ts");
        $("[id=#userEmail]").setValue("ats.73@mail.ru");

        $(".custom-control-label").click();
        $("[id=#userNumber]").setValue("");
        $("[id=#dateOfBirthInput]").click();

        $(".react-date picker__month-select").selectOption("June");
        $(".react-date picker__year-select").selectOption("1973");
        $(".react-date picker__day--22").click();

        $("[id=#subjectsInput]").setValue("a").click();
        $("label[for='hobbies-checkbox-1']").click();
        $("label[for='hobbies-checkbox-2']").click();
        $("label[for='hobbies-checkbox-3']").click();

        $("[id=#currentAddress]").setValue("123, область, город, улица д.1, кв.1");
        $("[id=#react-select-3-input]").setValue("AB").click();
        $("[id=#react-select-4-input]").setValue("BC").click();

        $("[id=#submit").pressEnter();




    }

}
