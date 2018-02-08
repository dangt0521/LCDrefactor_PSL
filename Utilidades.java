/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lcdrefactor.util;

/**
 *
 * @author DanielFelipe
 */
public class Utilidades {

    private static final String caracterHorizontal = "-";
    private static final String caracterVertical = "|";
    private static final int ORIENTACION_HORIZONTAL = 0;
    private static final int ORIENTACION_VERTICAL = 1;

    public static String concatenar(String[] capas) {
        StringBuilder sb = new StringBuilder();
        for (String capa : capas) {
            if (sb.length() > 0) {
                sb.append('\n');
            }
            sb.append(capa);
        }
        return sb.toString();
    }

    public static String[] ordenarHorizontalmente(String[][] cadena) {
        assert cadena.length > 0;

        String[] resultado = cadena[0].clone();
        for (int i = 1; i < cadena.length; i++) {
            for (int j = 0; j < cadena[i].length; j++) {
                resultado[j] = resultado[j] + cadena[i][j];
            }
        }
        return resultado;
    }

    public static String definirCaracter(int orientacion) {
        return orientacion == ORIENTACION_HORIZONTAL ? caracterHorizontal
                : orientacion == ORIENTACION_VERTICAL ? caracterVertical : "";
    }

    public static int getDigito(String digits, int i) {
        return Integer.parseInt(Character.toString(digits.charAt(i)));
    }

    public static boolean isNumeric(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

}
