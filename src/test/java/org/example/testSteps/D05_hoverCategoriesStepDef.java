package org.example.testSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.HoverCategories;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public
class D05_hoverCategoriesStepDef {

HoverCategories hover = new HoverCategories();
String subCategoryName;
    @When("user hover category")
    public void step1() throws InterruptedException {
             Actions actions=new Actions(Hooks.driver);
        actions.moveToElement(hover.computers()).perform();
        actions.moveToElement(hover.computers()).perform();
        Thread.sleep(3000);
        //subCategoryName = hover.desktops().getText().toLowerCase();
        //hover.computers().click();

    }

    @And("user select subcategory")
    public void step2(){
        hover.desktops().click();
    }

    @Then("user go to relative product page")
    public void step3(){
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/desktops", "Subcategory opened");

    }
}
