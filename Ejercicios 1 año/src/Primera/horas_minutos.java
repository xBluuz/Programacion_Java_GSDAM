package Primera;

import java.util.Scanner;

/**
 *
 * @author Juan Antonio
 */
public class horas_minutos {
    public static void main(String[] args) {
        int hora1, hora2, minuto1, minuto2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la primera hora: ");
        hora1 = sc.nextInt();
        System.out.println("Introduce el primer minuto: ");
        minuto1 = sc.nextInt();
        System.out.println("Introduce la segunda hora: ");
        hora2 = sc.nextInt();
        System.out.println("Introduce el segundo minuto: ");
        minuto2 = sc.nextInt();


        if ( hora2 > hora1 ){
            System.out.println("Horas: "+ (hora2 - hora1));
        }else{
            System.out.println("Horas: "+ (24 - (hora1 - hora2)));
        }
        if ( minuto1 > minuto2){
            System.out.println("Minutos: "+ (60 - (minuto1 - minuto2)));
        }else{
            System.out.println("Minutos: "+ (minuto2 - minuto1));
        }
    }
}
