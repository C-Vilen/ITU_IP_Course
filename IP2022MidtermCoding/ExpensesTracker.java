import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ExpensesTracker{  
    private int income;
    private List<Invoice> yearlyInvoices;

    // 5
    public ExpensesTracker(int income){
        this.income = income;
        yearlyInvoices = new ArrayList<>();
    }

    // 6 
    public void addInvoice(Invoice invoice) {
        yearlyInvoices.add(invoice);
    }

    // 7
    public int monthExpenses(int m) {
        int sum = 0;
        for (Invoice invoice : yearlyInvoices) {
            if(invoice.getMonth()==m) {
                sum += invoice.getAmount();
            }
        }
        return sum;
    }

    // 8
    public int monthSaving(int m) {
        return income - monthExpenses(m);
    }
   
    // 9
    public void readInvoice() {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int month = sc.nextInt();
        int amount = sc.nextInt();
        String payee = sc.next();
        addInvoice(new Invoice(amount, month, day, payee));
        sc.close();
    }

    // 10
    public void clearMonthInvoices(int m){
        Iterator<Invoice> it = yearlyInvoices.iterator();
        while (it.hasNext()){
            Invoice i = it.next();
            if(i.getMonth() == m) it.remove();
        }
    }   
    
    // 11 Use for loop to go over all elements and print the respective lines.
    public void listYearlySavings(){
        for(int m = 1; m <= 12; m++){
            int saving = monthSaving(m);
            if (saving <= 0){
                System.out.println("no saving in month " + m);
            } 
            System.out.println("the saved amount in month "+ m +" is "+ saving);
        }
    }

    //12
    public Map<String,Integer> payeeAmount(){
        Map<String,Integer> map = new HashMap<>();
        for (Invoice invoice : yearlyInvoices) {
            String payee = invoice.getPayee();
            int currentAmount = map.getOrDefault(payee, 0);
            map.put(payee, currentAmount + invoice.getAmount());
        }
        return map;
    }

    //alternative solution to payeeAmount() method
    public Map<String,Integer> payeeAmount2(){
        Map<String,Integer> map = new HashMap<>();
        for (Invoice invoice : yearlyInvoices) {
            String payee = invoice.getPayee();
            if(!map.containsKey(payee)) {
                map.put(payee, invoice.getAmount());                
            } else {
                int currentAmount = map.get(payee);
                map.put(payee, currentAmount + invoice.getAmount());
            }           
        }
        return map;
    } 
}