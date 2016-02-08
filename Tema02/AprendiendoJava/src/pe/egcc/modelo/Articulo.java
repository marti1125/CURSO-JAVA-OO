package pe.egcc.modelo;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 */
public class Articulo {

  private String nombre;
  private double precio;
  private int stock;
  private boolean disponible;

  public Articulo() {
    this.nombre = "Computadora";
    this.precio = 5000.0;
    this.stock = 1000;
    this.disponible = true;
    System.out.println("Objeto creado.");
  }

  @Override
  protected void finalize() throws Throwable {
    System.err.println("Chau objeto.");
  }

  /**
   * @return the nombre
   */
  public String getNombre() {
    return nombre;
  }

  /**
   * @param nombre the nombre to set
   */
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  /**
   * @return the precio
   */
  public double getPrecio() {
    return precio;
  }

  /**
   * @param precio the precio to set
   */
  public void setPrecio(double precio) {
    this.precio = precio;
  }

  /**
   * @return the stock
   */
  public int getStock() {
    return stock;
  }

  /**
   * @param stock the stock to set
   */
  public void setStock(int stock) {
    this.stock = stock;
  }

  /**
   * @return the disponible
   */
  public boolean isDisponible() {
    return disponible;
  }

  /**
   * @param disponible the disponible to set
   */
  public void setDisponible(boolean disponible) {
    this.disponible = disponible;
  }

}
