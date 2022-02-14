package steps;

import com.base.Base;
import com.pages.ContactsPage;
import com.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class ContactsSteps extends Base {
    HomePage homePage;
    ContactsPage contactsPage;
    @And("clicks on contacts")
    public void clicksOnContacts() {
        homePage = new HomePage();
        contactsPage = homePage.moveTOContactsPage();
    }

    @And("clicks on add new Contact")
    public void clickOnAddNewContact(){
        contactsPage.clickOnNewContact();
    }

    @Then("Email text field should be visible")
    public void emailTextFieldShouldBeVisible() {
        contactsPage.isEmailFieldDisplayed();
    }
    @And("Fill the first name and last name")
    public void fillTheFirstNameAndPassword(){
        contactsPage.createNewContact();
    }
    @Then("A new contact should be added")
    public void aNewContactShouldBeAdded(){
        contactsPage.isContactAdded();
    }
}
