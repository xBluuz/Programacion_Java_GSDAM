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
 
     /**
      * @param args the command line arguments
      */
     public static void main(String[] args) {
        int num1, num2;
        String operacion;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el primer número: ");
        num1 = teclado.nextInt();
        System.out.println("Introduce el segundo número: ");
        num2 = teclado.nextInt();

        teclado.nextLine();

        System.out.println("Introduce la operación a realizar (+, -, *, /): ");
        operacion = teclado.nextLine();

        switch (operacion) { 
            case "+":{
                System.out.println("El resultado de " + num1 + " + " + num2 + " es " + (num1 + num2));
                break;
            }
            case "-":{
                System.out.println("El resultado de " + num1 + " - " + num2 + " es " + (num1 - num2));
                break;
            }
            case "*":{
                System.out.println("El resultado de " + num1 + " * " + num2 + " es " + (num1 * num2));
                break;
            }
            case "/":{
                    System.out.println("El resultado de " + num1 + " / " + num2 + " es " + (num1 / num2));
                    break;
            }
            default:{
                System.out.println("Operación no válida");
                break;
            }
        }
        teclado.close();
    }
}
