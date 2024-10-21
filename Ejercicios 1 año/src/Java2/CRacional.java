/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
 
 package Java2;

 /**
  *
  * @author Juan Antonio
  */
 
 public class CRacional {
 
     /**
      * @param args the command line arguments
      */

    int numerador, denominador;
    void AsignarDatos(int num, int den) {
        numerador = num;
        if (den == 0) {
            den = 1;
        }//EL DENOMINADOR NO PUEDE SER 0
        denominador = den;
    }
    void VisualizarRacional() {
        System.out.println(numerador + "/" + denominador);
    }
     public static void main(String[] args) {
        //Punto de entrada a la aplicacion
        CRacional rl = new CRacional();

        rl.AsignarDatos(2, 5);
        rl.VisualizarRacional();
     }
 }
  