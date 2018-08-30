package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupHelper extends HelperBase {

    public GroupHelper(WebDriver wd) {
        super(wd);
    }

    //Возврат на страницу с группами
    public void returnToGroupPage(){
        click(By.linkText("group page"));
    }

    //Подтверждение создания группы
    public void submitGroupCreation(){
        click(By.name("submit"));
    }

    //Заполнение формы группы
    public void fillGroupForm(GroupData groupData) {
        type(By.name("group_name"), groupData.getName());
        type(By.name("group_header"), groupData.getHeader());
        type(By.name("group_footer"), groupData.getFooter());
    }

    //Нажатие кнопки создания группы
    public void initGroupCreation() {
        click(By.name("new"));
    }

    //Нажатие на кнопку удаления
    public void deleteSelectedGroups() {
        click(By.name("delete"));
    }

    //Выбор группы
    public void selectGroup() {
        click(By.xpath("//div[@id='content']/form/span[3]/input"));
    }

    public void initGroupModification() {
        click(By.name("edit"));
    }

    public void submitGroupModification() {
        click(By.name("update"));
    }
}
