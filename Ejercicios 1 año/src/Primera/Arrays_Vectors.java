/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
 
 package Primera;

import java.util.Random;
import java.util.Scanner;

 /**
  *
  * @author Juan Antonio
  */
 
 public class Arrays_Vectors {
 
     /**
      * @param args the command line arguments
      */
     public static void main(String[] args) {
        
        Random aleatorio = new Random();
        Scanner sc = new Scanner(System.in);
        
        String[] Nombres = new String[4];
        Nombres[0] = "Juan";
        Nombres[1] = "Antonio";
        Nombres[2] = "Pedro";
        Nombres[3] = "Luis";

        System.out.println(Nombres[0]);

        System.out.println("");

        for (int i = 0; i < 4; i++){
            System.out.println(Nombres[i]);
        }

        System.out.println("");
        System.out.println("--------------------");

        //SUMA DE TODOS LOS NUMEROS DEL ARRAY
        int[] numeros = new int[5];
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;

        int resultado = 0;
        for (int i = 0; i < numeros.length; i++){ // numeros.length SIRVE PARA QUE NO TENGAMOS QUE PONER EL NUMERO DE ELEMENTOS DEL ARRAY POR SI NO SABEMOS EL NUMERO DE ELEMENTOS
            resultado = resultado + numeros[i];
        }
        System.out.println(resultado);

        System.out.println("");
        System.out.println("--------------------");

        double[] decimales = new double[10];
        decimales[0] = 1.1;
        decimales[1] = 2.2;
        decimales[2] = 3.3;
        decimales[3] = 4.4;
        decimales[4] = 5.5;
        decimales[5] = 6.6;
        decimales[6] = 7.7;
        decimales[7] = 8.8;
        decimales[8] = 9.9;
        decimales[9] = 10.10;

        for (int i = 1; i < decimales.length; i++){
            if ((int) decimales[i] % 2 == 0){
                System.out.println((int) decimales[i]);
            }
        }

        System.out.println("");
        System.out.println("--------------------");


        int[] numeros2 = new int[40];

        int pares = 0, impares = 0;

        for (int i = 0 ; i < 40; i++){
            numeros2[i] = aleatorio.nextInt(10); // NUMEROS ALEATORIOS ENTRE 0 Y 10 pero si pones (10) + 1; el 0 nunca sale
            System.out.println(numeros2[i]);

            if (numeros2[i] % 2 == 0){
                pares = pares + numeros2[i];
            }else{
                impares = impares + numeros2[i];
            }
        }
        System.out.println(pares);
        System.out.println(impares);

        
        System.out.println("" );
        System.out.println("--------------------");

        System.out.println(aleatorio.nextInt(30)+50);

        System.out.println(Math.round( Math.random()*10)); // EL MATH DE POR SI DA DESIMALES PERO CON EL MATH.RANDOM(DENTRO EL MATH.RANDOM) SE NOS QUITA LOS DECIMALES
   
        System.out.println("");
        System.out.println("--------------------");

        int[] numeros3 = new int[50];

        for (int i = 0; i < numeros3.length; i++){
            numeros3[i] = aleatorio.nextInt(100);
            System.out.println(numeros3[i]);
        }


        System.out.println("");
        System.out.println("--------------------");

        numeros[0] = 0; // PARA BORRAR UN ELEMENTO DE UN ARRAY 
        Nombres[0] = null; // PARA BORRAR UN ELEMENTO DE UN ARRAY, tambien nos sirve el = "";

        for (int i = 0; Nombres.length > i; i++){
            Nombres[i] = null;
        }

        for (int i = 0 ; numeros.length > i; i++){
            numeros[i] = 0;
        }


        System.out.println("");
        System.out.println("--------------------");

        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        int posicion;

        System.out.println("¿Que posicion quieres saber?");
        posicion = sc.nextInt();

        System.out.println("Mes: " + meses[posicion - 1]);

    }
}