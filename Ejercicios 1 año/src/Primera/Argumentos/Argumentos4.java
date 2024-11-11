package Primera.Argumentos;

/**
 *
 * @author Juan Antonio
 */

public class Argumentos4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int suma = 0;

        for (int i = 0; i< args.length;i++){
            suma = suma + Integer.parseInt(args[i]);
        }

        System.out.println("La suma es: "+suma);
        System.out.println("");
        System.out.println("La multiplicacion es: "+(suma*args.length));


    }
}