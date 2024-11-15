package Objetos.EJ1;

import java.util.Scanner;

public class Cuenta {
    
    String Titular;
    int Saldo;
    String NumeroCuenta;

    Scanner sc = new Scanner(System.in);

    public Cuenta(String titular, int saldo, String numerocuenta){
        System.out.println("Cuenta creada");

        this.Titular = titular;
        this.Saldo = saldo;
        this.NumeroCuenta = numerocuenta;
    }

    public void Depositar(){
        int DepositarS = 0;

        System.out.println("Tienes "+this.Saldo+"$ en tu cuenta, cuanto quieres depositar: ");
        DepositarS = sc.nextInt();
        System.out.println("Se han añadido "+DepositarS+"$");
        this.Saldo+=DepositarS;
    }

    public void Retirar(){
        int RetirarS = 0;

        System.out.println("Tienes "+this.Saldo+"$ en tu cuenta, cuanto quieres retirar: ");
        RetirarS = sc.nextInt();
        
        if ((this.Saldo - RetirarS) < 0){
            System.out.println("No se puede retirar el saldo");
        }else{
            this.Saldo-=RetirarS;
            System.out.println("Dinero retirado");
        }
        
    }

    public void VerSaldo(){
        System.out.println("Hola "+this.Titular+" con Numero de cuenta "+this.NumeroCuenta);
        System.out.println("------------------------------------------------------------------");
        System.out.println("Tienes un saldo de "+this.Saldo+"$");
    }
}
