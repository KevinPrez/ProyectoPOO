/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.capitulo5.proyecto;

import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author pc ponce
 */
public class VehículosKAR extends javax.swing.JFrame {

    //FondoPanel fondo = new FondoPanel();
    ArrayList<Cliente> clientes = new ArrayList<>();

    /**
     * Creates new form VehículosKAR
     */
    public VehículosKAR() {

        //this.setContentPane(fondo);
        initComponents();
    }

    public void limpiarInterfazPrincipal() {
        txtNombre.setText("");
        txtEmail.setText("");
        txtCedula.setText("");
        cmbVehiculo.setSelectedItem(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        lblVehiculosKar = new javax.swing.JLabel();
        cmbVehiculo = new javax.swing.JComboBox<>();
        lblEmail = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        lblNumCedula = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblBienvenida = new javax.swing.JLabel();
        btnContinuar = new javax.swing.JButton();
        lblFont = new javax.swing.JLabel();

        PanelPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(PanelPrincipal);
        PanelPrincipal.setLayout(PanelPrincipalLayout);
        PanelPrincipalLayout.setHorizontalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        PanelPrincipalLayout.setVerticalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestión Vehículos");
        setForeground(new java.awt.Color(0, 0, 0));
        setMaximumSize(new java.awt.Dimension(587, 642));
        setMinimumSize(new java.awt.Dimension(587, 642));
        setResizable(false);
        setSize(new java.awt.Dimension(587, 642));
        getContentPane().setLayout(null);

        lblVehiculosKar.setFont(new java.awt.Font("Wide Latin", 3, 36)); // NOI18N
        lblVehiculosKar.setForeground(new java.awt.Color(204, 0, 0));
        lblVehiculosKar.setText("VehículosKAR");
        getContentPane().add(lblVehiculosKar);
        lblVehiculosKar.setBounds(50, 190, 490, 70);

        cmbVehiculo.setBackground(new java.awt.Color(0, 0, 0));
        cmbVehiculo.setFont(new java.awt.Font("Wide Latin", 2, 14)); // NOI18N
        cmbVehiculo.setForeground(new java.awt.Color(255, 255, 255));
        cmbVehiculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Haga su elección:", "Auto", "Motocicleta", "Bicicleta" }));
        cmbVehiculo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmbVehiculo.setOpaque(false);
        getContentPane().add(cmbVehiculo);
        cmbVehiculo.setBounds(60, 260, 230, 30);

        lblEmail.setFont(new java.awt.Font("Wide Latin", 0, 14)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("Correo electrónico:");
        getContentPane().add(lblEmail);
        lblEmail.setBounds(70, 150, 230, 30);
        getContentPane().add(txtNombre);
        txtNombre.setBounds(310, 70, 200, 30);
        getContentPane().add(txtCedula);
        txtCedula.setBounds(310, 110, 200, 30);
        getContentPane().add(txtEmail);
        txtEmail.setBounds(310, 150, 200, 30);

        lblNumCedula.setFont(new java.awt.Font("Wide Latin", 0, 14)); // NOI18N
        lblNumCedula.setForeground(new java.awt.Color(255, 255, 255));
        lblNumCedula.setText("Número de cédula:");
        getContentPane().add(lblNumCedula);
        lblNumCedula.setBounds(70, 120, 230, 20);

        lblNombre.setFont(new java.awt.Font("Wide Latin", 0, 14)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Nombre:");
        getContentPane().add(lblNombre);
        lblNombre.setBounds(70, 80, 120, 20);

        lblBienvenida.setBackground(new java.awt.Color(0, 0, 0));
        lblBienvenida.setFont(new java.awt.Font("Wide Latin", 0, 18)); // NOI18N
        lblBienvenida.setForeground(new java.awt.Color(255, 255, 255));
        lblBienvenida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBienvenida.setText("Bienvenido/a!");
        lblBienvenida.setToolTipText("");
        getContentPane().add(lblBienvenida);
        lblBienvenida.setBounds(160, 20, 270, 30);

        btnContinuar.setBackground(new java.awt.Color(0, 0, 0));
        btnContinuar.setFont(new java.awt.Font("Wide Latin", 0, 14)); // NOI18N
        btnContinuar.setForeground(new java.awt.Color(255, 255, 255));
        btnContinuar.setText("Continuar");
        btnContinuar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });
        getContentPane().add(btnContinuar);
        btnContinuar.setBounds(330, 260, 170, 30);

        lblFont.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/imagen_entrada_proy01.jpg"))); // NOI18N
        getContentPane().add(lblFont);
        lblFont.setBounds(0, 0, 590, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        // TODO add your handling code here:
        String nombre;
        String cedula;
        String email;
        nombre = txtNombre.getText().toUpperCase();

        email = txtEmail.getText();
        //validar el email primero

        Cliente c1 = new Cliente();
        //do{
        if (!txtNombre.getText().isBlank() || !txtEmail.getText().isBlank() || !txtCedula.getText().isBlank()) {
            cedula = txtCedula.getText();
            cedula = cedula.replace("-", "");
            cedula = cedula.replace("_", "");
            cedula = cedula.replace(".", "");
            if (cedula.matches("[0-9]+")) {
                if (c1.esCedulaValida(cedula) && email.matches(".+@.+")) {
                    c1.setNombre(nombre);
                    c1.setEmail(email);
                    c1.setNumCedula(cedula);

                    if (cmbVehiculo.getSelectedIndex() == 0) {
                        JOptionPane.showMessageDialog(rootPane, "Seleccione que tipo de vehiculo desea ver.");
                    }
                    if (cmbVehiculo.getSelectedIndex() == 1) {
                        FrmAuto second = new FrmAuto();
                        second.setVisible(true);
                        VehículosKAR.this.setVisible(false);
                        clientes.add(c1);
                        limpiarInterfazPrincipal();
                    }
                    if (cmbVehiculo.getSelectedIndex() == 2) {
                        FrmMoto third = new FrmMoto();
                        third.setVisible(true);
                        VehículosKAR.this.setVisible(false);
                        clientes.add(c1);
                        limpiarInterfazPrincipal();
                    }
                    if (cmbVehiculo.getSelectedIndex() == 3) {
                        FrmBici fourth = new FrmBici();
                        fourth.setVisible(true);
                        VehículosKAR.this.setVisible(false);
                        clientes.add(c1);
                        limpiarInterfazPrincipal();
                    }
                } else {
                    JOptionPane.showMessageDialog(rootPane, "El número de cédula o el correo electronico ingresado es inválido,"
                            + " ingrese de manera correcta cada uno de estos apartados, por favor.");
                    
                }

            } else {
                JOptionPane.showMessageDialog(rootPane, "Solo ingrese numeros en el apartado de cédula o ingrese uno válido, por favor.");
                txtCedula.setText("");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Llene todos los apartados por favor.");
        }
        
        //}while(c1.esCedulaValida(cedula) == false);

    }//GEN-LAST:event_btnContinuarActionPerformed

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
            java.util.logging.Logger.getLogger(VehículosKAR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VehículosKAR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VehículosKAR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VehículosKAR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VehículosKAR().setVisible(true)
                ;
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JButton btnContinuar;
    private javax.swing.JComboBox<String> cmbVehiculo;
    private javax.swing.JLabel lblBienvenida;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFont;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNumCedula;
    private javax.swing.JLabel lblVehiculosKar;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

//    class FondoPanel extends JPanel{
//        
//        private Image imagen;
//        
//        @Override
//        public void paint (Graphics g){
//            imagen = new ImageIcon(getClass().getResource("/Images/imagen_entrada_proy1.jpg")).getImage();
//            g.drawImage(imagen, 0, 0, getWidth(), getWidth(), this);
//            setOpaque(false);
//            super.paint(g);
//        }
//    }
}
