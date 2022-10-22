public class SaleItem {
    private String name;
    private String category;
    private int princeInCents;
    private int stock;

    public SaleItem(String name, String category, int priceInCents, int stock){
        this.name = name;
        this.category = category;
        this.princeInCents = priceInCents;
        this.stock = stock;
    }

    public void setPrice(int price){
        princeInCents = price;
    }

    public int getPrice() {
        return princeInCents;
    }

    public String getName() {
        return name;
    }
    public String getCategory() {
        return category;
    }

    public boolean checkStock(int count){
        if (count <= stock) {
            return true;
        }
        else {
            return false;
        }
    }

    public void addToStock(int extra){
        stock += extra;
    }
    
    public void removeFromStock(int fewer){
        stock -= fewer;
    }

    public static void main(String[] args) throws Exception {
        SaleItem milk = new SaleItem("Milk", "2", 5, 5);
        SaleItem banana = new SaleItem("Banana", "2", 2, 10);
        SaleItem ham = new SaleItem("Ham", "2", 10, 2);
        milk.addToStock(1);
        System.out.println(milk.checkStock(2));
        
        ShoppingBasket shoppingBasket = new ShoppingBasket();
        shoppingBasket.addItem(milk);
        shoppingBasket.addItem(milk);
        shoppingBasket.addItem(banana);
        shoppingBasket.addItem(ham);
        shoppingBasket.addItem(ham);
        shoppingBasket.printReceipt();

        PrintTriangle.triangle(7);
        
    }
}
