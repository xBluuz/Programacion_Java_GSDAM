package Primera.Argumentos;

/**
 *
 * @author Juan Antonio
 */

public class Argumentos5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        if (args.length != 0){
            int numero;
            for(int i = 0; i< args.length;i++){
                if (Boolean.parseBoolean(numero = Integer.parseInt(args[i])));
            }


        }else{
            System.out.println("Debes ingresar un numero");
        }


    }
}