/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
 
 package MIO;

import java.util.Scanner;

/**
  *
  * @author Juan Antonio
  */
 
  public class calculadora {
    static int opcion = 0, num1, num2;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (opcion != 6) {
            menu();
            switch(opcion){
                case 1:{
                    colocar();
                }
                case 2:{
                    System.out.println("La suma de "+num1+" + "+num2+" es :" + sumar(num1, num2));
                    System.out.println(" ");
                }
                case 3:{
                    System.out.println("La resta de "+num1+" - "+num2+" es :" + restar(num1, num2));
                    System.out.println(" ");
                }
                case 4:{
                    System.out.println("La multiplicacion de "+num1+" * "+num2+" es :" + multiplicar(num1, num2));
                    System.out.println(" ");
                }
                case 5:{
                    System.out.println("La division de "+num1+" / "+num2+" es :" + dividir(num1, num2));
                    System.out.println(" ");
                }
            }
        }
    }

    public static void menu() {
        System.out.println("-------CALCULADORA-------");
        System.out.println("1. Colocar numeros");
        System.out.println("2. Sumar");
        System.out.println("3. Restar");
        System.out.println("4. Multiplicar");
        System.out.println("5. Dividir");
        System.out.println("6. Salir");
        System.out.println("-------------------------");
        System.out.println("Elige una opcion: ");
        opcion = sc.nextInt();
    }
    public static void  colocar() {
        System.out.println("Introduce el primer numero: ");
        num1 = sc.nextInt();
        System.out.println("Introduce el segundo numero: ");
        num2 = sc.nextInt();
    }
    public static int sumar(int a, int b) {
        return a + b;
    }
    public static int restar(int a, int b) {
        return a - b;
    }
    public static int multiplicar(int a, int b) {
        return a * b;
    }
    public static int dividir(int a, int b) {
        return a / b;
    }
}