
 
package Primera;

import java.util.Scanner;

/**
 *
 * @author Juan Antonio
 */

public class FormulaVectores2D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Almacena 4 Escudrerias y de cada una
        // los dos pilotos.

        //haz que el usuario pueda preguntar por los pilotos/escuderias
        //y se ,muestre el tiempo correspondiete

        String[][] f1 = new String[5][9];
        Scanner sc = new Scanner(System.in);

        //Escuderias
        f1[0][0] = "";
        f1[1][0] = "Ferrari";
        f1[2][0] = "Mercedes";
        f1[3][0] = "Red Bull";
        f1[4][0] = "McLaren";

        //Pilotos
        f1[0][1] = "Sainz";
        f1[0][2] = "Leclec";
        f1[0][3] = "Russell";
        f1[0][4] = "Hamilton";
        f1[0][5] = "Max";
        f1[0][6] = "Checo";
        f1[0][7] = "Norris";
        f1[0][8] = "Piastri";

        for (int i= 1;i<5;i++){
            for (int j=1;j<9;j++){
                f1[i][j] = String.valueOf(Math.round(Math.random()*60)+":"+Math.round(Math.random()*60));
            }
        }

        System.out.println(" ");
        for (int i= 0;i<5;i++){
            System.out.println("");
            for (int j=0;j<9;j++){
               System.out.print(f1[i][j]+", ");
            }
        }
        System.out.println(" ");

        System.out.println("Dime que escuderia quieres preguntar");
        System.out.println("1. Ferrari");
        System.out.println("2. Mercedes");
        System.out.println("3. Red Bull");
        System.out.println("4. McLaren");
        int escuderia = sc.nextInt();

        switch (escuderia){
            case 1:{
                System.out.print(f1[1][0]);
                System.out.print(" ");
                System.out.print(f1[0][1]);
                System.out.print(" ");
                System.out.print(f1[1][1]);
                System.out.print(" , ");
                System.out.print(f1[0][2]);
                System.out.print(" ");
                System.out.print(f1[1][2]);
                break;
            }
            case 2:{
                System.out.print(f1[2][0]);
                System.out.print(" ");
                System.out.print(f1[0][3]);
                System.out.print(" ");
                System.out.print(f1[2][3]);
                System.out.print(" , ");
                System.out.print(f1[0][4]);
                System.out.print(" ");
                System.out.print(f1[2][4]);
                break;
            }
            case 3:{
                System.out.print(f1[3][0]);
                System.out.print(" ");
                System.out.print(f1[0][5]);
                System.out.print(" ");
                System.out.print(f1[3][5]);
                System.out.print(" , ");
                System.out.print(f1[0][6]);
                System.out.print(" ");
                System.out.print(f1[3][6]);
                break;
            }
            case 4:{
                System.out.print(f1[4][0]);
                System.out.print(" ");
                System.out.print(f1[0][7]);
                System.out.print(" ");
                System.out.print(f1[4][7]);
                System.out.print(" , ");
                System.out.print(f1[0][8]);
                System.out.print(" ");
                System.out.print(f1[4][8]);
                break;
            }
        }

       

        

      
    
            
    }
}