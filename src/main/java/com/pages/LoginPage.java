package com.pages;

import com.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class LoginPage extends Base {
    public LoginPage(){
        PageFactory.initElements(driver, this);
    }
    @FindBy (name = "username")
    WebElement username;
    @FindBy (name = "password")
    WebElement password;
    @FindBy (css = "[value=\"Login\"]")
    WebElement loginBtn;

    public HomePage performLogin(String name, String pass){
        username.sendKeys(name);
        password.sendKeys(pass);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(visibilityOf(loginBtn));
        element.click();
        return new HomePage();
    }
}
