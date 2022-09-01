package logintest;

import base.baseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

import static org.testng.Assert.assertEquals;

public class LoginTest extends baseTests {
    @Test
    public void testSuccessfullLoginOrNot() {
        LoginPage loginPage = homePage.clickSignupLogin();
        loginPage.setEmailAddressField();
        loginPage.setPasswordFieldField();
        loginPage.clicklogin();
        assertEquals(loginPage.loginAccountTest(),"Your email or password is incorrect!","Does not show that mail or password is incorrect");

    }
}