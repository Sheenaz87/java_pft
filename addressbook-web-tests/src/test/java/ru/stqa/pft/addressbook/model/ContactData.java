package ru.stqa.pft.addressbook.model;

public class ContactData {
  private final String name;
  private final String midddlename;
  private final String lastname;
  private final String nickname;
  private final String adress;
  private final String homephone;
  private final String workphone;
  private final String email;

  public ContactData(String name, String midddlename, String lastname, String nickname, String adress, String homephone, String workphone, String email) {
    this.name = name;
    this.midddlename = midddlename;
    this.lastname = lastname;
    this.nickname = nickname;
    this.adress = adress;
    this.homephone = homephone;
    this.workphone = workphone;
    this.email = email;
  }

  public String getName() {
    return name;
  }

  public String getMidddlename() {
    return midddlename;
  }

  public String getLastname() {
    return lastname;
  }

  public String getNickname() {
    return nickname;
  }

  public String getAdress() {
    return adress;
  }

  public String getHomephone() {
    return homephone;
  }

  public String getWorkphone() {
    return workphone;
  }

  public String getEmail() {
    return email;
  }
}
