package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By SignupLogin= By.linkText("Signup / Login");

    public HomePage(WebDriver driver){
        this.driver=driver;
    }
    public LoginPage clickSignupLogin(){
        driver.findElement(SignupLogin).click();
        return new LoginPage(driver);

    }
}

