public class Main {
    public static void main(String[] args) {

        Order order = new Order("Laptop", 50000);

        OrderController controller = new OrderController();

        controller.createOrder(order);
    }
}