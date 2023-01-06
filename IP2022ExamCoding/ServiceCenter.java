import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

    /* This is my Introductory Programming exam handin 05/01/2023
    This was done by Christian Vilen - 0410961911 
    */

public class ServiceCenter {
    // 8. Define a class ServiceCenter with fields serviceQueue of type List<Car>, 
    // carsPriority of type Map<String, Integer>, which maps a car license plate to a value representing a priority (higher value means higher priority) and 
    // gasPrice of type int that shows the price of each liter of gas. 
    // In the constructor, initialise gasPrice with the parameter of the constructor and serviceQueue and carsPriority as an empty list and an empty map, respectively.
    private List<Car> serviceQueue;
    private Map<String, Integer> carsPriority;
    private int gasPrice;

    public ServiceCenter(int gasPrice){
        this.gasPrice = gasPrice;
        serviceQueue = new ArrayList<>();
        carsPriority = new TreeMap<>();
    }

    // 9. In ServiceCenter, implement a method addToServiceQueue(Car c), that first checks whether the license plate of c is in the carsPriority keys, 
    //if yes then it adds c to the end of serviceQueue. 
    // Otherwise, it prints “Car <license plate> not found” where <license plate> is the license plate of c.
    public void addToServiceQueue(Car c){
        if(carsPriority.containsKey(c.getPlate())){
            serviceQueue.add(serviceQueue.size()+1, c);
        } else {
            System.out.println("Car " + c.getPlate() + " not found");
        }
    }

    // 10. In ServiceCenter, implement a method fillGas(Car c) that fills the gas tank of car c to full capacity. 
    // This method returns an int value that is the total price of the gas that was filled in the tank of the car. 
    public int fillGas(Car c){
        int gasNeeded = c.getTankCapacity()-c.getGasLevel();
        c.fillTank(gasNeeded);
        return gasNeeded*gasPrice;
    }

    // 11. In ServiceCenter, implement a method updatePriority(Car c, int p) that updates the priority mapped to the license plate of the car c, 
    // in the carsPriority map, with priority p. If the license plate of the car is not in the map, it is added with priority p.
    public void updatePriority(Car c, int p){
        if(carsPriority.containsKey(c.getPlate())){
            int priority = carsPriority.get(c.getPlate());
            carsPriority.replace(c.getPlate(), priority, p);
        } else {
            carsPriority.put(c.getPlate(), p);
        }
    }

    // 12. In ServiceCenter, implement a method serviceCar(Car c) that fills the gas tank, services the car if it needs service, 
    // and prints “Car <license plate> serviced for <price> dollars” where <license plate> is the license plate of c 
    // and <price> is the total price for the filled gas plus 500 if the car needed service.
    public void serviceCar(Car c){
        int output = fillGas(c);
        if(c.needsService()){
            c.service();
            output = output + 500;
        }
        System.out.println("Car "+ c.getPlate() + " serviced for " + output + " dollars");
    }

    // 13. In ServiceCenter, implement a method serviceAll() 
    // which services the cars in serviceQueue from the beginning to the end (using the serviceCar method). 
    // After servicing each car, the car is removed from the serviceQueue.
    public void serviceAll(){
        for (Car car : serviceQueue) {
            serviceCar(car);
            serviceQueue.remove(car);
        }
    }

    // 14. In ServiceCenter, implement a method called findHighestPriority() 
    // which returns the index of the car with highest priority in the serviceQueue. 
    // You may assume that priorities are strictly greater than 0 and return -1 if the queue is empty. 
    // If there are several cars with same priority, returns the smallest index.
    public int findHighestPriority(){
        if(serviceQueue.size()>0){
            int carWithHighestPrioty = 0;
            for (Car car : serviceQueue) {
                if(carsPriority.get(car.getPlate())>carWithHighestPrioty){
                    carWithHighestPrioty = carsPriority.get(car.getPlate());
                }
            }
            return carWithHighestPrioty;
        } else {
            return -1;
        }
    }

    // 15. In ServiceCenter, implement a method serviceAllWithPriority() 
    // which services the cars (using the serviceCar and/or serviceAll methods) in serviceQueue in order of priority. 
    // The cars with higher priority are serviced first. After servicing each car the car is removed from serviceQueue.
    public void serviceAllWithPriority(){
        for (Car car : serviceQueue) {
            if (carsPriority.get(car.getPlate()).equals(findHighestPriority())) {
                serviceCar(car);
                serviceQueue.remove(car);
            }
        }
    }
}
