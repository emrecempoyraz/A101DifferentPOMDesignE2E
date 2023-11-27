package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class BasketPage extends BasePage {


    @FindBy(xpath = "(//div[@class='title'])[3]")
    private WebElement myBaskettext ;

    @FindBy(xpath = "(//a[@title='Sepeti Onayla'])[1]")
    private WebElement verifyToBasketButton ;

    public BasketPage validateBasketPage () {
        waitForElement(this.myBaskettext);
        String actualText = myBaskettext.getText();
        String expectedText = "SEPETİM" ;
        Assert.assertTrue(actualText.contains(expectedText));
        return this ;
    }

    public BasketPage verifyToBasket () {
        if (verifyToBasketButton.isDisplayed()){
            verifyToBasketButton.click();
        }
        return this ;
    }

    public PhoneNumberPage getPhoneNumberPage () {
        return new PhoneNumberPage() ;
    }
}
