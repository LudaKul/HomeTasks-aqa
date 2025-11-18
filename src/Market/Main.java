package Market;

public class Main {

    public static void main(String[] args) {
        MarketService marketServiceStore = new MarketService();
        marketServiceStore.addStore("Nokia");
        marketServiceStore.addStore("FashionStore");
        marketServiceStore.addStore("ElectroWorld");
        marketServiceStore.addStore("HomeMarket");
        marketServiceStore.addStore("SportLife");


        marketServiceStore.addProductToCatalog(new Product(1, "Headphones", 100, "Nokia", 20.50));
        marketServiceStore.addProductToCatalog(new Product(2, "Lamp", 300, "FashionStore", 12.50));
        marketServiceStore.addProductToCatalog(new Product(3, "Blender", 600, "FashionStore", 42.50));
        marketServiceStore.addProductToCatalog(new Product(4, "Chair", 200, "FashionStore", 72.50));
        marketServiceStore.addProductToCatalog(new Product(5, "Cleaner", 800, "FashionStore", 250.50));
        marketServiceStore.addProductToCatalog(new Product(6, "Glasses", 200, "FashionStore", 33.50));
        marketServiceStore.addProductToCatalog(new Product(7, "Watches", 400, "ElectroWorld", 30.50));
        marketServiceStore.addProductToCatalog(new Product(8, "T-Shirt", 1800, "SportLife", 15.50));
        marketServiceStore.addProductToCatalog(new Product(9, "Sneakers", 2800, "FashionStore", 0.50));
        marketServiceStore.addProductToCatalog(new Product(10, "Dress", 3800, "Nokia", 50.50));

        marketServiceStore.printAllProducts();

        String[] listOfStores = {"HomeMarket", "HomeMarket", "ElectroWorld", "FashionStore", "SportLife"};
        Object[][] productNeedToSort = {
                {11, "Dish"}, {12, "TablesPro"}, {13, "Tables"},
                {14, "Cabinets"}, {15, "cabinetsPro"}
        };

        addProductToStore(marketServiceStore, productNeedToSort, listOfStores);

        marketServiceStore.printAllProducts();

        Product foundProduct = marketServiceStore.findProductById(10);
        System.out.println(marketServiceStore.findProductById(10).getName());
    }

    public static void addProductToStore(MarketService service, Object[][] products, String[] stores) {
        for (int i = 0; i < products.length; i++) {
            Object[] productData = products[i];
            int id = (Integer) productData[0];
            String name = (String) productData[1];
            String storeName = stores[i];
            service.addProductToCatalog(new Product(id, name, 100, storeName, 50.0));
            System.out.println("Добавляем: " + name + " (ID: " + id + ") в магазин: " + storeName);
        }
    }


}




