package com.sele.tests;

import com.sele.pages.W3DatePage;
import com.sele.pages.W3FirstPage;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TestValueOfW3 extends BaseClass {

    @Test
    public void printval() throws InterruptedException {
        this.init("chrome");

        this.driver.get("https://www.w3schools.com/js/js_timing.asp");
        W3FirstPage frst=new W3FirstPage();
        PageFactory.initElements(driver,frst);
        frst.clickRun();
        System.out.println("run clicked");
        Thread.sleep(15000);
        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
            if(driver.getTitle().equalsIgnoreCase("Tryit Editor v3.6")) {

                System.out.println("done ji");
                break;
            }
            System.out.println(driver.getTitle());
        }
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[id='iframeResult']")));
        W3DatePage dat=new W3DatePage(driver);
       /* WebElement elem=driver.findElement(By.id("tryhome"));
        if(elem!=null){
            System.out.println("nai ji ");

        }
        else{
            System.out.println("null hega");
        }*/
        wait.until(ExpectedConditions.visibilityOf(dat.dataelement));


        System.out.println("starting ji");
        System.out.println("value is dat="+dat.getDate());
        Thread.sleep(2000);
        System.out.println("value is dat="+dat.getDate());

    }
}
