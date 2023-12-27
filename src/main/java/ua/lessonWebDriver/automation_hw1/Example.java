package ua.lessonWebDriver.automation_hw1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://mvnrepository.com/");
        WebElement input = driver.findElement(By.xpath("//input[@id='query]"));
        WebElement searchButton = driver.findElement(By.xpath("//input[@value='Search']"));
        input.clear();
        searchButton.sendKeys("selenium");
        searchButton.click();
        driver.quit();
    }
}