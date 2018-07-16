package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactsData;

public class ContactsModificationTest extends TestBase {

    //Редактирование контакта
    @Test
    public void testContactsModification(){
        app.getNavigationHelper().gotoHomePage();
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillContactForm(new ContactsData("name1", "middlename", "lastname", "nickname", "title", "company", "address", "home", "work", "fax", "test@test.ru", "test2@test.ru", "test3@test.com", "homepage"));
        app.getContactHelper().submitContactModification();
        app.getContactHelper().gotoHomePage();
    }

}
