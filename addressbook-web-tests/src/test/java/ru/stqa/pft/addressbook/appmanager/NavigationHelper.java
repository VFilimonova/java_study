package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationHelper extends HelperBase {

    public NavigationHelper(FirefoxDriver wd) {
        super(wd);
    }

    //Переход на страницу групп в шапке
    public void gotoGroupPage() {
        click(By.linkText("groups"));
    }

    //Переход на страницу добавления контакта
    public void gotoAddNewContactsPage(String s) {
        click(By.linkText(s));
    }

    //Переход на страницу домой
    public void gotoHomePage(){
        click(By.linkText("home"));
    }

    //Закрытие диалогового окна
    public void closeWindow(){
        wd.switchTo().alert().accept();
    }

}
