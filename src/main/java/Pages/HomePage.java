package Pages;

import org.openqa.selenium.WebElement;
import Elements.HomeElements;

public class HomePage extends BasePage{
    public void clickAcceptCookies(){
        WebElement element=waitForElementToBeVisible(HomeElements.acceptCookies,5);
        clickElement(element);
    }
    public void clickLogin(){
        WebElement element=waitForElementToBeVisible(HomeElements.loginBtn,5);
        clickElement(element);
    }

}
