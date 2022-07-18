package org.example.testSteps;

import java.util.concurrent.TimeUnit;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import java.util.concurrent.TimeUnit;

public
class Hooks {
    public static WebDriver driver = null;

    @Before
    public static void openBrowser(){
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\toshiba\\IdeaProjects\\DemoNopCommerce\\src\\main\\resources\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("https://demo.nopcommerce.com/");


    }

    @After
    public static void closeBrowser() throws InterruptedException {

        Thread.sleep(6000);
        driver.quit();
    }

}
