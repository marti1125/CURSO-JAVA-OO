package pe.egcc.app.service;

/**
 *
 * @author Gustavo Coronel
 * @blog   gcoronelc.blogspot.com
 * @email  gcoronelc@gmail.com
 */
public class Clase2 extends Clase1{

  public Clase2() {
    super("Claudia");
    System.out.println("Hola Todos.");
  }
  
  @Override
  public int sumar(int n1, int n2) {
    int suma;
    suma = (n1 + n2)*(n1 - n2);
    return suma;
  }
  
  public double sumar(double n1, double n2) {
    double suma;
    suma = (n1 + n2)*(n1 - n2);
    return suma;
  }

}
