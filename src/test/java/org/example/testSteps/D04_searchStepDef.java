package org.example.testSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.Search;
import org.openqa.selenium.Keys;
import org.testng.asserts.SoftAssert;

public
class D04_searchStepDef {
    Search search=new Search();

    @Given("user click on search bar")
    public void step1(){
        search.searchField().click();
    }


    @When ("user search for product")

    public void step2() throws InterruptedException {
        search.searchField().sendKeys("laptop");
    Thread.sleep(3000);

    }

    @When ("user search for product with SKU")

    public void step02() throws InterruptedException {
        search.searchField().sendKeys( "AP_MBP_13");
        Thread.sleep(3000);
    }

    @When   ("user search for product like \"Xiaomi\"")

    public void step002() throws InterruptedException {
        search.searchField().sendKeys( "Xiaomi");
        Thread.sleep(3000);
    }

    @And("user click on search Button")

    public void step3(){
        search.searchField().sendKeys(Keys.ENTER);

    }

    @Then("user could search successfully and go to search page")
    public void step4(){
        // First Assertion
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/search?q=laptop"), "search URL");
        // Second Assertion
        int size = search.productsList();
        soft.assertTrue(size > 0,"Search Result");
        // Assert All
        soft.assertAll();
    }
    @Then("user could search successfully with SKU")
    public void step5() {
        // First Assertion
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/search?q=AP_MBP_13"), "URL after search");
        // Second Assertion
        int size = search.productsList();
        soft.assertTrue(size > 0,"Search Result");
        // Assert All
        soft.assertAll();
    }

    @Then("user could not search")
    public void step6() {
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(search.noProducts().isDisplayed(), "No products");
    }
}
