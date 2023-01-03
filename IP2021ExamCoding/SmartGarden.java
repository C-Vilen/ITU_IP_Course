import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SmartGarden {
    
    /*
     * Create SmartGarden class containing two fields roomLight and waterTankLevel
     * of type int and a field plants of type List<Plant>.
     */

    private int roomLight;
    private int waterTankLevel;
    private List<Plant> plants;

    /*
     * In the SmartGarden class, create a constructor that takes values for the
     * fields roomLight and waterTankLevel as arguments and initialises them. Your
     * constructor should also include other code required to make instances of
     * the class work properly.
     */

    public SmartGarden(int roomLight, int waterTankLevel) {
        this.roomLight = roomLight;
        this.waterTankLevel = waterTankLevel;
        plants = new ArrayList<>();
    }

    /*
     * In the SmartGarden class, create a method addPlant(plant) that given an
     * argument of type Plant adds that plant to the plants list.
     */

    public void addPlant(Plant plant) {
        plants.add(plant);
    }

    /*
     * In the SmartGarden class, implement a method waterPlants() that goes
     * through the plants list and waters all plants with the amount they require
     * to reach their optimalMoistureLevel. Furthermore, decrease the value of the
     * water tank level by the corresponding amount. However, if there is not enough
     * water in the tank to water a plant then throw a LowWaterLevelException with
     * the message "there is not enough water" (the implementation of this
     * exception is included in the project folder).
     */

    public void waterPlants() {
        for (Plant plant : plants) {
            int requiredWater = plant.getRequiredWater();
            if (waterTankLevel < requiredWater) {
                throw new LowWaterLevelException("there is not enough water");
            }
            waterTankLevel -= requiredWater;
            plant.water(requiredWater);
        }
    }

    /*
     * In the SmartGarden class, create a method checkLighting() that compares
     * the room light level with the required light for each of the plants in
     * the SmartGarden. For every plant in the smart garden print:
     * 
     * "plant <name> requires more light" if the light level of the room is
     * strictly smaller than the optimal light level for the plant
     *  
     * "plant <name> requires less light" if the light level of the room is
     * strictly greater than the optimal light level for the plant
     * 
     * "plant <name> has the perfect amount of light" otherwise.
     * 
     * In all cases <name> refers to the actual name of the plant.
     */

    public void checkLighting() {
        for (Plant plant : plants) {
            int optimalLightingLevel = plant.getOptimalLightingLevel();
            String name = plant.getName();
            if (roomLight < optimalLightingLevel) {
                System.out.println("plant " + name + " requires more light");
            } else if (roomLight > optimalLightingLevel) {
                System.out.println("plant " + name + " requires less light");
            } else {
                System.out.println("plant " + name + " has the perfect amount of light");
            }
        }
    }

    /*
     * In the SmartGarden class, create a method numberOfPlants() that returns
     * a map of type Map<Plant, Integer> containing a plant as a key and the number
     * of times that plant appears in the garden as its value.
     */

    public Map<Plant, Integer> numberOfPlants() {
        Map<Plant, Integer> plantMap = new HashMap<>();
        for (Plant plant : plants) {
            if (!plantMap.containsKey(plant)) {
                plantMap.put(plant, 1);
            } else {
                int num = plantMap.get(plant) + 1;
                plantMap.put(plant, num);
            }
        }
        return plantMap;
    }

    // Go to Plant

    /*
     * In the SmartGarden class, implement a method printReport() that prints the
     * plant description for all the plants in the smart garden using the printReport
     * method of the Plant class. However, you should only print each plant once,
     * even if it occurs multiple times. Hint: Use the numberOfPlants() method.
     */

    public void printReport() {
        for (Plant plant : numberOfPlants().keySet()) {
            plant.printReport();
        }
    }
}