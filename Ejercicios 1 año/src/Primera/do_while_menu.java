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
 
 public class do_while_menu {
 
     /**
      * @param args the command line arguments
      */
     public static void main(String[] args) {
        
        int opcion = 0;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("1. Muestra la fecha");
            System.out.println("2. Número aleatorio entre 50 y 100");
            System.out.println("3. Salir");
            System.out.println("--------------------------");
            System.out.print("Introduce una opción: ");
            opcion = sc.nextInt();

            switch(opcion){
                case 1:{
                    System.out.println("La fecha de hoy es: "+java.time.LocalDate.now());
                }
                case 2:{
                    System.out.println("Número aleatorio entre 50 y 100: "+(int)(Math.random()*50+50));//esto es un numero random este caso de 50 a 1002
                }
                default:{
                    System.out.println("Opción no válida");
                }
            }
        }while(opcion != 3);
     }
 }