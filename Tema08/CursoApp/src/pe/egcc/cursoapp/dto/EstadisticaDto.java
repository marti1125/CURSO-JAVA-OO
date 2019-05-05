package pe.egcc.cursoapp.dto;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class EstadisticaDto {

   private String concepto;
   private int valor;

   public EstadisticaDto() {
   }

   public EstadisticaDto(String concepto, int valor) {
      this.concepto = concepto;
      this.valor = valor;
   }

   public String getConcepto() {
      return concepto;
   }

   public void setConcepto(String concepto) {
      this.concepto = concepto;
   }

   public int getValor() {
      return valor;
   }

   public void setValor(int valor) {
      this.valor = valor;
   }

}
