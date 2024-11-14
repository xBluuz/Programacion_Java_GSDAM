package Objetos.EJ1;

import java.util.Scanner;

public class CuentaBancaria {
    public static void main(String[] args) {
        
        int opcion = 0;
        Scanner sc = new Scanner(System.in);
        Cuenta CuentaBancaria = new Cuenta("Juan Antonio", 1500, "71234329234");

        do{
            menu();
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:{
                    CuentaBancaria.Depositar();
                    System.out.println("");
                    break;
                }
                case 2:{
                    CuentaBancaria.Retirar();
                    break;
                }
                case 3:{
                    CuentaBancaria.VerSaldo();
                    break;
                }
                default:{
                    System.out.println("Opcion no valida");
                }
            }

        }while(opcion!=5);
    }

    public static void menu(){
        System.out.println("-----Menu Banco------");
        System.out.println("1. Depositar");
        System.out.println("2. Retirar");
        System.out.println("3. Ver Saldo");
        System.out.println("---------------------");
        System.out.println("4. Salir");
    }
}
