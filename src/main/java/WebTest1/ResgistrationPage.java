package WebTest1;

import org.openqa.selenium.By;

public class ResgistrationPage extends Utils {

    LoadProp loadProp = new LoadProp();

    private By _female = By.xpath("//input [@id=\"gender-female\"]");
    private By _firstname = By.id("//input[@id=\"FirstName\"]");
    private By _lastname = By.id("//input[@id=\"LastName\"]"),
    private By _email = By.xpath("//input[@id=\"Email\"]");
    private By _copmpanydetails = By.xpath("//input[@id=\"Company\"]");
    private By _newsletter = By.xpath("//input[@id=\"Newsletter\"]");
    private By _password = By.xpath("//input[@id=\"Password\"]");
    private By _confirmedPassword = By.xpath("//input[@id=\"ConfirmPassword\"]");
    private By _registerButton = By.xpath("register-button");

    private static String timestamp = currentTimeStamp();


    private static String currentTimeStamp() {

    }


    public void verifyUserIsOnRegisterpage() {

        assertURL("register");
    }

    public void userEnterRegistrationDetails() {
        sendText(_female, "female");
        sendText(_firstname, loadProp.getProperty("Peter"));
        sendText(_lastname, "Robert");
        sendText(_email, "" + timestamp + "@test.com");
        sendText(_copmpanydetails, "R&D Ltd");
        clickonElement(_newsletter);
        sendText(_password, "raman11");
        sendText(_confirmedPassword, "raman11");
        clickonElement(_registerButton);


    }




    private void clickonElement(By newsletter) {
    }


    private void sendText(By female, String female1) {
    }

    private void assertURL(String register) {
    }

    public void userEntersRegistrationDetails() {

    }
}