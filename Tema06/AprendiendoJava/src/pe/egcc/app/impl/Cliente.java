package pe.egcc.app.impl;

import pe.egcc.app.spec.ImprimirSpec;
import pe.egcc.app.spec.MantenimientoSpec;

/**
 *
 * @author Gustavo Coronel
 * @blog   gcoronelc.blogspot.com
 * @email  gcoronelc@gmail.com
 */
public class Cliente implements ImprimirSpec, MantenimientoSpec{

   @Override
   public void imprimir() {
      System.out.println("Cliente impreso.");
   }

   @Override
   public void insertar() {
      System.out.println("Cliente registrado correctamente.");
   }

   @Override
   public void modificar() {
      System.out.println("Cliente modificado correctamente.");
   }

   @Override
   public void eliminar() {
      System.out.println("Cliente eliminado correctamente.");
   }

   public void validar(){
      System.out.println("Datos del cliente validados.");
   }
   
}
