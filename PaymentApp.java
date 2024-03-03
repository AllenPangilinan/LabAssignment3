public class PaymentApp {
    public static void main(String[] args) {

        Order order1 = new Order("keyboard", 10, 300.0, new GCash());

        System.out.println("Order item is " + order1.getItem() +
                "\nUnit price is " + order1.getUnitPrice() +
                "\nQuantity is " + order1.getQuantity() +
                "\n\nPayment order details if " + order1.getPayment().getClass().getSimpleName() +
                "\nDiscount rate is " + order1.getPayment().determineDiscountRate() +
                "\nPayment amount is " + order1.getTotalAmount());

        Order order2 = new Order();
        order2.setQuantity(10);
        order2.setUnitPrice(300.0);
        order2.setPayment(new Maya());

        System.out.println("\nPayment order details if " + order2.getPayment().getClass().getSimpleName() +
                "\nDiscount rate is " + order2.getPayment().determineDiscountRate() +
                "\nPayment amount is " + order2.getTotalAmount());

        Order order3 = new Order("keyboard", 10, 300.0, new ShopeePay());

        System.out.println("\nPayment order details if " + order3.getPayment().getClass().getSimpleName() +
                "\nDiscount rate is " + order3.getPayment().determineDiscountRate() +
                "\nPayment amount is " + order3.getTotalAmount());
    }
}