import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
        Item item1 = new Item("mocha", 3.50);
        Item item2 = new Item("drip coffee", 2.50);
        Item item3 = new Item("latte", 4.0);
        Item item4 = new Item("cappucino", 4.50);

        // two orders using first contructor
        Order order1 = new Order();
        Order order2 = new Order();

        // three orders using overloaded constructor
        Order order3 = new Order("Sammy");
        Order order4 = new Order("Jimmy");
        Order order5 = new Order("Pam");

        // testing class methonds =)
        order1.addItem(item3);
        order1.addItem(item4);
        order2.addItem(item2);
        order2.addItem(item3);
        order3.addItem(item1);
        order3.addItem(item4);
        order4.addItem(item2);
        order4.addItem(item3);
        order5.addItem(item2);
        order5.addItem(item4);

        order1.display();
        order2.display();
        order3.display();
        order4.display();
        order5.display();

        order1.setReady(true);
        System.out.println(order1.getStatusMessage());
        order3.setReady(false);
        System.out.println(order3.getStatusMessage());

        System.out.println(order1.getOrderTotal());



    }
}
