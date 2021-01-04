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
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[][] notas = {{9,10,7,8},{10,5,7,9},{7,9.4,10,9}};
        String[] estudiantes = {"Jerry Ponce","Gabriela Lewis","David Bell"};
        double[] promedios = new double[3];
        double sumaNotas;
        double promedio;
        String mensajeFinal = "";
        for (int fila = 0; fila < notas.length; fila++) {
            sumaNotas = 0;
            for (int columna = 0; columna < notas[fila].length;columna++ ){
                sumaNotas = sumaNotas + notas[fila][columna];
                promedio = sumaNotas / notas[fila].length;
                promedios[fila] = promedio;
                }
            mensajeFinal = String.format("%sEstudiante: %s tiene un "
                    + "promedio de %.2f\n", 
                        mensajeFinal,
                        estudiantes[fila], 
                        promedios[fila]);
            }
        System.out.printf("%s",mensajeFinal);
    }
    
}
