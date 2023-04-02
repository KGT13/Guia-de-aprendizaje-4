import java.util.Scanner;
public class Ej_6_2{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
double cuadrado = 2;
double num=0;


for(;num != 42;){
    System.out.println("Introduzca un número: ");
 num = entrada.nextDouble();

System.out.println("El cuadrado de el número es "+ Math.pow(num, cuadrado));


}


    }
}