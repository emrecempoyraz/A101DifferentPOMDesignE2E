package PageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

  @FindBy (id = "CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")
  private WebElement acceptCookiesButton ;

  @FindBy(xpath = "(//input[@name='search_text'])[1]")
  private WebElement searchBar ;

  @FindBy(xpath = "(//button[@type='submit'])[1]")
  private WebElement submitButton ;

  public HomePage acceptCookies () {
      if (acceptCookiesButton.isDisplayed()) {
          this.acceptCookiesButton.click();}
      return this ;
  }

  public HomePage clickToSearchBar () {
      if (searchBar.isDisplayed()) {
          this.searchBar.click();
      }
      return this ;
  }

  public HomePage sendKeys () {
      if (searchBar.isDisplayed()) {
          this.searchBar.sendKeys("apple watch");
          submitButton.click();
      }
      return this ;
  }

  public ProductsPage getProductsPage () {
      return new ProductsPage ();
  }
}
