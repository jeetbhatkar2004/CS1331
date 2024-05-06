/**
 * This class represents a WaterBender
 * @author Jeet Tushar Bhatkar
 * @version 1.0
 */

public class WaterBender extends Bender {
    private boolean healer;

    /**
     * @param name     name
     * @param strength strength
     * @param health   health
     * @param healer   healer
     */
    public WaterBender(String name, int strength, int health, boolean healer) {

        super(name, strength, health);
        this.healer = healer;

    }

    /**
     * gets healer status
     * @return bool
     */
    public boolean getHealer() {

        return healer;
    }

    /**
     * gets name
     * @param name name
     */
    public WaterBender(String name) {

        this(name, 40, 80, false);
    }

    /**
     * function for attacking a WaterBender
     * @param b b
     */
    public void attack(Bender b) {

        if (!isAlive()) {
            return;
        }
        if (b instanceof WaterBender) {
            b.setHealth(b.getHealth() - 1);

        } else if (b instanceof FireBender) {
            b.setHealth(b.getHealth() - getStrength());
        }
        if (b.getHealth() < 0) {
            b.setHealth(0);
        }

    }

    /**
     * healing by a waterbender
     * @param wb arbitrary waterbender
     */
    public void heal(WaterBender wb) {

        if (!wb.healer || !wb.isAlive()) {
            return;

        }
        if (!wb.getHealer()) {
            wb.setHealth(wb.getHealth() + 40);

        } else {
            wb.setHealth(wb.getHealth() + 20);
        }

    }

    /**
     * checking for equality
     * @param b b
     * @return boolean
     */
    public boolean equals(WaterBender b) {

        return (super.equals(b) && this.healer == b.getHealer());
    }

    /**
     * To string
     * @return String
     */
    public String toString() {

        String cat = (healer) ? "can" : "cannot";
        return (super.toString() + " With my waterbending, I " + cat + " heal others.");
    }

}