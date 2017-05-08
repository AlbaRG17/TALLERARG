/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller1;

/**
 *
 * @author denis
 */
public class rectangulo {
    public double ancho;
    public double altura;
    
    public rectangulo(){
        ancho = 1;
        altura = 1;
    }
    
    public rectangulo(double ancho,double altura){
        this.ancho = ancho;
        this.altura = altura;
    }
    
    public double getArea(){
        double area = ancho * altura;
        return area;
    }
    
    public double getPerimetro(){
        double p = (ancho * 2) + (altura * 2);
        return p;
    }
    
  
}
