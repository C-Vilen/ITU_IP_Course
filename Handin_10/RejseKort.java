/* 
This is my tenth handin of a travelcard
This was done by C.Vilen 
Due date: 07-11-2022 12:00
*/

public class RejseKort {
    private int dkk;
    private int checkTime;
    private boolean status;
    private int maxX;
    private int minX;
    private int maxY;
    private int minY;
    private int price;

    public RejseKort(){
        this.dkk = 100;
        this.status = false;
    }

    public void depositMoney(int dkk){
        if(dkk < 0) {
            System.out.println("Error: Cannot deposit negative amount");
        } else {
            this.dkk = this.dkk + dkk;
            System.out.println(dkk + " DKK deposited. New balance: " + this.dkk + " DKK");
        }
    }

    public boolean isCheckedIn(int timeStamp){
        if(status && (timeStamp - this.checkTime) <= 120) {
            return true;        
        } else {
            return false;
        }
    }

    public void checkIn(int x, int y, int timeStamp){
        // Message if insufficient funds is on the travelcard
        if(this.dkk < 100){
            int amount = 100 - dkk;
            System.out.println("Not enough money in account to check in. Please deposit at least " + amount + " DKK");
        } 
        
        // If the journey continues
        if (status) {
            System.out.println("Continued journey (" + (timeStamp - this.checkTime) + " minutes since last check in)");
        }

        // If the journey starts
        if (status == false && this.dkk >= 100 ) {
            this.status = true;
            System.out.println("Checked in");
        }
        calculateMaxMinXY(x, y);
        this.checkTime = timeStamp;
    }

    public void checkOut(int x, int y, int timeStamp){
        calculateMaxMinXY(x, y);
                
        // Message if insufficient funds is on the travelcard
        if(status == false) {
            System.out.println("Error: Cannot check out; Not currently checked in");
        } 

        // Checking out if criteria is met
        if (this.status && this.dkk >= 100){
            calculateTravelPrice();
            this.dkk -= this.price;
            this.status = false;
            System.out.println("Checked out! " + (timeStamp - this.checkTime) + " minutes since last check in. Price is " + this.price + " DKK, remaining balance is " + dkk + " DKK");
        }
    }

    // Sets the max and min of x and y, respectively
    public void calculateMaxMinXY(int x, int y){
        if((minX + minY)==0){minX = x;minY = y;}
        if(x > maxX){maxX = x;}
        if(x < minX){minX = x;}
        if(y > maxY){maxY = y;}
        if(y < minY){minY = y;}
    }

    // Sets the price of a journey
    public int calculateTravelPrice(){
        price = 12 + (maxX - minX + maxY - minY) * 3;
        if(50 < this.price) {this.price = 50;} 
        return price;
    }
}