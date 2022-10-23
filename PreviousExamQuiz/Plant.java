public class Plant {
    private String name;
    private int moistureLevel;
    private int optimalMoistureLevel;
    private int optimalLightingLevel;

    public Plant(String name, int moistureLevel, int optimalMoistureLevel, int optimalLightingLevel){
        this.name = name;
        this.moistureLevel = moistureLevel;
        this.optimalMoistureLevel = optimalMoistureLevel;
        this.optimalLightingLevel = optimalLightingLevel;
    }

    public String getName(){
        return name;
    }

    public int getOptimalLightingLevel(){
        return optimalLightingLevel;
    }

    public int getRequiredWater(){
        return optimalMoistureLevel-moistureLevel;
    }

    public int water(int amountOfWater){
        return this.moistureLevel = moistureLevel + amountOfWater;
    }

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

    public void printReport(){
        System.out.println("plantName: " + name + ", current water: " + moistureLevel + ", required water: "+ optimalMoistureLevel + ", required light: " + optimalLightingLevel);
    }
}
