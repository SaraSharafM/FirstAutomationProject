package org.example.pages;


import org.example.testSteps.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public
class Login {

  public  WebElement logBtn() {

        WebElement logBtn = Hooks.driver.findElement(By.linkText("Log in"));

        return logBtn;
    }


    public WebElement emailE() {
        WebElement emailE =Hooks.driver.findElement(By.id("Email"));
        return emailE;
    }

    public WebElement passwordE() {

        WebElement passwordE =Hooks.driver.findElement(By.id("Password"));
        return passwordE;
    }

    public WebElement loginBtn() {

        WebElement loginBtn =Hooks.driver.findElement(By.cssSelector("button[class='button-1 login-button']"));
        return loginBtn;
    }


    public WebElement myAccount() {
        WebElement myAccount=Hooks.driver.findElement(By.linkText("My account"));
         return myAccount;
  }

    public WebElement wrongMsg() {
        WebElement wrongMsg=Hooks.driver.findElement(By.className("message-error"));
        return wrongMsg;
    }


}
