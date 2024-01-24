package ua.WebDriver;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class GmailInvalidPasswordTest {

    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeMethod
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        driver = new ChromeDriver(options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://mail.google.com");
    }

    @Test
    @Severity(SeverityLevel.BLOCKER)
    @Description("Check invalid password login")
    @Owner("Your Name")
    public void invalidPasswordLogin() {
        // Enter valid email
        WebElement emailInput = driver.findElement(By.xpath("//input[@id='identifierId']"));
        emailInput.sendKeys("your.email@gmail.com");
        emailInput.sendKeys(Keys.ENTER);

        // Wait for the password input field
        WebElement passwordInput = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("password")));

        // Enter invalid password
        passwordInput.sendKeys("invalidPassword");
        passwordInput.sendKeys(Keys.ENTER);

        // Wait for the error message
        WebElement errorMessage = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='o6cuMc Jj6Lae']")));

        // Validate the presence of the error message
        Assert.assertTrue(errorMessage.isDisplayed(), "Invalid password error not displayed");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
