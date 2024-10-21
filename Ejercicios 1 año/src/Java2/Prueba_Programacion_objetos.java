/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package Java2;

/**
 *
 * @author Juan Antonio
 */

 public class Prueba_Programacion_objetos {

    /**
     * Método principal para ejecutar el programa.
     * @param args los argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        COrdenador MiCOrdenador = new COrdenador();
        MiCOrdenador.Marca = "HP";
        MiCOrdenador.Procesador = "Intel Core i7";
        MiCOrdenador.Pantalla = "HP";
        MiCOrdenador.EncenderOrdenador();
        MiCOrdenador.Estado();
        System.out.println("--------------------");
        MiCOrdenador.ApagarOrdenador();
        MiCOrdenador.Estado();
    }
}

class COrdenador {
    String Marca, Procesador, Pantalla;
    boolean OrdenadorEncendido, Presentacion;

    void EncenderOrdenador() {
        if (OrdenadorEncendido) { // Si está encendido...
            System.out.println("El ordenador ya está encendido");
        } else {
            OrdenadorEncendido = true;
            System.out.println("El ordenador se ha encendido");
        }
    }

    void Estado() {
        System.out.println("\nEstado del ordenador: \nMarca: " + Marca + "\nProcesador: " + Procesador + "\nPantalla: " + Pantalla + "\n");

        if (OrdenadorEncendido) {
            System.out.println("El ordenador está encendido");
        } else {
            System.out.println("El ordenador está apagado");
        }
    }

    void ApagarOrdenador(){

        if (OrdenadorEncendido) { // Si está encendido...
            OrdenadorEncendido = false;
            System.out.println("El ordenador se ha apagado");
        } else {
            System.out.println("El ordenador ya está apagado");
        }
    }
}