
package lcdrefactor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DanielFelipe
 */
public class LCDRefactorTest {

    static final String CADENA_FINAL = "0,0";

    public static void main(String[] args) {

        List<String> listaComando = new ArrayList<>();
        String entrada;
        
        try {
            try (Scanner lector = new Scanner(System.in)) {

                System.out.println("Bienvenido/a. Por favor ingrese la entrada en el siguiente formato:");
                System.out.println("x,y En donde x es el tamaño de los digitos & y es el número a mostrar en pantalla. Para finalizar el ingreso de entradas por favor digite 0,0");
                System.out.println("");
                
                do {
                    System.out.print("Entrada: ");
                    entrada = lector.next();
                    if (!entrada.equalsIgnoreCase(CADENA_FINAL)) {
                        listaComando.add(entrada);
                    }
                } while (!entrada.equalsIgnoreCase(CADENA_FINAL));
            }
            
            System.out.println("Los resultados son los siguientes:");
            Iterator<String> iterator = listaComando.iterator();
            while (iterator.hasNext()) {
                try {
                    NumerosLCD.recibirEntrada(iterator.next());
                } catch (Exception ex) {
                    System.out.println("Error: " + ex.getMessage());
                }
            }
            System.out.println("");
            System.out.println("¡Gracias!");
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

    }

}
