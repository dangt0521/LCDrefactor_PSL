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
public final class Numero {
    private final int ORIENTACION_HORIZONTAL = 0;
    private final int ORIENTACION_VERTICAL = 1;
    private Posicion posicion_uno = new Posicion();
    private Posicion posicion_dos = new Posicion();
    private Posicion posicion_tres = new Posicion();
    private Posicion posicion_cuatro = new Posicion();
    private Posicion posicion_cinco = new Posicion();
    private Posicion posicion_seis = new Posicion();
    private Posicion posicion_siete = new Posicion();
    
    
    public Numero(int numero){
        posicion_uno.setOrientacion(ORIENTACION_HORIZONTAL);
        posicion_dos.setOrientacion(ORIENTACION_VERTICAL);
        posicion_tres.setOrientacion(ORIENTACION_VERTICAL);
        posicion_cuatro.setOrientacion(ORIENTACION_HORIZONTAL);
        posicion_cinco.setOrientacion(ORIENTACION_VERTICAL);
        posicion_seis.setOrientacion(ORIENTACION_VERTICAL);
        posicion_siete.setOrientacion(ORIENTACION_HORIZONTAL);
        setPosicionPorNumero(numero);
    }
    
    public void setPosicionPorNumero(int numero){
        switch(numero){
            case 0:
                posicion_uno.setVacio(false);
                posicion_dos.setVacio(false);
                posicion_tres.setVacio(false);
                posicion_cuatro.setVacio(true);
                posicion_cinco.setVacio(false);
                posicion_seis.setVacio(false);
                posicion_siete.setVacio(false);
                break;
            case 1:
                posicion_uno.setVacio(true);
                posicion_dos.setVacio(true);
                posicion_tres.setVacio(false);
                posicion_cuatro.setVacio(true);
                posicion_cinco.setVacio(true);
                posicion_seis.setVacio(false);
                posicion_siete.setVacio(true);
                break;
            case 2:
                posicion_uno.setVacio(false);
                posicion_dos.setVacio(true);
                posicion_tres.setVacio(false);
                posicion_cuatro.setVacio(false);
                posicion_cinco.setVacio(false);
                posicion_seis.setVacio(true);
                posicion_siete.setVacio(false);
                break;
            case 3:
                posicion_uno.setVacio(false);
                posicion_dos.setVacio(true);
                posicion_tres.setVacio(false);
                posicion_cuatro.setVacio(false);
                posicion_cinco.setVacio(true);
                posicion_seis.setVacio(false);
                posicion_siete.setVacio(false);
                break;
            case 4:
                posicion_uno.setVacio(true);
                posicion_dos.setVacio(false);
                posicion_tres.setVacio(false);
                posicion_cuatro.setVacio(false);
                posicion_cinco.setVacio(true);
                posicion_seis.setVacio(false);
                posicion_siete.setVacio(true);
                break;
            case 5:
                posicion_uno.setVacio(false);
                posicion_dos.setVacio(false);
                posicion_tres.setVacio(true);
                posicion_cuatro.setVacio(false);
                posicion_cinco.setVacio(true);
                posicion_seis.setVacio(false);
                posicion_siete.setVacio(false);
                break;
            case 6:
                posicion_uno.setVacio(false);
                posicion_dos.setVacio(false);
                posicion_tres.setVacio(true);
                posicion_cuatro.setVacio(false);
                posicion_cinco.setVacio(false);
                posicion_seis.setVacio(false);
                posicion_siete.setVacio(false);
                break;
            case 7:
                posicion_uno.setVacio(false);
                posicion_dos.setVacio(true);
                posicion_tres.setVacio(false);
                posicion_cuatro.setVacio(true);
                posicion_cinco.setVacio(true);
                posicion_seis.setVacio(false);
                posicion_siete.setVacio(true);
                break;
            case 8:
                posicion_uno.setVacio(false);
                posicion_dos.setVacio(false);
                posicion_tres.setVacio(false);
                posicion_cuatro.setVacio(false);
                posicion_cinco.setVacio(false);
                posicion_seis.setVacio(false);
                posicion_siete.setVacio(false);
                break;
            case 9:
                posicion_uno.setVacio(false);
                posicion_dos.setVacio(false);
                posicion_tres.setVacio(false);
                posicion_cuatro.setVacio(false);
                posicion_cinco.setVacio(true);
                posicion_seis.setVacio(false);
                posicion_siete.setVacio(false);
                break;
        }
    }

    public Posicion getPosicion_uno() {
        return posicion_uno;
    }

    public void setPosicion_uno(Posicion posicion_uno) {
        this.posicion_uno = posicion_uno;
    }

    public Posicion getPosicion_dos() {
        return posicion_dos;
    }

    public void setPosicion_dos(Posicion posicion_dos) {
        this.posicion_dos = posicion_dos;
    }

    public Posicion getPosicion_tres() {
        return posicion_tres;
    }

    public void setPosicion_tres(Posicion posicion_tres) {
        this.posicion_tres = posicion_tres;
    }

    public Posicion getPosicion_cuatro() {
        return posicion_cuatro;
    }

    public void setPosicion_cuatro(Posicion posicion_cuatro) {
        this.posicion_cuatro = posicion_cuatro;
    }

    public Posicion getPosicion_cinco() {
        return posicion_cinco;
    }

    public void setPosicion_cinco(Posicion posicion_cinco) {
        this.posicion_cinco = posicion_cinco;
    }

    public Posicion getPosicion_seis() {
        return posicion_seis;
    }

    public void setPosicion_seis(Posicion posicion_seis) {
        this.posicion_seis = posicion_seis;
    }

    public Posicion getPosicion_siete() {
        return posicion_siete;
    }

    public void setPosicion_siete(Posicion posicion_siete) {
        this.posicion_siete = posicion_siete;
    }
    
}
