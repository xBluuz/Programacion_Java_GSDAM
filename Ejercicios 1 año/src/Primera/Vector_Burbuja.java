package Primera;

/**
 *
 * @author Juan Antonio
 */

public class Vector_Burbuja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CREADOR DE LETRAS ALEATORIAS
        char[] letras = new char[50];

        for ( int i=0; i<letras.length; i++ ) {
            letras[i] = (char) Math.round( Math.random()*25+65);
        }

        //ORDENANACION BURBUJA
        char cambio;

        for (int i = 0; i < letras.length-1; i++){ //Ponemos -1 porque el ultimo elemento no se puede compara con el siguiente y para eso se corta antes
            for (int j= i+1; j< letras.length; j++){
                if (letras[i]>letras[j]){
                    cambio = letras[i];
                    letras[i] = letras[j];
                    letras[j] = cambio;
                }
            } 
        }
        for (int i = 0; i < letras.length; i++){
            System.out.println(letras[i]);
        }



        System.out.println("-------------------------------------------------");

        //ESTO PASA LAS LETRAS DE CHAR DE ANTES A NUMEROS INT
        int numero;
        
        for (int i = 0; i < letras.length; i++){
             numero = (int) letras[i];
            System.out.println(numero );
        }

        System.out.println("-------------------------------------------------");

        int[] numeros = new int[50];

        for (int i = 0; i < numeros.length; i++){
            numeros[i] = (int) Math.round(Math.random()*1000);
        }

        for (int i = 0; i< numeros.length-1; i++){
            for (int j = i+1; j < numeros.length; j++){
                if (numeros[i]> numeros[j]){
                    int cambio2 = numeros[i];
                    numeros[i]=numeros[j];
                    cambio2 = numeros[j];
                }
            }
        }
        for (int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }
    }
}