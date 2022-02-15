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
public final class CuentaPlazoFijo extends CuentaBancaria
{
    private double intereses;
    private static final double TASA = 0.15;

    public CuentaPlazoFijo(int numeroCuenta, String nombreCliente) {
        super(numeroCuenta, nombreCliente);
        this.intereses = 0;
    }
    
    
    @Override
    public boolean retiro(double m){
        if(m<=intereses){
         intereses-=m;
         return true;
    }
        return false;
    }
    
    
}
