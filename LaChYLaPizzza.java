
package renizaej;
import java.util.Scanner;

public class LaChYLaPizzza {
    public static void main(String[] args) {
        double cantidad;
        try (Scanner dinero = new Scanner (System.in)) {
            System.out.println("Dime la cantidad en pesos");
            cantidad = dinero.nextInt();
        }
        double convdoll = (double) (cantidad*17.13);
        double conveur = (double) (cantidad*18.27);
        System.out.println("De pesos a dolares es: "+convdoll + " De pesos a euros es: "+conveur);
    }
   
}
