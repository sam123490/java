import java.util.ArrayList;

public class Order {
    private String name;
    private boolean ready;
    private ArrayList<Item> items;

    public Order() {
        this("Guest");
    }
    public Order(String name) {
        this.name = name;
        this.items = new ArrayList<Item>();
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public boolean getReady() {
        return ready;
    }
    public void setReady(boolean ready) {
        this.ready = ready;
    }

    public ArrayList<Item> getItems() {
        return items;
    }
    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public void addItem(Item item) {
        items.add(item);
    }
    public String getStatusMessage() {
        if (ready) {
            return "Your order is ready.";
        }
        else {
            return "Thank you for waiting. Your order will be ready soon.";
        }
    }

    public double getOrderTotal() {
        double total = 0.0;
        for (int i=0; i < items.size(); i++) {
            total += items.get(i).getPrice();
        }
        return total;
    }

    public void display() {
        System.out.println("Customer Name: " + this.getName());
        for (int i=0; i < items.size(); i++) {
            System.out.println(items.get(i).getName() + " - $" + items.get(i).getPrice());
        }
        System.out.println("Total: $" + getOrderTotal() + "\n");
    }
}