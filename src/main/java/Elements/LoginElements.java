package Elements;

import org.openqa.selenium.By;

public interface LoginElements {
    By username=By.cssSelector("#username");
    By continueToLogin=By.cssSelector("#loginButton");
    By errorMessage=By.cssSelector("#responseMessage");
    By password=By.cssSelector("#password");
    By loginBtn=By.cssSelector("#loginButton");
}
