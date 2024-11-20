package Objetos1.TiposClases.Principal;


public class Clase_static {
    static String dato_static = "Dato inicial statico public";
    private static String dato_privado_static = "Dato inicial static privado";

    public Clase_static(){
        //NO SE VA A EJECUTAR ESTE CONSTRUCTOR
    }


    static {
        dato_static = "aqui se inicia";
    }//ESTE TEXTO SALDRA SIEMPRE SI HEMOS CREADO ESTO, PERO SI NO LO PONEMOS SALDREA EL VALOR INICIAL
    
    public static void Metodo_normal(){
        dato_static = "desde metodo normal";
    }

    public static void  getDato_Static_Privado(String dato){
        dato_privado_static = dato; 
    }
}


