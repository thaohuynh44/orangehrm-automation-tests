package dev.orangehrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;
    WebElement element;
    int TIME_OUT = 10;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(TIME_OUT));
    }

    public WebElement waitUntilElementIsClickable(By locator){
        return element = wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public void click(By locator){
        element = waitUntilElementIsClickable(locator);
        element.click();
    }

    public void setText(By locator, String text){
        element = waitUntilElementIsClickable(locator);
        element.clear();
        element.sendKeys(text);
    }


}
