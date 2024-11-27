
package Objetos1.TiposClases.Principal;

import Objetos1.TiposClases.Secundario.Pakete2;

/**
 * @author Juan Antonio
 */

public class TiposPkgpublicPkgprivatePkgstaticPkgprotectedFinalesAbstractas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //preivate
        
        Public_Private_Final Objeto_PFF = new Public_Private_Final();
       

        // Objeto_PFF.constante = 100;  ESTO DARIA ERROR YA QUE ES UN VATIABLE CONSTANTE
        Objeto_PFF.letra = 'F';//AL SER PUBLICA PODEMOS ACCEDER A ELLA
        //LA PRIVADA NO PODEMOS HACEDER

        Objeto_PFF.setPrecio(99);
        System.out.println(Objeto_PFF.getPrecio());

        //protected

        Clase_Protected Objeto_Protected = new Clase_Protected();

        System.out.println("");
        Objeto_Protected.protegido = 123456;

        // protected del paquete2

        Pakete2 Objeto_Protected2 = new Pakete2();

        Objeto_Protected2.ver();

        //static
        System.out.println(Clase_static.dato_static);
        
    }
}