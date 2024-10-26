package Primera;

import java.util.Scanner;

/**
 *
 * @author Juan Antonio
 */

public class Vector_Buscar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numeros = new int[50];
        int num;
        Scanner sc = new Scanner(System.in);

        //Codigo
        for (int i = 0 ; i < numeros.length; i++){
            numeros[i] = (int) Math.round(Math.random()*1000);
            System.out.println("Posicion "+i+" : "+numeros[i]);
        }

        System.out.println("Introduce un numero para buscar: ");
        num = sc.nextInt();

        for (int i = 0 ; i < numeros.length; i++){
            if (num == numeros[i]){
                System.out.println("El numero "+num+" se encuentra en la posicion "+i);
            }
        }

        
        //CREAR UN VECTOR DE CHAR Y BUSCAR UNA LETRA QUE DIGA EL USUARIO
        char[] letras = new char[50];
        char letra_user;

        for ( int i=0; i<letras.length; i++ ) {
            letras[i] = (char) Math.round( Math.random()*29+65);
            System.out.println("Posicion "+i+" : "+letras[i]);
        }

        System.out.println("Introduce una letra para buscar: ");
        letra_user = sc.next().charAt(0);  //con un (char) delante de sc.next() se puede hacer lo mismo

        for (int i = 0 ; i < letras.length; i++){
            if (letra_user == letras[i]){
                System.out.println("El numero "+letra_user+" se encuentra en la posicion "+i);
            }
        }
        




        //CREAR UN VECTOR DE PALABRAS(4 LETRAS) Y BUSCAR UNA PALABRA QUE DIGA EL USUARIO

    }
}