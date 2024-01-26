package com.saucedemo.pages;

import com.saucedemo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends BasePage{

    @FindBy(css = "[class='product_sort_container']")
    public WebElement sortDropDownMenu;

    public void sortPrice(String sortType){
        Select select= new Select(sortDropDownMenu);
        select.selectByVisibleText(sortType);
    }
    public void addToCartProduct(String productName){
        String productName2 = productName.toLowerCase().replace(" ", "-");
        System.out.println("productName2 = " + productName2);
        Driver.get().findElement(By.id("add-to-cart-"+productName2)).click();
    }
}
