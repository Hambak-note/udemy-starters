package week4.day2.field_lecture.question2.test;

public class Product extends Information{

    private int price;

    public Product(String id, String name, int price) {
        super(id, name);
        this.price = price;
    }

    @Override
    String print() {
        return super.print()+":"+this.price;
    }
}
