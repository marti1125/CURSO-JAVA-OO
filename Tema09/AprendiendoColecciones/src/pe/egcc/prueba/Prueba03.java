package pe.egcc.prueba;

import java.util.HashSet;
import java.util.Set;
import pe.egcc.dto.EmpleadoDto;

/**
 *
 * @author Gustavo Coronel
 * @blog   gcoronelc.blogspot.com
 * @email  gcoronelc@gmail.com
 */
public class Prueba03 {
   
   public static void main(String[] args) {
      
      // Creando la colección
      Set<EmpleadoDto> lista = new HashSet<>();

      // Agregar datos
      EmpleadoDto dtoGustavo = new EmpleadoDto("Gustavo", 20000.0);
      lista.add(dtoGustavo);
      lista.add(dtoGustavo);
      lista.add(dtoGustavo);
      lista.add(new EmpleadoDto("Karla", 10000.0));
      lista.add(new EmpleadoDto("Angel", 15000.0));
      lista.add(new EmpleadoDto("Delia", 18000.0));
      
      // Mostrar la colección
      for (EmpleadoDto dto : lista) {
         System.out.println(dto.getNombre() + " - " + dto.getSueldo());
      }
      
   }

}
