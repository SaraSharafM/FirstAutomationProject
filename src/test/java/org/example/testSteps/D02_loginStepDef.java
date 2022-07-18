package org.example.testSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.Login;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public
class D02_loginStepDef {
    Login log = new Login();


    @When("user navigate to login page")
    public
    void step1() {
        log.logBtn().click();
    }

    @And("user enter valid data")
    public
    void step2() {
        log.emailE().sendKeys("sarasharaf4907@gmail.com");
        log.passwordE().sendKeys("P@ssw0rd");
    }

    @Then("user click on login button")
    public
    void step3() {
        log.loginBtn().submit();
    }

    @And("user could login successfully and go to home page")
    public
    void step4() {

        // First Assertion
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/", "URL login");
        // Second Assertion
        Hooks.driver.findElement(By.linkText("My account")).isDisplayed();
        soft.assertTrue(log.myAccount().isDisplayed(), "My Account");
        // Assert All
        soft.assertAll();
    }

    @When("user navigate to login page2")
    public
    void step5() {
        log.logBtn().click();
    }

    @And("user enter invalid data")
    public
    void step6() {
        log.emailE().sendKeys("test@example.com");
        log.passwordE().sendKeys("P@sswOrd");
    }

    @Then("user click on login button2")
    public
    void step7() {
        log.loginBtn().submit();
    }


    @And("user could not login successfully and go to home page")
    public void step8() {
        // First Assertion
        SoftAssert soft = new SoftAssert();
        log.wrongMsg().isDisplayed();
        String actual = log.wrongMsg().getText();
        soft.assertEquals(actual,"Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found","Wrong Message");
        // Second Assertion
        actual = log.wrongMsg().getCssValue("color");
        String expected = "rgba(228, 67, 75, 1)";
        soft.assertEquals(actual, expected, "color");
        // Assert All
        soft.assertAll();
    }
}
