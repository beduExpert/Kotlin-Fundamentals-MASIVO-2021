public abstract class Product {

    float price;
    String name;
    String sku;


    public Product(float price, String name, String sku ) {
        this.price = price;
        this.name = name;
        this.sku = sku;
    }

    public abstract float getTotalPrice(int quantity);
}