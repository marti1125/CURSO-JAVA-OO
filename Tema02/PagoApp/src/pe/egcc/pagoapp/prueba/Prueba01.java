package pe.egcc.pagoapp.prueba;

import pe.egcc.pagoapp.dto.PagoDto;
import pe.egcc.pagoapp.service.PagoService;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog   www.desarrollasoftware.com
 * @email  gcoronelc@gmail.com
 */
public class Prueba01 {

  
  public static void main(String[] args) {
    // Datos
    PagoDto pagoDto = new PagoDto();
    pagoDto.setHorasDia(6);
    pagoDto.setDias(20);
    pagoDto.setPagoHora(130.0);
    // Proceso
    PagoService pagoService = new PagoService();
    pagoService.procesar(pagoDto);
    // Resultado
    System.out.println("Ingresos: " + pagoDto.getImgresos());
    System.out.println("Renta: " + pagoDto.getRenta());
    System.out.println("Neto: " + pagoDto.getNeto());
  }
  
}
