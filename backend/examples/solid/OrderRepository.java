import java.util.*;

class OrderRepository {

    List<Order> orders = new ArrayList<>();

    public void save(Order order) {
        orders.add(order);
        System.out.println("Order saved to database");
    }
}