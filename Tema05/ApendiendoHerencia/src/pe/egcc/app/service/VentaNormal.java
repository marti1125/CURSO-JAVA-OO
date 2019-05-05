package pe.egcc.app.service;

/**
 *
 * @author Gustavo Coronel
 * @blog   gcoronelc.blogspot.com
 * @email  gcoronelc@gmail.com
 */
public class VentaNormal extends VentaAbstract{

  @Override
  public double calcularVenta(double precio, int cantidad) {
    return (precio * cantidad);
  }

}
