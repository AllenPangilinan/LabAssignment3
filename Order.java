public class Order {
    private String item;
    private int quantity;
    private double unitPrice;
    private PaymentMode payment;

    public Order() {
    }

    public Order(String item, int quantity, double unitPrice, PaymentMode payment) {
        this.item = item;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.payment = payment;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setPayment(PaymentMode payment) {
        this.payment = payment;
    }

    public String getItem() {
        return item;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public double getTotalAmount() {
        double initialAmount = calculateInitialAmount();
        double discount = calculateDiscount(initialAmount);
        return calculateTotalAmount(initialAmount, discount);
    }

    private double calculateInitialAmount() {
        return getQuantity() * getUnitPrice();
    }

    private double calculateDiscount(double initialAmount) {
        return initialAmount * getPayment().determineDiscountRate();
    }

    private double calculateTotalAmount(double initialAmount, double discount) {
        return initialAmount - discount;
    }

    public PaymentMode getPayment() {
        return payment;
    }
}