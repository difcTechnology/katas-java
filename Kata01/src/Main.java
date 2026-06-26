import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    // CALCULAR PROPINAS KATA 1:

    Scanner informacion = new Scanner(System.in);

    System.out.println("Ingresa el valor de la cuenta");
    double cuenta = informacion.nextDouble();

    System.out.println("Ingresa el porcentaje de la propina");
    double propina = informacion.nextDouble();
    double montoPropina = cuenta * (propina / 100);

    double totalCuenta = cuenta + montoPropina;

    if ( propina >= 30 ){
        System.out.println("¡¡Propina Generosa!!");
    } else if (propina <= 5) {
        System.out.println("Propina muy baja");
    } else {
        System.out.println("Propina normal");
    }

    System.out.println("Monto de la propina: " + montoPropina);
    System.out.println("Total a pagar: " + totalCuenta);
    }
}