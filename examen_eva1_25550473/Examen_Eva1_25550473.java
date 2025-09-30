package examen_eva1_25550473;

import java.util.Scanner;

public class Examen_Eva1_25550473 {
        final static String PIN = "1234";
    public static void main(String[] args) {
        String pin;
        int saldo = 5000;
        int usuario, monto;
      
        Scanner input = new Scanner(System.in);
        
        System.out.println("**********BIENVENIDO*********");
        System.out.println("CAJERO");
        System.out.println("PIN:");
        pin = input.nextLine();
        
        if(pin.equals(PIN)){
                System.out.println("Consultar saldo (1)");
                System.out.println("Retirar dinero (2)");
                System.out.println("Depositar dinero (3)");
                System.out.println("Elija una de las opciones: ");
                usuario = input.nextInt();
                if(usuario == 2){
                    System.out.println("Monto que desea retirar");
                    monto = input.nextInt();
                    if(monto <= saldo){
                    int retiro = saldo - monto;
                    System.out.println("Su saldo es de:" + retiro);
                    }
                    else{
                        System.out.println("Retiro no válido");
                    }
                }
                else if(usuario == 3){
                    System.out.println("Monto que desea depositar");
                    monto = input.nextInt();
                    if(monto >= 0){
                    int deposito = saldo + monto;
                    System.out.println("Su saldo es de:" + deposito);
                    }
                    else{
                        System.out.println("Los depositos no pueden ser negativos");
                    }
                }
                else if(usuario == 1){
                    System.out.println("Saldo");
                    System.out.println("Su saldo es de : " + saldo);
                }
                else{
                    System.out.println("No existe esa opción");
                }
            }else{
                System.out.println("Acceso denegado");
            }
    }
    
}
