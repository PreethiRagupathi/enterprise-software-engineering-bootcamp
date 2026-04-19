class OrderService {

    OrderRepository repo = new OrderRepository();

    public void placeOrder(Order order) {

        // validation logic
        if (order.price <= 0) {
            System.out.println("Invalid price");
            return;
        }

        // business logic
        System.out.println("Processing order: " + order.name);

        // save to repository
        repo.save(order);

        System.out.println("Order placed successfully");
    }
}