/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package diferencia_edad_si;
import java.util.Scanner;
/**
 *
 * @author Juan Antonio
 */
public class Diferencia_Edad_Si {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ZONA DE VARIABLES
        String nombre1 = "", nombre2 = null;
        int edad1 = 0, edad2 = 0; 

        //ZONA DE SCANNER
        Scanner objeto_scanner = new Scanner(System.in);

        //ZONA DE CODIGO
        System.out.println("Dime tu nombre: ");
        nombre1 = objeto_scanner.nextLine();
        System.out.println("Dime tu edad: ");
        edad1 = objeto_scanner.nextInt();
        objeto_scanner.nextLine(); // esto es para limpiar el buffer del scanner
        
        System.out.println("Dime tu nombre: ");
        nombre2 = objeto_scanner.nextLine();
        System.out.println("Dime tu edad: ");
        edad2 = objeto_scanner.nextInt();


        if (((edad1 - edad2) <= 10) && ((edad1 - edad2) >= -10)){
            System.out.println("Se Casan "+nombre1+" con "+nombre2);
        }else{
            System.out.println(nombre1+" con "+nombre2+" no se casan");
        }
        
    }
    
}
