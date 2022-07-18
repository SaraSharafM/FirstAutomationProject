package org.example.pages;

import org.example.testSteps.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public
class HoverCategories {

    public
    WebElement computers() {
        WebElement computers = Hooks.driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"] [href=\"/computers\"]"));
        return computers;
    }

    public
    WebElement desktops() {
        WebElement desktops = Hooks.driver.findElement(By.cssSelector("li>a[href='/desktops']"));
        return desktops;
    }
    public WebElement categoryList(){
       WebElement categoryList =Hooks.driver.findElement(By.cssSelector("div[class=\"page-title\"]"));
        return categoryList;
    }
}