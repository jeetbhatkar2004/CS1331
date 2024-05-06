/**
 * This class represents a FireBender
 * @author Jeet Tushar Bhatkar
 * @version 1.0
 */
public class FireBender extends Bender {
    private static double fireSourceStrength = 1.0;

    /**
     * @param name     name
     * @param strength strength
     * @param health   health
     */
    public FireBender(String name, int strength, int health) {

        super(name, strength, health);
    }

    /**
     * @param name name
     */
    public FireBender(String name) {

        super(name, 60, 50);

    }

    /**
     * attacking for Firebender
     * @param b b
     */
    public void attack(Bender b) {

        if (!isAlive()) {
            return;
        } else {
            if (b instanceof WaterBender) {
                b.setHealth((int) (b.getHealth() - (getStrength() * getFireSourceStrength())));
            } else {
                b.setHealth((int) (b.getHealth() - getFireSourceStrength()));
            }
        }
        if (b.getHealth() < 0) {
            b.setHealth(0);
        }
        fireSourceStrength -= 0.05;
        if (fireSourceStrength < 0) {
            fireSourceStrength = 0;
        }
    }

    /**
     */
    public void replenishFireSources() {

        if (getStrength() < 50 && fireSourceStrength < 0.8) {
            fireSourceStrength = (getFireSourceStrength() < 0.8) ? 0.8 : 1;
        }
    }

    /**
     * @param b b
     * @return returns bool
     */
    public boolean equals(Bender b) {

        if (b instanceof FireBender) {
            return super.equals(b);
        }
        return false;
    }

    /**
     * To string
     * @return String
     */
    public String toString() {

        return (super.toString() + " I bend fire.");
    }

    /**
     * @return double
     */
    public double getFireSourceStrength() {

        return fireSourceStrength;
    }
}