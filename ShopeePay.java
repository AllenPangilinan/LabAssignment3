public class ShopeePay implements PaymentMode {
    @Override
    public double determineDiscountRate() {
        return 0.10;
    }
}