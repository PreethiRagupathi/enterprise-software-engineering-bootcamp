class OrderController {

    OrderService service = new OrderService();

    public void createOrder(Order order) {
        service.placeOrder(order);
    }
}