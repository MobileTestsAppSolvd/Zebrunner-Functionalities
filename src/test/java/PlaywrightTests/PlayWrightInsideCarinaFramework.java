package PlaywrightTests;


import com.WebZebRunner.carina.demo.gui.pages.HomePagePw;
import com.WebZebRunner.carina.demo.gui.pages.ProjectsPage;
import com.zebrunner.agent.core.registrar.Screenshot;
import com.zebrunner.carina.core.IAbstractTest;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.invoke.MethodHandles;

public class PlayWrightInsideCarinaFramework extends BaseTests implements IAbstractTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
    @Test
    public void testLoginZebrunner() {
        LOGGER.info("Here we open the page");
        homePage = new HomePagePw(page);
        LOGGER.info("Now we set the username");
        homePage.setUsername();
        LOGGER.info("At this time we are filling with the password");
        homePage.setPassword();
        LOGGER.info("Now we are clicking the logging button");
        homePage.clickOnLoginButton();
        LOGGER.info("We do the assertions if the login was successful");
        Assert.assertTrue(homePage.isTitleVisible(),"The login was not successful");
        ProjectsPage projectsPage = new ProjectsPage(page);
        projectsPage.clickOnProjectsButton();
    }
//    @Test
//    public void testherokuapp() {
//
//        try (Playwright pw = Playwright.create()){
//            BrowserType browserType = pw.chromium();
//            Browser browser = browserType.launch(new BrowserType.LaunchOptions().setHeadless(false).setChannel("chrome"));
//            Page page = browser.newPage();
//            page.navigate("https://the-internet.herokuapp.com/");
//            page.locator("//a[contains(text(),'Form Authentication')]").click();
//            page.getByRole(AriaRole.TEXTBOX,
//                    new Page.GetByRoleOptions().setName("username")).fill("tomsmith");
//            page.getByRole(AriaRole.TEXTBOX,
//                    new Page.GetByRoleOptions().setName("password")).fill("SuperSecretPassword!");
//            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(" Login"))
//                    .click();
//            boolean pageOpened = (page.getByRole(AriaRole.HEADING, new Page.GetByRoleOptions().setName("Welcome to the Secure Area. When you are done click logout below."))).isVisible();
//            Assert.assertTrue(pageOpened,"The login was unsuccessful");
//        }
//    }
}
