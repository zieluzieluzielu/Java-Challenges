package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public interface RentalService {

    boolean rent(User user, Item item, LocalDateTime rentFrom, LocalDateTime rentTo);

}
