package org.example.pages;

import org.example.testSteps.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public
class FollowUs {
    public WebElement facebook() {
        WebElement facebook= Hooks.driver.findElement(By.className("facebook"));
        return facebook;
    }

    public WebElement twitter() {
       WebElement twitter = Hooks.driver.findElement(By.xpath("//a[@href=\"https://twitter.com/nopCommerce\"]"));
        return twitter;
    }

    public WebElement rss() {
       WebElement rss=  Hooks.driver.findElement(By.xpath("//a[@href=\"/news/rss/1\"]"));
        return rss;
    }

    public WebElement youtube() {
       WebElement youtube = Hooks.driver.findElement(By.xpath("//a[@href=\"http://www.youtube.com/user/nopCommerce\"]"));
        return youtube;
    }
}
