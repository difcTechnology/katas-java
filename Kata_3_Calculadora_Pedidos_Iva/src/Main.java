import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double precio= 0;
        double subtotal= 0;
        double iva= 0;
        double total= 0;
        double descuento= 0;

        System.out.print("Ingrese el precio del producto (Si no hay mas productos ingrese 0): ");
        precio= scanner.nextDouble();

        while(precio!=0 && precio>0){
            subtotal= subtotal+precio;
            System.out.print("Ingresa el precio del otro producto (Si no hay mas productos ingrese 0): ");
            precio = scanner.nextDouble();
        }
        iva= subtotal*0.19;
        total= subtotal+iva;

        if(total>50000){
            descuento= total*0.10;
            total= total-descuento;

            System.out.println("El subtotal es: $" + subtotal);
            System.out.println("El iva es: $" + iva);
            System.out.println("El descuento es: $" + descuento);
            System.out.println("El total es: $" + total);
        }else{
            System.out.println("El subtotal es: $" + subtotal);
            System.out.println("El iva es: $" + iva);
            System.out.println("El total es: $" + total);
        }
        scanner.close();
    }
}