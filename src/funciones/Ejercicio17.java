/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package funciones;

import java.util.List;
import java.util.StringTokenizer;

/**
 *
 * @author Usuario
 */
public class Ejercicio17 {
    public String letraanumeros(String numero){
        String[] Letras = {"UNO", "DOS", "TRES", "CUATRO", "CINCO", "SEIS", "SIETE", "OCHO", "NUEVE",
        "DIEZ", "ONCE", "DOCE", "TRECE", "CATORCE", "QUINCE", "DIECISEIS", "DIECISIETE", "DIECIOCHO", "DIECINUEVE",
        "VEINTE", "TREINTA", "CUARENTA", "CINCUENTA", "SESENTA", "SETENTA", "OCHENTA", "NOVENTA",
        "CIEN", "CIENTO", "DOSCIENTOS"};
        Integer[] Valores = {1, 2, 3, 4, 5, 6, 7, 8, 9,
        10, 11, 12, 13, 14, 15, 16, 17, 18, 19,
        20, 30, 40, 50, 60, 70, 80, 90,
        100, 100, 200};
        
        List lstLetras = java.util.Arrays.asList(Letras);
        StringTokenizer st = new StringTokenizer(numero);
        Integer numer = 0;
        while (st.hasMoreTokens()) {
            String t = st.nextToken();
            if (lstLetras.indexOf(t) > -1) {
                numer += Valores[lstLetras.indexOf(t)];
            }
        }
        if ((numer>255)) {
            return String.valueOf(-1);
        }
        return String.valueOf(numer);
    }
}
