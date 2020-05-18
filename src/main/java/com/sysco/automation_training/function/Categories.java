package com.sysco.automation_training.function;

import com.sysco.automation_training.page.CategoriesPage;

public class Categories {

    static CategoriesPage categoriesPage = new CategoriesPage();


    public static void clickOnSubMenuItem(){
        categoriesPage.clickOnSubMenuItem();
    }

    public static void clickOnMenuItem(){
        categoriesPage.clickOnMenuItem();
    }


}
