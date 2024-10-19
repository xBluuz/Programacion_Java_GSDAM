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
 
 public class tabla_multiplicar {
 
     /**
      * @param args the command line arguments
      */
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Introduce un número de la tabla: ");
        num = sc.nextInt();

        System.out.println("Tabla del " + num);
        System.out.println("--------------");
        for (int i=0;i<=10;i++){
            System.out.println(num + " x " + i + " = " + num*i);
        }
     }
 }