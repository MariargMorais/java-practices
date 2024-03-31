package methods.exercise;
import java.math.BigDecimal;

public class FoodOrderService {

    public void placeOrder(FoodOrder newfoodOrder) {
        validateOrder(newfoodOrder);
        BigDecimal totalAmount = calculateTotalPrice(newfoodOrder);
        initiatePayment(totalAmount);
        initiateProduction(newfoodOrder);
    }

    private void validateOrder(FoodOrder foodOrder) {
        // implementation skipped for brevity
    }

    private BigDecimal calculateTotalPrice(FoodOrder foodOrder) {
        // implementation skipped for brevity
        return BigDecimal.ONE;
    }

    private void initiatePayment(BigDecimal totalAmount) {
        // implementation skipped for brevity
    }

    private void initiateProduction(FoodOrder foodOrder) {
        // implementation skipped for brevity
    }

}