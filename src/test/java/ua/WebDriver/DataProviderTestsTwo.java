package ua.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

//teacher
public class DataProviderTestsTwo {
private WebDriver webDriver;

    @DataProvider(name = "Date")
    public Object[][] searchDate()
    {
        return new Object[][]{
                               {"QA"},//,"PM"
                {"Developer Java"},//"UI/UX"

        };
    }

    @BeforeMethod

    public void before(){
        webDriver = new ChromeDriver();
        webDriver.get("https://dou.ua/");
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }
    @AfterMethod
    public void after(){
        webDriver.quit();
    }

    @Test(dataProvider = "Date")
    public void checkSearch(String data){
        WebElement input = webDriver.findElement(By.xpath("//input[@id='txtGlobalSearch']"));
        input.sendKeys(data);
        input.sendKeys(Keys.ENTER);
        System.out.println(data);
    }
//    {
//        final Locale actual = Locale.forLanguageTag(locale);
//        Assert.assertEquals(actual,expected,"Locale is incorrect");
//    }
}
