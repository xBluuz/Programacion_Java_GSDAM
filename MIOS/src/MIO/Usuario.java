package MIO;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Juan Antonio
 */

public class Usuario {

    /**
     * @param args the command line arguments
     */
   
    static ArrayList<String> users = new ArrayList<>();
    static String user2;
    
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int opcion = 0;

        while(opcion != 4){

            System.out.println("---------Menu-----------");
            System.out.println("1. Crear Usuario");
            System.out.println("2. Ver Usuaruios");
            System.out.println("3. Modificar Usuario");
            System.out.println("------------------------");
            System.out.println("4. Salir");
            System.out.println("-------------------------");
            opcion = teclado.nextInt();
            
            switch(opcion){
                case 1:{
                    Crear_User();
                    break;
                }
                case 2:{
                    Ver_User();
                    break;
                }
                case 3:{
                    Modificara_User();
                    break;
                }
                default:{
                    System.out.println("Opcion incorecta!!");
                }

            }
        }

    }

    public static void Crear_User(){
        boolean continuar = true;
        do { 
            teclado.nextLine();
            System.out.println("Dime el usuario que quieres crear");
            user2 = teclado.nextLine();
            users.add(user2);

            System.out.println(" ");
            System.out.println("Quieres Añadir otro mas (true/false): ");
            continuar = teclado.nextBoolean();
            
        } while (continuar == true);
    }

    public static void Ver_User() {
        System.out.println("Lista de Usuario: "+ users);
    }
    
    public static void Modificara_User(){
        teclado.nextLine();
        String palabra_a_buscar, palabra_remplazo;
        System.out.println("Dime que Usuario quieres cambiar: ");
        palabra_a_buscar = teclado.nextLine();
        System.out.println("Dime el nuevo Usuario: ");
        palabra_remplazo = teclado.nextLine();

        for (int i = 0; i < users.size(); i++) { //El size hace lo que nos hace un legth pero con arraylist
            if (users.get(i).equals(palabra_a_buscar)) {
                users.set(i, palabra_remplazo); 
            }
        }
    }
}