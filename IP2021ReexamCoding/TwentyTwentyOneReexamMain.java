package IP2021ReexamCoding;

public class TwentyTwentyOneReexamMain {
    public static void main(String[] args) {
        User user = new User(1);
        RegUser regUser = new RegUser(2, 3);
        RegUser regUser2 = new RegUser(2, 3);

        user.setIP("111234.101.12.01");
        System.out.println("User IP: " + user.getUserIP());
        System.out.println("User level: " + user.getLevel() + "\n");

        regUser.setIP("99.111.9999.");
        System.out.println("RegUser IP: " + regUser.getUserIP());
        System.out.println("RegUser level: " + regUser.getLevel());
        System.out.println("RegUser region: " + regUser.getRegion() + "\n");

        regUser.setIP("99.111.12.01");
        System.out.println("RegUser IP: " + regUser.getUserIP());
        System.out.println("RegUser level: " + regUser.getLevel());
        System.out.println("RegUser region: " + regUser.getRegion() + "\n");

        regUser2.setIP("993.342.111234.01");
        System.out.println("regUser2 IP: " + regUser2.getUserIP());
        System.out.println("regUser2 level: " + regUser2.getLevel());
        System.out.println("regUser2 region: " + regUser2.getRegion() + "\n");

        regUser.setIP("993.342.12.01");
        System.out.println("RegUser IP: " + regUser.getUserIP());
        System.out.println("RegUser level: " + regUser.getLevel());
        System.out.println("RegUser region: " + regUser.getRegion() + "\n");

        
    }
}