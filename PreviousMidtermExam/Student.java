public class Student {
    
    private String name;
    private int age;


    public Student(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean signUp(Lab lab) {
        // boolean success = lab.register(this);
        // return success;

        return lab.register(this);
    }


    public boolean signOff(Lab lab) {
        // boolean success = lab.remove(this);
        // return success;

        return lab.remove(this);
    }
}
