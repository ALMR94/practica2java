package practica2;

/*2. Crear y cargar una tabla de tamaño 4x4 y decir si es simétrica o no, es decir, si se
obtiene la misma tabla al cambiar filas por columnas. */

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        int[][] num = new int[4][4];
        boolean simetria;
        Scanner numero = new Scanner(System.in);
        System.out.println("Ingresa los números.");
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                  num[i][j]=numero.nextInt();              
            }            
        }
        System.out.println("\nAquí tenemos la tabla impresa: ");
        for (int i = 0; i < num.length; i++) {
            System.out.println();
            for (int j = 0; j < num.length; j++) {
                  System.out.print(num[i][j] + " ");              
            }            
        }
        System.out.println("\n\nComprobando si la tabla es simetrica...");
        simetria = true;
        int comprobsim = num.length -1;
        int i=0;
        while (i < comprobsim && simetria == true) {            
            int j=0;
            while (j < comprobsim && simetria == true) {                
                if(num[i][j] != num[j][i]){
                    simetria = false;
                }
                j++;
            }
          i++;
        }
        if(simetria){
            System.out.println("¡La tabla ha resultado ser simétrica!");
        }
        else{
            System.out.println("La tabla no es simétrica.");
        }
    }
}
