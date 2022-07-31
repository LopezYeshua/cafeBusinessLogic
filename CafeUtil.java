import java.util.ArrayList;
public class CafeUtil {
    

    // reward system for customers hwo always buy more drinks than they did the week before. + Ninja Bonus
    public int getStreakGoal(int numWeeks) {
        int sum =0;
        for (int i = 0; i <= numWeeks; i++) {
            sum += i;
        } return sum;
    }

    public double getOrderTotal(double[] prices) {
        double result = 0;
        for (int i = 0; i < prices.length; i++) {
            result += prices[i];
        } return result;
    }
    
    public void displayMenu(ArrayList<String> menuItems) {
        for (int i = 0; i < menuItems.size()-1; i++) {
            String item = menuItems.get(i);
            System.out.println(String.format("%d %s", i+1, item));
        }
    }
    // Add customer's name to the given customers list. then print the list + Sensei bonus.
    public void addCustomer(ArrayList<String> customers) {
        boolean active = true;
        while (active == true) {
            System.out.println("Please enter your name:");
            String userName = System.console().readLine("Enter 'q' to quit. \n");

            // breaks out of loop when user inputs 'q'.
            if (userName.contentEquals("q")) {
                break;
            }

            System.out.println(String.format("\nHello, %s", userName));
            System.out.println(String.format("There are %d people in front of you. \n", customers.size()));
            customers.add(userName);
        }
    }

    // Returns the total price of an order containing the same item.
    public void printPriceChart(String product, double price, int maxQuantity) {
        System.out.println(product);
        double sum = price;
        System.out.print(String.format("%d - $%.2f \n", 1, sum));
        for (int i = 1; i < maxQuantity; i++) {
            sum += price - .50;
            System.out.println(String.format("%d - $%.2f", i + 1, sum));
        }
    }
}