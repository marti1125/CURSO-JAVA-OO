package pe.egcc.app.prueba;

import pe.egcc.app.impl.Cliente;
import pe.egcc.app.spec.ImprimirSpec;
import pe.egcc.app.spec.MantenimientoSpec;

/**
 *
 * @author Gustavo Coronel
 * @blog   gcoronelc.blogspot.com
 * @email  gcoronelc@gmail.com
 */
public class Prueba02 {
   
   public static void main(String[] args) {
      
      Cliente obj = new Cliente();
      
      obj.validar();
      obj.insertar();
      obj.modificar();
      obj.eliminar();
      obj.imprimir();
      
   }

}
