//I worked on the homework assignment alone, using only course materials.
/**
 * This class represents a Cat
 * @author Jeet Tushar Bhatkar
 * @version 1.0

 */
public class Vet {

    /**
     * @param pet pet
     */
    public static void inspectPet(Pet pet) {
        System.out.println(pet.toString());
        if (pet instanceof Dog) {
            ((Dog) pet).bark();
        }
    }

    /**
     * @param pet pet
     */
    public static void treatPet(Pet pet) {
        if (pet instanceof Treatable) {
            System.out.println("Welcome to the vet " + pet.getName());
            ((Treatable) pet).treat();
            if (pet instanceof Dog) {
                System.out.println("Wow what a cute dog!");
                giveDogTreat((Dog) pet);
            }
        } else {
            System.out.println("Sorry, we cannot treat " + pet.getName());
        }
    }

    /**
     * @param dog dog
     */
    public static void giveDogTreat(Dog dog) {
        dog.setPainLevel(dog.getPainLevel() - 2);
    }

}