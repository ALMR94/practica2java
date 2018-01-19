package practica2;

/*1. Crear una tabla bidimensional de tamaño 5x5 y rellenarla de la siguiente forma: la
*posición T[n,m] debe contener n+m. Después se debe mostrar su contenido.*/

public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] num = new int[5][5];
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                  num[i][j]=i+j;              
            }            
        }
        System.out.println("Esta es la tabla impresa: ");
        for (int i = 0; i < num.length; i++) {
            System.out.println();
            for (int j = 0; j < num.length; j++) {
                  System.out.print(num[i][j] + " ");              
            }            
        }
    }
}
