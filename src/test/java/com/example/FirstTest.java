package com.example;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class FirstTest {


    public static AppiumDriver<MobileElement> appiumDriver;
    public static AndroidDriver androidDriver;

    public static void main(String[] args)
    {
        try {
            openCalculator();
        } catch (MalformedURLException e) {
            System.out.println(e.getCause());
            System.out.println(e.getMessage()) ;
            e.printStackTrace();
        }

    }

    public static void openCalculator() throws MalformedURLException {
        DesiredCapabilities desCap = new DesiredCapabilities();
        desCap.setCapability("deviceName","OnePlus 6");
        desCap.setCapability("udid","56912d7e");
        desCap.setCapability("platformName","Android");
        desCap.setCapability("platformVersion","10");
        desCap.setCapability("appPackage","com.oneplus.calculator");
        desCap.setCapability("appActivity","com.oneplus.calculator.Calculator");
        URL url = new URL("http://127.0.0.1:4723/wd/hub");

        appiumDriver = new AppiumDriver<MobileElement>(url,desCap);

        System.out.println("Hurrah..... the calculator started");

        MobileElement num1 = appiumDriver.findElement(By.id("com.oneplus.calculator:id/digit_1"));
        MobileElement plus = appiumDriver.findElement(By.id("com.oneplus.calculator:id/op_add"));
        MobileElement num4 = appiumDriver.findElement(By.id("com.oneplus.calculator:id/digit_4"));
        MobileElement equals = appiumDriver.findElement(By.id("com.oneplus.calculator:id/eq"));
        MobileElement result = appiumDriver.findElement(By.className("android.widget.TextView"));

        String resultValue = result.getText();
        System.out.println(resultValue);


         num1.click();
         plus.click();
         num4.click();
         equals.click();





    }
}
