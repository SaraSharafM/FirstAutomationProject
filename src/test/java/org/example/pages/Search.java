package org.example.pages;

import org.example.testSteps.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public
class Search {

    public
    WebElement searchField() {

        WebElement searchField = Hooks.driver.findElement(By.id("small-searchterms"));

        return searchField;
    }


    public
    int productsList() {
        int size = Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"]")).size();
        return size;
    }

    public WebElement noProducts(){
     WebElement noProducts=Hooks.driver.findElement(By.cssSelector("div[class=\"no-result\"]"));
        return noProducts;
    }
}