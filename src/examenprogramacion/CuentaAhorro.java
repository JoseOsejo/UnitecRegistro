/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenprogramacion;

import java.util.Calendar;

/**
 *
 * @author jcoq2
 */
public final class CuentaAhorro extends CuentaBancaria
{
    private Calendar ultimaModificacion;
    private boolean cuentaActiva;

    public CuentaAhorro(int numeroCuenta, String nombreCliente) {
        super(numeroCuenta, nombreCliente);
        this.ultimaModificacion = Calendar.getInstance();
        this.cuentaActiva = true;
    }

    public Calendar getUltimaModificacion() {
        return ultimaModificacion;
    }

    public void setUltimaModificacion(Calendar ultimaModificacion) {
        this.ultimaModificacion = ultimaModificacion;
    }

    public boolean isCuentaActiva() {
        return cuentaActiva;
    }

    public void setCuentaActiva(boolean cuentaActiva) {
        this.cuentaActiva = cuentaActiva;
    }
    
    
    @Override
    public double deposito(double m){
        if(this.cuentaActiva == true){
            return super.deposito(m);
        }else 
        {
            this.cuentaActiva = true;
            double montoPorcentaje = m*0.9;
            return super.saldoDisponible+=montoPorcentaje;
        }
        
    }
    
    @Override
    public boolean retiro(double cantidadRetiro)
    {
        if(this.cuentaActiva == true && super.saldoDisponible>cantidadRetiro){
            super.saldoDisponible -= cantidadRetiro;
            this.ultimaModificacion = Calendar.getInstance();
            return true;
        }else{
            this.cuentaActiva = true;
            super.saldoDisponible -=cantidadRetiro;
            this.ultimaModificacion = Calendar.getInstance();
            return true;
        }
        
    }
    
    
    public final void desactivar(){
        Calendar  hoy = Calendar.getInstance();
        hoy.add(Calendar.MONTH, -6);
        if(hoy.before(this.ultimaModificacion)){
            this.cuentaActiva = false;
        }
    }
    
    @Override
    public String toString(){
        return super.toString()+" cuenta Activa o Desactivada"+ cuentaActiva;
    }
    
}
