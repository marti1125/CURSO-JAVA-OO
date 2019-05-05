package pe.egcc.prueba;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Gustavo Coronel
 * @blog   gcoronelc.blogspot.com
 * @email  gcoronelc@gmail.com
 */
public class Prueba01 {
   
   public static void main(String[] args) {
      
      // Creando la colección
      Set<String> lista = new HashSet<>();

      // Agregar datos
      lista.add("Gustavo");
      lista.add("Gustavo");
      lista.add("Karla");
      lista.add("Angel");
      lista.add("Delia");
      
      // Mostrar la colección
      for (String nombre : lista) {
         System.out.println(nombre);
      }
      
   }

}
