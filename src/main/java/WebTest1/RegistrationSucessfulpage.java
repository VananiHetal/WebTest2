package WebTest1;

import org.openqa.selenium.By;

public class RegistrationSucessfulpage extends Utils{

    private By _registerSuccessMessage = By.xpath("//div[@class=\"result\"]");


    public void verifyUserSeeRegistrationSuccessMessage() {
        assertURL("registerresult") ;
        assertTextMessage("Your registration completed");
    }

    private void assertTextMessage(String your_registration_completeg) {
    }

    private void assertURL(String registerresult) {
    }
}
