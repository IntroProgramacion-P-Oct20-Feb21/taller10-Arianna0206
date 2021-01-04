/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema1;

/**
 *
 * @author macbookair
 */
public class Problema5 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[][] estudiantes = {{"Sarah Ward", "Philip Payne"},
            {"Carrie Burton", "Lauren Rice"},{"Emma Escobar", "Lori Flores"},
            {"Steven West", "Toni Martin"}};
        char cadena;
        String mensajeFinal= "";
        for (int fila = 0; fila < estudiantes.length; fila++) {
            for (int columna = 0; columna < estudiantes[fila].length;
                    columna++){
                cadena =  estudiantes[fila][columna].charAt(0);
                if(String.valueOf(cadena).equals("S")||
                        (String.valueOf(cadena).equals("P")||
                        (String.valueOf(cadena).equals("T")))){
                    mensajeFinal = String.format("%s%s\n",
                            mensajeFinal,estudiantes[fila][columna]);
                }
            }
        }
        System.out.println("Los estudiantes son:\n" + mensajeFinal);
    }
    
}
