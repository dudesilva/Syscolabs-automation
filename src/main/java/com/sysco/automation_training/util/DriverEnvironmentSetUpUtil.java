package com.sysco.automation_training.util;

import java.util.logging.Logger;
import com.syscolab.qe.core.ui.SyscoLabCapabilityUtil;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;



public class DriverEnvironmentSetUpUtil  {

    DriverEnvironmentSetUpUtil(){

    }

    public static String chromeDriver = "webdriver.chrome.driver";


    public static void setToRunLocally (){
        System.setProperty(chromeDriver,"src/main/resources/chrome_driver/i386/chromedriver");
        Logger.getLogger(System.getProperty(chromeDriver));



    }

    public static Capabilities setToRunRemotely(){
        DesiredCapabilities capabilities;
        System.getProperty("hub-url", "http://localhost:4444/wd/hub");
        capabilities = SyscoLabCapabilityUtil.getPCCapabilities("Windows" , "chrome");
        capabilities.setBrowserName(BrowserType.CHROME);
        return capabilities;
    }



}
