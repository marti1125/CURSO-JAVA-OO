package pe.egcc.app.pruebas;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class Prueba03 {

   public static void main(String[] args) {
      try {
         procesar();
      } catch (FileNotFoundException ex) {
         System.err.println(ex.getMessage());
      }

   }

   private static void procesar() throws FileNotFoundException {
      try {
         // Datos
         int n1 = 30;
         int n2 = 0;
         // Proceso
         int n3 = n1 / n2;
         // Reporte
         System.out.println("n1: " + n1);
         System.out.println("n2: " + n2);
         System.out.println("n3: " + n3);
         // Otra excepción
         String nomArchivo = "D:\\Datos123456.TXT";
         FileReader f = new FileReader(nomArchivo);
      } catch (ArithmeticException e) {
         System.err.println("No se puede dividir por cero.");
      } catch (FileNotFoundException e) {
         System.err.println("No se encuentra el archivo.");
         throw e;
      } catch (Exception e) {
         System.err.println(e.getMessage());
      } finally {
         System.out.println("Mensaje Final del try.");
      }
      System.out.println("Mensaje Final del programa.");
   }

}
