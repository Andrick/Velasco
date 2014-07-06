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
public class Ejercicio20 {
    public int particion(int num){
        int total = num;
        int count = 0;
	  for(int numParts=1; numParts<=total; ++numParts) {
	    count += particion(num, numParts);
	  }
	  return count;
    }
    
    public int particion(int sum, int numParts) {
	  if ( numParts > sum ) {
	    return 0;
	  } else if ( numParts == sum ) {
	    return 1;
	  } else {
	    return particion(sum-1, numParts-1) +
	           particion(sum-numParts, numParts);
	  }
	}  

    
}
