public class GradStudent extends Student{
    private int maxLabs;
    private int currentLabs;

    public GradStudent(String name) {
        super(name);
        maxLabs = 3;
        currentLabs = 0;
    }

    @Override
    public boolean signUp(Lab lab) {

        if(currentLabs < maxLabs) {
            boolean success = super.signUp(lab);
            if (success) {
                currentLabs++;
                return true;
            }
        } 
        return false;
    }

    @Override
    public boolean signOff(Lab lab) {
        boolean success = super.signOff(lab);

        if(success) {
            currentLabs--;
            return true;
        }
        return false;
    }
}
