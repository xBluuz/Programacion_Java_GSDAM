package Primera.Argumentos;

/**
 *
 * @author Juan Antonio
 */

public class Argumentos5 {

    //Ejercicio: Suma de arguemntos de linea de comandos
    //
    //Escribe un progrma en java que reciba una serie de numeros por linea de comandos y los sume.
    //Si alguno de los argumentos no es un numero, el programa debe mostrar un mensaje de error y termina.

    //Requisitos:
    //El progrma dewbe recibir los numeros argumetos de linea de comandos
    //si el usuario no introduce ningun argumento, el programa debe mostrar un mensaje de que tiene que introducir un numero  
    //Si todos los arguemntos son validos, el programa debe mostrar la suma de todos los numeros y si no, mostrar un mensaje de error


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        if (args.length == 0){
            System.out.println("Tienes que introducir un numero");
            System.exit(0); 
        }else{
            
        }
        

        


    }
}