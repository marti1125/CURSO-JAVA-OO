package pe.egcc.prueba;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Gustavo Coronel
 * @blog   gcoronelc.blogspot.com
 * @email  gcoronelc@gmail.com
 */
public class Prueba07 {

   
   
   public static void main(String[] args) {
      
      // Creación de lista
      List<String> lista = new ArrayList<>();
      
      // Agregar elementos
      lista.add("Gustavo");
      lista.add("Gustavo");
      lista.add("Karla");
      lista.add("Cesar");
      lista.add("Paula");
      lista.add("Ana");

      // Recorrido de la lista
      for (String nombre : lista) {
         System.out.println(nombre);
      }
      
      // Ordenar la lista
      lista.sort((String o1, String o2) -> o1.compareTo(o2));
      
      // Recorrido de la lista
      System.out.println("------------------------------------");
      for (String nombre : lista) {
         System.out.println(nombre);
      }
   }
}
