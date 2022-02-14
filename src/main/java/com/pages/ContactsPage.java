package com.pages;

import com.base.Base;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage extends Base {
    public ContactsPage(){
        PageFactory.initElements(driver, this);
    }
    @FindBy (name = "cs_email")
    WebElement emailTextField;
    @FindBy (css = "[value=\"New Contact\"]")
    WebElement addNewContact;
    @FindBy(name = "first_name")
    WebElement firstName;
    @FindBy(name = "surname")
    WebElement lastName;
    @FindBy (css = "[value=\"Save\"]")
    WebElement saveBtn;
    @FindBy(css = "[value=\"Next\"]")
    WebElement nextBtn;

    public void clickOnNewContact(){
        addNewContact.click();
    }

    public void isEmailFieldDisplayed(){
        Assert.assertTrue(emailTextField.isDisplayed());
    }

    public void createNewContact (){
       firstName.sendKeys("ghosoun");
        lastName.sendKeys("aldabea");
        saveBtn.click();
    }

    public void isContactAdded(){
        Assert.assertTrue(nextBtn.isDisplayed());
    }
}
