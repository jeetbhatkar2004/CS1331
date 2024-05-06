
/**
 * This class represents a Supply
 * @author Jeet Tushar Bhatkar
 * @version 1.0
 */
public class Supply extends GroceryItem {

    private final String blurb;

    /**
     * @param name name
     * @param itemCode item
     * @param price price
     * @param blurb blurb
     */
    public Supply(String name, int itemCode, double price, String blurb) {
        super(name, itemCode, price);
        this.blurb = blurb;
    }

    /**
     * @return String
     */
    public String describe() {
        return "The item looks like " + blurb + ".";
    }
}