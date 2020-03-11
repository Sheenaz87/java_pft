package ru.stqa.pft.addressbook.tests;


import org.testng.annotations.Test;


public class GroupDeletionTest extends TestBase {


  @Test
  public void testDeleteGroup() throws Exception {
    app.app.getNavigationHelper().gotoGroupPage();
    app.app.getGroupHelper().selectGroup();
    app.app.getGroupHelper().deletedSelectedGroups();
    app.app.getGroupHelper().returntoGroupPage();
  }


}
