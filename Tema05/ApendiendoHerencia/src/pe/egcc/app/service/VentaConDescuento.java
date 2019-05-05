package pe.egcc.app.service;

/**
 *
 * @author Gustavo Coronel
 * @blog   gcoronelc.blogspot.com
 * @email  gcoronelc@gmail.com
 */
public class VentaConDescuento extends VentaAbstract{

  @Override
  public double calcularVenta(double precio, int cantidad) {
    double descuento = 0.0;
    if( cantidad >= 12 ){
      descuento = precio * 0.05;
    }
    double importe = (precio - descuento) * cantidad;
    return importe;
  }

}
