package com.sele.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
    WebDriver driver;
    WebDriverWait wait;
    public void init(String val) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
       if(val.equalsIgnoreCase("chrome")){
           this.driver=new ChromeDriver();
           this.wait=new WebDriverWait(this.driver,20,50);

       }

    }


}
