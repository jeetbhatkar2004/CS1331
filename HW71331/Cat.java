/**
 * This class represents a Cat
 * @author Jeet Tushar Bhatkar
 * @version 1.0
 */
public class Cat extends Pet implements Treatable {
    /**
     *
     */
    private boolean hasStripes;

    /**
     * @param name namr
     * @param age age
     * @param painLevel painlevel
     * @param hasStripes stripes?
     */
    public Cat(String name, int age, int painLevel, boolean hasStripes) {
        super(name, age, painLevel);
        this.hasStripes = hasStripes;
    }

    /**
     * @param hasStripes STRIPES?
     */
    public Cat(boolean hasStripes) {
        this("Purrfect", 4, 9, hasStripes);
    }

    /**
     * @return bool
     */
    public boolean getHasStripes() {
        return hasStripes;
    }

    /**
     * @param hasStripes stripes?
     */
    public void setHasStripes(boolean hasStripes) {
        this.hasStripes = hasStripes;
    }

    /**
     * @param p pet
     * returns nothing
     */
    public void playWith(Pet p) {
        if (p instanceof Cat) {
            Cat otherCat = (Cat) p;
            if (this.hasStripes && otherCat.getHasStripes()) {
                // Both cats have stripes
                this.setPainLevel(getPainLevel() - 4);
                System.out.println("Meow! I love playing with other cats with the same pattern as me");
            } else if (!this.hasStripes && !otherCat.getHasStripes()) {
                // Neither cat has stripes
                this.setPainLevel(getPainLevel() - 2);
                System.out.println("Meow! I like playing with other cats without the same pattern as me");
            }
        } else if (p instanceof Dog) {
            // Cat doesn't like playing with dogs
            this.setPainLevel(getPainLevel() - 1);
            System.out.println("Meow. Go away " + p.getName() + "! I don't like playing with dogs!");
        }
        // Cannot play with Narwhals, do nothing
    }

    /**
     * returns nothing
     */
    public void treat() {
        this.setPainLevel(getPainLevel() - 1);
    }

    @Override
    /**
     * @return Strring
     */
    public String toString() {
        int humanAge = Treatable.convertCatToHumanYears(getAge());
        return "My name is " + getName() + " and I am "
            + getAge() + ". On a scale of one to ten my pain level is "
            + getPainLevel() + ". My age in human years is " + humanAge + ".";
    }



    @Override
    /**
     * @return bool
     */
    public boolean equals(Object o) {
        if (o instanceof Cat) {
            Cat otherCat = (Cat) o;
            return this.getName().equals(otherCat.getName())
                && this.getAge() == otherCat.getAge()
                && this.getPainLevel() == otherCat.getPainLevel()
                && this.hasStripes == otherCat.hasStripes;
        }
        return false;
    }
}