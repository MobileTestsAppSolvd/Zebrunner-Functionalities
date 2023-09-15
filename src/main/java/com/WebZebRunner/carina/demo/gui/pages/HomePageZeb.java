package com.WebZebRunner.carina.demo.gui.pages;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HomePageZeb extends AbstractPage {

    @FindBy(id = "accessKey")
    private ExtendedWebElement username;
    @FindBy(id = "password")
    private ExtendedWebElement password;
    @FindBy(css = "div.signin-form__login-button-wrapper")
    private ExtendedWebElement login;


    public HomePageZeb(WebDriver driver) {
        super(driver);
    }

    public void setUsername(){
        username.type("mja123");
    }

    public void setPassword(){
        password.type("teamPalmerita1");
    }

    public void clickLogin(){
        login.click();
    }
}
