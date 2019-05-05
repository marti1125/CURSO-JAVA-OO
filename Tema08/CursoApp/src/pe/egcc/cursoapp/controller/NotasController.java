package pe.egcc.cursoapp.controller;

import pe.egcc.cursoapp.dto.AlumnoDto;
import pe.egcc.cursoapp.dto.EstadisticaDto;
import pe.egcc.cursoapp.service.NotasService;

/**
 *
 * @author Gustavo Coronel
 * @blog   gcoronelc.blogspot.com
 * @email  gcoronelc@gmail.com
 */
public class NotasController {

   private NotasService service;

   public NotasController() {
      service = new NotasService();
   }
   
   public void registrarNotas( AlumnoDto dto){
      service.registrarNotas(dto);
   }
   
   public AlumnoDto[] obtenerListado(){
      return service.obtenerListado();
   }
   
   public EstadisticaDto[] obtenerEstadistica(){
      return service.obtenerEstadistica();
   }
   
}
