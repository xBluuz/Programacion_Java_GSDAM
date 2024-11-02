package Primera;

import java.util.Scanner;

/**
 *
 * @author Juan Antonio
 */

public class Ejercicios_Halloween1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Ejr1();
    }

    //Crea un programa que pida al usuario ingresar 10 números enteros y los almacene en un array.
    //Usa una función que calcule el promedio de esos números y otra función que determine el número 
    //más alto y el más bajo del array.

    public static void Ejr1(){
        int[] numerosEj1 = new int[10];
        for (int i = 0; i< numerosEj1.length; i++){
            System.out.println("Introduce el "+(i+1)+" número entero: ");
            numerosEj1[i] = sc.nextInt();
        }
        System.out.println("");
        System.out.println("El promedio de los números es: "+promedio(numerosEj1));
        System.out.println("El número mayor es: "+mayor(numerosEj1));
        System.out.println("El número menor es: "+menor(numerosEj1));
        
    }
    public static int promedio(int[] numeros){
        int suma = 0;
        for (int i = 0; i < numeros.length; i++){
            suma += numeros[i];
        }
        return suma/numeros.length;
    }
    public static int mayor(int[] numeros){
        int mayor = 0;

        for (int i= 0 ; i < numeros.length;i++){
            if (numeros[i] > mayor){
                mayor = numeros[i];
                
            }
        }
        return mayor;
    }
    public static int menor(int[] numeros){
        int menor = numeros[0];
        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] < menor){
                menor = numeros[i];
            }
        }
        return menor;
    }

    //Crea un programa que pida al usuario ingresar 5 palabras y las almacene en un array de Strings.
    //Utiliza una función para contar el número total de caracteres en todas las palabras ingresadas.
    //Muestra cada palabra y su longitud individual junto con el total de caracteres en consola.

    

}