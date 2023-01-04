package IP2021ReexamCoding;

public class TwentyTwentyOneReexamMain {
    public static void main(String[] args) {
        User user = new User(1);
        RegUser regUser = new RegUser(2, 3);

        user.setIP("99.342.12.01");
        System.out.println("User IP: " + user.getUserIP());
        System.out.println("User level: " + user.getLevel());

        regUser.setIP("99.111.9999.");
        System.out.println("RegUser IP: " + regUser.getUserIP());
        System.out.println("RegUser level: " + regUser.getLevel());
        System.out.println("RegUser region: " + regUser.getRegion());

        regUser.setIP("111.101.12.01");
        System.out.println("RegUser IP: " + regUser.getUserIP());
        System.out.println("RegUser level: " + regUser.getLevel());
        System.out.println("RegUser region: " + regUser.getRegion());

        regUser.setIP("993.342.12.01");
        System.out.println("RegUser IP: " + regUser.getUserIP());
        System.out.println("RegUser level: " + regUser.getLevel());
        System.out.println("RegUser region: " + regUser.getRegion());
    }
}