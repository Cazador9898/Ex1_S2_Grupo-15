/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exp_1_s2_grupo15;

/**
 *
 * @author guzma
 */
public class CuentaDeCredito extends CuentaBancaria{
private int limiteCredito = 1500000;
    
    @Override
    public void depositar ( int monto) {
     if (monto > 0){
     saldo += monto;
         System.out.println("¡Deposito realizado de manera exitosa!");
         System.out.println("¡Saldo Actual: $" + limiteCredito +"pesos.");
     }else{
         System.out.println("El monto debe ser mayor a 0.");
     }
}

    @Override
    public void girar (int monto){
        if (monto <= 0){
            System.out.println("El monto debe ser mayor a cero");
        }else if ((saldo - monto) < -limiteCredito){
            System.out.println("Excede el limite de crédito");
        }else {
        saldo -= monto;
        System.out.println("Giro exitoso. Saldo: $" + saldo);
        }
}
     @Override     
    public void consultarSaldo (){
        System.out.println("Saldo Actual: $" + saldo + "pesos.");
    
    }
}
