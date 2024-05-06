// //I worked on the homework assignment alone , using only course materials.
/**
 * This class represents a Bender
 * @author Jeet Tushar Bhatkar
 * @version 1.0
 */

abstract class Bender {
    private String name;
    private int strength;
    private int health;

    /**
     * @param name     name
     * @param strength strength
     * @param health   health
     */
    public Bender(String name, int strength, int health) {

        this.name = name;
        this.strength = strength;
        this.health = health;
    }

    /**
     * gets name
     * @return String
     */
    public String getName() {

        return name;

    }

    /**
     * gets strength
     * @return int
     */
    public int getStrength() {

        return strength;

    }

    /**
     * gets Health
     * @return int
     */
    public int getHealth() {

        return health;

    }

    /**
     * Sets name
     * @param newname temp name
     */
    public void setname(String newname) {

        name = newname;

    }

    /**
     * Sets Strength
     * @param newstrength temp strength
     */
    public void setStrength(int newstrength) {

        strength = newstrength;

    }

    /**
     * Sets Health
     * @param newhealth temp health
     */
    public void setHealth(int newhealth) {

        health = newhealth;

    }

    /**
     * @return bool
     */
    public boolean isAlive() {

        if (health > 0) {
            return true;
        }
        return false;
    }

    /**
     * @param b other object
     */

    public abstract void attack(Bender b);

    public String toString() {

        return String.format("My name is %s. I am a bender. My strength is %d and my current health is %d.", name,
                strength, health);

    }

    /**
     * It is a constructor.
     * @param x the x
     */
    public boolean equals(Object x) {

        if (!(x instanceof Bender)) {
            return false;
        }
        Bender otherN = (Bender) x;
        return (otherN.name.equals(name) && otherN.health == health);
    }
}