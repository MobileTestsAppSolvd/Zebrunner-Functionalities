package com.WebZebRunner.carina.demo.mobile.gui;

import com.WebZebRunner.carina.demo.mobile.gui.pages.BasePage;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    private final By burgerButton = By.xpath("put Locator valido");


}
