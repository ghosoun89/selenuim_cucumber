package com.pages;

import com.base.Base;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Base {
    public HomePage(){
        PageFactory.initElements(driver, this);
    }
    @FindBy (css = ".logo_text")
    WebElement logo;
    @FindBy (xpath = "//*[@title='Contacts']")
    WebElement contacts;

    public void isLogoDisplayed(){
        driver.switchTo().frame("mainpanel");
        Assert.assertTrue(logo.isDisplayed());
    }

    public ContactsPage moveTOContactsPage(){
        driver.switchTo().frame("mainpanel");
        contacts.click();
        return new ContactsPage();
    }
}
