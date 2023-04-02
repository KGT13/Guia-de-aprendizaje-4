import java.util.Scanner;

public class Ej_1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
System.out.println("***Cuenta Regresiva***");
System.out.println("Introduzca el número de segundos :");
 int tiempo =entrada.nextInt();

 for (int i = tiempo;i>=0; i--){
    System.out.println(i+" segundos...");

 }           

        
    }
    
}
