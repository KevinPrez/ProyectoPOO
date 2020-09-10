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
public class FrmMoto extends javax.swing.JFrame {

    /**
     * Creates new form GUIbici
     */
    public FrmMoto() {
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

        cmbMotocicletas = new javax.swing.JComboBox<>();
        btnMostrarInfoMoto = new javax.swing.JButton();
        btnReservarMoto = new javax.swing.JButton();
        lblFondoMotocicleta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Motocicletas");
        setBackground(new java.awt.Color(0, 0, 0));
        setMaximumSize(new java.awt.Dimension(505, 602));
        setMinimumSize(new java.awt.Dimension(505, 602));
        setPreferredSize(new java.awt.Dimension(505, 602));
        setResizable(false);
        getContentPane().setLayout(null);

        cmbMotocicletas.setBackground(new java.awt.Color(0, 0, 0));
        cmbMotocicletas.setFont(new java.awt.Font("Wide Latin", 0, 12)); // NOI18N
        cmbMotocicletas.setForeground(new java.awt.Color(255, 255, 255));
        cmbMotocicletas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una motocicleta..." }));
        getContentPane().add(cmbMotocicletas);
        cmbMotocicletas.setBounds(90, 90, 330, 40);

        btnMostrarInfoMoto.setBackground(new java.awt.Color(0, 0, 0));
        btnMostrarInfoMoto.setFont(new java.awt.Font("Wide Latin", 0, 12)); // NOI18N
        btnMostrarInfoMoto.setForeground(new java.awt.Color(255, 255, 255));
        btnMostrarInfoMoto.setText("Ver info de la moto");
        getContentPane().add(btnMostrarInfoMoto);
        btnMostrarInfoMoto.setBounds(140, 150, 230, 30);

        btnReservarMoto.setBackground(new java.awt.Color(0, 0, 0));
        btnReservarMoto.setFont(new java.awt.Font("Wide Latin", 0, 12)); // NOI18N
        btnReservarMoto.setForeground(new java.awt.Color(255, 255, 255));
        btnReservarMoto.setText("Reservar");
        getContentPane().add(btnReservarMoto);
        btnReservarMoto.setBounds(190, 200, 130, 40);

        lblFondoMotocicleta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Fondo Interfaz Motocicleta.png"))); // NOI18N
        getContentPane().add(lblFondoMotocicleta);
        lblFondoMotocicleta.setBounds(0, 0, 510, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

//        java.awt.EventQueue.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                new VehículosKAR().setVisible(true)
//                ;
//            } 
//        });
        
//        FrmMoto.this.setVisible(false);
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
            java.util.logging.Logger.getLogger(FrmMoto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMoto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMoto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMoto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMoto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMostrarInfoMoto;
    private javax.swing.JButton btnReservarMoto;
    private javax.swing.JComboBox<String> cmbMotocicletas;
    private javax.swing.JLabel lblFondoMotocicleta;
    // End of variables declaration//GEN-END:variables
}
