/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenprogramacion;

/**
 *
 * @author jcoq2
 */
public abstract class CuentaBancaria 
{
    //atributos numero cuenta nombre de clinete y otro 
    protected int numeroCuenta;
    protected String nombreCliente;
    protected double saldoDisponible;
    
    public CuentaBancaria(int numeroCuenta,String nombreCliente)
    {
    this.numeroCuenta = numeroCuenta;
    this.nombreCliente = nombreCliente;
    this.saldoDisponible = 500;
    }
    
    
    public double deposito(double m)
    {
        if(m>0){
            return this.saldoDisponible+=m;
        }else{
      return this.saldoDisponible;
        }
    }
    
    
    public abstract boolean retiro(double m);

    @Override
    public String toString() {
        return "CuentaBancaria{" + "numeroCuenta=" + numeroCuenta + ", nombreCliente=" + nombreCliente + ", saldoDisponible=" + saldoDisponible + '}';
    }
    
    
}
