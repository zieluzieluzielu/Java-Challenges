package com.kodilla.good.patterns.challenges;

public class MailService implements InformationService {

    @Override
    public void inform(User user, Item item, OrderRequest orderRequest) {
        PriceCounter priceCounter = new PriceCounter();
        System.out.println("Sending an email to: " + user.getMailAdress() + "...");
        System.out.println("\"Dear " + user + ",\nThank you for buying " + orderRequest.getAmount() + "x " + orderRequest.getItem() + " for " + item.price() + "USD per item - for total " + priceCounter.getPriceWithTax(item) + "USD (including 10% TAX rate)\nItem details:\n" + item.itemDescription() + "\"");

    }

}
