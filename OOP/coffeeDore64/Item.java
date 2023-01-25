public class Item {
    private String name;
    private double price;
    private int index;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String newName) {
        this.name = newName;
    }

    public double getPrice() {
        return this.price;
    }
    public void setPrice(double newPrice) {
        this.price = newPrice;
    }

    public int getIndex() {
        return this.index;
    }
    public void setIndex(int newIndex) {
        this.index = newIndex;
    }
}