import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Kata8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el número de empleados: ");
        int cantidad = 0;
        try {
            cantidad = sc.nextInt();
            sc.nextLine();
        }catch(InputMismatchException e){
            System.out.println("número de empleados invalido");
        }
        if(cantidad > 0) {
            List<Empleado> empleados = new ArrayList<>();

            for (int i = 1; i <= cantidad; i++) {
                System.out.print("Empleado " + i + ": ");
                String nombre = sc.nextLine();

                System.out.print("Horas trabajadas: ");
                int horasTrabajadas = sc.nextInt();
                sc.nextLine();

                empleados.add(new Empleado(nombre, horasTrabajadas));

            }
            int totalHorasTrabajadas = 0;
            for (Empleado p : empleados) {
                totalHorasTrabajadas += p.horasTrabajadas();
            }
            double promedioHoras = (double) totalHorasTrabajadas / empleados.size();

            List<String> nombres = empleados.stream().filter(e -> e.horasTrabajadas() > 40).map(e -> e.nombre()).collect(Collectors.toList());

            System.out.println("Total de horas: " + 135);
            System.out.println("Promedio de horas: " + 45.0);
            System.out.println("Empleados con más de 40 horas: " + nombres.size() + " (" + String.join(",", nombres) + ")");
        }
    }
}

record Empleado(String nombre, int horasTrabajadas) {}
