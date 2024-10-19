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
 
 public class factorial {
 
     /**
      * @param args the command line arguments
      */
     public static void main(String[] args) {
        int usuario, factorial;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dime el numero para sacar el factorial: ");
        usuario = sc.nextInt();

        factorial = usuario;
        

        for (int x = 1; x <= (usuario-1) ; x++){
            factorial = factorial * x;  
        }
     
        if (factorial < 500 || factorial > 2000 && factorial < 10000){
            System.out.println("Gran factorial");
        }else{
            System.out.println(factorial);
        }
     }
 }