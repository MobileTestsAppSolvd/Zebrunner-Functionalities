package PlaywrightTests;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.testng.annotations.Test;

public class PracticeOnPlaywright {

    @Test
    public void testherokuapp() {
        try (Playwright pw = Playwright.create();) {
            BrowserType browserType = pw.chromium();
            Browser browser = browserType.launch(new BrowserType.LaunchOptions().setHeadless(false).setChannel("chrome"));
            Page page = browser.newPage();
            page.navigate("https://the-internet.herokuapp.com/");
            System.out.println(page.title());
            page.locator("//a[contains(text(),'Form Authentication')]").click();
        }
    }
}
