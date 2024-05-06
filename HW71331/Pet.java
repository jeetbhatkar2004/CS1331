/**
 * This class represents a Cat
 * @author Jeet Tushar Bhatkar
 * @version 1.0
 */
public abstract class Pet {

    private String name;
    private int age;
    private int painLevel;

    /**
     * @param name name
     * @param age age
     * @param painLevel pain level
     */
    public Pet(String name, int age, int painLevel) {
        this.name = name;
        setAge(age);
        setPainLevel(painLevel);
    }

    /**
     * @param p p
     */
    public void playWith(Pet p) {
    }

    @Override
    /**
     * @return String
     */
    public String toString() {
        return "My name is " + name + " and I am " + age
            + ". On a scale of one to ten my pain level is " + painLevel + ".";
    }

    @Override
    /**
     * @return bool
     * @param object o
     */
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Pet)) {
            return false;
        }
        Pet other = (Pet) o; //casting onto other
        return name.equals(other.getName()) && age == other.getAge() && painLevel == other.getPainLevel();
    }

    /**
     * @return String
     */
    public String getName() {
        return name;
    }

    /**
     * @param name name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return int
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age age
     */
    public void setAge(int age) {
        if (age < 1) {
            this.age = 1;
        } else if (age > 100) {
            this.age = 100;
        } else {
            this.age = age;
        }
    }

    /**
     * @return int
     */
    public int getPainLevel() {
        return painLevel;
    }

    /**
     * @param painLevel pain
     */
    public void setPainLevel(int painLevel) {
        if (painLevel < 1) {
            this.painLevel = 1;
        } else if (painLevel > 10) {
            this.painLevel = 10;
        } else {
            this.painLevel = painLevel;
        }
    }
}