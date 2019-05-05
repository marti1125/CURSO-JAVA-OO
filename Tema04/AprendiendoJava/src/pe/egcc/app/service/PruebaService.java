package pe.egcc.app.service;

/**
 *
 * @author Gustavo Coronel
 * @blog   gcoronelc.blogspot.com
 * @email  gcoronelc@gmail.com
 */
public class PruebaService {
  
  private static double precio;
  public static int stock;
  
  private String producto;
  
  static{
    
    precio = 999.99;
    stock = 200;
    
  }

  public PruebaService() {
    this.producto = "Refrigeradora";
  }
  
  
  public static void mostrarPrecio(){
    System.out.println("Precio: " + precio);
    System.out.println("Stock: " + stock);
  }
  
  public void mostrar(){
    System.out.println("Producto: " + this.producto);
    System.out.println("Precio: " + precio);
    System.out.println("Stock: " + stock);
  }
  
}
