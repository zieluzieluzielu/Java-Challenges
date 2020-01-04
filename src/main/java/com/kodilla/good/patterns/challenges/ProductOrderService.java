package com.kodilla.good.patterns.challenges;

class ProductOrderService {

    private InformationService informationService;
    private RentalService rentalService;
    private RentalRepository rentalRepository;

    ProductOrderService(final InformationService informationService,
                        final RentalService rentalService,
                        final RentalRepository rentalRepository) {
        this.informationService = informationService;
        this.rentalService = rentalService;
        this.rentalRepository = rentalRepository;
    }

    RentalDto process(final RentRequest rentRequest) {
        boolean isRented = rentalService.rent(rentRequest.getUser(), rentRequest.getItem(), rentRequest.getFrom(),
                rentRequest.getTo());

        if (isRented) {
            rentalRepository.createRental(rentRequest.getUser(), rentRequest.getItem(), rentRequest.getFrom(), rentRequest.getTo());
            rentalRepository.countPrice();
            informationService.inform(rentRequest.getUser(),rentRequest.getItem());
            return new RentalDto(rentRequest.getUser(), true);
        } else {
            return new RentalDto(rentRequest.getUser(), false);
        }
    }
}