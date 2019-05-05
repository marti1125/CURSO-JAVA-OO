package pe.egcc.prueba;

import pe.egcc.dto.EmpleadoDto;

/**
 *
 * @author Gustavo Coronel
 * @blog   gcoronelc.blogspot.com
 * @email  gcoronelc@gmail.com
 */
public class Prueba04 {
   
   public static void main(String[] args) {
      
      EmpleadoDto emp1 = new EmpleadoDto("Gustavo", 20000.0);
      EmpleadoDto emp2 = new EmpleadoDto("Gustavo", 20000.0);
      
      System.out.println("HashCode Emp 1: " + emp1.hashCode());
      System.out.println("HashCode Emp 2: " + emp2.hashCode());
      
      if( emp1.equals(emp2)){
         System.out.println("Son Iguales");
      } else {
         System.out.println("Son diferentes");
      }
      
      
      EmpleadoDto emp3 = new EmpleadoDto("Gustavo", 20000.0);
      EmpleadoDto emp4 = emp3;
      
      System.out.println("HashCode Emp 3: " + emp3.hashCode());
      System.out.println("HashCode Emp 4: " + emp4.hashCode());
      
      if( emp3.equals(emp4)){
         System.out.println("Son Iguales");
      } else {
         System.out.println("Son diferentes");
      }
   }

}
