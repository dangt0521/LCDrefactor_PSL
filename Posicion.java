/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lcdrefactor;

/**
 *
 * @author DanielFelipe
 */
public class Posicion {
    
    private int valor;
    private int orientacion;
    private boolean vacio;

    public void setValor(int valor){
        this.valor = valor;
    }
    
    public int getValor(){
        return valor;
    }
    
    public void setOrientacion(int orientacion) {
        this.orientacion = orientacion;
    }
    
    public int getOrientacion() {
        return orientacion;
    }
    
    public void setVacio(boolean vacio){
        this.vacio = vacio;
    }
    
    public boolean isVacio(){
        return vacio;
    }
    
}
