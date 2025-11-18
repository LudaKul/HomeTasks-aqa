package Market;

public class Product {
    private int idProduct;
    private String name;
    private int count;
    private String store;
    private double price;

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    public Product(int idProduct, String name, int count, String store, double price) {
        this.idProduct = idProduct;
        this.name = name;
        this.count = count;
        this.store = store;
        this.price = price;

    }


}
