package org.example.pages;

import org.example.testSteps.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public
class HomeSlider {

    public
    WebElement slider(String sliderNum) {
        WebElement slider = Hooks.driver.findElement(By.xpath("(//a[@href='http://demo.nopcommerce.com/'])[" + sliderNum + "]"));
           return slider;
    }
}