package pe.egcc.app.prueba;

/**
 *
 * @author Gustavo Coronel
 * @blog   gcoronelc.blogspot.com
 * @email  gcoronelc@gmail.com
 */
public class Prueba06 {

   public static void main(String[] args) {
      
      int vector[] = {43,21,34,12,89,54};
      
      // Recorrido indexado
//      for (int i = 0; i < vector.length; i++) {
//         int dato = vector[i];
//         System.out.println(i + ".- " + dato);
//      }
      
      // Recorrido tipo coleacción
      for (int dato : vector) {
         System.out.println(dato);
      }
      
   }
}
