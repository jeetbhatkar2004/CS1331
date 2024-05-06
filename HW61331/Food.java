/**
 * This class represents a Food
 * @author Jeet Tushar Bhatkar
 * @version 1.0
 */

 // class food
public class Food extends GroceryItem {

    private final int age;
    private final int expiration;

    /**
     * @param name name
     * @param itemCode item code
     * @param price price
     * @param age age
     * @param expiration expiration
     */
    public Food(String name, int itemCode, double price, int age, int expiration) {
        super(name, itemCode, price);
        this.age = age;
        this.expiration = expiration;
    }

    /**
     * @return returns
     */
    public int calculateMonthsRemaining() {
        return expiration - age;
    }


    /**
     * @return returns String
     */
    public String describe() {
        int monthsRemaining = calculateMonthsRemaining();
        return "The food is " + age + " months old and has " + monthsRemaining + " months remaining before it expires.";
    }
}