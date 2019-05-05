package pe.egcc.app.pruebas;

import java.util.logging.Level;
import java.util.logging.Logger;
import pe.egcc.app.excepciones.NotaFueraDeRango;

/**
 *
 * @author Gustavo Coronel
 * @blog   gcoronelc.blogspot.com
 * @email  gcoronelc@gmail.com
 */
public class Prueba06 {

   public static void main(String[] args) {
      try {
         // Datos
         int n1 = -2;
         int n2 = 18;
         // Control
         validar(n1);
         validar(n2);
         // Proceso
         int n3 = (n1 + n2)/2;
         // Reporte
         System.out.println("n1: " + n1);
         System.out.println("n2: " + n2);   
         System.out.println("n3: " + n3);
      } catch (NotaFueraDeRango ex) {
         System.err.println(ex.getMessage());
      }
   }

   private static void validar(int nota) throws NotaFueraDeRango {
      if(nota < 0 || nota > 20){
         throw new NotaFueraDeRango();
      }
   }
   
}
