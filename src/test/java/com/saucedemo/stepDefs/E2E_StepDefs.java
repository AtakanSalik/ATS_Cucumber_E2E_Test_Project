package com.saucedemo.stepDefs;

import com.saucedemo.pages.CartPage;
import com.saucedemo.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class E2E_StepDefs {
HomePage homePage = new HomePage();
CartPage cartPage = new CartPage();
    @When("User sorts products from high to low")
    public void user_sorts_products_from_high_to_low() {
    homePage.sortPrice("Price (high to low)");
    }
    @When("User adds at least two items to the cart {string} and {string}")
    public void user_adds_at_least_two_items_to_the_cart(String product1,String product2) {
    homePage.addToCartProduct(product1);
    homePage.addToCartProduct(product2);
    }
    @Then("Basket shows the correct number of products {string}")
    public void basket_shows_the_correct_number_of_products(String basketNumber) {
        Assert.assertEquals(homePage.basketNumber.getText(),basketNumber);
    }
    @Then("User navigates to the cart page")
    public void user_navigates_to_the_cart_page() {
    homePage.cartPageBtn.click();
    }
    @Then("Right items are added to the cart {string} and {string}")
    public void right_items_are_added_to_the_cart(String product1,String product2) {
    cartPage.verifyCartHasCorrectProducts(product1,product2);
    }
    @Then("User goes to the checkout page and fills the form")
    public void user_goes_to_the_checkout_page_and_fills_the_form() {
    cartPage.checkoutBtn.click();
    cartPage.fillForm();
    }
    @Then("User clicks continue to go to the {string} page")
    public void user_clicks_continue_to_go_to_the_checkout_overview_page(String title) {
        cartPage.continueBtn.click();
        cartPage.verifyPageTitle(title);
    }
    @Then("User clicks finish")
    public void user_clicks_finish() {
    cartPage.finishBtn.click();
    }
    @Then("Success shopping message is displayed {string}")
    public void success_shopping_message_is_displayed(String message) {
    cartPage.verifySuccesShopMessage(message);
    }

}
