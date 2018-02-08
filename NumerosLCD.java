/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lcdrefactor;

import lcdrefactor.util.Utilidades;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author DanielFelipe
 */
public class NumerosLCD {

    private static final String caracterEspacio = " ";
    private static Posicion p1 = new Posicion();
    private static Posicion p2 = new Posicion();
    private static Posicion p3 = new Posicion();
    private static Posicion p4 = new Posicion();
    private static Posicion p5 = new Posicion();
    private static Posicion p6 = new Posicion();
    private static Posicion p7 = new Posicion();

    private static ArrayList getNumero(int numero, int size) {
        String pos_inicial = caracterEspacio;
        String pos_cuatro = caracterEspacio;
        String pos_final = caracterEspacio;

        ArrayList caracteres = new ArrayList();
        Numero numero_pos = new Numero(numero);

        p1 = numero_pos.getPosicion_uno();
        p2 = numero_pos.getPosicion_dos();
        p3 = numero_pos.getPosicion_tres();
        p4 = numero_pos.getPosicion_cuatro();
        p5 = numero_pos.getPosicion_cinco();
        p6 = numero_pos.getPosicion_seis();
        p7 = numero_pos.getPosicion_siete();

        for (int i = 0; i < size; i++) {
            pos_inicial = p1.isVacio()
                    ? pos_inicial + caracterEspacio : pos_inicial
                    + Utilidades.definirCaracter(p1.getOrientacion());
        }
        caracteres.add(pos_inicial + caracterEspacio);

        for (int i = 0; i < size; i++) {
            String pos_medio = "";
            String pos_dos = p2.isVacio() ? caracterEspacio
                    : Utilidades.definirCaracter(p2.getOrientacion());
            String pos_tres = p3.isVacio() ? caracterEspacio
                    : Utilidades.definirCaracter(p3.getOrientacion());
            for (int j = 0; j < size; j++) {
                pos_medio = pos_medio + caracterEspacio;
            }
            pos_medio = pos_dos + pos_medio + pos_tres;
            caracteres.add(pos_medio);
        }

        for (int i = 0; i < size; i++) {
            pos_cuatro = p4.isVacio()
                    ? pos_cuatro + caracterEspacio : pos_cuatro
                    + Utilidades.definirCaracter(p4.getOrientacion());
        }
        caracteres.add(pos_cuatro + caracterEspacio);

        for (int i = 0; i < size; i++) {
            String pos_medio = "";
            String pos_cinco = p5.isVacio() ? caracterEspacio
                    : Utilidades.definirCaracter(p5.getOrientacion());
            String pos_seis = p6.isVacio() ? caracterEspacio
                    : Utilidades.definirCaracter(p6.getOrientacion());
            for (int j = 0; j < size; j++) {
                pos_medio = pos_medio + caracterEspacio;
            }
            pos_medio = pos_cinco + pos_medio + pos_seis;
            caracteres.add(pos_medio);
        }

        for (int i = 0; i < size; i++) {
            pos_final = p7.isVacio() ? pos_final + caracterEspacio
                    : pos_final + Utilidades.definirCaracter(p7.getOrientacion());
        }
        caracteres.add(pos_final + caracterEspacio);

        return caracteres;
    }

    private static Map<Integer, String[]> getCadenaSegmentos(int numero, int size) {
        Map<Integer, String[]> segmentos = new HashMap<>();
        ArrayList caracteres = getNumero(numero, size);
        String[] cadena = new String[caracteres.size()];
        for (int i = 0; i < caracteres.size(); i++) {
            cadena[i] = (String) caracteres.get(i);
        }
        segmentos.put(numero, cadena);
        return segmentos;
    }

    public static void recibirEntrada(String entrada) {
        String parametros[];
        if (!entrada.contains(",")) {
            throw new IllegalArgumentException("Cadena " + entrada
                    + " no contiene caracter ,");
        }
        parametros = entrada.split(",");
        if (!Utilidades.isNumeric(parametros[0])) {
            System.out.println("El tamaño digitado no es un número");
        } else if (parametros[1] == null || parametros[1].equals("") || !Utilidades.isNumeric(parametros[1])) {
            System.out.println("Por favor revise el número ingresado");
        } else if (parametros.length > 2) {
            System.out.println("Cadena " + entrada
                    + " contiene mas caracter ,");
        } else if (parametros.length < 2) {
            System.out.println("Cadena " + entrada
                    + " no contiene los parametros requeridos");
        }
        else {
            int numero = Integer.parseInt(parametros[1]);
            int size = Integer.parseInt(parametros[0]);
            if (size > 10 || size < 1){
                System.out.println("El tamaño de los digitos debe estar entre 1 y 10");
            } else {
                System.out.println(convertirALCD(numero, size));
            }
        }
    }

    private static String convertirALCD(int numero, int size) {
        String[][] segmentos = getSegmentos(numero, size);
        String[] resultado = Utilidades.ordenarHorizontalmente(segmentos);
        return Utilidades.concatenar(resultado);
    }

    private static String[][] getSegmentos(int numero, int size) {
        String digitos = String.valueOf(numero);
        String[][] resultado = new String[digitos.length()][];
        for (int i = 0; i < digitos.length(); i++) {
            resultado[i] = getSegmentosPorDigito(Utilidades.getDigito(digitos, i), size);
        }
        return resultado;
    }

    private static String[] getSegmentosPorDigito(int digito, int size) {
        String result[] = getCadenaSegmentos(digito, size).get(digito);
        if (null == result) {
            throw new RuntimeException(String.format("Dígito %d no encontrado", digito));
        }
        return result;
    }

}
