/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
 
 package Primera;

import java.util.Scanner;

 /**
  *
  * @author Juan Antonio
  */
 
 public class fibonacci {
 
     /**
      * @param args the command line arguments
      */
     public static void main(String[] args) {
        int a = 1, b = 0, c = 0, j;
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuantos numeros de serie de Fibonacci quieres?");
        j = sc.nextInt();

        for ( int i = a; i <= j; i++){
            c = a + b;
            a = b;
            b = c;
            System.out.println(c);
        }
     }
 }