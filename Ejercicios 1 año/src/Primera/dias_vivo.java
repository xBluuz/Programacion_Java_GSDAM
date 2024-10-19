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
 
 public class dias_vivo {
 
     /**
      * @param args the command line arguments
      */
     public static void main(String[] args) {
        int edad = 0, resultado;
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime en que año naciste: ");
        edad = sc.nextInt();

        resultado = (2024 - edad) * 365;
        System.out.println("Has vivido " + resultado + " dias");
     }
 }