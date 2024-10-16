/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package Primera;
/**
 *
 * @author Juan Antonio
 */
public class Contadores_basicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int conta=0;

        conta++; //Suma 1
        conta+=2; //suma 2
        conta+=5; // Suma 5
                
        conta--; //Resta 1
        conta-=2; //Resta 2
        conta-=5; //Resta 5


        ++conta; //Suma uno en la misma linea
        --conta; //Resta uno en la misma linea
        System.out.println(conta);
    }
    
}
