 /*
        Referencia para obtener el valor cualitativo de una nota numérica
        0 - 2.9   Insuficiente
        3 - 4.9   Regular
        5 - 7.9   Buena
        8 - 9.5   Muy Buena
        9.6 - 10  Sobresaliente  
        */
package problema1;

/**
 *
 * @author macbookair
 */
public class Problema3 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[][] notasCualitativas = new String[3][3];
	double[][] notasCuantitativas = {{7.1, 8, 10}, {3, 7, 9}, {10, 9, 2.1}};
        double notas;
        String mensajeFinal = "";
        
        for (int fila = 0; fila < notasCualitativas.length; fila++) {
            
            for (int columna = 0; columna < notasCualitativas[fila].length; 
                    columna++) {
                notas = notasCuantitativas[fila][columna];
                
                if((notas >= 0) && (notas <= 2.9)){
                        mensajeFinal = String.format("[%d][%d] = %.1f es "
                                + "Insuficiente", 
                                fila,
                                columna,
                                notasCuantitativas[fila][columna]);
                    }else{
                    if((notas >= 3) && (notas <= 4.9)){
                        mensajeFinal = String.format("[%d][%d] = %.1f es "
                                + "Regular",
                                fila,
                                columna,
                                notasCuantitativas[fila][columna]);
                    }else{
                        if((notas >= 5) && (notas <= 7.9)){
                            mensajeFinal = String.format("[%d][%d] = %.1f es "
                                    + "Buena",
                                    fila,
                                    columna,
                                    notasCuantitativas[fila][columna]);
                        }else{
                            if((notas >= 8) && (notas <= 9.5)){
                                mensajeFinal = String.format("[%d][%d] = %.1f "
                                        + " es Muy Buena",
                                        fila,
                                        columna,
                                        notasCuantitativas[fila][columna]);
                            }else{
                                if((notas >= 9.6) && (notas <= 10)){
                                    mensajeFinal = String.format("[%d][%d] = "
                                            + "%.1f es Sobresaliente",
                                            fila,
                                            columna,
                                            notasCuantitativas[fila][columna]);
                                }
                            }
                        }
                    }
                }
                System.out.printf("%s\n",mensajeFinal);
            }
        }
    }
}

