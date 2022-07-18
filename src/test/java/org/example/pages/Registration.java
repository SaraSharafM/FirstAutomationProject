package org.example.pages;

import org.example.testSteps.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public
class Registration {

    public
    WebElement regBtn() {

        WebElement regBtn = Hooks.driver.findElement(By.linkText("Register"));

        return regBtn;
    }

    public
    WebElement femaleGender() {

        WebElement femaleGender = Hooks.driver.findElement(By.id("gender-female"));

        return femaleGender;
    }

    public
    WebElement firstName() {

        WebElement firstName = Hooks.driver.findElement(By.id("FirstName"));

        return firstName;

    }

    public
    WebElement lastName() {

        WebElement lastName = Hooks.driver.findElement(By.id("LastName"));

        return lastName;

    }

    public WebElement birthDay() {

        WebElement birthDay = Hooks.driver.findElement(By.name("DateOfBirthDay"));

        return birthDay;
    }

    public WebElement birthMonth() {

        WebElement birthMonth=Hooks.driver.findElement(By.name("DateOfBirthMonth"));
          return birthMonth;
    }

    public WebElement birthYear() {

        WebElement birthYear=Hooks.driver.findElement(By.name("DateOfBirthYear"));
         return birthYear;

    }

    public WebElement email() {

        WebElement email=Hooks.driver.findElement(By.id("Email"));
         return email;
    }

    public WebElement companyName() {

        WebElement companyName = Hooks.driver.findElement(By.id("Company"));
         return companyName;
    }

    public WebElement password() {

        WebElement password=Hooks.driver.findElement(By.id("Password"));
         return password;
    }

    public WebElement confirmPassword() {

        WebElement confirmPassword = Hooks.driver.findElement(By.id("ConfirmPassword"));
           return confirmPassword;
    }

    public WebElement submitBtn () {

        WebElement submitBtn = Hooks.driver.findElement(By.id("register-button"));

        return submitBtn;}

    public WebElement successfulMsg() {

        WebElement successfulMsg= Hooks.driver.findElement(By.xpath("//div[@class=\"result\"]"));
        return successfulMsg;

    }



}


