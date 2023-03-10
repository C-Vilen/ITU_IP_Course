public class Car {

    /* This is my Introductory Programming exam handin 05/01/2023
    This was done by Christian Vilen 
    */

    // 1. Define the class Car with a field plate of type String representing a car's unique license plate. 
    // It also contains the integer fields mileage representing the number of kilometers the car has driven in its life time,
    // lastServiceMileage representing the car's mileage when it was last serviced, 
    // tankCapacity representing the gas tank capacity in liters, 
    // and gasLevel representing the current amount of gas. 
    // Finally, it contains a field consumption of type float representing the number of liters of gas the car consumes per kilometer driven.  
    private String plate;
    private int mileage;
    private int lastServiceMileage;
    private int tankCapacity;
    private int gasLevel;
    private float consumption;

    // In the constructor of the class, initialise the fields plate, tankCapacity and consumption with parameters of the constructor 
    // and set all other fields to 0.
    public Car(String plate, int tankCapacity, float consumption){
        this.plate = plate;
        mileage = 0;
        lastServiceMileage = 0;
        this.tankCapacity = tankCapacity;
        gasLevel = 0;
        this.consumption = consumption;        
    }

    // 2. In Car, implement the methods getPlate(), getTankCapacity(), and getGasLevel(), which return the value of the corresponding fields in the class.
    public String getPlate() {
        return plate;
    }

    public int getTankCapacity() {
        return tankCapacity;
    }

    public int getGasLevel() {
        return gasLevel;
    }
    
    //3. In Car, implement a method kmSinceService() that returns the number of kilometers the car has driven since the last service.
    public int kmSinceService(){
        int output = mileage-lastServiceMileage;
        return output;
    }

    // 4. In Car, implement a method fillTank(int gasAmount) that increases the gas level in the tank with gasAmount, 
    // if this does not exceed (become strictly greater than) the tank capacity, and throws a GasOverFlowException otherwise. 
    // The implementation of GasOverFlowException is attached at the end of this page.
    public void fillTank(int gasAmount) throws GasOverFlowException{
        if(tankCapacity > gasLevel+gasAmount){
            this.gasLevel = gasLevel + gasAmount;
        }
    }

    // 5. In Car, implement a method service() which sets the value of lastServiceMileage to mileage.
    public void service(){
        this.lastServiceMileage = mileage;
    }

    // 6. In Car, implement a method needsService(), which returns true if the car has driven more than 30000 kilometers since its last service and false otherwise.
    public boolean needsService(){
        boolean output = false;
        if(kmSinceService() > 30000){
            output = true;
        }
        return output;
    }

    // 7. In Car, define a method drive(int d) that computes the amount of gas required to drive d kilometers, using d and consumption, 
    // and rounding the result to the nearest integer using Math.round. If there is enough gas in the tank then add d to mileage, 
    // remove the required gas from gasLevel, and return true. Otherwise do nothing and return false.
    // Math.round(float f) takes a floating point number f and rounds f to its nearest integer value.
    public boolean drive(int d){
        boolean output = false;
        int drivenConsumption = d/Math.round(consumption);
        if(gasLevel > drivenConsumption){
            mileage = mileage + d;
            gasLevel = gasLevel - drivenConsumption;
            output = true;
        }
        return output;
    }
}
