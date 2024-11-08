package MIO;

import java.util.Scanner;

/**
 *
 * @author Juan Antonio
 */

public class Usuario {

    /**
     * @param args the command line arguments
     */
    static String[] user = new String[10];
    static int opcion = 0;
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        while(opcion != 4){
            menu();
            switch(opcion){
                case 1:{

                    break;
                }
                case 2:{

                    break;
                }
                case 3:{

                    break;
                }
                default:{
                    System.out.println("Opcion incorecta!!");
                }

            }
        }

    }
    public static void menu(){
        System.out.println("---------Menu-----------");
        System.out.println("1. Crear Usuario");
        System.out.println("2. Ver Usuaruios");
        System.out.println("3. Modificar Usuario");
        System.out.println("------------------------");
        System.out.println("4. Salir");
        System.out.println("-------------------------");
        opcion = teclado.nextInt();
    } 


    public static void Crear_User(){

    }
}