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
        for (Product product : productCart) { // Usar Product clase abstracta acá hace que el dia de mañana pueda haber más tipos de productos y lo va a saber calcular sin tantos Ifs.
            finalprice += product.calculatePrice();
        }
        return finalprice;
    }
}
