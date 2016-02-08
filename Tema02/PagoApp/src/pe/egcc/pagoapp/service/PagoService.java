package pe.egcc.pagoapp.service;

import pe.egcc.pagoapp.dto.PagoDto;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog   www.desarrollasoftware.com
 * @email  gcoronelc@gmail.com
 */
public class PagoService {

  public void procesar(PagoDto pagoDto){
    // Variables
    double ingresos, renta, neto;
    // Proceso
    ingresos = pagoDto.getHorasDia() * pagoDto.getDias() * pagoDto.getPagoHora();
    if(ingresos > 1500.00){
      renta = ingresos * 0.08;
    } else {
      renta = 0.0;
    }
    neto = ingresos - renta;
    // Salida
    pagoDto.setImgresos(ingresos);
    pagoDto.setRenta(renta);
    pagoDto.setNeto(neto);
  }
}
