/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

import java.util.Arrays;

/*4. Crear una tabla de tamaño 7x7 y rellenarla de forma que los elementos de la
diagonal principal sean 1 y el resto 0.*/

public class ejercicio4 {

    public static void main(String[] args) {
        int[][] tabla = new int[7][7];
        int i;
        
        for (i = 0; i < tabla.length; i++) {
            tabla[i][i] = 1;
        }

        System.out.println("Así quedaría la tabla impresa: ");
        for (i = 0; i < tabla.length; i++) {
            System.out.println(Arrays.toString(tabla[i]));
        }
    }
}
