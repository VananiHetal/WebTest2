package WebTest1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

import static WebTest1.Basepage.driver;

public class BrowserSelector extends Utils {

    LoadProp loadProp = new LoadProp();

    public void setUpBrowser() {

        String browser = loadProp.getProperty("browser");
        // String setUpBrowser = System.getProperty("setUpBroser");
        if(browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.geco.driver", "src\\test\\java\\Browserdriver\\geckodriver.exe");
            System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE, "true");
            System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
            driver = new FirefoxDriver();
            driver.manage().window().fullscreen();
        } else if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "src\\test\\java\\Browserdriver\\chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("disable-infobars");
            options.addArguments("-disable-extensions");
            options.addArguments("-disable-setUpBrowser-side-navigation");
            options.addArguments("-incongnito");
            options.addArguments("-disable-blink-features=BlockCredentialedSubresources");
            driver = new ChromeDriver(options);
            driver.manage().window().fullscreen();
        } else if (browser.equalsIgnoreCase("ie")) {
            System.setProperty("webdriver.chrome.driver", "src\\test\\java\\Browserdriver\\IEDriverServer.exe");
            InternetExplorerOptions options = new InternetExplorerOptions();
            options.setCapability(InternetExplorerDriver.IE_SWITCHES, "-private");
            options.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
            driver = new InternetExplorerDriver(options);
            driver.manage().window().maximize();
        }else {
            System.out.println("Browser name is empty or typed wrong:" + browser);

        }


    }

}
