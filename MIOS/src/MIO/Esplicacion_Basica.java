/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
 
 package MIO;

import java.util.Scanner;

/**
  *
  * @author Juan Antonio
  */
 
 public class Esplicacion_Basica {
 
     /**
      * @param args the command line arguments
      */
     public static void main(String[] args) {
        int numero; // Variable para almacenar un número entero
        String frase; // Variable para almacenar una cadena de texto
        char letra; // Variable para almacenar un carácter
        double real; // Variable para almacenar un número real
        float flotante; // Variable para almacenar un número real de precisión simple
        boolean psoe; // Variable para almacenar un valor lógico

        Scanner teclado = new Scanner(System.in); // Crear un objeto Scanner para leer de teclado

        System.out.println("Introduce un número entero: "); //ESCRIBIR 
        numero = teclado.nextInt(); // Leer 

        //Para el scanner se puede poner nextInt (Numero), nextDouble (Double), nextFloat (Float), nextBoolean (Cuando es booleano), nextLine o next() (String), nextChar().CharAt(0) (Char)

        //(Decimales)Diferencia entre double y float es que el double tiene más precisión que el float y siempre el float tiene que llevar una F al final

        //OPERADORES
        // + Suma
        // - Resta
        // * Multiplicación
        // / División
        // % Resto de la división
        
        //= incia algo
        //==  compara algo
        //===  compara algo y además verifica que sea del mismo tipo

        

        if (numero == 0) { // Si el numero que el usuario ha introducido es 0 
            System.out.println("El número es cero"); //Te muestra eso
        }else{ //Si no es igual a 0
            System.out.println("El número no es cero"); //Te muestra eso
        }

        if (numero == 0) { // Si el numero que el usuario ha introducido es 0 
            System.out.println("El número es cero"); //Te muestra eso
        }else if(numero==0){
            System.out.println("Gay");
        }else{
            
        }

        System.out.println("---------------------");
        
        // BUCLES 3 TIPOS
        
        // 2 DE ELLOS SE REPITEN SI LA CONDICION NO SE CUMPLE

        // BUCLE WHILE (MIENTRAS) Primero comprueba y luego hace
        while (numero != 0){ //!= significa diferente
            System.out.println("Introduce un número entero: ");
            numero = teclado.nextInt(); // Leer un número entero
        }
        System.out.println("---------------------");

        // BUCLE DO WHILE (Repetir mientras) Primero hace el bucle y luego comprueba
        do{
            System.out.println("Introduce un número entero: ");
            numero = teclado.nextInt();
        }while(numero != 0);
        System.out.println("---------------------");

        // EL OTRO SE REPITE LAS VECES QUE SE LE INDIQUE

        // BUCLE FOR (PARA) Se repite un número de veces determinado
        //i++ de 1 en 1
        //i+=2 de 2 en 2
        //i+=3 de 3 en 3
        for (int i = 0; i<=10;i++){ //(int i = 0 ( el numero inical ); i<10 (hasta q numero va dura el bucle);i++ (El paso al que va en este caso de 1 en 1))
            System.out.println(i); //i = valor del la funcion for (0,1,2,3,4,5,6,7,8,9,10)
            System.out.println("Hola"); //Te muestra Hola 11 veces
        }

        System.out.println("---------------------");

        //SEGUN (switch)

        System.out.println("Introduce un número entero: ");
        numero = teclado.nextInt();

        switch (numero) { // Según el valor que nos haya dado el usuario hace estos casos (Se suele hacer para menus)
            case 1:{
                System.out.println("Has introducido el número 1");
                break; //Si no pones break se ejecutan todos los casos (IMPORATE CERRAR CON BRAKE)
            }
            case 2:{
                System.out.println("Has introducido el número 2");
                break;
            }
            case 7:{
                System.out.println("Has introducido el número 3");
                break;
            }
            default:{ //Si no se cumple ninguno de los casos anteriores se ejecuta este
                System.out.println("Has introducido un número diferente de 1, 2 y 3");
                break;
            }
        }

        System.out.println("---------------------");
        System.out.println("Introduce un número entero: ");
        frase = teclado.next();

        switch (frase) { // Según el valor que nos haya dado el usuario hace estos casos (Se suele hacer para menus)
            case "hola":{ //Si es una string se pone entre comillas
                System.out.println("Has introducido el número 1");
                break; //Si no pones break se ejecutan todos los casos (IMPORATE CERRAR CON BRAKE)
            }
            case "2":{
                System.out.println("Has introducido el número 2");
                break;
            }
            case "7":{
                System.out.println("Has introducido el número 3");
                break;
            }
            default:{ //Si no se cumple ninguno de los casos anteriores se ejecuta este
                System.out.println("Has introducido un número diferente de 1, 2 y 3");
                break;
            }
        }
       
        //VECTORES/ARRAY ES UN ALMACEN DE VARIABLES DEL MISMO TIPO (STRING....)

        //CREAR
        String[] Vector_Nombres = new String[5];
        Scanner sc = new Scanner(System.in);
        //String[] (ESTO INDETICA QUE EL ARRAY/VECTOR Y QUE TIPO+[]) Vector_Nombres (NOMBRE QUE LE METEMOS A ESE ARRAY) = new String[10] (EL NEW CREA EL HUECO EN LA RAM PARA ESTE ARRAY Y [10] CANTIDA DE INFOMACION QUE VA  VER DENTRO);

        //ESTA LA MANERA PRICIPAL DE METER INFORMACION

        //LOS ARRAY SIEMPRE POR EL 0
        Vector_Nombres[0] = "IZAN";//PRIMERA POSICION
        Vector_Nombres[1] = "MARCO";
        Vector_Nombres[2] = "MARCOS";
        Vector_Nombres[3] = "IZAN1";
        Vector_Nombres[4] = "IZAN2";

        System.out.println(Vector_Nombres[2]); //SOLO SE PODRA MOSTRAR LA POSICION DETERMINADA

        System.out.println("");//ESPACIO

        //MOSTRAR TODOS LA INFORMACION DEL ARRY CON FOR
        for (int i=0;i<Vector_Nombres.length;i++){  // DEL O AL Vector_Nombres.length(UN METODO QUE NOS DICE EL TAMAÑO EN ESTE CASO DEL ARRAY) A PASO 1 A 1
            System.out.println(Vector_Nombres[i]); //ESTO LO QUE VA A HACER ES EN EL PRIMER BOCLE SERA LA POCICION 0, EL SIGUENTE LA 1.....
        }

        System.out.println("");//ESPACIO

        //METER INFORMACION CON FOR(EL USUARIO VA INTRODUCIENDO LA IFORMACION)
        for (int i=0;i<Vector_Nombres.length;i++){  // DEL O AL Vector_Nombres.length(UN METODO QUE NOS DICE EL TAMAÑO EN ESTE CASO DEL ARRAY) A PASO 1 A 1
           Vector_Nombres[i] = sc.nextLine(); // //ESTO LO QUE VA A HACER ES EN EL PRIMER BOCLE SERA LA POCICION 0, EL SIGUENTE LA 1..... 
           // Y EN CADA UNO EL USUARIO VA A IR INTRODUCIENDO LOS NOMBRES
        }

        System.out.println("");//ESPACIO

        //ESTO MUESTRA LOS NUEVOS
        for (int i=0;i<Vector_Nombres.length;i++){  // DEL O AL Vector_Nombres.length(UN METODO QUE NOS DICE EL TAMAÑO EN ESTE CASO DEL ARRAY) A PASO 1 A 1
            System.out.println(Vector_Nombres[i]); //ESTO LO QUE VA A HACER ES EN EL PRIMER BOCLE SERA LA POCICION 0, EL SIGUENTE LA 1.....
        }


        
     }

}