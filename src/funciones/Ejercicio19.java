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
public class Ejercicio19 {
    public int Binario(int num){
        int coc = 0, res=0,binario = 0;
        while (num >= 2){
                coc = num / 2;
                res = num % 2;
                num = coc;
                if (res == 1) {
                    binario++;
            }
        }
        return binario;
    }
    
}
