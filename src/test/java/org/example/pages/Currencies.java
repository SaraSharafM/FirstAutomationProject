package org.example.pages;

import org.example.testSteps.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public
class Currencies {

    public
    WebElement customerCurrency() {
        WebElement customerCurrency = Hooks.driver.findElement(By.id("customerCurrency"));

        return customerCurrency;
    }




    public
    WebElement productPrices() {
        WebElement productPrices = Hooks.driver.findElement(By.cssSelector("span[class=\"price actual-price\"]"));
        return productPrices;
    }
}