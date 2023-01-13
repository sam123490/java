public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffeePrice = 3.0;
        double lattePrice = 3.75;
        double cappuccinoPrice = 3.25;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = false;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
        // ** Your customer interaction print statements will go here ** //
        System.out.println(pendingMessage);

        if(isReadyOrder4){
        System.out.println(readyMessage + displayTotalMessage + cappuccinoPrice);
        }
        else{
            System.out.println(pendingMessage);
        }
        if(isReadyOrder2){
            System.out.println(displayTotalMessage + lattePrice + lattePrice);
        }
        else{
            System.out.println(pendingMessage);
        }
        System.out.println(customer3 + displayTotalMessage + (lattePrice - dripCoffeePrice));

    }
}