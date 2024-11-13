package Objetos1.EJ1;

/**
 *
 * @author Juan Antonio
 */

public class PrimerObjeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CREARCION DEL OBJETO
        Persona cliente = new Persona("Josep",20,"AASSSD4");

        System.out.println("DNI: "+cliente.DNI);
        System.out.println("Nombre: "+cliente.Nombre);
        System.out.println("Edad: "+cliente.Edad);

        cliente.Comer();
    }
}