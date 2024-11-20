package Objetos1.TiposClases;

public class Public_Private_Final {
    final int constante = 100; //ESTA VARIABLE NO LE PUDE CAMBIAR EL VALOR POR EL FINAL
    public char letra = 'a';
    private float precio = 99.2F;//CON ESTO PROTEGEMOS LA VARIABLE PARA QUE SOLO SE UTILICE EN ESTA CLASE


    //CONSTRUCTOR VACIO
    public Public_Private_Final(){

    }

    //ENCAPSULAMIENTO

    //MOSTRAR
    public float getPrecio(){
        return precio;
    }

    //EDITARLOS
    public void setPrecio(float precio){
        this.precio = precio;
    }
}
