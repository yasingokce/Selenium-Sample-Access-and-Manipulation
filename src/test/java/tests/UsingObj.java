package tests;

import java.time.Duration;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
import com.example.KeyValueName;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.Pages;

public class UsingObj {
    private WebDriver driver;
    private Pages page;
    private HomePage mainpage;
    private WebDriverWait wait;

    @BeforeSuite
    void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(20L));
        mainpage = new HomePage(driver, wait);
        page = new Pages(driver, wait);
        SoftAssert softassert = new SoftAssert();
        driver.get(mainpage.testHomePageUrl);
        String actualUrl = driver.getCurrentUrl();
        softassert.assertEquals(actualUrl, mainpage.testHomePageUrl);

    }

    // element checking
    @Test(priority = 0)
    void visibleItems() {
        for (Map.Entry<String, KeyValueName<String, String>> entry : mainpage.map.entrySet()) {
            page.elementChecking(entry);
        }
    }

    // displayed element ?
    @Test(priority = 1)
    void displayedElementsCheck() {
        for (Map.Entry<String, KeyValueName<String, String>> entry : mainpage.map.entrySet()) {
            page.elementIsDisplayed(entry);
        }
    }

    // enabled element ?
    @Test(priority = 2)
    void enabledElementsCheck() {
        for (Map.Entry<String, KeyValueName<String, String>> entry : mainpage.map.entrySet()) {
            page.elementIsEnabled(entry);
        }
    }
    

    @AfterSuite
    void closeChromeDriver() {
        driver.close();
    }

}
