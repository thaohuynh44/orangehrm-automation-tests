package dev.orangehrm.tests;

import dev.orangehrm.utils.ConfigLoader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public void initializeConfig() {
        ConfigLoader.getInstance();
    }

    @BeforeTest
    public void setUp() {
        driver.manage().window().maximize();
        driver.get(ConfigLoader.getProperty("LOGIN_EP"));
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
