package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        System.out.println(System.getProperty("user.home"));
        WebDriver driver = new ChromeDriver();
        driver.get("https://selenium.dev");
        driver.quit();
    }
}