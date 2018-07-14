package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.model.ContactsData;

public class ContactHelper extends HelperBase{

    public ContactHelper (FirefoxDriver wd) {
        super(wd);
    }

    //Нажатие кнопки подтверждения создания контакта
    public void submitContactCreation(){
        click(By.name("submit"));
    }

    //Заполнение формы создания контакта
    public void fillContactForm(ContactsData contactsData) {
        type(By.name("firstname"),contactsData.getFirstname());
        type(By.name("middlename"),contactsData.getMiddlename());
        type(By.name("lastname"), contactsData.getLastname());
        type(By.name("nickname"),contactsData.getNickname());
        type(By.name("title"),contactsData.getTitle());
        type(By.name("company"),contactsData.getCompany());
        type(By.name("address"),contactsData.getAddress());
        type(By.name("home"),contactsData.getHome());
        type(By.name("work"),contactsData.getWork());
        type(By.name("fax"),contactsData.getFax());
        type(By.name("email"),contactsData.getS());
        type(By.name("email2"),contactsData.getS1());
        type(By.name("email3"),contactsData.getS2());
        type(By.name("homepage"),contactsData.getHomepage());
    }

    //Переход на страницу Домой
    public void gotoHomePage() {
        click(By.linkText("home page"));
    }
}
