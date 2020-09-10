/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.capitulo5.proyecto;

/**
 *
 * @author pc ponce
 */
public class FrmBici extends javax.swing.JFrame {

    /**
     * Creates new form GUImoto
     */
    public FrmBici() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnReservarBici = new javax.swing.JButton();
        btnMostrarInfoBici = new javax.swing.JButton();
        cmbBicicletas = new javax.swing.JComboBox<>();
        lblBicicleta = new javax.swing.JLabel();
        lblFondoBicicleta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(505, 602));
        setMinimumSize(new java.awt.Dimension(505, 602));
        getContentPane().setLayout(null);

        btnReservarBici.setBackground(new java.awt.Color(0, 0, 0));
        btnReservarBici.setFont(new java.awt.Font("Wide Latin", 0, 12)); // NOI18N
        btnReservarBici.setForeground(new java.awt.Color(255, 255, 255));
        btnReservarBici.setText("Reservar");
        getContentPane().add(btnReservarBici);
        btnReservarBici.setBounds(190, 230, 130, 40);

        btnMostrarInfoBici.setBackground(new java.awt.Color(0, 0, 0));
        btnMostrarInfoBici.setFont(new java.awt.Font("Wide Latin", 0, 12)); // NOI18N
        btnMostrarInfoBici.setForeground(new java.awt.Color(255, 255, 255));
        btnMostrarInfoBici.setText("Ver info de la bici");
        getContentPane().add(btnMostrarInfoBici);
        btnMostrarInfoBici.setBounds(140, 180, 230, 30);

        cmbBicicletas.setBackground(new java.awt.Color(0, 0, 0));
        cmbBicicletas.setFont(new java.awt.Font("Wide Latin", 0, 12)); // NOI18N
        cmbBicicletas.setForeground(new java.awt.Color(255, 255, 255));
        cmbBicicletas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una bicicleta..." }));
        getContentPane().add(cmbBicicletas);
        cmbBicicletas.setBounds(90, 120, 330, 40);

        lblBicicleta.setBackground(new java.awt.Color(0, 0, 0));
        lblBicicleta.setFont(new java.awt.Font("Wide Latin", 0, 36)); // NOI18N
        lblBicicleta.setForeground(new java.awt.Color(255, 255, 255));
        lblBicicleta.setText("Bicicletas");
        getContentPane().add(lblBicicleta);
        lblBicicleta.setBounds(100, 30, 310, 70);

        lblFondoBicicleta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Fondo Interfaz Bicicleta.png"))); // NOI18N
        getContentPane().add(lblFondoBicicleta);
        lblFondoBicicleta.setBounds(0, 0, 500, 600);

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
            java.util.logging.Logger.getLogger(FrmBici.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmBici.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmBici.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmBici.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmBici().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMostrarInfoBici;
    private javax.swing.JButton btnReservarBici;
    private javax.swing.JComboBox<String> cmbBicicletas;
    private javax.swing.JLabel lblBicicleta;
    private javax.swing.JLabel lblFondoBicicleta;
    // End of variables declaration//GEN-END:variables
}
