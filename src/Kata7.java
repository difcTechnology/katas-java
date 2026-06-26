import java.util.Scanner;

public class Kata7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String respuesta="N";
        double suma = 0;
        do {
            System.out.print("Ingrese el precio del producto : ");
            double precio = sc.nextDouble();

            System.out.print("Ingrese la cantidad : ");
            int cantidad = sc.nextInt();

            double porcentaje = switch (cantidad) {
                case 1, 2 -> 0;
                case 3, 4, 5 -> 0.05;
                case 6, 7, 8, 9, 10 -> 0.10;
                default -> 0.15;
            };
            double subtotal = precio * cantidad;
            double descuento = subtotal*(porcentaje);
            double IVA = (subtotal-descuento)*0.19;
            double total = subtotal - descuento + IVA;
            System.out.printf("Subtotoal : %.0f%n",subtotal);
            System.out.printf("Descuento (%.0f%%): %.0f%n", (porcentaje*100),descuento);
            System.out.printf("IVA (19%%): $%.0f%n",IVA);
            System.out.println(total);
            suma +=total;
            respuesta=sc.next();
        }while(respuesta.equalsIgnoreCase("S"));
        System.out.printf("Total de la compra: $%.0f%n",suma);

    }
}
