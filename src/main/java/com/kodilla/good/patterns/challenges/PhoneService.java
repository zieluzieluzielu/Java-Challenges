package com.kodilla.good.patterns.challenges;

public class PhoneService implements InformationService {
    @Override
    public void inform(User user, Item item, OrderRequest orderRequest) {
        System.out.println("Calling: " + user.getPhoneNumber() + "...");
    }
}
