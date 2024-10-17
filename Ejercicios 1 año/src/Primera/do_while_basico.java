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
 
 public class do_while_basico {
 
     /**
      * @param args the command line arguments
      */
     public static void main(String[] args) {
        int num = 0, suma = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introdice un número: ");
        num = teclado.nextInt();

        suma = suma + num + (num -1);

        do { 
            num = num -1;
            suma = suma + (num-1);
        } while (num != 1);

        System.out.println("La suma de los números es: " + suma);
     }
 }