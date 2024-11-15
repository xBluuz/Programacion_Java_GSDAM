package Objetos1.EJ2;

public class Coche {
    //Creamos Variables
    String Color, Marca, Fecha_ITV;
    Float Km;

    //Creamos Contrusctor
    public Coche(String color, String marca,String fecha_itv, float km){
        this.Color = color;
        this.Marca = marca;
        this.Fecha_ITV = fecha_itv;
        this.Km = km;
    }

    //Funciones....
    public void Circular(){
        System.out.println("Circulando........");
    }

    public void Aparcar(){
        System.out.println("El coche de esta "+this.Marca+" esta aparcando");
    }

    public void Recibir_Multa(String tipo, float cuantia){
        System.out.println(tipo+" "+cuantia+"$");
    }

    public float Ver_Km(){
        return this.Km;
    }
}
