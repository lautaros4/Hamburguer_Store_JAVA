public class ProductFactory {

    private static ProductFactory instance;

    private ProductFactory() {
    }

    public static ProductFactory getInstance(){
        if (instance == null){
            instance = new ProductFactory();
        }
        return instance;
    }

    public Product generateProduct(String code){
        switch (code){
            case "Hamburguer":
                return new ProductSingle("Hamburguer", 15.6);
            case "Fries":
                return new ProductSingle("Fries", 8.4);
            case "Soda":
                return new ProductSingle("Soda", 6.7);
            case "Combo 1":
                ProductComposite combo1 = new ProductComposite("Combo 1", 0.4);
                combo1.AddProduct(new ProductSingle("Hamburguer", 15.6));
                combo1.AddProduct(new ProductSingle("Fries", 8.4));
                combo1.AddProduct(new ProductSingle("Soda", 6.7));
                return combo1;
        }
        return null;
    }
}
