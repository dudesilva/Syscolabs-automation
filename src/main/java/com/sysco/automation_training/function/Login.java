package com.sysco.automation_training.function;

import com.sysco.automation_training.common.Constants;
import com.sysco.automation_training.page.LoginPage;
import com.sysco.automation_training.util.DriverEnvironmentSetUpUtil;

public class Login {

    static LoginPage loginPage = new LoginPage();


    public static void navigateToTheLoginPage() {

        loginPage.navigateToLoginPage();
    }

    public static boolean isLoginButtonDisplayed() {

        return loginPage.isLoginButtonDisplayed();
    }


    public static void loginFunctionality(String email, String password) {
        loginPage.setUserName(email);
        loginPage.setPassword(password);
        loginPage.clickLoginButton();
    }

    public static String getInvalidPasswordErrorMessage(){
        return loginPage.getInvalidPasswordErrorMessage();
    }

    public static String getUserName(){
        return loginPage.getUserName();
    }
}

