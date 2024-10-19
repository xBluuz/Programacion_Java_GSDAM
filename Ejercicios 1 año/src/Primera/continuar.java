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
 
 public class continuar {
 
     /**
      * @param args the command line arguments
      */
     public static void main(String[] args) {
        boolean continuar;
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 10; i++){
            System.out.println("Deseas continuar? (true/false)");
            continuar = sc.nextBoolean();

            if (continuar == false){
                i = 11;
            }else{
                System.out.println(i);
            }
        }
     }
 }