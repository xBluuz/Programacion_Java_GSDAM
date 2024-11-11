package Primera.Argumentos;

/**
 *
 * @author Juan Antonio
 */

public class Argumentos2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String argumento1 = args[0];
        String argumento2 = args[1];
        
        int args2 = Integer.parseInt(argumento2);

        for (int i = 0; i<= args2;i++){
            System.out.println(argumento1+": "+i);
        }

    
    }
}