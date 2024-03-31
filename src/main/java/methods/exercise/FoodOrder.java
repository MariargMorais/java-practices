package methods.exercise;
import java.math.BigDecimal;

//The FoodOrderService.java class you can see is a good example of method signatures gone wrong.
//The placeOrder method accepts as many as 7 parameters, and then uses some internal methods with subsets of these 7 arguments.
//All of this makes the code hard to read and difficult to maintain.
//
//As a better alternative, move all the 7 parameters into a new record class named FoodOrder.java,
//and then replace the long parameter lists in methods placeOrder, validateOrder, calculateTotalPrice
//and initiateProduction with just single parameters of the newly created FoodOrder class (leave initiatePayment
//untouched as it only uses a single parameter from the start).
//
//Important: When changing the parameters into record fields, do not change their order.
//Use the same order that you see in the placeOrder method signature.
//The automated test that verifies your solution will depend on that order.
public class FoodOrder {
}
