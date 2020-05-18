package com.sysco.automation_training.page;

import com.syscolab.qe.core.ui.SyscoLabUI;
import org.openqa.selenium.By;

public class SecureCheckoutPage {


    protected By txtEmailAddress = By.id("customer-email");
    protected By txtFirstName = By.xpath("//*[@id='shipping-new-address-form']//input[@name='firstname']");
    protected By txtLastName = By.xpath("//*[@id='shipping-new-address-form']//input[@name='lastname']");
    protected By txtCompany = By.xpath("//*[@id='shipping-new-address-form']//input[@name='company']");
    protected By txtSuburb = By.xpath("//*[@id='shipping-new-address-form']//input[@name='city']");
    protected By txtPostCode = By.xpath("//*[@id='shipping-new-address-form']//input[@name='postcode']");
    protected By drpState = By.xpath("//*[@id='shipping-new-address-form']//select[@name='region_id']");
    protected By drpCountry = By.xpath("//*[@id='shipping-new-address-form']//select[@name='country_id'] ");
    protected By txtAddress1 = By.xpath("//*[contains(@name,'shippingAddress.street.0')]/div/input");
    protected By txtPhoneNumber = By.xpath("//*[contains(@name,'shippingAddress.telephone')]/div/div/div/input");
    protected By btnContinue = By.xpath("//button[@ class = 'button -primary -expanded']");
    protected By txtPhoneRegion = By.id("/localization-select-field");

    //button[@ class = 'button -primary -expanded']
    SyscoLabUI syscoLabUI = new SyscoLabUI();

    public void setTxtEmailAddress(String custmoremailAddress){
        syscoLabUI.sendKeys(txtEmailAddress , custmoremailAddress);

    }

    public void setTxtFirstName(String firstName){
        syscoLabUI.sendKeys(txtFirstName,firstName);

    }

    public void setTxtLastName (String lastName){
        syscoLabUI.sendKeys(txtLastName,lastName);
    }

    public void setTxtCompany(String company){
        syscoLabUI.sendKeys(txtCompany, company);

    }
    public void setTxtSuburb(String suburb){
        syscoLabUI.sendKeys(txtSuburb ,suburb);
    }

    public void setTxtPostCode(String postCode){
        syscoLabUI.sendKeys(txtPostCode , postCode);
    }

    public  void selectState(String state){
        syscoLabUI.selectFromDropDown(drpState , state);
    }

    public void selectCountry(String country){
        syscoLabUI.selectFromDropDown(drpCountry , country);
    }

    public void setTxtAddress1(String address1){
        syscoLabUI.sendKeys(txtAddress1,address1);

    }

    public void setTxtPhoneNumber(String phoneNumber){
        syscoLabUI.sendKeys(txtPhoneNumber , phoneNumber);

    }

    public void setTxtPhoneRegion(String phoneRegion){
        syscoLabUI.sendKeys(txtPhoneRegion,phoneRegion);
    }

    public void clickContinue(){
        syscoLabUI.click(btnContinue);
    }

}
