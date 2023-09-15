package com.WebZebRunner.carina.demo.gui.pages;

import com.microsoft.playwright.Page;
import com.zebrunner.carina.utils.R;

public class HomePagePw {
    private Page page;
    private String title = "h1";
    private String username = "#accessKey";
    private String password = "#password";
    private String loginButton = "div.signin-form__login-button-wrapper";

    public HomePagePw(Page page) {
        this.page = page;
    }

    public void setUsername() {
        page.fill(username,R.CONFIG.get("username"));
    }

    public void setPassword() {
        page.fill(password,R.CONFIG.get("password"));
    }

    public ProjectsPage clickOnLoginButton() {

        page.locator(loginButton).click();
        return new ProjectsPage(page);
    }

    public boolean isTitleVisible(){
      return page.locator(title).isVisible();
    }
}
