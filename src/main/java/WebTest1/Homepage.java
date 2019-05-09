package WebTest1;

import org.openqa.selenium.By;

public class Homepage extends Utils {

    private By _registerLink =By.xpath("//a[@class='ico-register']");
    private By _categoriesLink = By.linkText("Categories");
    private By _computerLink =By.linkText("Computers");
    private By _apparelLink = By.linkText("Apparel");}

    public void clickonRegisterButton() {
       clickElementBy(_registerLink);
    }
    public void clickoncategories(String Link) {
       clickElementBy(_categoriesLink);
    }
    public void clickonComputer(){
      clickElementBy(_computerLink);
    }
    public void clickonApparel(){
       clickElementBy(_apparelLink);
    }

    public void clickOnRegisterbutton() {
        clickElementBy(_registerLink);
    }
}