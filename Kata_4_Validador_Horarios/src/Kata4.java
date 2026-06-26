import java.util.Scanner;

public class Kata4 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int dia= 0;
        int hora= 0;

        System.out.print("Ingresa El dia de la semana:\n1: Lunes\n2: Martes\n3: Miercoles\n4: Jueves\n5: Viernes\n6: Sabado\n7: Domingo\n");
        dia= scanner.nextInt();

        System.out.print("Ingrese la hora (0-23): ");
        hora= scanner.nextInt();

        switch(dia){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                if(hora >= 6 && hora < 20){
                    System.out.println("Abierto.");
                }else{
                    System.out.println("Cerrado.");
                }
                System.out.print("Horario de lunes a viernes de 6:00 AM a 8:00 PM");
                break;
            case 6:
                if (hora >= 7 && hora <= 14) {
                    System.out.println("Abierto.");
                } else {
                    System.out.println("Cerrado.");
                }
                System.out.println("Horario de sábado: 7:00 AM - 2:00 PM");
                break;
            case 7:
                System.out.println("Cerrado");
                System.out.println("Los domingos no hay atencion");
                break;
            default:
                System.out.println("Dia Invalido");
        }
        scanner.close();
    }
}