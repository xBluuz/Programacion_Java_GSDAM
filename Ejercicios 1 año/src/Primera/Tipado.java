/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Primera;

/**
 *
 * @author Juan Antonio
 */
public class Tipado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        char letra;
        String frase;
        double real;
        float flotante;
        boolean psoe;
        final int constante = 1234; //no se puede cambiar el valor siemrpe sera el primer valor introducido

        //CAMBIAMOS DE UNA STRING A INT
        frase = "10";
        numero = Integer.parseInt(frase);
        System.out.println("Numero: " + numero * 8);

        //NUMERO A FRASE
        numero = 39;
        frase = String.valueOf(numero);
        System.out.println("Frase: " + frase);

        //FLOTANTE
        flotante = 9.78F; //Los float siempre tienen que llevar la F ao final para que detecte que es un float;
        real = 4.8 * flotante;
        System.out.println("Resultado: " + real);

        //DE NUMERO REAL A STRING
        frase = String.valueOf(real);
        System.out.println("Real frase: " + frase);
        
        //DE BOOLEANO A FRASE Y DE FRASE A BOOLEANO
        psoe = true;
        frase = String.valueOf(psoe);
        System.out.println("Continuar como String: " + frase);
        frase = "false";
        psoe = Boolean.parseBoolean(frase);
        System.out.println("Frase como boolean: " + psoe);
        
        real = 9.7;
        numero = (int) real;//Esto obliga a la funcion a realizarse
        System.out.println("Numero: "+numero);
        flotante = (float)real;
        System.out.println("Numero flotante: "+flotante);
        
        
        //CORREGIR ESTE CODIGO
        numero = 300;
        letra = (char) (numero%256);//PARA CONTAR LAS VECES QUE LA LA VUELTA SE PONE %
        System.out.println("Letra 300: "+letra);

    }

}
