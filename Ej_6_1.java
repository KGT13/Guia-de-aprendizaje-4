import java.util.Scanner;

public class Ej_6_1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
System.out.println("***Cuenta Regresiva***");
System.out.println("Introduzca el número de segundos :");
 int tiempo = entrada.nextInt();

 while (tiempo>=0){

        
        System.out.println(tiempo+" segundos...");
        tiempo--;
    
    

 }           

        
    }
    
}
