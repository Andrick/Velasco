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
public class Ejercicio16 {
    public int serie(int x, int y , int z){
        int cont = 0;
        int a = 0;
        int acum = 0;
        int vector[] = new int[z+1];
        if (y>z) {
            return 0;
        }
        if ((x<=0)||(x>255)||(y<=0)||(y>255)||(z<=0)||(z>255)) {
            return -1;
        }
        do {
            if (a==0) {
                vector[cont]=x;
            }else{
                vector[cont]=vector[cont-1]*a;
            }
            cont++;
            a=a+2;
        } while (z>=cont);
        for (int i = y-1; i < z; i++) {
            acum = acum + vector[i];
        }
        return acum;
    }
}
