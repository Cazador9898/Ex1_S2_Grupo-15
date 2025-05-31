/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exp_1_s1_grupo15;

/**
 *
 * @author guzma
 */
public class CuentaDeCredito extends Cliente{
    private int numeroCuentaCredito;
    private int saldoCredito;

    public CuentaDeCredito(int numeroCuentaCredito, int saldoCredito, String Rut, String Nombre, String ApellidoPaterno, String ApellidoMaterno, String Domicilio, String Comuna, int Telefono, CuentaCorriente cuentaCorriente) {
        super(Rut, Nombre, ApellidoPaterno, ApellidoMaterno, Domicilio, Comuna, Telefono, cuentaCorriente);
        this.numeroCuentaCredito = numeroCuentaCredito;
        this.saldoCredito = saldoCredito;
    }

    
    
        
            public void depositar ( int monto) {
     if (monto > 0){
     saldoCredito += monto;
         System.out.println("¡Deposito realizado de manera exitosa!");
         System.out.println("¡Saldo Actual: $" + saldoCredito +"pesos.");
     }else{
         System.out.println("El monto debe ser mayor a 0.");
     }
}


    public void girar (int monto){
        if (monto <= 0){
            System.out.println("EL monto debe ser mayor a cero");
        }else if (monto > saldoCredito) {
            System.out.println("Fondos insuficientes");
} else{
            saldoCredito -= monto;
            System.out.println("¡Giro realizado de manera exitosa!");
            System.out.println("Saldo Actual: $"+ saldoCredito + "pesos");
        }
}
          
    public void consultarSaldo (){
        System.out.println("Saldo Actual: $" + saldoCredito + "pesos.");
    
    }
    public int getNumeroCuenta(){
        return numeroCuentaCredito;
    }
    public int getSaldo(){
    return saldoCredito;
    }
}
