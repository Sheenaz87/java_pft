package ru.stqa.pft.addressbook.tests;


import org.testng.annotations.Test;


public class GroupDeletionTest extends TestBase {


  @Test
  public void testDeleteGroup() throws Exception {
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().deletedSelectedGroups();
    app.getGroupHelper().returntoGroupPage();
  }


}
