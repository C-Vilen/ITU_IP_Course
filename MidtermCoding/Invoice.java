public class Invoice{
    private int amount;
    private int month;
    private int day;
    private String payee;

    public Invoice(int amount, int month, int day, String payee) {
        this.amount = amount;
        this.month = month;
        this.day = day;
        this.payee = payee;
    }
    
    // 2
    public void printInvoice(){
        System.out.println("amount:"+amount+", month:"+month+", day:"+day+", payee:"+payee);
    }

    // 3
    public int getAmount() {
        return amount;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public String getPayee() {
        return payee;
    }
}
