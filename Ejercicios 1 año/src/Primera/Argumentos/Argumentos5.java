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

    public static void main(String[] args){
        if (args.length != 0){
            String numero;
            int total = 0;
            for (int i=0;i<args.length;i++){
                numero=args[i];
            if (numero.matches("[0-9][0-9][0-9]")){ //si la string tiene los valores de 0-9 CONTRA MAS PONGAMOS MAS GRADE PUEDE SER EL NUMERO
                total+=Integer.parseInt(numero);
            }else{
                System.out.println("has introducido un valor no valido");
            }
            }  
            System.out.println(total);          
        }else{
            System.out.println("Introdice un numero");
        }
    }
}