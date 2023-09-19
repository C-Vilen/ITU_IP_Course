public class Message {

    private User receiver;
    private String text;

    public Message(User receiver, String text) {
        this.receiver = receiver;
        this.text = text;
    }

    public User getReceiver() {
        return receiver;
    }

    public String getText() {
        return text;
    }
}
