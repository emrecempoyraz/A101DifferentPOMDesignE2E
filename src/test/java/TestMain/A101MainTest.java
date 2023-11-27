package TestMain;

import TestManager.BaseTest;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import jdk.jfr.Description;
import org.testng.annotations.Test;

public class A101MainTest extends BaseTest {

   @Description("A101E2ETEST_Vol2")
   @Severity(SeverityLevel.CRITICAL)
   @Test (description = "e2e")
   void goToBasketPageWithProduct () throws InterruptedException {
      startTest
              .acceptCookies()
              .clickToSearchBar()
              .sendKeys()
              .getProductsPage()
              .scrollToColourSelection()
              .selectBlackFilter()
              .selectProduct()
              .getProductPage()
              .validateAppleWatchSearch()
              .clickAddToBasketButton()
              .clickAddToBasketButton()
              .goToBasket()
              .getBasketPage()
              .validateBasketPage()
              .verifyToBasket()
              .getPhoneNumberPage()
              .sendNumber();





   }
}
