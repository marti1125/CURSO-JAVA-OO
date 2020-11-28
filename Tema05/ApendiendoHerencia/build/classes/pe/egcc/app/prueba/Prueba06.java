package pe.egcc.app.prueba;

import pe.egcc.app.service.Clase1;
import pe.egcc.app.service.Clase2;
import pe.egcc.app.service.Clase3;
import pe.egcc.app.service.Clase4;

/**
 *
 * @author Gustavo Coronel
 * @blog   gcoronelc.blogspot.com
 * @email  gcoronelc@gmail.com
 */
public class Prueba06 {

  public static void main(String[] args) {
    Clase2 objeto = new Clase2();
    System.out.println("ES COMPATIBLE:");
    System.out.println("Object: " + ((objeto instanceof Object)?"SI":"NO"));
    System.out.println("Clase1: " + ((objeto instanceof Clase1)?"SI":"NO"));
    System.out.println("Clase2: " + ((objeto instanceof Clase2)?"SI":"NO"));
    System.out.println("Clase3: " + ((objeto instanceof Clase3)?"SI":"NO"));
    System.out.println("Clase4: " + ((objeto instanceof Clase4)?"SI":"NO"));
    
    Clase3 var1 = (Clase3) objeto;
  }
  
}
