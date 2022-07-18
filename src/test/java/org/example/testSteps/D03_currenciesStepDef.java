package org.example.testSteps;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.Currencies;
import org.example.pages.Login;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public
class D03_currenciesStepDef {
    Login log = new Login();

    Currencies currencies = new Currencies();




@When("user select “Euro” from currency dropdown list")
    public void step1(){
    currencies.customerCurrency().click();
    //currencies.selectedCurrency().click();
    Select select = new Select(currencies.customerCurrency());
    select.selectByVisibleText("Euro");

}

@Then("All $ sign change to € sign")

    public void step2(){

    int count = Hooks.driver.findElements(By.cssSelector("option[value='https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F']")).size();
    for (int x = 0; x < count; x++){
        String text = currencies.productPrices().getText();
        Assert.assertTrue(text.contains("€"));
    }
}
}
