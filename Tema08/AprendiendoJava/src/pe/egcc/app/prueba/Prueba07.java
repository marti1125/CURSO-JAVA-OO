package pe.egcc.app.prueba;

/**
 *
 * @author Gustavo Coronel
 * @blog   gcoronelc.blogspot.com
 * @email  gcoronelc@gmail.com
 */
public class Prueba07 {

   public static void main(String[] args) {
      
      int[][] mat = {
         {12,56,32,18,76},
         {17,54,28,31,98},
         {78,65,54,38,61}
      };
      
      // Versión indexada
//      for (int i = 0; i < mat.length; i++) {
//         int[] fila = mat[i];
//         for (int j = 0; j < fila.length; j++) {
//            int dato = fila[j];
//            System.out.println(dato);
//         } 
//      }
      
      // Versión tipo colección
      for (int[] fila: mat) {
         for (int dato: fila) {
            System.out.println(dato);
         } 
      }
      
   }
}
