package pe.egcc.dto;

import java.util.Objects;

/**
 *
 * @author Gustavo Coronel
 * @blog   gcoronelc.blogspot.com
 * @email  gcoronelc@gmail.com
 */
public class EmpleadoDto {
   
   private String nombre;
   private Double sueldo;

   public EmpleadoDto() {
   }

   public EmpleadoDto(String nombre, Double sueldo) {
      this.nombre = nombre;
      this.sueldo = sueldo;
   }

   public String getNombre() {
      return nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public Double getSueldo() {
      return sueldo;
   }

   public void setSueldo(Double sueldo) {
      this.sueldo = sueldo;
   }
   

   @Override
   public int hashCode() {
      int hash = 3;
      hash = 97 * hash + Objects.hashCode(this.nombre);
      hash = 97 * hash + Objects.hashCode(this.sueldo);
      return hash;
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj) {
         return true;
      }
      if (obj == null) {
         return false;
      }
      if (getClass() != obj.getClass()) {
         return false;
      }
      final EmpleadoDto other = (EmpleadoDto) obj;
      if (!Objects.equals(this.nombre, other.nombre)) {
         return false;
      }
      if (!Objects.equals(this.sueldo, other.sueldo)) {
         return false;
      }
      return true;
   }

}
