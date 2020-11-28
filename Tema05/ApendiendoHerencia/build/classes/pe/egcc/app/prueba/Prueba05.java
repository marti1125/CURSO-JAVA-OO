package pe.egcc.app.prueba;

import pe.egcc.app.service.VentaAbstract;
import pe.egcc.app.service.VentaConDescuento;
import pe.egcc.app.service.VentaNormal;

/**
 *
 * @author Gustavo Coronel
 * @blog   gcoronelc.blogspot.com
 * @email  gcoronelc@gmail.com
 */
public class Prueba05 {

  public static void main(String[] args) {
    // Datos
    double precio = 100.0;
    int cantidad = 20;
    // Proceso
    VentaAbstract venta = new VentaConDescuento();
    double importe = venta.calcularVenta(precio, cantidad);
    // Reporte
    System.out.println("Precio: " + precio);
    System.out.println("Cantidad: " + cantidad);
    System.out.println("Importe: " + importe);
  }
}
