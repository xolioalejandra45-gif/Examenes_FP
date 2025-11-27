package eva2_examen_25550473;

import java.util.Scanner;

public class Eva2_Examen_25550473 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, divisor = 0, i, j;
        Boolean numero;
        
        System.out.println("Ingrese un número entero");
        num = input.nextInt();
        System.out.println("¿Desea imprimir números primos (true) o no primos (false)?");
        numero = input.nextBoolean();{
        if (numero == true){
            for(i = 3; i<= num; i+=2){
            for(j = 1; j<= i ; j++ ) {
                System.out.print("*");
            }
            System.out.println(i);
            }
            }    
        else{
            for(i = 2; i<= num; i+=2){
            for(j = 1; j<= i ; j++ ) {
                System.out.print("*");
            }
            System.out.println(i);
            }
        }
        
        }
        
    }
}
