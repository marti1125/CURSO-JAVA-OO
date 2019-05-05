package pe.egcc.app.impl;

import pe.egcc.app.spec.ImprimirSpec;

/**
 *
 * @author Gustavo Coronel
 * @blog   gcoronelc.blogspot.com
 * @email  gcoronelc@gmail.com
 */
public class Comprobante implements ImprimirSpec{
   
   public void calcularComprobante(){
      
   }

   @Override
   public void imprimir() {
      System.out.println("Comprobante impreso.");
   }

}
