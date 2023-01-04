/*
 * In the following you will find the description of the first programming problem
 * that is about a smart garden. A smart garden assists taking care of house plants.
 * 
 * Please note that it is important that the naming of your classes, and signature
 * of methods exactly follow the description. All fields must be private and all
 * methods must be public. 
 */

public class Plant {

    /*
     * Create a Plant class containing a field name of type String and three fields
     * moistureLevel, optimalMoistureLevel, and optimalLightingLevel of type int.
     * The moistureLevel field is the amount of water that the plant currently has
     * whereas the optimalMoistureLevel represents the amount of water that the
     * plant
     * should typically have.
     */

    private String name;
    private int moistureLevel;
    private int optimalMoistureLevel;
    private int optimalLightingLevel;

    /*
     * Create a constructor for Plant that takes the value of all four fields as
     * arguments and initialises the fields of the class.
     */

    public Plant(String name, int moistureLevel, int optimalMoistureLevel, int optimalLightingLevel) {
        this.name = name;
        this.moistureLevel = moistureLevel;
        this.optimalMoistureLevel = optimalMoistureLevel;
        this.optimalLightingLevel = optimalLightingLevel;
    }

    /*
     * Create the methods getName() and getOptimalLightingLevel() that return the
     * name and the optimalLightingLevel of the plant, respectively.
     */

    public String getName() {
        return name;
    }

    public int getOptimalLightingLevel() {
        return optimalLightingLevel;
    }

    /*
     * Create a method getRequiredWater() that returns how much water a plant must
     * receive in order to reach its optimal moisture level. You may assume that
     * the moistureLevel is smaller than or equal to the optimalMoistureLevel.
     */

    public int getRequiredWater() {
        return optimalMoistureLevel - moistureLevel;
    }

    /*
     * Create a method water(amountOfWater) that given an argument of type int
     * increases the moistureLevel of a plant by that amount.
     */

    public void water(int amountOfWater) {
        moistureLevel += amountOfWater;
    }

    /*
     * Generate the methods equals() and hashCode() for the Plant class (in VSCode
     * right click in source document -> Source Action -> generate hashCode() and
     * equals()). Do not try to create them yourself if you are not able to do this.
     * Questions (12) and (14) will work incorrectly if you don't have these methods
     * but rather use the default ones, but you will not be docked point from them.
     * The implementation of the two methods are also attached in the .txt file.
     * Using these implementations requires that the fields are defined exactly
     * according to the description.
     */

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + moistureLevel;
        result = prime * result + optimalMoistureLevel;
        result = prime * result + optimalLightingLevel;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Plant other = (Plant) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (moistureLevel != other.moistureLevel)
            return false;
        if (optimalMoistureLevel != other.optimalMoistureLevel)
            return false;
        if (optimalLightingLevel != other.optimalLightingLevel)
            return false;
        return true;
    }

    // Go to SmartGarden

    /*
     * In the Plant class, create a method printReport() that prints the name, the
     * moistureLevel, the optimalMoistureLevel, and the optimalLightingLevel of the
     * plant using the format:
     * 
     * "plantName: <name>, current water: <moistureLevel>,
     * required water: <optimalMoistureLevel>, required light:
     * <optimalLightingLevel>"
     */

    public void printReport() {
        System.out.println("plantName: " + name + ", current water: " + moistureLevel +
                ", required water: " + optimalMoistureLevel + ", required light: " + optimalLightingLevel);
    }

    // Go back to SmartGarden
}