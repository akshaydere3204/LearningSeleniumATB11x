package com.thetestingacademy.ex01_Selenium_Basics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium01 {


    @Test
    public void test_openVWOLoginPage(){
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
        chromeDriver.get("https://app.vwo.com");
        chromeDriver.quit();


    }


}
