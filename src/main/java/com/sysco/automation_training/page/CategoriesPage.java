package com.sysco.automation_training.page;

import com.syscolab.qe.core.ui.SyscoLabUI;
import org.openqa.selenium.By;

public class CategoriesPage {



    protected By lnknMenuItemMen =By.xpath("//*[@id='mi-1-2']");
    protected By lnkSubMenuItemRun = By.xpath("//*[@id='mi-3-2-3-1' and @title='Run']");


    protected static SyscoLabUI syscoLabUI;


    public  void clickOnMenuItem(){
        syscoLabUI.click(lnknMenuItemMen);
    }

    public void clickOnSubMenuItem(){
        syscoLabUI.click(lnkSubMenuItemRun);
    }
}
