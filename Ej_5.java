import java.util.Scanner;
public class Ej_5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Inserte el tamaño del lado del triángulo :");
        int x = entrada.nextInt();
        
        for(int i = 0; i <= x; i++){
            for(int j = 0; j<= i; j++){
                System.out.print("*");

            }
            System.out.println();
            

        }
        
    }
    
    
}
