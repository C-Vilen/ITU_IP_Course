package MessageAndUser;

public class MainMessageAndUser {
    public static void main(String[] args) {
        User user1 = new User();
        User user2 = new User();
        Message msg1 = new Message(user1, "Hello!");
        Message msg2 = new Message(user2, "Hi!");
        Message msg3 = new Message(user1, "How are you?");
        Message msg4 = new Message(user2, "Fine, thanks!");
        Message msg5 = new Message(user1, "Bye!");
        Message msg6 = new Message(user2, "Bye!");
        user1.sendMessage(msg1);
        user2.sendMessage(msg2);
        user1.sendMessage(msg3);
        user2.sendMessage(msg4);
        user1.sendMessage(msg5);
        user2.sendMessage(msg6);
        System.out.println(user1.readMessage());
        System.out.println(user2.readMessage());
        System.out.println(user1.readMessage());
        System.out.println(user2.readMessage());
        System.out.println(user1.readMessage());
        System.out.println(user2.readMessage());
    }
}
