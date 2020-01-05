package com.kodilla.good.patterns.challenges;

public class Main {

    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(new MailService(), new OrderService(), new CarOrderRepository());
        productOrderService.process(orderRequest);

//        MovieStore movieStore = new MovieStore();
//        String movieList = movieStore.getMovies().values().stream().flatMap(List::stream).collect(Collectors.joining("!"));
//        System.out.println(movieList);
    }

}
