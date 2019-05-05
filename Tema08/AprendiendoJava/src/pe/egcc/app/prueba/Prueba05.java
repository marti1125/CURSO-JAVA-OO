package pe.egcc.app.prueba;

/**
 *
 * @author Gustavo Coronel
 * @blog   gcoronelc.blogspot.com
 * @email  gcoronelc@gmail.com
 */
public class Prueba05 {
   
   public static void main(String[] args) {
      
      // Caso 1
      int[][] mat1;
      mat1 = new int[5][10];
      
      // Caso 2
      int[][] mat2 = new int[20][5];
      
      // Caso 3
      int[][] mat3 = {
         {12,56,32,18,76},
         {17,54,28,31,98},
         {78,65,54,38,61}
      };
      
      // Caso 4
      int[][] mat4;
      mat4 = new int[][]{
         {12,56,32,18,76},
         {17,54,28,31,98,54,32},
         {78,65,54,38,61,12}      
      };
      
      for (int i = 0; i < mat4.length; i++) {
         int[] fila = mat4[i];
         String filaDatos = "";
         for (int j = 0; j < fila.length; j++) {
            int dato = fila[j];
            filaDatos += dato + "\t";
         }
         System.out.println(filaDatos);
      }
      
      
   }

}
