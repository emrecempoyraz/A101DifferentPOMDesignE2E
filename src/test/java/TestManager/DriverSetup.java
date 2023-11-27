package TestManager;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class DriverSetup {

    public static WebDriver driver;

    public static WebDriver initialize_Driver(){

        driver = new ChromeDriver(DriverOptions.getOptions());
        driver.get(IDriver.URL);
        driver.manage().timeouts().implicitlyWait(IDriver.IMP_WAIT , TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(IDriver.PAGE_WAIT , TimeUnit.SECONDS);
        driver.manage().window().maximize();
        return getDriver();
    }

    public static WebDriver getDriver(){
        return driver;
    }
}
