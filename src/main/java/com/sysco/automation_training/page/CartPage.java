package com.sysco.automation_training.page;

import com.syscolab.qe.core.ui.SyscoLabUI;
import org.openqa.selenium.By;

public class CartPage {

    protected By btnCartSymbol = By.xpath("//*[@class='minicart-wrapper']");
    protected By lblQtyNumber = By.xpath("//*[@class='counter qty']");
    protected By btnDeleteFromCart = By.xpath("//a[@class='action delete']");
    protected By btnCloseTheCart = By.xpath("//*[@class='close']");
    //protected By lblDeleteConfimMessage = By.xpath("//div[text()='Are you sure you would like to remove this item from the shopping cart?']");
    //protected By btnConfimrationOK = By.xpath("//span[text()='OK']");
    protected By lblItemNameInCart = By.xpath("//a[text()='ROCKPORT CITY EDGE MENS UBAL BLACK LAGER LEA BLACK']");
    protected By lblSubtotal = By.xpath("//div[@ class = 'subtotal']");
    protected By btnProceedToCheckout = By.xpath("//button[@ title = 'Proceed To Checkout']");


    //public boolean isItemAlreadyAvailable(){}

    protected static SyscoLabUI syscoLabUI;

    public void clickCartSymbol() {
        syscoLabUI.click(btnCartSymbol);
    }

    public  String getQtyNumber(){
        return syscoLabUI.getValue(lblQtyNumber);
    }

    public void clickDeleteFromCart(){
        syscoLabUI.click(btnDeleteFromCart);
    }

    public void clickCloseTheCart(){
        syscoLabUI.click(btnCloseTheCart);
    }

    public void displayItemNameInCart(){
        syscoLabUI.getText(lblItemNameInCart);
    }

    public void displaysubtotal(){
        syscoLabUI.getText(lblSubtotal);
    }

    public void proceedToCheckout(){
        syscoLabUI.click(btnProceedToCheckout);
    }


}