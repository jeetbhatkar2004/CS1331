/**
 * This class represents a Cat
 * @author Jeet Tushar Bhatkar
 * @version 1.0
 */
public interface Treatable {
    /**
     * @param dogAge dog age
     * @return nothing
     */
    static int convertDogToHumanYears(int dogAge) {
        double humanAge = 16 * Math.log(dogAge) + 31;
        return (int) Math.floor(humanAge);
    }

    /**
     * @param catAge cat age
     * @return return
     */
    static int convertCatToHumanYears(int catAge) {
        double humanAge = 9 * Math.log(catAge) + 18;
        return (int) Math.floor(humanAge);
    }

    /**
     * does not return anything
     */
    void treat();
}