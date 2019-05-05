package pe.egcc.cursoapp.service;

import pe.egcc.cursoapp.dto.AlumnoDto;

/**
 *
 * @author Gustavo Coronel
 * @blog   gcoronelc.blogspot.com
 * @email  gcoronelc@gmail.com
 */
class Datos {

   private Datos() {
   }

   // Cantidad maxima de alumno
   static final int TOTAL = 100;
   
   // Lista de alumnos
   static AlumnoDto[] lista;
   
   // Cantidad actual de alumnos
   static int contador;
   
   static {
      lista = new AlumnoDto[TOTAL];
      contador = 0;
   }
   
}
