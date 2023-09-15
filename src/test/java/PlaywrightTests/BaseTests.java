package PlaywrightTests;

import com.WebZebRunner.carina.demo.gui.pages.HomePagePw;
import com.WebZebRunner.carina.demo.gui.pages.ProjectsPage;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.testng.annotations.BeforeTest;

public class BaseTests {
    protected HomePagePw homePage;
    protected Page page;
//    private String title = "h1";

    @BeforeTest
    public void openPage() {
        Playwright pw = Playwright.create();
        BrowserType browserType = pw.chromium();
        Browser browser = browserType.launch(new BrowserType.LaunchOptions().setHeadless(false).setChannel("chrome"));
        page = browser.newPage();
        page.navigate("https://solvdinternal.zebrunner.com/signin/");
//        page.waitForCondition(() -> {
//            String pageTitle = page.title();
//            return pageTitle.contains(title);
//        });
        homePage = new HomePagePw(page);
    }
}
