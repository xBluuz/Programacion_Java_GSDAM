/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package acceso_mientras_si;

import java.util.Scanner;

/**
 *
 * @author Juan Antonio
 */
public class Acceso_Mientras_SI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contador = 0;
        String pass;
        Scanner sc = new Scanner(System.in);

        while (contador < 3) { // condicon
            // codigo que se ejecuta mientras se cumpla la condicion
            System.out.println("Escribe la contraseña");
            pass = sc.nextLine();
            contador++;

            if (pass.equals("abc")){
                System.out.println("Contraseña correcta");
            } else {
                System.out.println("Contraseña incorrecta");
                contador = 4;
            }

        }

    }

}
