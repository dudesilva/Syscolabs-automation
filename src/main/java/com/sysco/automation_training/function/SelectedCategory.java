package com.sysco.automation_training.function;

import com.sysco.automation_training.page.SelectedCategoryPage;

public class SelectedCategory {

    static SelectedCategoryPage selectedCategoryPage = new SelectedCategoryPage();



    public static void clickProductAddToCart(){
        selectedCategoryPage.clickProductAddToCart();

    }

    public static void clickOnShoeProduct() {
       selectedCategoryPage.clickOnShoeProduct();
    }

    public static void clickOnShoeSize() {
       selectedCategoryPage.clickOnShoeSize();
    }

    public static boolean issSccefulMessageDispalyed(){
        return selectedCategoryPage.issSccefulMessageDispalyed();
    }
}
