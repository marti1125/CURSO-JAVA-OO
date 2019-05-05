package pe.egcc.prueba;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Gustavo Coronel
 * @blog   gcoronelc.blogspot.com
 * @email  gcoronelc@gmail.com
 */
public class Prueba08 {

   public static void main(String[] args) {
      
      // Variable de tipo colección
      Map<String,Double> lista = new HashMap<>();
      
      // Datos
      lista.put("P001", 345.67);
      lista.put("P002", 500.0);
      lista.put("P003", 657.23);
      lista.put("P004", 890.45);
      lista.put("P005", 754.65);
      lista.put("P003", 987.54);
      
      // Obtener un valor individual
      System.out.println("P003: " + lista.get("P003"));

      // Recorrido de la coleccion
      Set<String> claves = lista.keySet();
      System.out.println("--------------------------------");
      for (String clave : claves) {
         System.out.println(clave + " - " + lista.get(clave));
      }
      
   }
   
   
}
