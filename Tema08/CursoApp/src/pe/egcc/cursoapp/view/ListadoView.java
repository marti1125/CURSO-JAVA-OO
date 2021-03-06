package pe.egcc.cursoapp.view;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pe.egcc.cursoapp.controller.NotasController;
import pe.egcc.cursoapp.dto.AlumnoDto;

/**
 *
 * @author Gustavo Coronel
 * @blog   gcoronelc.blogspot.com
 * @email  gcoronelc@gmail.com
 */
public class ListadoView extends javax.swing.JDialog {

    /** Creates new form ListadoView */
    public ListadoView(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        traerListado();
    }
    
    private void traerListado(){
       try {
          // Obtener el listado
          NotasController control = new NotasController();
          AlumnoDto[] listado = control.obtenerListado();
          // Mostrar Listado
          DefaultTableModel tabla;
          tabla = (DefaultTableModel) tblListado.getModel();
          tabla.setRowCount(0);
          for (AlumnoDto dto : listado) {
             Object[] rowData = {
                dto.getNombre(),
                dto.getNota1(),
                dto.getNota2(),
                dto.getNota3(),
                dto.getNota4(),
                dto.getPromedio()
             };
             tabla.addRow(rowData);
          }
       } catch (Exception e) {
         JOptionPane.showMessageDialog(
            rootPane,
            e.getMessage(),
            "NOTAS - ERROR", 
            JOptionPane.ERROR_MESSAGE
         );          
       }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      jScrollPane1 = new javax.swing.JScrollPane();
      tblListado = new javax.swing.JTable();

      setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
      setTitle("LISTADO DE ALUMNOS");

      tblListado.setModel(new javax.swing.table.DefaultTableModel(
         new Object [][] {
            {null, null, null, null, null, null},
            {null, null, null, null, null, null},
            {null, null, null, null, null, null},
            {null, null, null, null, null, null}
         },
         new String [] {
            "NOMBRE", "NOTA 1", "NOTA 2", "NOTA 3", "NOTA 4", "PROM"
         }
      ) {
         Class[] types = new Class [] {
            java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
         };
         boolean[] canEdit = new boolean [] {
            false, false, false, false, false, false
         };

         public Class getColumnClass(int columnIndex) {
            return types [columnIndex];
         }

         public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit [columnIndex];
         }
      });
      tblListado.setColumnSelectionAllowed(true);
      jScrollPane1.setViewportView(tblListado);
      tblListado.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
      if (tblListado.getColumnModel().getColumnCount() > 0) {
         tblListado.getColumnModel().getColumn(0).setResizable(false);
         tblListado.getColumnModel().getColumn(1).setResizable(false);
         tblListado.getColumnModel().getColumn(2).setResizable(false);
         tblListado.getColumnModel().getColumn(3).setResizable(false);
         tblListado.getColumnModel().getColumn(4).setResizable(false);
         tblListado.getColumnModel().getColumn(5).setResizable(false);
      }

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 774, Short.MAX_VALUE)
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ListadoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListadoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListadoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListadoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ListadoView dialog = new ListadoView(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JScrollPane jScrollPane1;
   private javax.swing.JTable tblListado;
   // End of variables declaration//GEN-END:variables

}
