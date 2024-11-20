package Objetos1.TiposClases.Secundario;

import Objetos1.TiposClases.Principal.Clase_Protected; // .* ESTO LLAMA TODOS LOS DE ESA CAFRPETA, ESTO HACE QUE SI TE VAS A TRAER
//MUCHO CON ESTO SE HACE YA 

public class Pakete2 {
    Clase_Protected Objeto_Protected = new Clase_Protected();

    public Pakete2(){
        
    }

    public void ver(){
        System.out.println(Objeto_Protected.leer_protegido());
    }



}

