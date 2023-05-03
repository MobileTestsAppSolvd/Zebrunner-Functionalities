package com.WebZebRunner.carina.demo;

import com.WebZebRunner.carina.demo.mobile.gui.HomePage;
import com.google.common.io.Files;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

public class BaseTests {

    private static final Logger LOGGER = LogManager.getLogger(BaseTests.class);

    WebDriver driver;

  protected HomePage homePage;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        LOGGER.info("Opening remote driver");
        ChromeOptions chromeOptions = new ChromeOptions();
        System.setProperty("webdriver.chrome.driver", "rcs/chromedriver-mac105");

        driver = new ChromeDriver(new ChromeOptions());
        driver.manage().window().fullscreen();
        driver.get("https://zebrunner.com/documentation/integrations/");
        homePage = new HomePage(driver);
    }

    @AfterClass
    public void clean() {
        driver.quit();
    }


}
