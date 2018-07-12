package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

public class ContactsCreationTests extends TestBase {

    @Test
    public void testContactsCreation() {
        gotoAddContactsPage("add new");
        fillContactForm(new ContactsData("name1", "middlename", "lastname", "nickname", "title", "company", "address", "home", "work", "fax", "test@test.ru", "test2@test.ru", "test3@test.com", "homepage"));
        submitContactCreation();
        returnToHomePage();
    }
}