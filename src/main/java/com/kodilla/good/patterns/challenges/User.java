package com.kodilla.good.patterns.challenges;

public class User {
    private String name;
    private String surname;
    private String mailAdress;
    private String phoneNumber;

    public User(String name, String surname, String mailAdress, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.mailAdress = mailAdress;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return name +" "+ surname ;
    }

    public String getMailAdress() {
        return mailAdress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }


}
