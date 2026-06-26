import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Kata2 {
    public static void main(String[] args) {
        Scanner informacion = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la bebida");
        String bebida = informacion.nextLine();

        System.out.println("Ingresa la temperatura de la bebida en grados Celsius");
        double bebidaTemperatura = informacion.nextDouble();

        String infoTemp = "";
        if ( bebidaTemperatura > 60){
            infoTemp = "Caliente";
        } else if ( bebidaTemperatura >= 30 && bebidaTemperatura <= 60 ) {
            infoTemp = "Templada";
        }else {
            infoTemp = "Fria";
        }
        System.out.println("nombre: " + bebida +  ", temperatura: " + bebidaTemperatura + " ----> " + infoTemp );
    }
}