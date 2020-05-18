package com.sysco.automation_training.tests;

import com.sysco.automation_training.common.Constants;
import com.sysco.automation_training.data.UserCreatedData;
import com.sysco.automation_training.function.Categories;
import com.sysco.automation_training.function.Login;
import com.sysco.automation_training.function.SecureCheckout;
import com.sysco.automation_training.function.SelectedCategory;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import sun.rmi.runtime.Log;


public class LoginTest {

    static UserCreatedData userCreatedData = new UserCreatedData;


    @Test
    public static void verifyLoginButtonDisplay(){
        SoftAssert softAssert = new SoftAssert();
        Login.navigateToTheLoginPage();
        softAssert.assertTrue(Login.isLoginButtonDisplayed(), "Login Page is not Displayed");
        softAssert.assertAll();

    }

    /*@Test(alwaysRun = true,dependsOnMethods = "verifyLoginButtonDisplay")
    public static void verifyLoginErrorMessageForInvalidPassword(){
        SoftAssert softAssert = new SoftAssert();
        Login.loginFunctionality(userCreatedData.email ,userCreatedData.incorrectPassword);
        softAssert.assertEquals(Login.getInvalidPasswordErrorMessage(),Constants.ERROR_INVALID_CREDTIAL , "This is not an invalid message for invalid password");
        softAssert.assertAll();


    }*/

    @Test(alwaysRun = true ,dependsOnMethods = "verifyLoginButtonDisplay")
   public static void verifySuccessfulUserLogin(){
        SoftAssert softAssert = new SoftAssert();
        Login.loginFunctionality(userCreatedData.email ,userCreatedData.password);
        softAssert.assertEquals(Login.getUserName(),Constants.USER_NAME ,"User name is not matched");
        softAssert.assertAll();
    }

    @Test(alwaysRun = true, dependsOnMethods = "verifySuccessfulUserLogin")
    public static void verifyUserAbleToSelectCategory(){
        SoftAssert softAssert = new SoftAssert();
        Categories.clickOnMenuItem();
        Categories.clickOnSubMenuItem();
        SelectedCategory.clickOnShoeProduct();
        SelectedCategory.clickOnShoeSize();
        SelectedCategory.clickProductAddToCart();
        softAssert.assertTrue(SelectedCategory.issSccefulMessageDispalyed() , "SucceMessage is not displayed after adding item to cart");
       // SecureCheckout.getEmailAdress(cu);
        System.out.println("Gayya");






    }
}





