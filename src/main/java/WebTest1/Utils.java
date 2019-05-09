package WebTest1;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.zip.DataFormatException;

import static java.lang.Thread.sleep;

public class Utils extends Basepage {

    // click element

    public static void clickElementBy(By by) {

        driver.findElement(by).click();
    }
        //creat time stanp with current day-month-hour-minute

        public static String randomNumber(){

            DateFormat format = new SimpleDateFormat("ddMMHHmm");

            return  format.format(new Date());
        }
        // creat time stamp with current day-month-year-hour-minute-second

    public static String randomDate() {

        DateFormat format = new SimpleDateFormat("ddMMyyHHmmss");
        return format.format(new Date());
    }
    //Get current system time

    public static String GetCurrentTimrStamp(){
        SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS"); //dd/MM//YYYY
        Date now = new Date();
        String strDate = sdfDate.format(now);
        return strDate;
    }

    // Clear Text form inout box/area

    public static void clearTextfromInotBox(By by) {
        driver.findElement(by).clear();
    }

    //Enter text in input field

    public static void enterTextInputField(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    // enter text
    public static void enterText(By by, String text) {

        driver.findElement(by).sendKeys(text);
    }

    //  Cleat and Enter text
    public static void clearAndEntertext(By by, String text) {
        driver.findElement(by).clear();
        driver.findElement(by).sendKeys();
    }

    // Checking Webelement present in DOM
    public static boolean checkWebelementPresentinDom(By by) {
        try {
            driver.findElement(by).click();
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
// checking webelelment display or not

    public static boolean checkWebelementDisplay(By by) {

        try {
            driver.findElement(by).isDisplayed();
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
    // Wait for fixed time given in second

    public static void waitForElemntforFixedTimeinSecond(By by, int seconds) {
        WebDriverWait wait = new WebDriverWait(driver, seconds);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
    }

    // try to click element three times if not available in first go

    public static boolean retryForElement(By by) {
        boolean result = false;
        int attempt = 0;
        while (attempt < 3) {
            try {
                Thread.sleep(10);
                driver.findElement(by).click();
                result = true;
                break;
            } catch (Exception e) {
            }
            attempt++;
        }
        return result;
    }

    //  wait locator to be clickable for given time in seconds

    public static void waitForLocatorToBeClickable(By by,int seconds){
        WebDriverWait wait= new WebDriverWait(driver,seconds);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
    }

    // Wait for visibility of element with given time

    public static void explicitWaitForVisibility(By by, int seconds){

        WebDriverWait wait = new WebDriverWait(driver,seconds);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));

    }
    //get selected value from dropdown

    public static void getSelectedValueFromDropdown(By by,String text){
        Select select = new Select(driver.findElement(by));
        select.selectByValue(text);
    }

    //Wait alert to display

    public static void waitAlerttoBeDisplay(By by,int seconds){
        try {
            WebDriverWait wait = new WebDriverWait(driver, seconds);
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = driver.switchTo().alert();
            alert.accept();
        }
        catch (NoAlertPresentException noAlert){
            noAlert.getMessage();
        }

    }

// find whether alert is present or not

    public static boolean isAlertPresent(){
        boolean presenceOfAlert = false;
        WebDriverWait wait = new WebDriverWait(driver, 2 /*timeout in seconds*/);
        try {
            wait.until(ExpectedConditions.alertIsPresent());
            presenceOfAlert = true;
        } catch (TimeoutException e) {
            presenceOfAlert = false;
        }
        return presenceOfAlert;
    }

//  get attribute of element

 /* public  String getAttributeOfElement( WebElement element, String attr){}


        String value = element.getAttribute(attr);
        return value;
      */



// get css property of element

    public String getCssPropertyOfElement(WebElement element, String css){
        String value = element.getCssValue(css);
        return value;

    }


    // Select text by value
    public static void selectTextbyValue(By by,String text){

        Select select = new Select(driver.findElement(by));
        select.selectByValue(text);
    }

    // wait to be display
    public static void waitforelementDisplay(By by, int time){
        WebDriverWait wait = new WebDriverWait(driver ,time);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
    }

    // Wait for elementclickabel
    public static void waitforelementclickable(By by,int time){
        WebDriverWait wait = new WebDriverWait(driver,time);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
    }

    //Tick element
    public static void tickElement(By by) {

        driver.findElement(by).isSelected();
    }

    //Clear Text form inout box/area

    public static void clearTextElementfrominoutarea(By by){

        driver.findElement(by).clear();
    }


    //Scroll to element and click
    public static void  scrollandClickBy(By by) {

        JavascriptExecutor js = ((JavascriptExecutor) driver);
        try {
            sleep(1000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        WebElement element = driver.findElement(by);
        js.executeScript("argument()0,scrollintoView(true);", element);
        //sleep(1);
        element.click();
    }
    //Scroll to view element
    public static void ScrolltoViewElement(By by){

        WebElement element = driver.findElement(by);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

        try
        {
            Thread.sleep(500);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        element.getText();

    }

    //Enter text in input field

    public static void enterExtelementininputfield(By by,String text){

        driver.findElement(by).sendKeys(text);
    }


// capture screen shot
  /*  public static void captureScreenshot( WebDriver driver,String screenshotName) {


        try {
            TakesScreenshot ts = (TakesScreenshot) driver;

            File source = ts.getScreenshotAs(OutputType.FILE);
            FileUtils.copyfile(source, new File("./Screenshot/" + screenshotName + ".png"));
            System.out.println("Screen shot taken");
        }
        Catch(Exception e)
        {
            System.out.println("Exception while taking screenshot" + e.getMessage());
        }

    }}*/



















}
