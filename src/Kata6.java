import java.util.Scanner;

public class Kata6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int horaUsuario = 0;
        int clientesHora;

        int totalClientes = 0;
        int contadorHoras = 0;

        int horaMayorClientes = 0;
        int mayorClientes = 0;

        while (horaUsuario != -1) {

            System.out.print("Ingrese la hora (0-23, -1 para terminar): ");
            horaUsuario = sc.nextInt();

            if (horaUsuario == -1) {
                break;
            }

            System.out.print("Ingrese el número de clientes en esa hora: ");
            clientesHora = sc.nextInt();

            totalClientes = totalClientes + clientesHora;
            contadorHoras++;

            if (clientesHora > mayorClientes) {
                mayorClientes = clientesHora;
                horaMayorClientes = horaUsuario;
            }
        }

        System.out.println("----- Reporte de Clientes -----");
        System.out.println("Total de clientes: " + totalClientes);

        if (contadorHoras > 0) {
            double promedio = (double) totalClientes / contadorHoras;
            System.out.println("Promedio de clientes por hora: " + promedio);
            System.out.println("Hora con más clientes: " + horaMayorClientes +
                    " (" + mayorClientes + " clientes)");
        } else {
            System.out.println("No se ingresaron datos.");
        }

        sc.close();
    }
}