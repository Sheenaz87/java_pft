package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactHelper extends HelperBase {

  public ContactHelper(WebDriver wd) {
    super(wd);
  }

  public void returnContactPage() {
    click(By.linkText("home page"));
  }

  public void submitContactCreation() {
    click(By.name("submit"));
  }


  public void fillContactForm(ContactData contactData) {
    type(By.name("firstname"), contactData.getName());
    type(By.name("middlename"), contactData.getMidddlename());
    type(By.name("lastname"), contactData.getLastname());
    type(By.name("nickname"), contactData.getNickname());
    type(By.name("address"), contactData.getAdress());
    type(By.name("home"), contactData.getHomephone());
    type(By.name("work"), contactData.getWorkphone());
    type(By.name("email"), contactData.getEmail());

  }
}
