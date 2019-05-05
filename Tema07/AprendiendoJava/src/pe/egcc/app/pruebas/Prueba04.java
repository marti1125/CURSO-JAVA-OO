package pe.egcc.app.pruebas;

/**
 *
 * @author Gustavo Coronel
 * @blog   gcoronelc.blogspot.com
 * @email  gcoronelc@gmail.com
 */
public class Prueba04 {

   public static void main(String[] args) {
      try {
         // Datos
         int n1 = 30;
         int n2 = 0;
         // Control
         if(n2 == 0){
            throw new Exception("No es posible dividir por cero (0).");
         }
         // Proceso
         int n3 = n1 / n2;
         // Reporte
         System.out.println("n1: " + n1);
         System.out.println("n2: " + n2);
         System.out.println("n3: " + n3);
      } catch (Exception e) {
         System.err.println(e.getMessage());
      }
   
   }
   
}
