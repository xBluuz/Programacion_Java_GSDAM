package acceso_mientras_si;
import java.util.Scanner;

public class Acceso_Mientras_SI {

    public static void main(String[] args) {
        int contador = 0;
        String pass;
        Scanner sc = new Scanner(System.in);

        while (contador < 3) { // condición
            // código que se ejecuta mientras se cumpla la condición
            System.out.println("Escribe la contraseña");
            pass = sc.nextLine();
            contador++;

            if (pass.equals("abc")) {
                System.out.println("Contraseña correcta");
                break; // salir del bucle si la contraseña es correcta
            } else {
                System.out.println("Contraseña incorrecta");
            }
        }
    }
}