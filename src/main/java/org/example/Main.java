package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://wikipedia.org");

        WebElement searchInput = driver.findElement(By.id("searchInput"));

        searchInput.sendKeys("Microsoft");
        WebElement firstSuggestion = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".suggestions-dropdown > .suggestion-link")));
        firstSuggestion.click();

        WebElement pageTitle = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#firstHeading span")));

        if(pageTitle.getText().equalsIgnoreCase("Microsoft")) {
            System.out.println("The title matches with Microsoft");
        } else {
            System.out.println("The title does not match Microsoft");
        }

        List<WebElement> allAnchors = driver.findElements(By.tagName("a"));

        for (WebElement anchor: allAnchors) {
            System.out.println(anchor.getText());
        }

        driver.quit();
    }
}