package com.saucedemo.pages;

import com.saucedemo.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CartPage extends BasePage{
    @FindBy(id = "checkout")
    public WebElement checkoutBtn;
    @FindBy(id = "continue")
    public WebElement continueBtn;
    @FindBy(id = "finish")
    public WebElement finishBtn;
    @FindBy(xpath = "//div[@class=\"form_group\"]/input")
    public List<WebElement> formInputBoxes;
    public void verifyCartHasCorrectProducts(String product1,String product2){
        String actualPorduct1 = Driver.get().findElement(By.xpath("//div[.='" + product1 + "']")).getText();
        String actualPorduct2 = Driver.get().findElement(By.xpath("//div[.='" + product2 + "']")).getText();
        Assert.assertEquals(actualPorduct1,product1);
        Assert.assertEquals(actualPorduct2,product2);
    }
    public void fillForm(){
       formInputBoxes.get(0).sendKeys("atakan");
       formInputBoxes.get(1).sendKeys("salık");
       formInputBoxes.get(2).sendKeys("35000");
    }
    public void verifyPageTitle(String title){
        String actualTitle = Driver.get().findElement(By.xpath("//span[.='" + title + "']")).getText();
        Assert.assertEquals(actualTitle,title);
    }
    public void  verifySuccesShopMessage(String message){
        String actualMessage = Driver.get().findElement(By.xpath("//h2[.='" + message + "']")).getText();
        Assert.assertEquals(actualMessage,message);
    }
}
