package MIO;

import java.util.Scanner;

public class Repaso1 {
    
    static Scanner sc = new Scanner(System.in);
    static int opcion = 0;
    
    public static void main(String[] args) {
        
        do{
            menu();
            switch (opcion){
                case 1:{
                    Ejercicio1();
                    break;
                }
                case 6:{
                    System.out.println("Saliendo del programa.......");
                    break;
                }
            }
        }while(opcion !=6);
    }

    public static void menu(){
        System.out.println("---------MENU---------");
        System.out.println("1. Ejericio 1");
        System.out.println("----------------------");
        System.out.println("6. Salir");
        System.out.println("----------------------");
        opcion = sc.nextInt();
    }
    
      //Crea un programa que tenga un array de temperaturas en grados Celsius (5 valores).
    //Escribe una función que reciba este array y devuelva otro array con las temperaturas convertidas a Fahrenheit.
    //Muestra ambos arrays en consola (Celsius y Fahrenheit).

    public static void Ejercicio1(){
        int[] Celsius = new int[5];

        for (int i=0;i<Celsius.length;i++){
            Celsius[i] = (int)Math.round(Math.random()*20+30);
        }

        for (int i=0;i<Celsius.length;i++){
            System.out.println("El "+(i+1)+" grado Celsius es: "+Celsius[i]);
        }
        System.out.println("");
        Pasar_C_a_F(Celsius);
        System.out.println("");
    }

    public static void Pasar_C_a_F(int[] Celsius){
        for (int i=0;i<Celsius.length;i++){
            Celsius[i] = (Celsius[i] * 9 / 5) + 32;
        }

        for (int i=0;i<Celsius.length;i++){
            System.out.println("El "+(i+1)+"grado Fahrenheit es: "+Celsius[i]);
        }
    }


}
