package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class ContactsDeletionTest extends TestBase {

    //Удаление контакта через форму редактирования
    @Test
    public void testContactsDeletionAnEditingForm(){
        app.getContactHelper().initContactModification();
        app.getContactHelper().submitContactDeletionAnEditingForm();
    }

    //Удаление контакта на главной странице
    @Test
    public void testContactDeletionOnTheHomePage(){
        app.getContactHelper().selectContact();
        app.getContactHelper().submitContactDeletionOnTheHomePage();
        app.getNavigationHelper().closeWindow();
    }
}
