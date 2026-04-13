class OrderService {

    PaymentService paymentService;
    EmailService emailService;
    OrderRepository orderRepository;

    OrderService(PaymentService paymentService, EmailService emailService, OrderRepository orderRepository) {
        this.paymentService = paymentService;
        this.emailService = emailService;
        this.orderRepository = orderRepository;
    }

    void placeOrder() {
        createOrder();
        paymentService.processPayment();
        emailService.sendEmail();
        orderRepository.saveToDatabase();
    }

    void createOrder() {
        System.out.println("Order created");
    }
}