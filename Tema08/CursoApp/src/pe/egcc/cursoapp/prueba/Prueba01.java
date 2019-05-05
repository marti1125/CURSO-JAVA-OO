package pe.egcc.cursoapp.prueba;

import pe.egcc.cursoapp.dto.AlumnoDto;
import pe.egcc.cursoapp.service.NotasService;

/**
 *
 * @author Gustavo Coronel
 * @blog   gcoronelc.blogspot.com
 * @email  gcoronelc@gmail.com
 */
public class Prueba01 {

   public static void main(String[] args) {
      // Datos
      AlumnoDto dto1 = new AlumnoDto("Gustavo", 18, 19, 20, 17);
      AlumnoDto dto2 = new AlumnoDto("Pedro", 13, 15, 17, 10);
      AlumnoDto dto3 = new AlumnoDto("Olga", 10, 16, 18, 15);
      AlumnoDto dto4 = new AlumnoDto("Martha", 15, 9, 15, 16);
      AlumnoDto dto5 = new AlumnoDto("Valeria", 13, 18, 8, 15);
      
      // Objeto Service
      NotasService service = new NotasService();
      
      // Registrar notas
      service.registrarNotas(dto1);
      service.registrarNotas(dto2);
      service.registrarNotas(dto3);
      service.registrarNotas(dto4);
      service.registrarNotas(dto5);
      
      // Listado
      AlumnoDto[] listado = service.obtenerListado();
      for (AlumnoDto dto : listado) {
         System.out.println(dto.getNombre() + "\t" + dto.getPromedio());
      }
   }
   
}
