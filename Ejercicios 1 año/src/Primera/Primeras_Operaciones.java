

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
public class Primeras_Operaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double numero1;
        double numero2;
        
  
        Scanner objeto_scanner = new Scanner(System.in);
        
        System.out.println("Escribe el Primer numero con decimales: ");  
        numero1 = objeto_scanner.nextDouble();
        System.out.println("Escribe el segundo numero con decumales: ");
        numero2 = objeto_scanner.nextDouble();
        System.out.println("Miltiplicacion: " + (numero1 * numero2));
    }
    
}
