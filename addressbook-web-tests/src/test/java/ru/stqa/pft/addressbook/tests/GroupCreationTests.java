package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupCreationTests extends TestBase {

    //Создание группы
    @Test
    public void testGroupCreation() {
        app.gotoGroupPage();
        app.initGroupCreation();
        app.fillGroupForm(new GroupData("test1", "test2", "test3"));
        app.submitGroupCreation();
        app.returnToGroupPage();
    }

}
