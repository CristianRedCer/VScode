import java.util.Scanner;
public class HolaMundo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
         int a, b, c,d; 
        System.out.println("hola mundo");
        System.out.println("Ingrese un valor que quieras sumar y restar(Tiene que ser este el mayor de los 2): ");
        a = teclado.nextInt();
        System.out.println("Ingrese otro valor que quieras sumar y restar: ");
        b = teclado.nextInt();
        teclado.nextLine();
        c = a + b;
        d = a - b;
        System.out.println("La suma de " + a + " y " + b + " es: " + c);
        System.out.println("La resta de " + a + " y " + b + " es: " + d);
    }
    
}