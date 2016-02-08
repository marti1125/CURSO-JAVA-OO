package pe.egcc.dos;

import pe.egcc.uno.ClaseA;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 */
public class ClaseC extends ClaseA {

  public void metodoC() {
    ClaseA bean = new ClaseA();
    //System.out.println("n1: " + bean.n1);
    //System.out.println("n2: " + bean.n2);
    System.out.println("n3: " + n3);
    System.out.println("n4: " + bean.n4);
  }

}
