package com.vytrack.pages.activities;

import com.vytrack.utilities.Driver;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.WebDriverWait;

public class Example {
    protected WebDriver driver= Driver.getDriver("chrome");
    protected WebDriverWait wait = new WebDriverWait(Driver.getDriver("chrome"), 15);
    @Test
    public static void testCase1(){


    }
}
