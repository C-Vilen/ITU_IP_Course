package ItemAndStoreMidterm;
// 1
public class Item {
    private String kind;
    private String color;
    private int price;
    
    public Item(String kind, String color, int price) {
        this.kind = kind;
        this.color = color;
        this.price = price;
    }

    // 2
    public String getKind() {
        return kind;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }
    
    // 3
    public void setPrice(int price) {
        this.price = price;
    }

    // 4
    public boolean compare(Item i) {
        return price == i.getPrice() &&
               kind.equals(i.getKind()) &&
               color.equals(i.getColor());
    }
}
