import java.util.ArrayList;
import java.util.Arrays;
public class CafeUtil {

    public int getStreakGoal() {
        int totalDrinks = 0;
        for (int i = 1; i <= 10; i++) {
            totalDrinks += i;
        }
        return totalDrinks;
    }

    public double getOrderTotal(double[] prices) {
        double totalPrice = 0.0;
        for (int i = 0; i < prices.length; i++) {
            totalPrice += prices[i];
        }
        return totalPrice;
    }

    public void displayMenu(ArrayList<String> menuItems) {
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println(i + " " + menuItems.get(i));
        }
    }

    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println("Hello, " + userName);
        System.out.println(String.format("There are %d people infront of you.", customers.size()));
        customers.add(userName);
        System.out.println(customers);
    }
    
}