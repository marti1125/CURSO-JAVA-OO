package pe.egcc.app.prueba;

import pe.egcc.app.impl.Cliente;
import pe.egcc.app.impl.Comprobante;
import pe.egcc.app.spec.ImprimirSpec;

/**
 *
 * @author Gustavo Coronel
 * @blog   gcoronelc.blogspot.com
 * @email  gcoronelc@gmail.com
 */
public class Prueba01 {

   public static void main(String[] args) {
      Comprobante obj1 = new Comprobante();
      imprimirObjeto(obj1);
      Cliente obj2 = new Cliente();
      imprimirObjeto(obj2);
   }

   private static void imprimirObjeto(ImprimirSpec objeto) {
      objeto.imprimir();
   }
   
   
}
