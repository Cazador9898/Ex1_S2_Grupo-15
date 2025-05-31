/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exp_1_s1_grupo15;

/**
 *
 * @author guzma
 */
public class CuentaDeAhorro extends Cliente{
    private int numeroCuentaAhorro;
    private int saldoAhorro;

    public CuentaDeAhorro(int numeroCuentaAhorro, int saldoAhorro, String Rut, String Nombre, String ApellidoPaterno, String ApellidoMaterno, String Domicilio, String Comuna, int Telefono, CuentaCorriente cuentaCorriente) {
        super(Rut, Nombre, ApellidoPaterno, ApellidoMaterno, Domicilio, Comuna, Telefono, cuentaCorriente);
        this.numeroCuentaAhorro = numeroCuentaAhorro;
        this.saldoAhorro = saldoAhorro;
    }


    
        
            public void depositar ( int monto) {
     if (monto > 0){
     saldoAhorro += monto;
         System.out.println("¡Deposito realizado de manera exitosa!");
         System.out.println("¡Saldo Actual: $" + saldoAhorro +"pesos.");
     }else{
         System.out.println("El monto debe ser mayor a 0.");
     }
}


    public void girar (int monto){
        if (monto <= 0){
            System.out.println("EL monto debe ser mayor a cero");
        }else if (monto > saldoAhorro) {
            System.out.println("Fondos insuficientes");
} else{
            saldoAhorro -= monto;
            System.out.println("¡Giro realizado de manera exitosa!");
            System.out.println("Saldo Actual: $"+ saldoAhorro + "pesos");
        }
}
          
    public void consultarSaldo (){
        System.out.println("Saldo Actual: $" + saldoAhorro + "pesos.");
    
    }
    public int getNumeroCuenta(){
        return numeroCuentaAhorro;
    }
    public int getSaldo(){
    return saldoAhorro;
    }
}
    

