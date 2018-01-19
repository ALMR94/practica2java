package practica2;

import java.util.Scanner;

/*6. Crear una matriz “marco” cuyo tamaño se pedirá al usuario por teclado. Todos sus
elementos deben ser 0 salvo los de los bordes que deben ser 1. Mostrar la matriz.*/
public class ejercicio6 {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        System.out.println("Ingresa el número para la altura del marco:");
        int altura=numero.nextInt();
        System.out.println("Ingresa el número para la base del marco:");
        int base=numero.nextInt();
        int[][] matriz = new int[altura][base];
                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz[0].length; j++) {
                        matriz[i][j] = 0;
                        matriz[i][0] = 1;
                        matriz[0][j] = 1;
			matriz[i][base-1] = 1;
			matriz[altura-1][j] = 1;
			}
		}
                System.out.println("Así nos queda la matriz 'marco' con la altura y base introducidos: ");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.print(matriz[i][j]);
			}
			System.out.println();
		}
        }
}

