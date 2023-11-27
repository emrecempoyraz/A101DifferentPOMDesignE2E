package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends BasePage{

    @FindBy (xpath = "//label[@for='attributes_integration_colourSİYAH']")
    private WebElement blackWatchFilter ;

    @FindBy(xpath = "(//li[@class='checkbox'])[29]")
    private WebElement colourSelection ;

    @FindBy(xpath = "//img[@src='https://akn-ayb.a-cdn.akinoncdn.com/products/2023/09/26/2296611/47822d67-aedc-40d3-ba9f-17d2fc1dd0b0_size250x250_quality100_cropCenter.jpg']")
    private WebElement productLocator ;

    public ProductsPage scrollToColourSelection () {
        jse.executeScript("window.scrollBy(0,400)");
        return this ;
    }

    public ProductsPage selectBlackFilter () throws InterruptedException {
        Thread.sleep(1000);
        if (blackWatchFilter.isDisplayed()){
            blackWatchFilter.click();
        }
        return this ;
    }

    public ProductsPage selectProduct () {
        if (productLocator.isDisplayed()) {
            productLocator.click();
        }
        return this ;
    }

    public ProductPage getProductPage () {
        return new ProductPage () ;
    }
}
