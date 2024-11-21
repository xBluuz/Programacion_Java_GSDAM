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
        System.out.println("");
        System.out.println("-------------------------------------------------");
        //Ejr2();
        System.out.println("");
        System.out.println("-------------------------------------------------");
        //Ejr3();
        System.out.println("");
        System.out.println("-------------------------------------------------");
        //Ejr4();
        System.out.println("");
        System.out.println("-------------------------------------------------");
       // Ejr5();
        System.out.println("");
        System.out.println("-------------------------------------------------");
        //Ejr6();
        System.out.println("");
        System.out.println("-------------------------------------------------");
        //Ejr7();
        System.out.println("");
        System.out.println("-------------------------------------------------");
        //Ejr8();
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

    public static float  promedio(int[] numeros){
        int suma = 0;
        for (int i = 0; i < numeros.length; i++){
            suma += numeros[i];
        }
        return (float) suma/numeros.length; // Ponemos el float para que tenga decimales
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

    public static void Ejr2(){
        String[] palabrasEjr2 = new String[5];
        for (int i= 0; i< palabrasEjr2.length; i++){
            System.out.println("Introduce la palabra "+(i+1)+": ");
            palabrasEjr2[i] = sc.next();
        }
        System.out.println("");
        System.out.println("El total de caracteres en las palabras es: "+contarCaracteres(palabrasEjr2));
        mostrarPalabras(palabrasEjr2);
    }

    public static int contarCaracteres(String[] palabras){
        int totalCaracteres = 0;
        for(int i=0 ; i < palabras.length; i++){
            totalCaracteres += palabras[i].length(); //length() es un método que devuelve la longitud de la String
        }
        return totalCaracteres;
    }

    public static void mostrarPalabras(String[] palabras){
        for (int i = 0; i < palabras.length; i++){
            System.out.println("La palabra "+(i+1)+" es: "+palabras[i]+" y tiene "+palabras[i].length()+" caracteres.");
        }
    }

    //Crea un programa que permita al usuario ingresar 10 números enteros en un array.
    //Implementa una función que ordene el array en orden ascendente usando el método de burbuja o cualquier algoritmo de ordenación básico.
    //Muestra el array original y el array ordenado en consola.

    public static void Ejr3(){
        int[] numeroEjr3 = new int[10];
        for (int i= 0; i< numeroEjr3.length; i++){
           numeroEjr3[i] = (int) Math.round(Math.random()*100+1);
        }
        System.out.println("");
        System.out.println("Array ordendo: ");
        ordenarBurbuja(numeroEjr3);
    }

    public static void ordenarBurbuja(int[] numeros){
        int cambio;
        for (int i = 0; i < numeros.length-1; i++){
            for (int j= i+1; j< numeros.length; j++){
                if (numeros[i]>numeros[j]){
                    cambio = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = cambio;
                }
            } 
        }
        for (int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }
    }

    //Crea un programa que tenga un array de temperaturas en grados Celsius (5 valores).
    //Escribe una función que reciba este array y devuelva otro array con las temperaturas convertidas a Fahrenheit.
    //Muestra ambos arrays en consola (Celsius y Fahrenheit).

    public static void Ejr4(){
        int[] temperaturas = new int[5];
        for (int i=0 ; i< temperaturas.length; i++){
            temperaturas[i] = (int) Math.round(Math.random()*20+30);
        }
        System.out.println("");
        System.out.println("Temperaturas en grados Celsius: ");
        for (int i = 0; i < temperaturas.length; i++){
            System.out.println(temperaturas[i]+"ºC");
        }
        System.out.println("");
        System.out.println("Temperaturas en grados Fahrenheit: ");
        convertirFahr(temperaturas);
    }

    public static void convertirFahr(int[] temperaturas){
        for (int i = 0; i < temperaturas.length; i++){
            temperaturas[i] = (temperaturas[i]*9/5)+32;
        }
        for (int i = 0; i < temperaturas.length; i++){
            System.out.println(temperaturas[i]+"ºF");
        }
    }

    //Crea un programa que genere 10 números aleatorios entre 1 y 20 y los almacene en un array, asegurándose de que no se repitan.
    //Usa una función para verificar que los números generados no estén duplicados en el array antes de añadirlos.
    //Muestra el array resultante en consola.

    public static void Ejr5(){
        int[] numerosAleatorios = new int[10];
        for (int i = 0; i < numerosAleatorios.length; i++){
            numerosAleatorios[i] = (int) (Math.random()*20+1);
            
        }
        n_repetidos(numerosAleatorios);
    }

    public static void n_repetidos(int[] numeros){
        for (int i = 0; i < numeros.length; i++){ // ESTA FUNCION LO QUE HACE ES EL PIMER FOR DA LA PRIMERA VIELTA HACIENDO UN NUMEOR ALEATORIO Y LUEGO EN EL SEGUNDO FOR DA 10 VUELTAS SACANDO LOS NUMEOR DEL ARRAY Y COMPRUEBA SI ESE NUMERO SE REPITE
            for (int j = 0; j < i; j++){ 
                if (numeros[i] == numeros[j]){
                    i--; //Si se repite el número, se resta 1 a i para que vuelva a generar un número aleatorio
                }
            }
        }
        for (int i = 0; i < numeros.length; i++){
            System.out.println((i+1)+" numero: "+numeros[i]);
        }
    }
    //Siempre que pongamos una ! delante de algo, estamos negando la condición


    //Crea un programa que almacene en un array las notas de 5 estudiantes (números enteros entre 0 y 10).
    //Escribe funciones para calcular el promedio de notas y para contar cuántos estudiantes aprobaron (nota mayor o igual a 5) y cuántos reprobaron.
    //Muestra los resultados en la consola.

    public static void Ejr6(){
        int[] notas = new int[5];
        for (int i=0;i<notas.length;i++){
            notas[i] = (int) Math.round(Math.random()*10);
        }
        System.out.println(" ");
        for (int i=0;i<notas.length;i++){
            System.out.println("Nota del estudiante "+(i+1)+": "+notas[i]);
        }
        System.out.println(" ");
        OperacionesNotas(notas);
    }

    public static void OperacionesNotas(int[] notas){
        int aprobaron = 0;
        int reprobaron = 0;
        int media = 0;
        for (int i=0;i<notas.length;i++){
            media += notas[i];
            if (notas[i] >= 5){
                aprobaron++;
            }else{
                reprobaron++;
            }
        }
        System.out.println("La media de las notas es: "+media/notas.length);
        System.out.println("Aprobaron: "+aprobaron);
        System.out.println("Reprobaron: "+reprobaron);
    }

    //Crea un programa que permita al usuario ingresar 10 números en un array.
    //Luego, pide al usuario que ingrese un número adicional y utiliza una función para verificar si el número está en el array.
    //Si el número se encuentra en el array, indica su posición; si no, muestra un mensaje indicando que no se encontró.

    public static void Ejr7(){
        int[] numeros = new int[10];
        for (int i=0;i<numeros.length;i++){
            System.out.println("Introduce el "+(i+1)+" número: ");
            numeros[i] = sc.nextInt();
        }
        buscarNumero(numeros); //MAXIMA VARIANLES QUE PODEMOS PASAR SON 255 VARIABLES
    }

    public static void buscarNumero(int[] numeros){
        boolean exixte = false;
        System.out.println("Introduce un número para buscar en el array: ");
        int num = sc.nextInt();
        for (int i=0;i<numeros.length;i++){
            if (num == numeros[i]){
                System.out.println("El número "+num+" se encuentra en la posición "+(i+1));
                exixte = true;
            }
            if (!exixte){
                System.out.println("El número "+num+" no se encuentra en el array.");
            }
        }
    } 
    
    //Crea un array de 10 números enteros y permite al usuario ingresar valores para cada posición.
    //Usa una función que reciba el array e intercambie los elementos en las posiciones pares con los de las posiciones impares.
    //Muestra el array antes y después del intercambio en consola.

    public static void Ejr8(){
        int[] numero = new int[10];
        for (int i=0 ; i< numero.length; i++){
            System.out.println("Introduce el "+(i+1)+" número: ");
            numero[i] = sc.nextInt();
        }
        System.out.println("");
        System.out.println("Array original: ");
        for (int i=0;i<numero.length;i++){
            System.out.println(numero[i]);
        }
        System.out.println("Array intercambiado: ");
        intercambiarPosiciones(numero);
    }

    public static void intercambiarPosiciones(int[] numeros){
        int cambio;
        for (int i=0;i<numeros.length-1;i+=2){ //Esto es un for de los numeros impares del array
            cambio = numeros[i];
            numeros[i] = numeros[i+1];
            numeros[i+1] = cambio;
        }
        for (int i=0;i<numeros.length;i++){
            System.out.println(numeros[i]);
        }
    }
} 