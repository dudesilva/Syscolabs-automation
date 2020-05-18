package com.sysco.automation_training.function;

import com.sysco.automation_training.page.CartPage;

public class Cart {

    static CartPage cartPage = new CartPage();

    public void navigateToShoppingCart(){
        cartPage.clickCartSymbol();
    }

     public void clickCloseTheCart(){
        cartPage.clickCloseTheCart();
     }

    public void clickDeleteFromCart(){
        cartPage.clickDeleteFromCart();
    }


}
