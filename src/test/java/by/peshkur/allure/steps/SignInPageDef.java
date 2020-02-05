package by.peshkur.allure.steps;

import by.peshkur.allure.config.UserConfig;
import by.peshkur.allure.pages.SignInPage;

import io.cucumber.java.en.Then;

public class SignInPageDef {
    SignInPage signInPage = new SignInPage();


    @Then("Input login")
    public void inputLogin() {
        signInPage.inputLogin(UserConfig.USER_LOGIN);
    }

    @Then("Input password")
    public void inputPassword() {
        signInPage.inputPassword(UserConfig.USER_PASSWORD);
    }
}
