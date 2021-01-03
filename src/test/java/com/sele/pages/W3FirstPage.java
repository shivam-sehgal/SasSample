package com.sele.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class W3FirstPage {

    @FindBy(how= How.XPATH,using="//a[@class=\"w3-btn w3-margin-bottom\" and @href=\"tryit.asp?filename=tryjs_setinterval2\"]")
    @CacheLookup
    WebElement runButton;

    public void clickRun(){
        runButton.click();
    }

}
