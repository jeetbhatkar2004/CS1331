/**
 * This class represents a Cat
 * @author Jeet Tushar Bhatkar
 * @version 1.0
 */
public class Narwhal extends Pet {
    /**
     *
     */
    private int hornLength;

    /**
     * @param name name
     * @param age age
     * @param painLevel pain level
     * @param hornLength horn length
     */
    public Narwhal(String name, int age, int painLevel, int hornLength) {
        super(name, age, painLevel);
        this.hornLength = hornLength;
    }

    /**
     * does not
     */
    public Narwhal() {
        this("Jelly", 19, 2, 7);
    }

    /**
     * @param p pet
     */
    public void playWith(Pet p) {
        if (p instanceof Narwhal) {
            System.out.println("Who needs dogs and cats when we have each other");
            this.setPainLevel(2);
        } else {
            System.out.println("I live in the ocean so I can't play with you");
            this.setPainLevel(1);
        }
    }

    @Override
    /**
     * @return String
     */
    public String toString() {
        return "My name is " + getName() + " and I am " + getAge() + ". On a scale of one to ten my pain level is "
            + getPainLevel() + ". I have a horn that is " + hornLength + " feet long.";
    }

    @Override
    /**
     * @return bool
     */
    public boolean equals(Object o) {
        if (o instanceof Narwhal) {
            Narwhal n = (Narwhal) o;
            return super.equals(o) && hornLength == n.hornLength;
        }
        return false;
    }

    /**
     * @return int
     */
    public int getHornLength() {
        return hornLength;
    }

    /**
     * @param hornLength horn
     */
    public void setHornLength(int hornLength) {
        this.hornLength = hornLength;
    }
}