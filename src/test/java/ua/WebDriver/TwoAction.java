package ua.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

    public class TwoAction {

        @Test
        public void dragAndDrop ()  {
            WebDriver webDriver = new ChromeDriver();

            try {
                webDriver.manage().window().maximize();
                webDriver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

                WebElement source = new WebDriverWait(webDriver, Duration.ofSeconds(5))
                        .until(ExpectedConditions.presenceOfElementLocated(By
                                .xpath("//div[@id='box6']")));
                WebElement target = new WebDriverWait(webDriver, Duration.ofSeconds(5))
                        .until(ExpectedConditions.presenceOfElementLocated(By
                                .xpath("//div[@id='box106']")));

                new Actions(webDriver)
                        .clickAndHold(source)
                        .pause(4000)
                        .moveToElement(target)
                        .build()
                        .perform();
            }
            finally {
                webDriver.quit();
            }
        }
    }


