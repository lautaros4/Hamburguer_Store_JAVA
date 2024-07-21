import java.util.ArrayList;
import java.util.List;

public class BurgerJoint {

    private List<Product> productCart;

    public BurgerJoint() {
        productCart = new ArrayList<>();
    }

    public void addProduct(String code){
        productCart.add(ProductFactory.getInstance().generateProduct(code));
    }

    public Double calculateCartPrice(){
        Double finalprice = 0.0;
        for (Product product : productCart) { 
            finalprice += product.calculatePrice();
        }
        return finalprice;
    }
}
