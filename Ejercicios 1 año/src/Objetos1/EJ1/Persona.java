package Objetos1.EJ1;
/**
 *
 * @author Juan Antonio
 */

public class Persona { //la clase siempre tiene q ser en mayusculas
    
    String Nombre = "";
    int Edad = 0;
    String DNI = "";

    //ZONA DE COSTUCTORES

    //UN CONSTRUCTOR SE EJECUTA SOLO CUANDO CREEMOS EL OBJETO

    public Persona(){ //ESTO ES UN METODO CONTRUCTOR  VACIO QUE NUNCA DEVUELVE NADA Y TIENE QUE TENER SIEMRE EL NOMBRE DE LA CLASE

    };

    public Persona(String nombre, int edad, String DNI){ // ESTE CONTRUCOTR RECIVE NOMBRE, EDAD Y DNI
        System.out.println("Persona creada");

        //EL THIS SIRBE PARA DIFERENCIAR LOS ATRIBUTOS DE ARRIBA QUE EMOS CREADO
        this.Nombre = nombre;
        this.Edad = edad;
        this.DNI = DNI;
    }


    //ZONA DE METODOS

    public void Comer(){
        System.out.println(this.Nombre+" esta Comiendo...");
    }

    public void DiasVividos(){
        System.out.println("Dias vividos: "+this.Edad*356);
    }

    public void Calcular21(double cantidad){
        System.out.println("21%: "+cantidad*0.21);
    }

    public String Llamada(){
        if (this.Nombre.charAt(this.Nombre.length()-1)=='o'){
            return "STRO: " + this.Nombre;
        }else if (this.Nombre.charAt(this.Nombre.length()-1)=='a'){
            return "STRA: " + this.Nombre;
        }
        return "";
    }
    public char ascii(int numero){
        return (char)numero;
    }
}
