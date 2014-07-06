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
public class Ejercicio18 {
    public String[] Ordenar(String[] valores){
        for(int i=0;i<valores.length;i++) {
            for(int j=0;j<valores.length-i;j++) {
                if (valores[j].compareTo(valores[j+1])>0) {
                    String aux;
                    aux=valores[j];
                    valores[j]=valores[j+1];
                    valores[j+1]=aux;
                }
            }
        }
        return valores;
    }
    
}
