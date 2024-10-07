


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author Juan Antonio
 */
public class Booleano {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       boolean continuar;
       Scanner objeto_scanner = new Scanner(System.in);

       
        System.out.println("Deseas continuar");
        continuar = objeto_scanner.nextBoolean();
        
        if (continuar){
            System.out.println("Has elegido continuar");
        }else{
            System.out.println("No has elegido continuar");
        }
    }
    
}
