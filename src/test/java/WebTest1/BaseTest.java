package WebTest1;

import static WebTest1.Basepage.driver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class BaseTest extends Utils {

    BrowserSelector browserSelector = new BrowserSelector();

    @Before
    public void openBrowser(){

        browserSelector.setUpBrowser();
        driver.get("https://demo.nopcommerce.com");
    }
    @After
    public void closeBrowser(){
        driver.quit();
    }
}
