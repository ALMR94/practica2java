package practica2;

import java.util.Scanner;

/*3. Crear y cargar dos matrices de tamaño 3x3, sumarlas y mostrar su suma.*/
public class ejercicio3 {
    public static void main(String[] args) {
        int[][] tabla1 = new int[3][3];
        int[][] tabla2 = new int[3][3];
        Scanner num = new Scanner(System.in);
        System.out.println("Introduce los 9 números para la tabla 1.");
        for (int i = 0; i < tabla1.length; i++) {
            for (int j = 0; j < tabla1.length; j++) {
                tabla1[i][j]=num.nextInt();              
            }            
        }
        System.out.println("Ahora introduce otros 9 números para la tabla 2.");
        for (int i = 0; i < tabla2.length; i++) {
            for (int j = 0; j < tabla2.length; j++) {
                tabla2[i][j]=num.nextInt();              
            }            
        }
        System.out.println("\n\nEsta es la primera tabla.");
        for (int i = 0; i < tabla1.length; i++) {
            System.out.println();
            for (int j = 0; j < tabla1.length; j++) {
                  System.out.print(tabla1[i][j] + " ");              
            }            
        }
        System.out.println("\n\nY esta es la segunda.");
        for (int i = 0; i < tabla2.length; i++) {
            System.out.println();
            for (int j = 0; j < tabla2.length; j++) {
                  System.out.print(tabla2[i][j] + " ");              
            }            
        }
        int[][] suma = new int[3][3];
        System.out.println("\n\nAhora sumamos las dos tablas y... este es el resultado ;)");
        for (int i = 0; i < suma.length; i++) {
            for (int j = 0; j < suma.length; j++) {
                  suma[i][j]=  tabla1[i][j] + tabla2[i][j];            
            }            
        }
        for (int i = 0; i < suma.length; i++) {
            System.out.println();
            for (int j = 0; j < suma.length; j++) {
                  System.out.print(suma[i][j] + " ");              
            }            
        }
    }    
}
