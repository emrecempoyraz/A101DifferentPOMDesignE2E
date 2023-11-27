package PageObjects;

import Parameter.IParamater;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PhoneNumberPage extends BasePage implements IParamater{

    @FindBy (xpath = "//input[@type='tel' and @id='phone']")
    private WebElement phoneTextField ;

    public PhoneNumberPage sendNumber () {
        if (phoneTextField.isDisplayed())
        this.phoneTextField.clear();
        this.phoneTextField.sendKeys(IParamater.PHONE_NUMBER);
        return this ;
    }
}
