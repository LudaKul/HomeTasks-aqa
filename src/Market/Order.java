package Market;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderId;
    private User orderByUser;
    private List<Product> products;

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public User getOrderByUser() {
        return orderByUser;
    }

    public void setOrderByUser(User orderByUser) {
        this.orderByUser = orderByUser;
    }

    public Order (int orderID, User orderByUser){
        this.orderId = orderID;
        this.orderByUser = orderByUser;
        this.products = new ArrayList<>();


    }

}
