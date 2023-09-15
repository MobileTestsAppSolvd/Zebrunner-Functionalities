package com.WebZebRunner.carina.demo;

import com.WebZebRunner.carina.demo.gui.pages.HomePageZeb;
import com.zebrunner.carina.core.IAbstractTest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import java.lang.invoke.MethodHandles;


public class ZebTest implements IAbstractTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
    @Test
    public void testLogin() {
        HomePageZeb homePage = new HomePageZeb(getDriver());
        LOGGER.info("Here is the page Opened");
        homePage.open();
        LOGGER.info("Now the username is going to be fulfilled");
        homePage.setUsername();
        LOGGER.info("Now the password is going to be fulfilled");
        homePage.setPassword();
        LOGGER.info("Now the login button is clicked");
        homePage.clickLogin();

//        SidePanelPage slidePanel = homePage.clickOnBurgerButton();
    }
}
