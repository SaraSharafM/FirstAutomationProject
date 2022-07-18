package org.example.testSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.FollowUs;
import org.testng.Assert;

import java.util.ArrayList;

public
class D07_followUsStepDef {

    FollowUs follow =new FollowUs();

    @When("user opens facebook link")
    public void step1() {
        follow.facebook().click();
    }


    @When("user opens twitter link")
    public void step2() {
        follow.twitter().click();
        ;
    }

    @When("user opens rss link")
    public void step3() {
        follow.rss().click();
    }

    @When("user opens youtube link")
    public void step4() {
        follow.youtube().click();
        }

    @Then("^\"([^\"]*)\" is opened in new tab$")

    //  @Then("open twitter in new tab")
    //@Then("open rss in new tab")
    //@Then("open youtube in new tab")
    public void opens_new_tab(String linkType) throws InterruptedException {
        Thread.sleep(12000);
        ArrayList<String> Tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(Tabs.get(1));

        switch (linkType) {

            case "facebook":
                Assert.assertEquals(Hooks.driver.getCurrentUrl(), "https://www.facebook.com/nopCommerce","facebook link");
                break;

            case "twitter-Link":
                Assert.assertEquals(Hooks.driver.getCurrentUrl(), "https://twitter.com/nopCommerce","twitter link");
                break;

            case "rss-Link":
                Assert.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/new-online-store-is-open","rss link");
                break;

            case "youtube-Link":
                Assert.assertEquals(Hooks.driver.getCurrentUrl(), "https://www.youtube.com/user/nopCommerce","youtube link");
                break;
        }

        Hooks.driver.close();

        Hooks.driver.switchTo().window(Tabs.get(0));
    }


}
