/**
 * This class represents a Cat
 * @author Jeet Tushar Bhatkar
 * @version 1.0
 */
public class Dog extends Pet implements Treatable {

    /**
     *
     */
    private String breed;

    /**
     * @param name name
     * @param age age
     * @param painLevel pain level
     * @param breed breed
     */
    public Dog(String name, int age, int painLevel, String breed) {
        super(name, age, painLevel);
        this.breed = breed;
    }

    /**
     * @param breed breed
     */
    public Dog(String breed) {
        this("Buzz", 6, 3, breed);
    }

    /**
     * @return sting
     */
    public String getBreed() {
        return breed;
    }

    /**
     * @param breed breed
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }

    /**
     * @param p
     * this method does not return anything
     */
    public void playWith(Pet p) {
        int oldPainLevel = getPainLevel();
        if (p instanceof Dog) {
            this.setPainLevel(getPainLevel() - 3);
            System.out.println("Woof! I love playing with other dogs so much that my pain level went from "
                + oldPainLevel + " to " + getPainLevel());
        } else if (p instanceof Cat) {
            if (((Cat) p).getHasStripes()) {
                this.setPainLevel(getPainLevel() - 2);
                System.out.println("AHHH! I thought you were a tiger!");
            } else {
                this.setPainLevel(getPainLevel() - 1);
                System.out.println("Woof. Cats without stripes are okay since they made my pain level go from "
                    + oldPainLevel + " to " + getPainLevel());
            }
        }
    }

    /**
     * This method does not return anyting
     */
    public void treat() {
        this.setPainLevel(getPainLevel() - 3);
    }

    /**
     * this methoddoesnt return anythiing
     */
    public void bark() {
        System.out.println("bark bark");
    }

    /**
     * @return String
     */
    public String toString() {
        int humanAge = Treatable.convertDogToHumanYears(getAge());
        return "My name is " + getName() + ", I am " + getAge() + ", and I am a " + breed
            + ". On a scale of one to ten my pain level is "
            + getPainLevel() + ". My age in human years is " + humanAge + ".";
    }

    @Override
    /**
     * @return bool
     */
    public boolean equals(Object o) {
        if (!(o instanceof Dog)) {
            return false;
        }
        Dog d = (Dog) o;
        return getName().equals(d.getName()) && getAge() == d.getAge()
            && getPainLevel() == d.getPainLevel() && breed.equals(d.breed);
    }

}