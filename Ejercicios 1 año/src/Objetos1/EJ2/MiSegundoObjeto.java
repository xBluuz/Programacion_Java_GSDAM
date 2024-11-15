package Objetos1.EJ2;

public class MiSegundoObjeto {
    
    public static void main(String[] args) {
        
        // Creamos dos clases para gestionar coches y circuitos

        //coches
        //color, marca, fecha_itv, Kilometros
        // Circular, Aparcar, Recibir_Multas, Consultar KM
        
        //Ciurcuito
        //Tipo (cerrado abierto), Acresso (Abierto o cerrado), KM, Nº vueltas, Fecha_Arpertura, Nombre, Ganadores[]
        // Arpertura, cerrar, consular ganadores, insertar ganadores 

        //Creamos los objetos coche
        Coche coche_1 = new Coche("Rojo","Audi","07/12/2025",20000.14F); //El float si ponemos deciamales hace falta la F si no no
        Coche coche_2 = new Coche("Azul", "Mercedes", "02/05/2026", 10000.10F);
        Circuito circuito_1 = new Circuito(true, new String[]{"Juan", "Luis", "Fernando", "Rafael", "Izan"}, "Monza");

        //Insetamos las funciones
        coche_1.Circular();
        coche_1.Aparcar();
        coche_1.Recibir_Multa("Velocidad", 100.50F);
        System.out.println("Los Kilometros: "+coche_1.Ver_Km()+"Km");
        System.out.println("------------------------------------");
        coche_2.Circular();
        coche_2.Aparcar();
        coche_2.Recibir_Multa("Alchol", 199.99F);
        System.out.println("Los Kilometros: "+coche_2.Ver_Km()+"Km");

        System.out.println("");
        System.out.println("---------------------------");
        System.out.println("");

        circuito_1.Arpertura();
        circuito_1.Ver_Estado_Circuito();
        circuito_1.Cerrar();
        circuito_1.Ver_Estado_Circuito();
        circuito_1.Ver_Ganadores();
        
    }
}
