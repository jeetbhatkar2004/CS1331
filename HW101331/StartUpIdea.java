/**
 * @author CS1331 Spring 2023 TAs
 * @version 1.0
 * This class is a wrapper over different traits of a Start-up Idea
 */
public class StartUpIdea implements Comparable<StartUpIdea> {
    private String problem;
    private String targetCustomer;
    private int customerNeed;
    private int knownPeopleWithProblem;
    private int targetMarketSize;
    private String competitors;
    private int effect;

    /**
     * 0-arg constructor implicitly setting all instance variables to default
     * values
     */
    public StartUpIdea() {
    }

    /**
     * 6-arg constructor
     * @param problem description
     * @param targetCustomer target customer
     * @param customerNeed 1-10 rating of need
     * @param knownPeopleWithProblem people you know with the problem
     * @param targetMarketSize number of potential customer
     * @param competitors current competitors/solutions
     * @param effect current
     */
    public StartUpIdea(String problem, String targetCustomer,
                       int customerNeed, int knownPeopleWithProblem,
                       int targetMarketSize, String competitors, int effect) {
        this.problem = problem;
        this.targetCustomer = targetCustomer;
        this.customerNeed = customerNeed;
        this.knownPeopleWithProblem = knownPeopleWithProblem;
        this.targetMarketSize = targetMarketSize;
        this.competitors = competitors;
        this.effect = effect;
    }

    /**
     * Optional for student to change
     * @return String representation of StartUpIdea
     */
    public String toString() {
        String str = "";
        str += "Problem: " + problem + "\n";
        str += "Target Customer: " + targetCustomer + "\n";
        str += "Customer Need: " + customerNeed + "\n";
        str += "Known People With Problem: " + knownPeopleWithProblem + "\n";
        str += "Target Market Size: " + targetMarketSize + "\n";
        str += "Competitors: " + competitors + "\n";
        str += "Effectiveness: " + effect + "\n";
        return str;
    }

    /**
     * This StartUpIdea is less than other StartUpIdea if it is valued higher
     * Optional for student to change
     * @param other StartUpIdea to be compared
     * @return a negative integer, zero, or a positive integer as this
     * object is less than, equal to, or greater than the specified object.
     */
    public int compareTo(StartUpIdea other) {
        int totalCustomerDesireDiff =
            this.customerNeed * (this.targetMarketSize + this.knownPeopleWithProblem + this.effect * 10000)
            - other.customerNeed * (other.targetMarketSize + other.knownPeopleWithProblem + other.effect * 10000);
        return 0 - totalCustomerDesireDiff;
    }

    /**
     * Getter for problem
     * @return problem
     */
    public String getProblem() {
        return problem;
    }

    /**
     * Setter for problem
     * @param problem to set
     */
    public void setProblem(String problem) {
        this.problem = problem;
    }

    /**
     * Getter for targetCustomer
     * @return targetCustomer
     */
    public String getTargetCustomer() {
        return targetCustomer;
    }

    /**
     * Setter for targetCustomer
     * @param targetCustomer to set
     */
    public void setTargetCustomer(String targetCustomer) {
        this.targetCustomer = targetCustomer;
    }

    /**
     * Getter for customerNeed
     * @return customerNeed
     */
    public int getCustomerNeed() {
        return customerNeed;
    }

    /**
     * Setter for customerNeed
     * @param customerNeed to set
     */
    public void setCustomerNeed(int customerNeed) {
        this.customerNeed = customerNeed;
    }

    /**
     * Getter for knownPeopleWithProblem
     * @return knownPeopleWithProblem
     */
    public int getKnownPeopleWithProblem() {
        return knownPeopleWithProblem;
    }

    /**
     * Setter for knownPeopleWithProblem
     * @param knownPeopleWithProblem to set
     */
    public void setKnownPeopleWithProblem(int knownPeopleWithProblem) {
        this.knownPeopleWithProblem = knownPeopleWithProblem;
    }

    /**
     * Getter for targetMarketSize
     * @return targetMarketSize
     */
    public int getTargetMarketSize() {
        return targetMarketSize;
    }

    /**
     * Setter for targetMarketSize
     * @param targetMarketSize to set
     */
    public void setTargetMarketSize(int targetMarketSize) {
        this.targetMarketSize = targetMarketSize;
    }

    /**
     * Getter for competitors
     * @return competitors
     */
    public String getCompetitors() {
        return competitors;
    }

    /**
     * Setter for competitors
     * @param competitors to set
     */
    public void setCompetitors(String competitors) {
        this.competitors = competitors;
    }
        /**
     * Getter for effect
     * @return effect
     */
    public int getEffectiveness() {
        return effect;
    }

    /**
     * Setter for effect
     * @param hi to set
     */
    public void setEffectiveness(int hi) {
        this.effect = hi;
    }

}