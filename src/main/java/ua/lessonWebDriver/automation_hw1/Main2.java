package ua.lessonWebDriver.automation_hw1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class Main2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rozetka.com.ua/");

        List<WebElement> categorieList = driver.findElements(By.className("menu-categories__item"));
        driver.quit();
    }
}

