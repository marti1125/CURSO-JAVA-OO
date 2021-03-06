package pe.egcc.appcomp.prueba;

import pe.egcc.appcomp.model.Item;
import pe.egcc.appcomp.service.CompAbstract;
import pe.egcc.appcomp.service.FacturaService;

/**
 *
 * @author Gustavo Coronel
 * @blog   gcoronelc.blogspot.com
 * @email  gcoronelc@gmail.com
 */
public class Prueba01 {

   public static void main(String[] args) {
      // Dato
      Double total = 119.0;
      // Proceso
      CompAbstract service = new FacturaService();
      Item[] repo = service.procesar(total);
      // Reporte
      for (Item item : repo) {
         System.out.println(item.getConcepto() + " -> " + item.getImporte());
      }
      
   }
}
