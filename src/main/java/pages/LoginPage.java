package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;
    private By emailAddressField = By.cssSelector("input[data-qa=\"login-email\"]");
    private By passwordField= By.cssSelector("input[data-qa=\"login-password\"]");
    private By loginButton= By.cssSelector("button[data-qa=\"login-button\"]");
    public LoginPage(WebDriver driver){
        this.driver=driver;
    }
    public void setEmailAddressField(){
        driver.findElement(emailAddressField).sendKeys("hkml@gmail.com");
    }
    public void setPasswordFieldField(){
        driver.findElement(passwordField).sendKeys("3jch3");
    }

    public void clicklogin(){
        driver.findElement(loginButton).click();
    }

    public String loginAccountTest(){
        return driver.findElement(By.cssSelector("#form > div > div > div.col-sm-4.col-sm-offset-1 > div > form > p")).getText();
    }



}
