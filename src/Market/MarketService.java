package Market;

import java.util.*;

public class MarketService {
    private Map<Integer, Product> productCatalog = new HashMap<>();
    private Set<String> stores = new HashSet<>();
    private List<Product> allProducts = new ArrayList<>();


public void addProductToCatalog(Product product) {
    productCatalog.put(product.getIdProduct(), product);
}

public Product findProductById(int id){
    return productCatalog.get(id);
}

public void removeProduct(int id){
    productCatalog.remove(id);
}

public void addStore(String storeName){
    stores.add(storeName);
}

public boolean containsStore(String storeName){
    return stores.contains(storeName);
}

    public void printAllProducts() {
        for (Product product : productCatalog.values()) {
            System.out.println(product.getName() + " - " + product.getStore() + " - " + product.getPrice());
        }
    }
    public void assignProductToStore(int productId, String storeName){
    Product product = findProductById(productId);
        if (product != null)
            product.setStore(storeName);

}
String[] listOfStores = {"HomeMarket", "HomeMarket", "ElectroWorld", "FashionStore", "SportLife"};

Object [][] productNeedToSort = {
        {11, "Dish"},
        {12, "TablesPro"},
        {13, "Tables"},
        {14, "Cabinets"},
        {15, "cabinetsPro"}
};

}



