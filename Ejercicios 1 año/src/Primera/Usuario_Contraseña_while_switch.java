/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Primera;

import java.util.Scanner;

/**
 *
 * @author Juan Antonio
 */
public class Usuario_Contraseña_while_switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String user = "", pass = "", user2, pass2;
        int menu = 0 ;
        
        Scanner teclado = new Scanner(System.in);
        
        while (menu < 3 ){ // != significa diferente a tmb <> 
            System.out.println("-----MENU-----");
            System.out.println("1.- Alta Usuario");
            System.out.println("2.- Iniciar Sesion");
            System.out.println("3.- Salir");
            System.out.println("");
            System.out.println("Opcion: ");
            menu = teclado.nextInt();
            teclado.nextLine();

            switch (menu){
                case 1:{
                    System.out.println("Ingrese el usuario: ");
                    user = teclado.nextLine();
                    System.out.println("Ingrese la contraseña: ");
                    pass = teclado.nextLine();
                    break;
                }
                case 2:{
                    System.out.println("Ingrese el usuario: ");
                    user2 = teclado.nextLine();
                    System.out.println("Ingrese la contraseña: ");
                    pass2 = teclado.nextLine();
                    
                    if (user.equals(user2)) {
                        if (pass.equals(pass2)) {
                            System.out.println("Bienvenido");
                        } else {
                            System.out.println("Contraseña incorrecta");
                        }
                    } else {
                        System.out.println("Usuario incorrecto");
                    }
                    break;
                }

            }
            
        }
    }
    
}
