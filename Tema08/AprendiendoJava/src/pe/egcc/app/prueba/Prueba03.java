package pe.egcc.app.prueba;

/**
 *
 * @author Gustavo Coronel
 * @blog   gcoronelc.blogspot.com
 * @email  gcoronelc@gmail.com
 */
public class Prueba03 {

   public static void main(String[] args) {
      int[][] notas = new int[3][5];
      mostrarMatriz(notas);
      
      notas[0][4] = 17;
      notas[1][2] = 15;
      notas[2][3] = 16;
      mostrarMatriz(notas);
   }

   private static void mostrarMatriz(int[][] notas) {
      System.out.println("---------------------------------");
      for (int i = 0; i < notas.length; i++) {
         int[] fila = notas[i];
         String filaDatos = "";
         for (int j = 0; j < fila.length; j++) {
            int dato = fila[j];
            filaDatos += dato + "\t";
         }
         System.out.println(filaDatos);
      }
   }
}
