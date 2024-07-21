import java.util.ArrayList;
import java.util.List;

public class ProductComposite extends Product {

    private List<Product> productList;
    private Double discount;

    public ProductComposite(String name, Double discount) {
        super(name);
        this.discount = discount;
        productList = new ArrayList<>();
    }

    public void AddProduct(ProductSingle product){
        productList.add(product);
    }

    @Override
    public Double calculatePrice() {
        Double FinalPrice = 0.0;
        for (Product product : productList) {
            FinalPrice += product.calculatePrice();
        }
        Double Finaldiscountprice = FinalPrice - FinalPrice*discount;
        return Finaldiscountprice;
    }
}
