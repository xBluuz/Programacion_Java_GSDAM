package Primera;

import java.util.Scanner;

/**
 *
 * @author Juan Antonio
 */

public class Vector_Buscar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        
        int[] numeros = new int[50];
        int num;
        

        //Codigo
        for (int i = 0 ; i < numeros.length; i++){
            numeros[i] = (int) Math.round(Math.random()*1000);
            System.out.println("Posicion "+i+" : "+numeros[i]);
        }

        System.out.println("Introduce un numero para buscar: ");
        num = sc.nextInt();

        for (int i = 0 ; i < numeros.length; i++){
            if (num == numeros[i]){
                System.out.println("El numero "+num+" se encuentra en la posicion "+i);
            }
        }

        
        //CREAR UN VECTOR DE CHAR Y BUSCAR UNA LETRA QUE DIGA EL USUARIO
        char[] letras = new char[50];
        char letra_user;

        for ( int i=0; i<letras.length; i++ ) {
            letras[i] = (char) Math.round( Math.random()*29+65);
            System.out.println("Posicion "+i+" : "+letras[i]);
        }

        System.out.println("Introduce una letra para buscar: ");
        letra_user = sc.next().charAt(0);  //con un (char) delante de sc.next() se puede hacer lo mismo

        for (int i = 0 ; i < letras.length; i++){
            if (letra_user == letras[i]){
                System.out.println("El numero "+letra_user+" se encuentra en la posicion "+i);
            }
        }
         


System.out.println("-------------------------------------------------");

/* 
        //CREAR UN VECTOR DE PALABRAS(4 LETRAS) Y BUSCAR UNA PALABRA QUE DIGA EL USUARIO
        
        
        //CEAMOS UN ARRAY DE 50 POSICIONES
        String[] palabras = new String[10];

        //CONSITE ES QUE EN CADA FASE DE EL ARRAY GENERE CON EL OTRO FOR 4 LETRAS CON CHAR QUE FORMEN LA PALBRA DE 4 LETRAS Y MOSTRAMOS
        for(int i=0;i<palabras.length;i++){
            palabras[i] = "";
            for(int j=0;j<4;j++){
                palabras[i] = palabras[i]+ (char) Math.round(Math.random()*25+65);
            }
            System.out.println("Posicion "+i+" : "+palabras[i]);
        }


        //PEDIMOS AL USUARIO QUE INTRODUZCA UNA PALABRA Y BUSCAMOS EN EL ARRAY
        System.out.println("Introduce una palabra para buscar: ");
        String palabra_user = sc.next();

        //BUSCAMOS LA PALABRA EN EL ARRAY
        for (int i=0 ; i<palabras.length; i++){
            if (palabra_user.equals(palabras[i])){
                System.out.println("La palabra "+palabra_user+" se encuentra en la posicion "+i);
            }
        }
       

        System.out.println("-------------------------------------------------");

        String[] palabras2 = new String[4];
        char[] letra1 = new char[4];
        char[] letra2 = new char[4];
        char[] letra3 = new char[4];
        char[] letra4 = new char[4];

        //Creamos aleatoramente las letras
        for (int i=0 ; i< 4; i++){
            letra1[i] = (char) Math.round(Math.random()*25+65);
            letra2[i] = (char) Math.round(Math.random()*25+65);
            letra3[i] = (char) Math.round(Math.random()*25+65);
            letra4[i] = (char) Math.round(Math.random()*25+65);
        }

        for (int i=0;i<palabras2.length;i++){
            palabras2[i] = ""+(char) letra1[i]+(char) letra2[i]+(char) letra3[i]+(char) letra4[i];
            System.out.println("Posicion "+i +1 +" : "+palabras2[i]);
        }

        System.out.println("Introduce la primera letra: ");
        String palabra_user2 = sc.next();

        for (int i = 0; i < palabras2.length; i++) {
            if (palabra_user2.charAt(0) == letra1[i]) {
                System.out.println("Dime la segunda letra: ");
                palabra_user2 = sc.next();
                if (palabra_user2.charAt(0) == letra2[i]) {
                    System.out.println("Dime la tercera letra: ");
                    palabra_user2 = sc.next();
                    if (palabra_user2.charAt(0) == letra3[i]) {
                        System.out.println("Dime la cuarta letra: ");
                        palabra_user2 = sc.next();
                        if (palabra_user2.charAt(0) == letra4[i]) {
                            System.out.println("La palabra "+palabras2[i]+"se encuentra en la posicion " + i);
                        }
                    }else{
                        System.out.println("La palabra no se encuentra");
                    }
                }
            }
        }
            */
        sc.close();
    }

}