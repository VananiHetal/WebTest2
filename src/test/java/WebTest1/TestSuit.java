package WebTest1;

import org.junit.Test;

public class TestSuit extends BaseTest{

    Homepage homepage = new Homepage();
    ResgistrationPage registrationPage = new ResgistrationPage();
    RegistrationSucessfulpage registrationSucessfulpage = new RegistrationSucessfulpage();

    @Test
    public void userShouldAbleToRegisterSuccessfully(){

      homepage.clickOnRegisterbutton();
        registrationPage.userEntersRegistrationDetails();
        registrationSucessfulpage.verifyUserSeeRegistrationSuccessMessage();

    }
}
