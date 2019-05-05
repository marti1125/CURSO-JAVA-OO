package pe.egcc.app.prueba;

/**
 *
 * @author Gustavo Coronel
 * @blog   gcoronelc.blogspot.com
 * @email  gcoronelc@gmail.com
 */
public class Prueba02 {

   public static void main(String[] args) {
      String lista[] = new String[5];
      mostrarVector( lista );
      
      lista[1] = "Gustavo";
      lista[3] = "Claudia";
      mostrarVector( lista );
      
   }

   private static void mostrarVector(String[] lista) {
      System.out.println("-------------------");
      for (String dato : lista) {
         System.out.println("- " + dato);
      }
   }
}
