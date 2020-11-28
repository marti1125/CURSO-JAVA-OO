package pe.egcc.app.prueba;

import pe.egcc.app.service.Clase2;
import pe.egcc.app.service.Clase4;

/**
 *
 * @author Gustavo Coronel
 * @blog   gcoronelc.blogspot.com
 * @email  gcoronelc@gmail.com
 */
public class Prueba02 {
  
  public static void main(String[] args) {
    // Datos
    int n1 = 8;
    int n2 = 6;
    // Proceso
    Clase2 clase2 = new Clase4();
    int suma = clase2.sumar(n1, n2);
    // Reporte
    System.out.println("n1: " + n1);
    System.out.println("n2: " + n2);
    System.out.println("suma: " + suma);
  }

}
