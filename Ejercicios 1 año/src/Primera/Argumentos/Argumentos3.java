package Primera.Argumentos;

/**
 *
 * @author Juan Antonio
 */

public class Argumentos3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String argumento1 = args[0];
        String argumento2 = args[1];
        String palabraArgumento = "";
        
        switch (argumento1) {
            case "-L":{
                palabraArgumento = "Linux";
                break;
            }
            case "-W":{
                palabraArgumento = "Windows";
                break;
            }
            case "-M":{
                palabraArgumento = "Mac";
                break;
            }
        }

        int args2 = Integer.parseInt(argumento2);
        for (int i = 0; i<args2;i++){
            System.out.println(palabraArgumento+": "+(i+1));
        }
    
    }
}