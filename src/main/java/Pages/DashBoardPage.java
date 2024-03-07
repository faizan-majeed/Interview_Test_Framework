package Pages;

import org.openqa.selenium.WebElement;
import Elements.DashBoardElements;

public class DashBoardPage extends BasePage{
    public String getUserFromDashBoard(){
        WebElement element=waitForElementToBeVisible(DashBoardElements.user,60);
        return getElementText(element);
    }
    public void clickUserForMoreOptions(){
        WebElement element=waitForElementToBeVisible(DashBoardElements.user,60);
        clickElement(element);
    }
    public void clickSignOut(){
        WebElement element=waitForElementToBeVisible(DashBoardElements.signOut,60);
        clickElement(element);
    }
    public void clickExitWithoutSync(){
        WebElement element=waitForElementToBeVisible(DashBoardElements.exitWithoutSync,60);
        clickElement(element);
    }
    public void clickCreateNewNote(){
        WebElement element=waitForElementToBeVisible(DashBoardElements.createNewNote,60);
        clickElement(element);
    }
    public void clickCreatedNote(){
        WebElement element=waitForElementToBeVisible(DashBoardElements.createdTitle,60);
        clickElement(element);
    }
    public void enterTitle(String title){
        WebElement iframe=waitForElementToBeVisible(DashBoardElements.editorIframe,60);
        getWebDriver().switchTo().frame(iframe);
        WebElement element=waitForElementToBeVisible(DashBoardElements.noteTitle,60);
        sendKeysToElement(element,title);
        getWebDriver().switchTo().defaultContent();
    }
    public void enterNoteText(String note){
        WebElement iframe=waitForElementToBeVisible(DashBoardElements.editorIframe,60);
        getWebDriver().switchTo().frame(iframe);
        WebElement element=waitForElementToBeVisible(DashBoardElements.noteText,60);
        sendKeysToElement(element,note);
        getWebDriver().switchTo().defaultContent();
    }
    public String getCreatedNoteTitle(){
        WebElement element=waitForElementToBeVisible(DashBoardElements.createdTitle,60);
        return getElementText(element);
    }
    public String getCreatedNoteText(){
        WebElement element=waitForElementToBeVisible(DashBoardElements.createdNoteText,60);
        return getElementText(element);
    }
    public void clickNoteActions(){
        WebElement element=waitForElementToBeVisible(DashBoardElements.noteActions,60);
        clickElement(element);
    }
    public void clickMoveToTrash(){
        WebElement element=waitForElementToBeVisible(DashBoardElements.moveToTrash,60);
        clickElement(element);
    }
    public void clickDeletePermanently(){
        WebElement element=waitForElementToBeVisible(DashBoardElements.deletePermanently,60);
        clickElement(element);
    }
    public void clickDeleteButton(){
        WebElement element=waitForElementToBeVisible(DashBoardElements.deleteButton,60);
        clickElement(element);
    }
    public void clickHomeButton(){
        WebElement element=waitForElementToBeVisible(DashBoardElements.homeButton,60);
        clickElement(element);
    }
    public void clickNotebook(){
        WebElement element=waitForElementToBeVisible(DashBoardElements.notebook,60);
        clickElement(element);
    }
    public void clickTrash(){
        WebElement element=waitForElementToBeVisible(DashBoardElements.trash,60);
        clickElement(element);
    }

}
