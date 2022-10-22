import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ShoppingBasket {
    private List<SaleItem> saleItems;
    private Map<SaleItem, Integer> saleItemCount;
    private boolean finalized;
    
    public ShoppingBasket(){
        saleItems = new ArrayList<>();
        saleItemCount = new HashMap<>();
        finalized = false;
    }

    public void addItem(SaleItem saleItem) throws InvalidPurchase{
        if (finalized) {
            throw new InvalidPurchase("Purchase has been finalized");
        }
        else {
            saleItems.add(saleItem);
        }
    }

    public int totalCost(){
        int totalCost = 0;
        for (SaleItem saleItem : saleItems) {
            totalCost += saleItem.getPrice();
        }
        return totalCost;
    }

    public void createCount(){
        for (SaleItem saleItem : saleItems) {
            if (saleItemCount.containsKey(saleItem)) {
                saleItemCount.replace(saleItem, saleItemCount.get(saleItem) + 1);
            }
            else {
                saleItemCount.put(saleItem, 1);
            }
        }
    }

    public boolean checkStock(){
        createCount();
        for (SaleItem saleItem : saleItems) {
            if ( !saleItem.checkStock(saleItemCount.get(saleItem))) {
                return false;
            }
        }
        return true;
    }

    public void finalizePurchase() throws OutOfStock{
        if (checkStock() && !finalized) {
            for (SaleItem saleItem : saleItemCount.keySet()) {
                saleItem.removeFromStock(saleItemCount.get(saleItem));
                finalized = true;
            }
        }
        else if (finalized) System.out.println("Purchase cannot be finlized more than once");

        else throw new OutOfStock("OutOfStockException, purchase cannot be checked-out.");
    }

    public List<SaleItem> sortSaleItems(){
        List<SaleItem> sortedItem = saleItems.stream()
        .sorted(Comparator.comparing(SaleItem::getCategory)
        .thenComparing(SaleItem::getName))
        .collect(Collectors.toList());
        return sortedItem;
    }

    public double totalPrice(){
        double total = 0;
        for (SaleItem saleItem : saleItems) {
            total += saleItem.getPrice();
        }
        return total;
    }

    public void printReceipt() throws OutOfStock{
        finalizePurchase();
        for (SaleItem saleItem : sortSaleItems()) {
            String output = "";
            output += saleItem.getName() + " $" + saleItem.getPrice();
            System.out.println(output);
        }
        System.out.println("Total: $" + totalCost());
    }
}