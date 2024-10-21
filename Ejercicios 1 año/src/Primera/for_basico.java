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
 
 public class for_basico {
 
     /**
      * @param args the command line arguments
      */
     public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Caramelo");
        }

        System.out.println("");
        for (int i = 0; i < 63; i++) {
            System.out.println(i);
        }

        System.out.println("");
        for (int i = 63; i > 0; i--) {
            System.out.println(i);
        }

        System.out.println("");
        for (int i = 1; i < 80; i+=2) {
            System.out.println(i);
        }

        System.out.println("");
        int factorial = 1; // LAS VARIABLES NUNCA PUEDEN ESTAR DENTRO DEL BOCLE
        for (int x = 1; x <= 7 ; x++){
            factorial = (factorial * x);
        }

        System.out.println("El factorial de 7 es: " + factorial);
        System.out.println("");
        for (int i = 0 ; i <= 20 ; i+=2){
            if (i == 6 || i == 8){
                System.out.println("Ausente");
            }else{
                System.out.println(i);
            }
        }

        System.out.println("");
        int contador = 0;
        boolean continuar;
        Scanner sc = new Scanner(System.in);
        for (int i = 500; i >400 ; i--){
            if ( i == 460 || i == 440){
               System.out.println("");
            }else{
                System.out.println(i);
            }
            contador++;
            if (contador == 10){
                System.out.println("Deseas continuar? (true/false)");
                continuar = sc.nextBoolean();
                if (continuar == false){
                    i = 399;
            }else{
                contador = 0;
            }}
        }
     }
 }