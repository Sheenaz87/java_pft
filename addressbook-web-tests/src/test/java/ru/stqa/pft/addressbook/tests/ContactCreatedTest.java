package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreatedTest extends TestBase {



  @Test
  public void testContactCreated() throws Exception {
    app.getNavigationHelper().gotoContactPage();
    app.getContactHelper().fillContactForm(new ContactData("Jonson", "Test1", "Broun", "Fred", "NY", "912345678", "876543211", "test@test.com"));
    app.getContactHelper().submitContactCreation();
    app.getContactHelper().returnContactPage();
  }


}
