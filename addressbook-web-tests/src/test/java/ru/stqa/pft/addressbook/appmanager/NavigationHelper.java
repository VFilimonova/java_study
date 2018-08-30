package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase {

    public NavigationHelper(WebDriver wd) {
        super(wd);
    }

    //Переход на страницу групп в шапке
    public void gotoGroupPage() {
        click(By.linkText("groups"));
    }

/*    //Переход на страницу добавления контакта в шапке
    public void gotoAddNewContactsPage(String s) {
        click(By.linkText(s));
    }*/

    //Переход на страницу добавления контакта в шапке
    public void gotoAddNewContactsPage1() {
      click(By.xpath("//*[contains(text(),'add new')]"));
    }

    //Переход на страницу домой в шапке
    public void gotoHomePage(){
        click(By.linkText("home"));
    }

    //Закрытие диалогового окна
    public void closeWindow(){
        wd.switchTo().alert().accept();
    }

}
