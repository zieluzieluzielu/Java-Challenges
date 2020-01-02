package com.kodilla.good.patterns.challenges;

public class MailService implements InformationService {

    @Override
    public void inform(User user, Item item) {
        System.out.println("Sending an email to: " + user.getMailAdress() + "...");
        System.out.println("\"Dear "+user+", Thank you for booking "+item.itemDescription()+"\"");

    }

}
