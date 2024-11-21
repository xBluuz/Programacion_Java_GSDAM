package MIO;
import java.util.Scanner;


/**
 *
 * @author Juan Antonio
 */

public class PPT {

    /**
     * @param args the command line arguments
     */

    static int usurio = 0, ia = 0;
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {

        int victorias = 0, derrotas = 0, empates = 0;

    do {

        System.out.println("------Piedra, Papel o Tijera------");
        System.out.println("1. Piedra");
        System.out.println("2. Papel");
        System.out.println("3. Tijera");
        System.out.println("4. Resultado");
        System.out.println("0. Salir");
        System.out.println("-----------------------------------");
        usurio = sc.nextInt();

        int ia2 = ia();

        switch (usurio) {
            case 1:{
                if (ia2 == 2){
                    System.out.println("La ia a sacado Papel, has Perdido");
                    derrotas++;
                } else if (ia2 == 3) {
                    System.out.println("La ia a sacado Tijera, has Ganado!!");
                    victorias++;
                } else if (ia2 == 1){
                    System.out.println("La ia a sacado Piedra, has Esmpatado");
                    empates++;
                }
                break;
            }
            case 2:{
                if (ia2 == 2){
                    System.out.println("La ia a sacado Papel, has Empatado");
                    empates++;
                } else if (ia2 == 3) {
                    System.out.println("La ia a sacado Tijera, has Perdido");
                    derrotas++;
                } else if (ia2 == 1){
                    System.out.println("La ia a sacado Piedra, has Ganado!!");
                    victorias++;

                }
                break;
            }
            case 3:{
                if (ia2 == 2){
                    System.out.println("La ia a sacado Papel, has Has Ganado!!");
                    victorias++;

                } else if (ia2 == 3) {
                    System.out.println("La ia a sacado Tijera, has Empatado");
                    empates++;
                } else if (ia2 == 1){
                    System.out.println("La ia a sacado Piedra, has Perdido");
                    derrotas++;
                }
                break;
            }
            case 4:{
                System.out.println("Has ganado: "+victorias);
                System.out.println("Has perdido: "+derrotas);
                System.out.println("Has empatado: "+empates);
            }
        }
        System.out.println(" ");
    }while (usurio != 0);

    }

    public static int ia(){
        ia = (int) Math.round(Math.random()*3+1);
        return ia;
    }

}