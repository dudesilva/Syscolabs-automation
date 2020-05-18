package com.sysco.automation_training.page;

import com.syscolab.qe.core.ui.SyscoLabUI;
import org.openqa.selenium.By;

public class SelectedCategoryPage {


    protected By btnproductAddToCart = By.id("product-addtocart-button");
    protected By lnkShoeProduct = By.xpath("//a[@class='product-item-link' and @title='BROOKS ADRENALINE GTS 20 MENS NAVY BLUE SILVER']");
    protected By lnkShoesSize = By.xpath("//div[@option-id='288' and @option-label='10']");
    protected By overlaySucceeMessage = By.xpath("//div[text()='You added BROOKS ADRENALINE GTS 20 MENS NAVY BLUE SILVER to your shopping cart.']");


    SyscoLabUI syscoLabUI = new SyscoLabUI();



    public  void clickProductAddToCart() {
        syscoLabUI.click(btnproductAddToCart);
    }

    public  void clickOnShoeProduct() {
        syscoLabUI.click(lnkShoeProduct);
    }

    public   void clickOnShoeSize() {
        syscoLabUI.click(lnkShoesSize);
    }

    public boolean issSccefulMessageDispalyed(){
        return syscoLabUI.isDisplayed(overlaySucceeMessage);
    }

}

