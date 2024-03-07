package Elements;

import org.openqa.selenium.By;

public interface DashBoardElements {
    By user= By.cssSelector(".mjp8WyYQODySClV2byHt");
    By signOut =By.xpath("//span[contains(text(),'Sign out')]");
    By exitWithoutSync=By.cssSelector("#qa-LOGOUT_CONFIRM_DIALOG_CANCEL");
    By createNewNote=By.xpath("//span[contains(text(),'New Note')]");
    By noteTitle=By.xpath("//textarea[@placeholder='Title']");
    By noteText=By.cssSelector("#en-note div");
    By createdTitle=By.xpath("//div[contains(@id,'qa-NOTES_SIDEBAR_NOTE_TITLE')]//span");
    By createdNoteText=By.xpath("//div[contains(@id,'qa-NOTES_SIDEBAR_NOTE_SNIPPET')]//span");
    By noteActions =By.cssSelector("#qa-NOTE_ACTIONS");
    By moveToTrash=By.xpath("//span[contains(text(),'Move to Trash')]");
    By deletePermanently=By.xpath("//span[contains(text(),'Delete permanently')]");
    By editorIframe=By.cssSelector("#qa-COMMON_EDITOR_IFRAME");
    By deleteButton=By.cssSelector("#qa-EXPUNGE_NOTE_CONFIRM_DIALOG_SUBMIT");
    By homeButton=By.cssSelector("#qa-NAV_HOME");
    By returnToAppButton=By.cssSelector("#qa-LOGOUT_CONFIRM_DIALOG_SUBMIT");
    By notebook=By.cssSelector("#qa-NOTE_PARENT_NOTEBOOK_BTN");
    By notesButton=By.cssSelector("#qa-NAVBAR_NOTE_ADD_BUTTON");
    By trash=By.xpath("//span[contains(text(),'Trash')]");

}
