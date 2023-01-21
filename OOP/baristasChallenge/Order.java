import java.util.ArrayList;

public class Order {
    private String name;
    private boolean ready;
    private ArrayList<Item> items = new ArrayList();

    public Order() {
        this.name = "Guest";
        this.items = items;
    }
    public Order(String name) {
        this.name = name;
        this.items = items;
    }

    public String getName() {
        return name;
    }
    public void setName(String newName) {
        this.name = newName;
    }

    public boolean getReady() {
        return ready;
    }
    public void setReady(boolean Ready) {
        this.ready = Ready;
    }

    public ArrayList<Item> getItems() {
        return items;
    }
    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public void addItem(Item item) {
        this.items.add(item);
    }
    public String getStatusMessage() {
        if (this.ready == true) {
            return "Your order is ready.";
        }
        else {
            return "Thank you for waiting. Your order will be ready soon.";
        }
    }
    public double getOrderTotal() {
        double total = 0.0;
        for (int i=0; i < this.items.size(); i++) {
            total += this.items.get(i).getPrice();
        }
        return total;
    }
    public void display() {
        System.out.println("Customer Name: " + this.getName());
        for (int i=0; i < this.items.size(); i++) {
            System.out.println(this.items.get(i).getName() + " - $" + this.items.get(i).getPrice());
        }
        System.out.println("Total: $" + this.getOrderTotal() + "\n");
    }
}