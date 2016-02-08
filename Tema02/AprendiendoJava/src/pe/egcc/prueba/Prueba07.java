package pe.egcc.prueba;

import pe.egcc.modelo.Articulo;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog   www.desarrollasoftware.com
 * @email  gcoronelc@gmail.com
 */
public class Prueba07 {

  public static void main(String[] args) {
    
    Articulo bean = new Articulo();
    
    System.out.println("Nombre: " + bean.getNombre());
    System.out.println("Precio: " + bean.getPrecio());
    System.out.println("Stock: " + bean.getStock());
    System.out.println("Disponible: " + bean.isDisponible());
    
    bean.setNombre("Televisor");
    
    System.out.println("Nombre: " + bean.getNombre());
  }
}
