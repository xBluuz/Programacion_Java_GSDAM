/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
 
 package Java2;

 /**
  *
  * @author Juan Antonio
  */
 
  public class CCoche {

    String Marca, Modelo, Matricula;
    boolean CocheArrancado, CambiarVelocidad, Acelerar, Frenar, PararMotor, Estado;

    /**
     * Método para arrancar el coche.
     */
    void ArrancarCoche() {
        if (CocheArrancado) {
            System.out.println("El coche ya está arrancado");
        } else {
            CocheArrancado = true;
            System.out.println("El coche se ha arrancado");
        }
    }

    /**
     * Método para cambiar la velocidad del coche.
     */
    void CambiarVelocidad() {
        if (CocheArrancado) {
            CambiarVelocidad = true;
            System.out.println("Se ha cambiado la velocidad del coche");
        } else {
            System.out.println("El coche está apagado, no se puede cambiar la velocidad");
        }
    }

    /**
     * Método para acelerar el coche.
     */
    void Acelerar() {
        if (CocheArrancado) {
            Acelerar = true;
            System.out.println("El coche está acelerando");
        } else {
            System.out.println("El coche está apagado, no se puede acelerar");
        }
    }

    /**
     * Método para frenar el coche.
     */
    void Frenar() {
        if (CocheArrancado) {
            Frenar = true;
            System.out.println("El coche está frenando");
        } else {
            System.out.println("El coche está apagado, no se puede frenar");
        }
    }

    /**
     * Método para parar el motor del coche.
     */
    void PararMotor() {
        if (CocheArrancado) {
            CocheArrancado = false;
            System.out.println("El coche se ha apagado");
        } else {
            System.out.println("El coche ya está apagado");
        }
    }

    /**
     * Método para mostrar el estado del coche.
     */
    void Estado() {
        System.out.println("\nEstado del coche: \nMarca: " + Marca + "\nModelo: " + Modelo + "\nMatricula: " + Matricula + "\n");

        if (CocheArrancado) {
            System.out.println("El coche está arrancado");
        } else {
            System.out.println("El coche está apagado");
        }
    }

    /**
     * Método principal para ejecutar el programa.
     * @param args los argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        CCoche miCoche = new CCoche();
        miCoche.Marca = "Toyota";
        miCoche.Modelo = "Corolla";
        miCoche.Matricula = "ABC-123";

        miCoche.ArrancarCoche();
        miCoche.CambiarVelocidad();
        miCoche.Acelerar();
        miCoche.Frenar();
        miCoche.PararMotor();
        miCoche.Estado();
    }
}
