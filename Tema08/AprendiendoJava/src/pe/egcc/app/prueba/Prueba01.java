package pe.egcc.app.prueba;

/**
 *
 * @author Gustavo Coronel
 * @blog   gcoronelc.blogspot.com
 * @email  gcoronelc@gmail.com
 */
public class Prueba01 {
   
   public static void main(String[] args) {
      
      int[] notas = new int[5];
      mostrarVector(notas);
      
      notas[1] = 15;
      notas[3] = 20;
      mostrarVector(notas);
      
   }

   private static void mostrarVector(int[] notas) {
      System.out.println("-----------------------");
      for (int i = 0; i < notas.length; i++) {
         int nota = notas[i];
         System.out.println(i + ".- " + nota);
      }
   }

}
