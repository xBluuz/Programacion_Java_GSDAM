package MIO;

import java.util.Scanner;

/**
 *
 * @author Juan Antonio
 */

public class Apuntes_Funciones {

    /**
     * @param args the command line arguments
     */

        //ES LAS FUNCIONES TENEMOS 2 TIPOS DE VARIABLES 
        //LAS GOLBALES Y LAS LOCALES
        
        //LAS GLOBALES VAN A SERVIR PARA CUALQUIER FUNCION
        //LAS VARIABLES GLOBALES QUE CREEMOS SIEMPRE TIENE QUE ESTAR EN STATIC
        // YA QUE SE CREEAN FUERA DE LAS FUNCIONES
        //EJEMPLO
        static Scanner sc = new Scanner(System.in);


        //MIENTAS QUE LAS LOCALES SOLO SERVIRAN PARA LA FUNCION EN LA QUE ESTE CREADA
        //ESTOS SON LAS VARAIBLES QUE YA HEMOS UTILIZADO ANTERIOMENTE
        //EJEMPLO LINEA 42

    public static void main(String[] args) {
        //LAS FUNCIONES SON UN HERRAMENTA QUE NOS PERMITE CREAR NUESTRO CODIGO FUERA DEL MAIN
        //ASI FACILITANDONOS AYUDANDONOS A QUE NUESTRO CODIGO ESTA MAS ORDENADO


        //PARA PASAR LAS FUNCIONES QUE NO DEVUELNE NADA SON MAS FACILES
        //CON DIRECTAMENTE CON LLAMARLA YA ESTAR 
        Prueba1();
    }

    //LAS FUNCIONES SIEMPRE SE CREAN DEBAJO DE EL MAIN

    //TENEMOS 2 TIPOS
    //LAS QUE NO DEVUELVE NADA Y LAS QUE DEVUELVEN 
    //LAS QUE NO DEVUELVEN NADA LOS VOID

    public static void Prueba1(){
        //EJEMPLO VARIABLES LOCALES
        int Numero1;
        int Numero2;
        int Solucion;

        System.out.println("Dime el primer numero: ");
        Numero1 = sc.nextInt();//AQUI ESTAMOS UTILIZANDO LA VARIABLE LOCAL DE SCANNER QUE HEMOS CREADO ARRIBA
        System.out.println("Dime el segundo numero: ");
        Numero2 = sc.nextInt();

        //PARA PODER METER UNA FUNCION QUE DEVUELVA SE PUEDE HACER DE 2 MANERA
        //1 METIENDOLA EN UN VARIABLE
        Solucion = suma(Numero2, Numero2); //COMO DECIMOS ABAJO HAY QUE METES LAS DOS VAARIABLES PARA PASAR LA INFORMACION A LA FUNCION DE ABAJO
        System.out.println(Solucion);//Y LUEGO HAY QUE HACER UN SOUT DE LA VARAIBLE
        
        System.out.println("");

        //Y LA OTRA ES DIRECTA QUE ES HACIENDO UN SOUT
        System.out.println(suma(Numero2, Numero2));//SIEMPRE PONIENDO LOS VALORES QUE QUEREMOS PASAR
    }

    //LAS QUE DEVUELVEN (INT, STRING....) DEPENDIENDO DEL VALOR QUE QUERMOS DEVOLVER
    //ESTE SIEMPRE SE DEVOLVERA CON UN return + el valor a devolver;

    public static int suma(int a,int b){//AQUI ESTAMOS PIDIENDO QUE DONDE METAMOS ESTA FUNCION
        int suma = a+b;                 //NOS PASE 2 NUMEROS ENTEROS PARA LUEGO UTILIZARLOS EN LA FUNCION
        return suma; //ESTO ES LO QUE SE VA MOSTAR 
    }

}