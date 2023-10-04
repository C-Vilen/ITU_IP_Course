public class ExpensesMain {
    public static void main(String[] args) {
        Invoice i1 = new Invoice(100, 1, 1, "A");
        Invoice i2 = new Invoice(200, 1, 2, "B");
        Invoice i3 = new Invoice(300, 2, 1, "A");
        ExpensesTracker tracker = new ExpensesTracker(800);
        tracker.addInvoice(i1);
        tracker.addInvoice(i2);
        tracker.addInvoice(i3);
        tracker.listYearlySavings();        
    }
}
