package week5.day4.question1;

public class Product {

    String name;
    int price;
    int inventory;

    public Product(String name, int price, int inventory) {
        this.name = name;
        this.price = price;
        this.inventory = inventory;
    }

    @Override
    public String toString() {
        return "상품명: " + name + " 가격: " + price + " 재고량: "+inventory+"\n";
    }
}
