package com.sysco.automation_training.function;

import com.sysco.automation_training.page.SecureCheckoutPage;

public class SecureCheckout {

    static SecureCheckoutPage secureCheckoutPage = new SecureCheckoutPage();


    public static void getEmailAdress(String custmorEmailAddress) {
        secureCheckoutPage.setTxtEmailAddress(custmorEmailAddress);
    }


    public static void getFirstName(String firstName) {
        secureCheckoutPage.setTxtFirstName(firstName);

    }

    public static void getLastName(String lastName){
        secureCheckoutPage.setTxtLastName(lastName);
    }

    public static void getStreetAddress1(String streetAddress1){
        secureCheckoutPage.setTxtAddress1(streetAddress1);
    }

    public static void getSuburb(String suburb){
        secureCheckoutPage.setTxtSuburb(suburb);
    }

    public static void selectState(String state){
        secureCheckoutPage.selectState(state);

    }

    public static void getPostCode(String postCode){
        secureCheckoutPage.setTxtPostCode(postCode);
    }

    public static void selectCountry(String country){
        secureCheckoutPage.selectCountry(country);
    }

    public static void selectRegion(String region){
        secureCheckoutPage.setTxtPhoneRegion(region);
    }

    public static void getPhonrNumber(String phoneNumber){
        secureCheckoutPage.setTxtPhoneNumber(phoneNumber);
    }

    public static void getCompany(String company){
        secureCheckoutPage.setTxtCompany(company);

    }

    public static void clickContinue(){
        secureCheckoutPage.clickContinue();

    }


}