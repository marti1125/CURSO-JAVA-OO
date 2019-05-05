package pe.egcc.app.prueba;

import pe.egcc.app.service.PruebaService;

/**
 *
 * @author Gustavo Coronel
 * @blog   gcoronelc.blogspot.com
 * @email  gcoronelc@gmail.com
 */
public class Prueba02 {
  
  public static void main(String[] args) {
    
    System.out.println("Stock: " + PruebaService.stock);
    
    System.out.println("-----------------------");
    
    PruebaService.mostrarPrecio();
    
    System.out.println("--------------------------");
    PruebaService.stock = 500;
    PruebaService service = new PruebaService();
    service.mostrar();
    
  }

}
