package pe.egcc.app.pruebas;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class Prueba05 {

   public static void main(String[] args) {
      // Datos
      int n1 = 30;
      int n2 = 0;
      // Proceso
      int n3 = n1 / n2;
      // Abrir archivo
      FileReader archivo;
      try {
         archivo = abrirArchivo();
      } catch (Exception e) {
         archivo = null;
      }
      // Reporte
      System.out.println("n1: " + n1);
      System.out.println("n2: " + n2);
      System.out.println("n3: " + n3);
   }

   private static FileReader abrirArchivo() throws FileNotFoundException {
      FileReader f = null;
      String nomArchivo = "D:\\Datos123456.TXT";
      f = new FileReader(nomArchivo);
      return f;
   }

}
