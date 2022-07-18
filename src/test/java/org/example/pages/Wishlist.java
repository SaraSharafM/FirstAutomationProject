package org.example.pages;

import io.cucumber.messages.types.Hook;
import org.example.testSteps.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public
class Wishlist {



    public int wishListItems(){
        int size = Hooks.driver.findElements(By.cssSelector("div[class=\"wishlist-content\"]")).size();
        return size;
    }
    public WebElement wishList() {
       WebElement wishList= Hooks.driver.findElement(By.cssSelector("div[class=\"header-links\"] [href=\"/wishlist\"]"));
        return wishList;
    }

    public
    WebElement addWishList() {
         WebElement addWishList= Hooks.driver.findElement(By.cssSelector("button[onclick='return AjaxCart.addproducttocart_catalog(\"/addproducttocart/catalog/18/2/1\"),!1']"));
        return addWishList;
    }

    public WebElement wishSuccessMsg() {
        WebElement wishSuccessMsg= Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]"));
        return wishSuccessMsg;
    }

    public WebElement closeB() {
        WebElement closeB =Hooks.driver.findElement(By.cssSelector("span[class=\"close\"]"));
        return closeB;
    }
}
