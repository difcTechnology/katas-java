
import java.util.Scanner;

public class Kata5  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        int totalPedido = 0;

        while (opcion != 6) {
            System.out.println("========== MENÚ DE LA CAFETERÍA ==========");
            System.out.println("1. Café ($4.000)");
            System.out.println("2. Muffin ($3.500)");
            System.out.println("3. Sandwich ($7.500)");
            System.out.println("4. Jugo ($5.000)");
            System.out.println("5. Té ($3.000)");
            System.out.println("6. Salir");
            System.out.println("==========================================");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Has escogido el cafe con un precio de $4.000 pesos" );
                    totalPedido = totalPedido + 4000;
                break;
                case 2:
                    System.out.println("Has escogido el muffin con un precio de $3.500 pesos");
                    totalPedido = totalPedido + 3500;
                break;
                case 3:
                    System.out.println("Has escogido el sandwich con un precio de $7.500 pesos");
                    totalPedido = totalPedido + 7500;
                    break;
                case 4:
                    System.out.println("Has escogido el jugo con un precio de $5.000 pesos");
                    totalPedido = totalPedido + 5000;
                    break;
                case 5:
                    System.out.println("Has escogido el té con un precio de $3.000 pesos");
                    totalPedido = totalPedido + 3000;
                    break;
                case 6:
                    System.out.println("Que tengas un muy buen día");
                    break;
                default:
                    System.out.println("Por favor escoge una opcion valida");
                    break;

        }
        }
        System.out.println("==========================================");
        System.out.println("Muchas gracias por su visita.");
        System.out.println("Total del pedido: $" + totalPedido);
    }
}