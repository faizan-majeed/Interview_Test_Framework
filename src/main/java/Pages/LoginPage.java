package Pages;

import org.openqa.selenium.WebElement;
import Elements.LoginElements;

public class LoginPage extends BasePage{
    public void enterUsername(String username){
        WebElement element=waitForElementToBeVisible(LoginElements.username,5);
        sendKeysToElement(element,username);
    }
    public void enterPassword(String password){
        WebElement element=waitForElementToBeVisible(LoginElements.password,5);
        sendKeysToElement(element,password);
    }
    public void clickContinueToLogin(){
        WebElement element=waitForElementToBeVisible(LoginElements.continueToLogin,5);
        clickElement(element);
    }
    public String getErrorMessage(){
        WebElement element=waitForElementToBeVisible(LoginElements.errorMessage,10);
        return getElementText(element);
    }
    public void clickSignInBtn(){
        WebElement element=waitForElementToBeVisible(LoginElements.loginBtn,5);
        clickElement(element);
    }
    public String getTitle(){
        return getWebDriver().getTitle();
    }


}
