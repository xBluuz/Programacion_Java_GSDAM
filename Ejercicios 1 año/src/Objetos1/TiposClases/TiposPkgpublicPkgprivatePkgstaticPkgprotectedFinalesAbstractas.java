
package Objetos1.TiposClases;

/**
 * @author Juan Antonio
 */

public class TiposPkgpublicPkgprivatePkgstaticPkgprotectedFinalesAbstractas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Public_Private_Final Objeto_PFF = new Public_Private_Final();

        // Objeto_PFF.constante = 100;  ESTO DARIA ERROR YA QUE ES UN VATIABLE CONSTANTE
        Objeto_PFF.letra = 'F';//AL SER PUBLICA PODEMOS ACCEDER A ELLA
        //LA PRIVADA NO PODEMOS HACEDER

        Objeto_PFF.setPrecio(99);
        System.out.println(Objeto_PFF.getPrecio());
    }
}