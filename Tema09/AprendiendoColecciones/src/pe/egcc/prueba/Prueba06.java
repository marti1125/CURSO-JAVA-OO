package pe.egcc.prueba;

import java.util.ArrayList;
import java.util.List;
import pe.egcc.dto.EmpleadoDto;

/**
 *
 * @author Gustavo Coronel
 * @blog   gcoronelc.blogspot.com
 * @email  gcoronelc@gmail.com
 */
public class Prueba06 {
   
   public static void main(String[] args) {
      
      List<EmpleadoDto> lista = new ArrayList<>();
      
      lista.add(new EmpleadoDto("Gustavo", 25000.0));
      lista.add(new EmpleadoDto("Mariela", 18000.0));
      lista.add(new EmpleadoDto("Pedro", 8000.0));
      lista.add(new EmpleadoDto("Ana", 12000.0));
      lista.add(new EmpleadoDto("Jessica", 10000.0));
      
      for(int i = 0; i < lista.size(); i++){
         
         EmpleadoDto dto = lista.get(i);
         System.out.println(dto.getNombre() + " - " + dto.getSueldo());
         
      }
      
   }

}
