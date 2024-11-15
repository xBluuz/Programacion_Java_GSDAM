package Objetos1.EJ2;

public class Circuito {
    
    //Creamos los Variables
    boolean Tipo_A_C;
    boolean Acesso_A_C;
    Float Km, N_Vueltas;
    String Fecha_Arpertura, Nombre;
    String[] Ganadores = new String[5]; 


    //Creamos el Contructor
    public Circuito(boolean Tipo_a_c, String[] ganadores, String nombre){
        this.Tipo_A_C = Tipo_a_c;
        this.Ganadores = ganadores;
        this.Nombre = nombre;
    }

    //Vamos creado las funciones
    public void Arpertura(){
        if (!this.Tipo_A_C){
            System.out.println("El circuito se esta abiriendo");
            this.Acesso_A_C = true;
        }else{
            System.out.println("Circuito esta Abierto");
            this.Acesso_A_C = true;
        }
    }

    public void Cerrar(){
        if (!this.Tipo_A_C){
            System.out.println("El circuito esta cerrado");
            this.Acesso_A_C = false;
        }else{
            System.out.println("Circuito se esta cerrando");
            this.Acesso_A_C = false;
        }
    }

    public void Ver_Estado_Circuito(){
        if (!this.Acesso_A_C){
            System.out.println("El circuito esta cerrado");
        }else{
            System.out.println("El circuito esta abierto");
        }

    }

    public void Ver_Ganadores(){
        for (int i=0;i<this.Ganadores.length;i++){
            System.out.println((i+1)+". Ganador del circuito "+this.Nombre+" "+this.Ganadores[i]);
        }
    }
}
