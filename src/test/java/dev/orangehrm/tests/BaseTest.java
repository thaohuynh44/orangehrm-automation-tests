package dev.orangehrm.tests;

import dev.orangehrm.utils.ConfigLoader;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    String LOGIN_EP = "";
    WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public void initializeConfig(){
        ConfigLoader.getInstance();
    }
    @BeforeTest
    public void setUp(){
        driver.manage().window().maximize();
        driver.get(LOGIN_EP);
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
