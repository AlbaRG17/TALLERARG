/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller2;

import java.util.Date;

/**
 *
 * @author denis
 */
public class cuenta {
    private int id;
    private double saldo;
    private double interesanual;
    private Date fechaCreacion;
    
    public cuenta(){
        id = 0;
    }

    public cuenta(int id, double saldo) {
        this.id = id;
        this.saldo = saldo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getInteresanual() {
        return interesanual;
    }

    public void setInteresanual(double interesanual) {
        this.interesanual = interesanual;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    
    public double getInteresMensual(){
       double interesMensual = ((saldo * interesanual) / 100) / 12;
       return interesMensual;
    }
    
    public void retiro(double retiro){
        if(retiro < saldo){
            saldo = saldo - retiro;
        }
        else{
            System.out.println("El Saldo es insuficiente");
        }
    }
    
    public void deposito(double deposito){
        saldo = saldo + deposito;
    }

}
