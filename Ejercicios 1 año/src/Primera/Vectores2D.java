
 
package Primera;

/**
 *
 * @author Juan Antonio
 */

public class Vectores2D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[][] Productos = new String[13][4]; // 12 filas de los meses y 3 vendedores
        //ESTO SIGNIFICA DE DOS DIMENSIONES SI QUISIERMOS HACER MAS DIMESIONES SE AÑADEN DEPENDIEDO DE LAS DIMESIONES QUE QUEREMOS
    
        Productos[0][0] = ""; //Meses / Nombre
        Productos[0][1] = "Pedro";
        Productos[0][2] = "Juan";
        Productos[0][3] = "Marcos";

        Productos[1][0] = "Enero";
        Productos[2][0] = "Febrero";
        Productos[3][0] = "Marzo";
        Productos[4][0] = "Abril";
        Productos[5][0] = "Mayo";
        Productos[6][0] = "Junio";
        Productos[7][0] = "Julio";
        Productos[8][0] = "Agosto";
        Productos[9][0] = "Sepetiembre";
        Productos[10][0] = "Octubre";
        Productos[11][0] = "Nomviembre";
        Productos[12][0] = "Deciembre";

        for (int i=1;i<13;i++){ 
            for (int j =1;j<4;j++){
                Productos[i][j] = String.valueOf(Math.round(Math.random()*100));  //PASAR DE INT A STRING CON String.valueOF
            }
        }

        for (int i=0;i<13 ; i++){ 
            System.out.println(" ");  //Cada mes hace un salto de linea
            for (int j =0;j<4;j++){
                System.out.print(Productos[i][j]+ " ");
            }
           
        }







    }
}