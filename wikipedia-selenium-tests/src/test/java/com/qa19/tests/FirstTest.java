package com.qa19.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FirstTest {
    WebDriver wd;

    @BeforeClass
    public void setUp() {
        wd = new ChromeDriver();
    }

    @Test
    public void openGoogleTest() {
        wd.get("https://www.google.ru/");
    }

    @AfterClass
    public void tearDown() {
        wd.quit();
    }
}
