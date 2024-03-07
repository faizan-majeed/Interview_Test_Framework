package BaseTest;


import org.junit.After;
import Pages.BasePage;
import Utils.WebSetup;


public class BaseTest {
	public BasePage basePage=new BasePage();

    public void openUrl(String url) {
    	basePage.loadPage(url);
    }
    @After
    public void closeBrowser(){
        WebSetup.getInstance().getDriver().close();
        WebSetup.getInstance().nullDriver();
    }

}
