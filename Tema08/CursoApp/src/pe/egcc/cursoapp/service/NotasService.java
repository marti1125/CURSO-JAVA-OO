package pe.egcc.cursoapp.service;

import java.util.Arrays;
import pe.egcc.cursoapp.dto.AlumnoDto;
import pe.egcc.cursoapp.dto.EstadisticaDto;

/**
 *
 * @author Gustavo Coronel
 * @blog   gcoronelc.blogspot.com
 * @email  gcoronelc@gmail.com
 */
public class NotasService {
   
   
   public AlumnoDto[] obtenerListado(){
      if(Datos.contador == 0){
         throw new RuntimeException("No hay ningun alumno registrado.");
      }
      AlumnoDto lista2[];
      lista2 = new AlumnoDto[Datos.contador];
      for (int i = 0; i < lista2.length; i++) {
         lista2[i] = Datos.lista[i];
      }
      return lista2;
   }
   
   public void registrarNotas( AlumnoDto dto ){
      // Verificar si hay espacio
      if( Datos.contador >= Datos.TOTAL ){
         throw new RuntimeException("No hay espacio para mas alumnos.");
      }
      // Proceso
      calcularPromedio( dto );
      Datos.lista[Datos.contador] = dto;
      Datos.contador++;
   }

   private void calcularPromedio(AlumnoDto dto) {
      int[] datos = {dto.getNota1(), dto.getNota2(), 
         dto.getNota3(), dto.getNota4()};
      Arrays.sort(datos);
      int prom;
      prom = (dto.getNota1() + dto.getNota2() + dto.getNota3()
              + dto.getNota4() - datos[0]) / 3;
      dto.setPromedio(prom);
   }

   public EstadisticaDto[] obtenerEstadistica(){
      EstadisticaDto repo[] = {
         new EstadisticaDto("Nota Mayor", obtenerNotaMayor()),
         new EstadisticaDto("Nota Menor", obtenerNotaMenor()),
         new EstadisticaDto("Nota Promedio", obtenerNotaPromedio()),
         new EstadisticaDto("Aprobados", obtenerAprobados()),
         new EstadisticaDto("Desaprobados", obtenerDesaprobados())
      };
      return repo;
   }

   private int obtenerDesaprobados() {
      int cont = 0;
      for( AlumnoDto dto: obtenerListado()){
         if( dto.getPromedio() < 14 ){
            cont++;
         }
      }
      return cont;
   }

   private int obtenerAprobados() {
      int cont = 0;
      for( AlumnoDto dto: obtenerListado()){
         if( dto.getPromedio() >= 14 ){
            cont++;
         }
      }
      return cont;
   }

   private int obtenerNotaPromedio() {
      int suma = 0;
      for( AlumnoDto dto: obtenerListado()){
         suma += dto.getPromedio();
      }
      int prom = suma / Datos.contador;
      return prom;
   }

   private int obtenerNotaMenor() {
      AlumnoDto[] lista = obtenerListado();
      int nota = lista[0].getPromedio();
      for (AlumnoDto dto : lista) {
         if(dto.getPromedio() < nota){
            nota = dto.getPromedio();
         }
      }
      return nota;
   }

   private int obtenerNotaMayor() {
      AlumnoDto[] lista = obtenerListado();
      int nota = lista[0].getPromedio();
      for (AlumnoDto dto : lista) {
         if(dto.getPromedio() > nota){
            nota = dto.getPromedio();
         }
      }
      return nota;
   }
   
   
}
