package Primera;

import java.util.Scanner;

/**
 *
 * @author Juan Antonio
 */

public class Buscar_String {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String frase= "Esto es una frase";
        char letra_a_buscar;
        int contador = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una letra para buscar: ");
        letra_a_buscar = sc.next().charAt(0);

        for (int i=0;i<frase.length();i++){   //LOS PARANTESIS SON PORQUE ES UN METODO
            if (letra_a_buscar == (frase.charAt(i))){  //charAt es un metodo que devuelve el caracter en una frase 0 el primero 
                contador++;
            }
        }
        System.out.println("La letra "+letra_a_buscar+" aparece "+contador+" veces en la frase");


        System.out.println("----------------------");

        System.out.println("Introduce una letra para buscar: ");
        letra_a_buscar = sc.next().charAt(0);
        System.out.println("Introduce la segunda letra para buscar: ");
        char letra_a_buscar2 = sc.next().charAt(0);


        for (int i=0;i<frase.length()-1;i++){  
            if (letra_a_buscar == (frase.charAt(i))){
                if (letra_a_buscar2 == (frase.charAt(i+1))){
                    System.out.println("Se han encontrado las los letras");
                }
            }
        }

        System.out.println("----------------------");

        System.out.println("Introduce una letra para buscar: ");
        String silaba_a_buscar = sc.next();

        for (int i=0;i<frase.length()-1;i++){  
            if (silaba_a_buscar.charAt(0) == (frase.charAt(i))){
                if (silaba_a_buscar.charAt(1) == (frase.charAt(i+1))){
                    System.out.println("Se han encontrado las los letras");
                }
            }
        }


        System.out.println("----------------------");

        //PIDE UNA LETRA AL USUAIO Y OTRA POR LA CUAL REEMPLAZARLA
        // EJEMPLO: REPLAZA LAS V POR LA B

        String frase2 = "Vamos a la playa";

        System.out.println("La frase es: " + frase2);

        System.out.println("Dime las letras que quieres reemplazar: ");
        char letra_a_reemplazar = sc.next().charAt(0);
        System.out.println("Dime la letra por la que quieres reemplazar: ");
        char letra_reemplazo = sc.next().charAt(0);

        frase2 = frase2.replace(letra_a_reemplazar, letra_reemplazo); // replace es una funcion que lo que hace es remplazar todos los caracteres de la frase2 (1. parametros que queremos remplazar y 2. por el que queremos remplazarlo)

        System.out.println("La nueva frase es: " + frase2);

        sc.close();
    }
}