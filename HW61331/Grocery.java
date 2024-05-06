import java.util.Arrays;

/**
 * @author Jeet Tushar Bhatkar
 * @version 1.0
 * @return returs
 */
public class Grocery {
    private GroceryItem[] shelf;
    /**
     * constructor
     */
    public Grocery() {
        shelf = new GroceryItem[0];
    }

    /**
     * @param items item
     */

    public Grocery(GroceryItem[] items) {
        // Copy items array to shelf array and sort it
        shelf = Arrays.copyOf(items, items.length);
        Arrays.sort(shelf);
    }

    /**
     * no return    value
     */
    public void browseItems() {
        for (GroceryItem item: shelf) {
            System.out.println(item.toString());
        }
    }

    /**
     * @param newItem new item
     */
    public void addGroceryItem(GroceryItem newItem) {
        // Create new array with length + 1 and copy previous elements
        GroceryItem[] newShelf = Arrays.copyOf(shelf, shelf.length + 1);
        newShelf[newShelf.length - 1] = newItem; // Add new item to end
        shelf = newShelf; // Set shelf to new array

        // Sort shelf array
        Arrays.sort(shelf);
    }

    /**
     * @param code code
     * @return retuerns
     */
    public GroceryItem getGroceryItem(int code) {
        for (int i = 0; i < shelf.length; i++) {
            if (shelf[i].equals(code)) {
                return shelf[i];
            }
        }
        return null; // Code not found
    }

    /**
     * @return retue s
     */
    public int getNumberOfItems() {
        return shelf.length;
    }

}