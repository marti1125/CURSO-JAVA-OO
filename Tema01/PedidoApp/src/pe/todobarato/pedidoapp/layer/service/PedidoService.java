package pe.todobarato.pedidoapp.layer.service;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog   www.desarrollasoftware.com
 * @email  gcoronelc@gmail.com
 */
public class PedidoService {
  
  public double calcularImpuesto(double importe){
    double impuesto;
    impuesto = importe * 0.18;
    return impuesto;
  }
  
  public double calcularTotal(double importe){
    double total;
    total = importe + calcularImpuesto(importe);
    return total;
  }

}
