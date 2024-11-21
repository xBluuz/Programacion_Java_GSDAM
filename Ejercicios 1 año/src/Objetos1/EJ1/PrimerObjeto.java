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
        Persona cliente = new Persona("Josepa",20,"AASSSD4");

        System.out.println("DNI: "+cliente.DNI);
        System.out.println("Nombre: "+cliente.Nombre);
        System.out.println("Edad: "+cliente.Edad);

        cliente.Comer();
        cliente.DiasVividos();
        cliente.Calcular21(1000);
        String Llamada = cliente.Llamada(); // al hacer un retrun hay que igualarlo a una varaible o directamente llamarlo en un sout
        System.out.println(Llamada);
        System.out.println(cliente.ascii(90));
    }
}