import java.util.Scanner;


public class Ej_6_3{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Inserte el rango [a,b]:");
        int a = entrada.nextInt();
        int b = entrada.nextInt();
        int contador = 0;
    

        while(a<=b){
            a +=1;
             
                if(a%10 == 2||a%10== 3||a%10==6) {
                    contador ++;

                    
                }
            }
            System.out.println("La cantidad de números que terminan en 2, 3 o 6 es "+contador);

               }
        
        
    }


    
