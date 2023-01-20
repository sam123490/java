import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
        Item item1 = new Item("mocha", 3.50);
        Item item2 = new Item("drip coffee", 2.50);
        Item item3 = new Item("latte", 4.0);
        Item item4 = new Item("cappucino", 4.50);
        // Order variables -- order1, order2 etc.
        // Order1
        ArrayList<Item> order1Items = new ArrayList<Item>();
        order1Items.add(item1);
        order1Items.add(item2);
        Order order1 = new Order("Cindhuri", 7.50, false, order1Items);
        // Order2
        ArrayList<Item> order2Items = new ArrayList<Item>();
        order2Items.add(item3);
        Order order2 = new Order("Jimmy", 4.0, true, order2Items);
        order2.items.add(item1);
        order2.total += 2.50;
        // Order3
        ArrayList<Item> order3Items = new ArrayList<Item>();
        Order order3 = new Order("Noah", 0.0, false, order3Items);
        order3.items.add(item4);
        order3.total += 4.50;
        // Order4
        ArrayList<Item> order4Items = new ArrayList<Item>();
        Order order4 = new Order("Sam", 0.0, false, order4Items);
        order4.items.add(item3);
        order4.total += item3.price;

        order1.ready = true;
        order4.items.add(item3);
        order4.items.add(item3);
        order4.total += (item3.price * 2);
        order2.ready = true;

        // Application Simulations
        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order4.name);
        System.out.printf("Total: %s\n", order4.total);
        System.out.printf("Ready: %s\n", order4.ready);
    }
}
