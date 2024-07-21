//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    BurgerJoint pedido1 = new BurgerJoint();

    pedido1.addProduct("Hamburguer");
    pedido1.addProduct("Fries");
    pedido1.addProduct("Soda");
    System.out.println("Total price is " + pedido1.calculateCartPrice());
    pedido1.addProduct("Combo 1");
    System.out.println("Total price is " + pedido1.calculateCartPrice());



    }
}