package ru.stqa.pft.addressbook.model;

public class ContactsData {
    private final String firstname;
    private final String middlename;
    private final String lastname;
    private final String nickname;
    private final String title;
    private final String company;
    private final String address;
    private final String home;
    private final String work;
    private final String fax;
    private final String s;
    private final String s1;
    private final String s2;
    private final String homepage;

    public ContactsData(String firstname, String middlename, String lastname, String nickname, String title, String company, String address, String home, String work, String fax, String s, String s1, String s2, String homepage) {
        this.firstname = firstname;
        this.middlename = middlename;
        this.lastname = lastname;
        this.nickname = nickname;
        this.title = title;
        this.company = company;
        this.address = address;
        this.home = home;
        this.work = work;
        this.fax = fax;
        this.s = s;
        this.s1 = s1;
        this.s2 = s2;
        this.homepage = homepage;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public String getNickname() {
        return nickname;
    }

    public String getTitle() {
        return title;
    }

    public String getCompany() {
        return company;
    }

    public String getAddress() {
        return address;
    }

    public String getHome() {
        return home;
    }

    public String getWork() {
        return work;
    }

    public String getFax() {
        return fax;
    }

    public String getS() {
        return s;
    }

    public String getS1() {
        return s1;
    }

    public String getS2() {
        return s2;
    }

    public String getHomepage() {
        return homepage;
    }
}
