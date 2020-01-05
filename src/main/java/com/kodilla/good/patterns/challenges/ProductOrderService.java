package com.kodilla.good.patterns.challenges;

class ProductOrderService {

    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    ProductOrderService(final InformationService informationService,
                        final OrderService orderService,
                        final OrderRepository rentalRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = rentalRepository;
    }
    OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest.getUser(), orderRequest.getItem(), orderRequest.getAmount(),
                orderRequest.getOrderDate());

        if (isOrdered) {
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getItem(), orderRequest.getAmount(),
                    orderRequest.getOrderDate());
            orderRepository.countPrice(orderRequest);
            informationService.inform(orderRequest.getUser(),orderRequest.getItem(),orderRequest);
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}