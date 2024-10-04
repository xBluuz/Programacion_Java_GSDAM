/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */10
import java.util.Scanner;

/**
 *
 * @author Juan Antonio
 */
public class Primeras_Operaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numero1;
        int numero2;
        
        numero1 = 10;
        numero2 = 550;
        
        System.out.println("Suma: " + (numero1 + numero2));
        Scanner objeto_scanner = new Scanner(System.in);
        
        System.out.println("Escribe el Primer numero: ");  
        numero1 = objeto_scanner.nextInt();
        System.out.println("Escribe el segundo numero: ");
        numero2 = objeto_scanner.nextInt();
        System.out.println("Suma: " + (numero1 + numero2));
    }
    
}
