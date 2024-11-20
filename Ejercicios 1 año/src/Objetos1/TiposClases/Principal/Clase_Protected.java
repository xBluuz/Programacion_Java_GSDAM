package Objetos1.TiposClases.Principal;

public class Clase_Protected {
    protected double protegido = 1234;

    public Clase_Protected(){

    }

    public double leer_protegido(){
        return this.protegido; //NO SERIA OBLIGATORIO EL THIS YA QUE SOLO HAY ESA VARIABLE
    }

    public void modificar_protegido(double protegido){
        this.protegido = protegido;
    }
}
