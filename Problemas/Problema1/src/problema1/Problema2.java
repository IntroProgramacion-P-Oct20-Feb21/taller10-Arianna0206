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
public class Problema2 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String[] vendedores = {"Jessica Cole","Robert Wallace"};
        double[][] ventas = new double[2][5];
        double venta;
        double sumaTotal = 0;
        String mensajeFinal = "";
        for (int fila = 0; fila < vendedores.length; fila++) {
            for (int columna = 0; columna < ventas.length;columna++ ){
                System.out.println("Ingrese la venta del día");
                venta = entrada.nextDouble();
                sumaTotal = sumaTotal + venta;
                }
            }
            for(int fila = 0; fila < vendedores.length; fila++){
            System.out.printf("Vendedor [%d] %s\n",fila,vendedores[fila]);
        }
            System.out.printf("Han realizado un total de $%.2f en ventas\n",
                    sumaTotal);
    }
}

