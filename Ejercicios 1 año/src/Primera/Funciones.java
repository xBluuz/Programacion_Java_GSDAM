package Primera;

import java.util.Scanner;

/**
 *
 * @author Juan Antonio
 */

public class Funciones {

    //Todas las variables globales creadas aqui se utilizan para todos las funciones y las que entan dentro de las funciones se llaman locales
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //LLamada a la funcion
        Capturar();
        Mostrar_Nombre("Juan");
        int monto = Monto(); //hay que crear la variable para que se pueda mostrar el valor del mismo tipo de dato que se esta retornando
        System.out.println(monto);
        int resutado = Multiplicacion(15, 5);
        System.out.println(resutado);
    }

    public static void Capturar(){
        // variable local
        String frase;

        frase = sc.nextLine();
        System.out.println(frase);
    }

    public static void Mostrar_Nombre(String nombre){
        System.out.println(nombre);
    }

    public static int Monto(){ //Siempre tiene que ser la variable como el tipo de dato que hay en el public static
        int monto;
        monto = 432;
        return monto;
        //Retorna el valor de la variable monto
        
    }

    public static int Multiplicacion(int num1, int num2){
        return num1 * num2;
    }
}