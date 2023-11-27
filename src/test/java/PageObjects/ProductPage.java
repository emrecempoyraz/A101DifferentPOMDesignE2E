package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ProductPage extends BasePage {


    @FindBy(css = ".product-name.js-name")
    private WebElement appleWatchText ;

    @FindBy(css = ".add-to-basket.button.green.block.with-icon.js-add-basket")
    private WebElement addToBasketButton ;

    @FindBy(xpath = "(//*[text()='Sepeti Görüntüle'])[2]")
    private WebElement goToBasketButton ;


    public ProductPage validateAppleWatchSearch () {
         String actualText = appleWatchText.getText();
         String expectedText = "Apple Watch Series 8 41 mm MNP53TU/A Akıllı Saat Siyah";
         Assert.assertEquals(actualText,expectedText);
         return this ;
    }


     public ProductPage clickAddToBasketButton () {
        if (addToBasketButton.isDisplayed()) {
            addToBasketButton.click();
        }
        return this ;
     }

     public ProductPage goToBasket () {
        if (goToBasketButton.isDisplayed()) {
            goToBasketButton.click();
        }
        return this ;
     }

     public BasketPage getBasketPage () {
        return new BasketPage() ;
     }



}
