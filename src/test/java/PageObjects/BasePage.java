package PageObjects;


import lombok.Data;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static TestManager.BaseTest.driver;

@Data
public class BasePage {
    public static WebDriverWait wait;
    public static JavascriptExecutor jse;

    public BasePage(){
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        jse = (JavascriptExecutor) driver;
    }

    protected ExpectedCondition<WebElement> waitForElement(WebElement element){
        return ExpectedConditions.visibilityOf(element);
    }
}
