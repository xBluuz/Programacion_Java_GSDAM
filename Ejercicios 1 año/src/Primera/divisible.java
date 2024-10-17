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

public class divisible {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un numero: ");
        num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("El numero " + num + " es divisible entre 2");
        } else if (num % 3 == 0) {
            System.out.println("El numero " + num + " es divisible entre 3");
        } else {
            System.out.println("El numero " + num + " no es divisible entre 2 ni entre 3");
        }
    }
}