import java.util.Scanner;
public class Ej_6_5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Inserte el tamaño del lado del triángulo :");
        int x = entrada.nextInt();
        
        int i =0 ;
        while(i<x){
            int j = 0;
            while (j<=i) {
                System.out.print("*");
                j++;
                
            }
            System.out.println();
            i++;
        }
        
    }
    
    
}
