public class Maya implements PaymentMode {
    @Override
    public double determineDiscountRate() {
        return 0.05;
    }
}