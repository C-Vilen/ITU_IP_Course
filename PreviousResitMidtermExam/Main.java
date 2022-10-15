public class Main {

    public static void main(String[] args) throws Exception {
        
        // New boxes
        Box toys = new Box(1, "Toys");
        Box clothing = new Box(2, "Clothing");

        // New robot
        Robot bot = new Robot();

        // Add boxes to transfer list
        bot.addToTransferList(toys);
        bot.addToTransferList(clothing);

        // Print the transfer list
        bot.printTransferList();

        // Move a box forward one step
        bot.moveForward(clothing, 1);

        // Print the transfer list to see changes
        bot.printTransferList();

        // Move a box forward beyond its destination
        bot.moveForward(clothing, 5);

        // Check to see that the box stopped at its destination
        bot.printTransferList();

        // Add a box to the priority list with priority 1
        bot.setLabelPriority(toys, 1);

        // Print out the priority of the box in the priority list
        System.out.println(bot.getBoxPriority(toys));

        // Print out the priority of a box that is not in the priority list
        System.out.println(bot.getBoxPriority(clothing));

    }
}
