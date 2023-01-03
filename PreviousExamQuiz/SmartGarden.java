import java.util.ArrayList;
import java.util.List;

public class SmartGarden {
    private int roomLight;
    private int waterTankLevel;
    private List<Plant> plants;

    public SmartGarden(int roomLight, int waterTankLevel) {
        this.roomLight = roomLight;
        this.waterTankLevel = waterTankLevel;
        plants = new ArrayList<>();
    }
    
    public void addPlant(Plant plant){
        plants.add(plant);
    }

    public void waterPlants() throws Exception{
        for (Plant plant : plants) {
            if (plant.getRequiredWater() == 0 && waterTankLevel >= plant.getRequiredWater()){
                plant.water(plant.getRequiredWater());
                this.waterTankLevel = waterTankLevel-plant.getRequiredWater();
            }
            if (waterTankLevel < plant.getRequiredWater())
            throw new Exception("there is not enough water");
        }
    }

    public void checkLighting(){
        for (Plant plant : plants) {
            if (plant.getOptimalLightingLevel() < roomLight) {
                System.out.println("plant " + plant.getName() + " requires more light");
            }

            if (plant.getOptimalLightingLevel() > roomLight) {
                System.out.println("plant " + plant.getName() + " requires less light");
            }

            if (plant.getOptimalLightingLevel() == roomLight) {
                System.out.println("plant " + plant.getName() + " has the perfect amount of light");
            }
        }
    }

    // public Map<Plant, Integer> numberOfPlants(){
    //     for (Plant plant : plants) {
    //         return Map<plant.
    //     }
    // }

    public void printReport() {
        for (Plant plant : plants) {
            plant.printReport();
        }
    }
}
