public class Main {
    public static void main(String[] args) {

        PaymentService payment = new PaymentService();
        EmailService email = new EmailService();
        OrderRepository repo = new OrderRepository();

        OrderService order = new OrderService(payment, email, repo);

        order.placeOrder();
    }
}