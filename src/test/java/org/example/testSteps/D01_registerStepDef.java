package org.example.testSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.Registration;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public
class D01_registerStepDef {
    Registration reg = new Registration();


    @Given("user go to register page")
    public
    void step1() {
        reg.regBtn().click();

    }

    @When("user choose male or female and enter valid data")

    public
    void step2() {
        reg.femaleGender().click();

        reg.firstName().sendKeys("Sara");

        reg.lastName().sendKeys("Sharaf");

        Select select = new Select(reg.birthDay());
        select.selectByIndex(12);

        select = new Select(reg.birthMonth());
        select.selectByVisibleText("April");

        select = new Select(reg.birthYear());
        select.selectByValue("1990");


        reg.email().sendKeys("sarasharaf4907@gmail.com");

        reg.companyName().sendKeys("Vezeeta");

        reg.password().sendKeys("P@ssw0rd");
        reg.confirmPassword().sendKeys("P@ssw0rd");
    }

    @Then("user press on register button")
    public
    void step3() {
        reg.submitBtn().click();
    }

    @And("user could register successfully")
    public
    void step4() {
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(reg.successfulMsg().isDisplayed(), "Success Message");
        // 2nd Assertion
        String actual = reg.successfulMsg().getCssValue("color");
        String expected = "rgba(76, 177, 124, 1)";
        soft.assertEquals(actual, expected, "color is correct");
        // Assert All
        soft.assertAll();
    }
}