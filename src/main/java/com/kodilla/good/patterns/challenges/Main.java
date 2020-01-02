package com.kodilla.good.patterns.challenges;

public class Main {

    public static void main(String[] args) {
        RentRequestRetriever rentRequestRetriever = new RentRequestRetriever();
        RentRequest rentRequest = rentRequestRetriever.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(new MailService(), new CarRentalService(), new CarRentalRepository());
        productOrderService.process(rentRequest);

//        MovieStore movieStore = new MovieStore();
//        String movieList = movieStore.getMovies().values().stream().flatMap(List::stream).collect(Collectors.joining("!"));
//        System.out.println(movieList);
    }

}
