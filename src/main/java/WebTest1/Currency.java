package WebTest1;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class Currency extends Utils {

    LoadProp loadProp = new LoadProp();


    private By customerCurrency = By.xpath("//select[@id=\"customerCurrency\"]");
    private By priceactualPrice = By.xpath("//span[@class=\"price actual-price\"]");

}
    public void userShouldBeableToChangecurrency() {

    selectTextbyValue(text);

        Select select = new Select(driver.findElement(by)
