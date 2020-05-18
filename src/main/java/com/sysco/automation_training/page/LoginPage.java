package com.sysco.automation_training.page;

import com.sysco.automation_training.common.Constants;
import com.sysco.automation_training.util.DriverEnvironmentSetUpUtil;
import com.syscolab.qe.core.ui.SyscoLabUI;
import com.syscolab.qe.core.ui.web.SyscoLabWUI;
import org.openqa.selenium.By;

public class LoginPage {

    protected static SyscoLabUI syscoLabUI;


    protected By txtEmailAddress = By.id("email");
    protected By txtPassword = By.id("pass");
    protected By btnLogin = By.id("send2");
    protected By lblErrorMessage = By.xpath("//div[text()='YOU DID NOT SIGN IN CORRECTLY OR YOUR ACCOUNT IS TEMPORARILY DISABLED']']");
    protected By lblUserName = By.xpath("//*[@ class = 'name']//*[contains(text(),'william  jacob')]");



    public void navigateToLoginPage(){

        DriverEnvironmentSetUpUtil.setToRunLocally();
        syscoLabUI = new SyscoLabWUI(null);
        syscoLabUI.navigateTo(Constants.SITE_URL);
        syscoLabUI.getDriver().manage().window().maximize();

    }

    public void setUserName(String email){
        syscoLabUI.sendKeys(txtEmailAddress,email);

    }

    public void setPassword(String password){
        syscoLabUI.sendKeys(txtPassword,password);
    }

    public void clickLoginButton(){
        syscoLabUI.click(btnLogin);
    }

    public boolean isLoginButtonDisplayed(){
         return syscoLabUI.isDisplayed(btnLogin);

    }

    public String getInvalidPasswordErrorMessage(){
        return syscoLabUI.getText(lblErrorMessage);
    }

    public String getUserName(){
        return syscoLabUI.getText(lblUserName);


    }

    public void refresh(){
        syscoLabUI.refreshBrowser();
        syscoLabUI.sleep(5);
    }



}
