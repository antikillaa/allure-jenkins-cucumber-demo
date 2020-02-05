package by.peshkur.allure.steps;

import io.cucumber.java.Before;

import static com.codeborne.selenide.Selenide.open;

public class Hooks {

    @Before
    public void openUrl() {
        open("https://grinfer.com/");
    }
}
