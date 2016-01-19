package pe.egcc.prueba;

import pe.egcc.service.MateService;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog   www.desarrollasoftware.com
 * @email  gcoronelc@gmail.com
 */
public class Prueba01 {
  
  public static void main(String[] args) {
    MateService mateService;
    mateService = new MateService();
    int suma = mateService.sumar(5, 8);
    System.out.println("Suma: " + suma);
  }

}
