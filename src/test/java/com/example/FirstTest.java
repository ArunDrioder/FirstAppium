package com.example;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
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




    }
}
