/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package while_menu_mes;

import java.util.Scanner;

/**
 *
 * @author Juan Antonio
 */
public class While_menu_mes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int mes;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un mes (1-12): ");
        mes = sc.nextInt();

        switch (mes){
            case 1: {
                System.out.println("Enero");
                break;
            }
            case 2: {
                System.out.println("Febrero");
                break;
            }
            case 3: {
                System.out.println("Marzo");
                break;
            }
            case 4: {
                System.out.println("Abril");
                break;
            }
            case 5: {
                System.out.println("Mayo");
                break;
            }
            case 6: {
                System.out.println("Junio");
                break;
            }
            case 7: {
                System.out.println("Julio");
                break;
            }
            case 8: {
                System.out.println("Agosto");
                break;
            }
            case 9: {
                System.out.println("Septiembre");
                break;
            }
            case 10: {
                System.out.println("Octubre");
                break;
            }
            case 11: {
                System.out.println("Noviembre");
                break;
            }
            case 12: {
                System.out.println("Diciembre");
                break;
            }
            default: { //ESTO SIBE PARA QUE CUANDO NO PONGA EL NUMERO QUE QUEREMOS QUE NOS DIGA QUE NO ES VALIDO
                System.out.println("Mes no válido");
            }
        }
        switch (mes) { //ESTO HACE QUE VARIOS VALORES PUEDAN TENER UNA SOLUCION Y NO TIENE QUE SER NUMEROS ORDENADOR PUEDE TENER UN 88 CONO UN 12 EN UN CASE
            case 1 :
            case 2 :
            case 3 :{
                System.out.println("Primavera");
                break;
            }
            case 4 :
            case 5 :
            case 6 :{
                System.out.println("Verano");
                break;
            }
            case 7 :
            case 8 :
            case 9 :{
                System.out.println("Otoño");
                break;
            }
            case 10 :
            case 11 :
            case 12 :{
                System.out.println("Invierno");
                break;
            }
        }
        
    }
    
}
