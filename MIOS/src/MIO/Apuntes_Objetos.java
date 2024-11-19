package MIO;

/**
 *
 * @author Juan Antonio
 */

public class Apuntes_Objetos {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {

        //ESTO SE VE DESPUES DE VER COMO SE CREAR LA CLASE MIRAR LO DE ABAJO

        //DESPUES DE HABER CREADO LA CALSE PARA INSRTERLA Y CREARLA AQUI SE HACE ASI
        Objeto objeto_prueba = new Objero("Juan", 19, "213451H"); 
//ESTO CONSISTE EN Objeto( EL NOMBRE DEL OBJETO ) objeto_prueba(EL NOMBRE QUE LE COLOCAMOS AL OBJETO PARA IDENTIFICARLO EN EL CODIFO) 
//= new Objero("Juan", 19, "213451H");(Y ESTO LO QUE HACEMOS ES HACERLE UN HUECO EN LA RAM PARA LA CLASE Y EN LOS () PONEMOS LA INFORMACION QUE PEDIAMOS EN EL CONSTRUCTOR) 

        //COMO METEMOS LAS FUNCIONES
        //PARA METER LAS FUNCIONES ES TAN FACIL COMO PONER EL NOMBRE QUE NOSOTROS LE HEMOS PUESTO A EL OBJETO
        //QUE HEMOS CREADO + EL NOMBRE DE LA FUNCION CREADA
        //EJEMPLO
        //NO DEVUELVE
        objeto_prueba.Mostrar_Todo();//ESTO NOS SACARIA LA PRIMERA FUNCION
        //
        //RECORDAR QUE DEPENDIENDO DE QUE SI DEVUELVE O NO DEVUELVE ES DIFERENTE EL MODO DE METERLO
        //
        //DEVUELVE
        //OPCION1
        //CREAMOS LA VARIABLE Y LUEGO LA LLAMAMOS
        int Años_Vividos = objeto_prueba.Años_Vividos();
        System.out.println(Años_Vividos);
        //
        //OPCION2Ç
        //LLAMAMOS DIRECTAMENTE LA FUNCIONS
        System.out.println(objeto_prueba.Años_Vividos());
    }
}

//ESTO LO CREO AQUI PARA EXPLICARLO PERO NO SE PUEDE, PERO LO CREAMOS EN OTRO .JAVA QUE TIENE QUE TENER EL NOMBRE DE LA CLASE
//QUE VAMOS A CREAR

class Objero { //la clase siempre tiene q ser en mayusculas

    //CREAMOS LAS VARAIBLES PRINCIPALES DE CLASE DE OBJETOS
    //SIEMPRE LAS INICIAMOS
    String Nombre = "";
    int Edad = 0;
    String DNI = "";

    //ZONA DEL CONSTRUCTOR 
    //Un constructor sirve para inicializar el objeto 
    //y establecer sus propiedades y valores predeterminados. 
    //Tiene el mismo nombre que la clase y no cuenta con ningún valor de retorno
    // ya que su función principal es inicializar el objeto y no devolver ningún valor.

    //EL CONSTRUCTOR PUEDE ESTAR CREADO EN BLANCO, ESTO SIRVE PARA QUE ESTE CREADO PERO NO LE PASEMOS INFORMACION 
    public Objero(){
        
    }

    //EL CONSTRUCTOR CON LA INFORMACION PARA INICIALIZAR EL OBJETO
    public Objeto(Strign nombre, int edad, String dni){ //AQUI LO QUE ESTAMOS HACIENDO ES QUE NOS GUARDE LOS VALORES QUE NOS VA PASAR A LA HORA DE CREAR EL OBJETO

      this.Nombre = nombre; //EL THIS. SIRVE PARA LLAMAS A LAS VARIABLES PRINCIPALES DE LA CLASE LAS DE ARRIBA
      this.Edad = edad;
      this.DNI = dni;
      // LO QUE ACABAMOS DE HACER AHORA ES AÑADIR LA INFORMACION QUE NOS HAN PROPORCIONADA AL CREAR EL OBJETO Y GUARDARLA EN LAS VARIABLES QUE 
      // HEMOS CREADO ARRIBA  
    }

    //DESPUES DE HABER CREADO EL OBJETO TOCA CREEAR LO ULTIMO
    //LAS FUNCIONES QUE VA A REALIZAR EL OBJETO
    //
    //PARA ESO TENEMOS 2 TIPOS QUE YA CONOCEMOS LAS QUE DEVUELVEN Y LAS QUE NO DEVUELVEN

    //LAS QUE NO DEVUELVEN 
    //
    public void Mostrar_Todo(){
        System.out.println("Hola "+this.Nombre+" tienes "+this.Edad+" edad y tu DNI es "+this.DNI);
    }

    //LOS QUE DEVUELVEN
    //
    //COMO YA SABEMOS ESTO SIEMPRE TIENE QUE ESTAR DEVUELTO CON UN RETUN
    public int Dias_Vivo(){
        return this.Edad * 365;
    }

    //EN ESTE CASO IRIAMOS A EL PUBLIC MAIN DE EL .JAVA PRICIPAL DE LA CLASE PARA AÑADIR LA CLASE Y LAS FUNCIONES
    //
    //NOSOTROS VAMOS A ARRIBA Y OS EXPLICO COMO SE CREAR LA CLASE Y INSERTAMOS FUNCIONES
}