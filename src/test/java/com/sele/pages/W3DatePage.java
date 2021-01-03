package com.sele.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class W3DatePage {

    @FindBy(how= How.XPATH,using="//*[@id=\"demo\"]")
   public WebElement dataelement;

    public W3DatePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public String getDate(){

        return this.dataelement.getText();
    }
}
