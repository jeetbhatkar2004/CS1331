/**
 * This class represents a GroceryItem
 * @author Jeet Tushar Bhatkar
 * @version 1.0
 */

public abstract class GroceryItem implements Comparable<GroceryItem>, Describable {
    private String name;
    private int itemCode;
    private double price;

    /**
     * @param name name
     * @param itemCode item
     * @param price price
     */
    public GroceryItem(String name, int itemCode, double price) {
        this.name = name;
        this.itemCode = itemCode;
        this.price = price;
    }

    @Override
    public int compareTo(GroceryItem other) {
        if (this.price < other.price) {
            return 1;
        } else if (this.price > other.price) {
            return -1;
        } else {
            return 0;
        }
    }
    /**
     * @return String
     */
    @Override
    public String toString() {
        return this.itemCode + ": " + this.describe();
    }


}