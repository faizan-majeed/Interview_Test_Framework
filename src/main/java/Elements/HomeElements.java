package Elements;

import org.openqa.selenium.By;

public interface HomeElements {
    By acceptCookies= By.xpath("//span[contains(text(),'Accept all cookies')]//parent::button");
    By loginBtn=By.xpath("//a[@class='link-background-animated rounded-lg px-3 pt-2 pb-2.5']");

}
