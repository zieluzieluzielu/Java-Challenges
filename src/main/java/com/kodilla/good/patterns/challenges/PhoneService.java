package com.kodilla.good.patterns.challenges;

public class PhoneService implements InformationService {
    @Override
    public void inform(User user, Item item) {
        System.out.println("Calling: " + user.getPhoneNumber() + "...");
    }
}
