/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package funciones;

/**
 *
 * @author Usuario
 */
public class Ejercicio21 {
    public String Matriz1(String [][]n){
        String res = null;
        int[][] M = new int[3][3];
        for (int a = 0; a < 3 / 2; a++) {
            for (int i = a; i < 3 - a; i++) {
            res = res + String.valueOf(M[a][i]);
        }
        for (int i = a; i <= 3 - a; i++) {
            res = res + String.valueOf(M[i][3 - a + 1]);
        }
        for (int i = 3 - a + 1; i >= a + 1; i--) {
            res = res + String.valueOf(M[3 - a + 1][i]);
        }
        for (int i = 3 - a + 1; i >= a + 1; i--) {
            res = res + String.valueOf(M[i][a]);
        }
        }
        if (3 % 2 == 1) {
            res = res + String.valueOf(M[3 / 2 + 1][3 / 2 + 1]);
        }
        return res;
    }
    
}
