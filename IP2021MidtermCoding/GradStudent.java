// Define class GradStudent, a subclass of Student
public class GradStudent extends StudentMidterm {

    // Fields unique to Grad Students
    private int maxLabs;
    private int currentLabs;

    // Grad Student constructor
    public GradStudent(String name) {

        // Pass name to superclass constuctor
        // (a name is required for the superclass)
        super(name);

        maxLabs = 3; // Grad Students cannot be assigned to more that 3 labs
        currentLabs = 0; // Number of labs when the Grad Student is first created
    }

    // Override signUp() method of the superclass
    @Override
    public boolean signUp(Lab lab) {

        // Implement check for max number of labs
        if (currentLabs < maxLabs) {

            // Use superclass method to sign up and save result (a boolean)
            boolean success = super.signUp(lab);

            // If signup succeeded, increment number of labs and return true
            if (success) {
                currentLabs++;
                return true;
            }
        }

        return false;
    }

    // Override signOff() method of the superclass
    @Override
    public boolean signOff(Lab lab) {

        // Use superclass method to sign off and save result (a boolean)
        boolean succes = super.signOff(lab);

        // If signoff succeeded, decrement number of labs and return true
        if (succes) {
            currentLabs--;
            return true;
        }

        return false;
    }
}