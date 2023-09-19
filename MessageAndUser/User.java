package MessageAndUser;
public class User {
    private Message[] inbox;
    private int messageCount;

    public User() {
        this.inbox = new Message[20];
        this.messageCount = 0;
    }
    
    public String addMessage(Message msg){
        if(this.messageCount < 20){
            inbox[messageCount++] = msg;
            return "Message is added!";
        } else {
            return "Sorry, the inbox is full!";
        }
    }

    public boolean sendMessage(Message msg){
        return (msg.getReceiver().addMessage(msg).equals("Message is added!"));
    }

    public String readMessage(){
        String txt = "";
        if(messageCount == 0){
            txt = "There is no message to read!";
        }
        else{
            txt = inbox[0].getText();
            messageCount--;
            for(int i = 0; i<messageCount;i++) inbox[i]=inbox[i+1];                
        }
        return txt;
    }
}
