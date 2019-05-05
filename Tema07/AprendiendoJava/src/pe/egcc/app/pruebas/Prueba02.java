package pe.egcc.app.pruebas;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class Prueba02 {

   public static void main(String[] args) {

      try {
         leerArchivo();
      } catch (FileNotFoundException ex) {
         Logger.getLogger(Prueba02.class.getName()).log(Level.SEVERE, null, ex);
      }

   }

   private static void leerArchivo() throws FileNotFoundException {
      String nomArchivo = "D:\\Datos.TXT";
      FileReader f = new FileReader(nomArchivo);
      BufferedReader b = new BufferedReader(f);
   }
   
   

}
