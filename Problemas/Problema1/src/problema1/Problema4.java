/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author macbookair
 */
public class Problema4 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double[][] datos = new double[2][2];
        double valor;
        String mensajeFinal = "";
        for (int fila = 0; fila < datos.length; fila++) {
            for (int columna = 0; columna < datos.length; columna++) {
                System.out.println("Ingrese un valor");
                valor = entrada.nextDouble();
                System.out.printf("[%d][%d] = %.2f\n",fila,columna,valor);
            }
        }
    } 
}


