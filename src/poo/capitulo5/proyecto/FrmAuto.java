/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.capitulo5.proyecto;

import java.awt.Image;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author pc ponce
 */
public class FrmAuto extends javax.swing.JFrame {

    ArrayList<Cliente> clientesActuales = new ArrayList<>();

    Automovil auto1 = new Automovil(2020, "Gol", 5, "Plateado", "Volkswagen", 16000.00);
    Automovil auto2 = new Automovil(2019, "Crafter", 21, "Blanco", "Volkswagen", 63000.00);
    Automovil auto3 = new Automovil(2020, "Jetta", 5, "Rojo", "Volkswagen", 19990.00);
    Automovil[] autos = {auto1, auto2, auto3};

    ImageIcon gol = new ImageIcon(getClass().getResource("/Automoviles/Gol Plateado 2017.png"));
    ImageIcon crafter = new ImageIcon(getClass().getResource("/Automoviles/Crafter Blanco 2016.png"));
    ImageIcon jetta = new ImageIcon(getClass().getResource("/Automoviles/Jetta Rojo 2018.png"));

    /**
     * Creates new form GUIauto
     */
    public FrmAuto() {
        initComponents();
        panelInfoAuto.setVisible(false);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAutomovil = new javax.swing.JLabel();
        cmbAutomoviles = new javax.swing.JComboBox<>();
        btnMostrarInfoAuto = new javax.swing.JButton();
        btnReservarAuto = new javax.swing.JButton();
        panelInfoAuto = new javax.swing.JPanel();
        lblImgCarro = new javax.swing.JLabel();
        btnCerrarInfoAuto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaInfoCarro = new javax.swing.JTextArea();
        lblFondoAuto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Automóviles");
        setMinimumSize(new java.awt.Dimension(505, 602));
        setResizable(false);
        getContentPane().setLayout(null);

        lblAutomovil.setBackground(new java.awt.Color(0, 0, 0));
        lblAutomovil.setFont(new java.awt.Font("Wide Latin", 0, 33)); // NOI18N
        lblAutomovil.setForeground(new java.awt.Color(255, 255, 255));
        lblAutomovil.setText("AUTOMÓVILES");
        getContentPane().add(lblAutomovil);
        lblAutomovil.setBounds(10, 30, 490, 50);

        cmbAutomoviles.setBackground(new java.awt.Color(0, 0, 0));
        cmbAutomoviles.setFont(new java.awt.Font("Wide Latin", 0, 12)); // NOI18N
        cmbAutomoviles.setForeground(new java.awt.Color(255, 255, 255));
        cmbAutomoviles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un automóvil...", "Gol", "Crafter", "Jetta" }));
        getContentPane().add(cmbAutomoviles);
        cmbAutomoviles.setBounds(90, 100, 330, 40);

        btnMostrarInfoAuto.setBackground(new java.awt.Color(0, 0, 0));
        btnMostrarInfoAuto.setFont(new java.awt.Font("Wide Latin", 0, 12)); // NOI18N
        btnMostrarInfoAuto.setForeground(new java.awt.Color(255, 255, 255));
        btnMostrarInfoAuto.setText("Ver info del auto");
        btnMostrarInfoAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarInfoAutoActionPerformed(evt);
            }
        });
        getContentPane().add(btnMostrarInfoAuto);
        btnMostrarInfoAuto.setBounds(140, 160, 230, 30);

        btnReservarAuto.setBackground(new java.awt.Color(0, 0, 0));
        btnReservarAuto.setFont(new java.awt.Font("Wide Latin", 0, 12)); // NOI18N
        btnReservarAuto.setForeground(new java.awt.Color(255, 255, 255));
        btnReservarAuto.setText("Reservar");
        btnReservarAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservarAutoActionPerformed(evt);
            }
        });
        getContentPane().add(btnReservarAuto);
        btnReservarAuto.setBounds(190, 210, 130, 40);

        panelInfoAuto.setBackground(new java.awt.Color(102, 102, 102));
        panelInfoAuto.setBorder(new javax.swing.border.MatteBorder(null));
        panelInfoAuto.setLayout(null);
        panelInfoAuto.add(lblImgCarro);
        lblImgCarro.setBounds(230, 20, 220, 200);

        btnCerrarInfoAuto.setBackground(new java.awt.Color(102, 102, 102));
        btnCerrarInfoAuto.setFont(new java.awt.Font("Wide Latin", 0, 14)); // NOI18N
        btnCerrarInfoAuto.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrarInfoAuto.setText("Cerrar");
        btnCerrarInfoAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarInfoAutoActionPerformed(evt);
            }
        });
        panelInfoAuto.add(btnCerrarInfoAuto);
        btnCerrarInfoAuto.setBounds(160, 230, 130, 40);

        txaInfoCarro.setBackground(new java.awt.Color(204, 204, 204));
        txaInfoCarro.setColumns(20);
        txaInfoCarro.setFont(new java.awt.Font("Wide Latin", 0, 10)); // NOI18N
        txaInfoCarro.setRows(5);
        jScrollPane1.setViewportView(txaInfoCarro);

        panelInfoAuto.add(jScrollPane1);
        jScrollPane1.setBounds(10, 20, 210, 200);

        getContentPane().add(panelInfoAuto);
        panelInfoAuto.setBounds(20, 270, 460, 280);

        lblFondoAuto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondos/Fondo Interfaz Automovil.jpg"))); // NOI18N
        getContentPane().add(lblFondoAuto);
        lblFondoAuto.setBounds(0, 0, 510, 610);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMostrarInfoAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarInfoAutoActionPerformed
        int index = cmbAutomoviles.getSelectedIndex();

        switch (index) {
            case 1:
                panelInfoAuto.setVisible(true);
                Icon imgGol = new ImageIcon(gol.getImage().getScaledInstance(lblImgCarro.getWidth(), lblImgCarro.getHeight(), Image.SCALE_DEFAULT));
                lblImgCarro.setIcon(imgGol);
                txaInfoCarro.setText(auto1.presentarInfo());
                break;
            case 2:
                panelInfoAuto.setVisible(true);
                Icon imgCrafter = new ImageIcon(crafter.getImage().getScaledInstance(lblImgCarro.getWidth(), lblImgCarro.getHeight(), Image.SCALE_DEFAULT));
                lblImgCarro.setIcon(imgCrafter);
                txaInfoCarro.setText(auto2.presentarInfo());
                break;
            case 3:
                panelInfoAuto.setVisible(true);
                Icon imgJetta = new ImageIcon(jetta.getImage().getScaledInstance(lblImgCarro.getWidth(), lblImgCarro.getHeight(), Image.SCALE_DEFAULT));
                lblImgCarro.setIcon(imgJetta);
                txaInfoCarro.setText(auto3.presentarInfo());
                break;
            default:
                JOptionPane.showMessageDialog(rootPane, "Seleccione un auto para ver su información.");
        }

    }//GEN-LAST:event_btnMostrarInfoAutoActionPerformed

    private void btnReservarAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservarAutoActionPerformed
        int index = cmbAutomoviles.getSelectedIndex() - 1;
        Cliente clienteactual = clientesActuales.get(clientesActuales.size() - 1);
        int respuesta = JOptionPane.showConfirmDialog(rootPane, "¿Está seguro que desea reservar un " + autos[index].getModelo() + "?", "Confirmación", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (respuesta == JOptionPane.YES_OPTION) {
            clienteactual.setVehiculoReservado(autos[index]);
            JOptionPane.showMessageDialog(rootPane, clienteactual.toString()
                    + "\n\nGracias por darnos el honor de ayudarle a escoger su próximo vehículo.");
            this.setVisible(false);
            VehículosKAR interfaz = new VehículosKAR();
            interfaz.clientes = clientesActuales;
            interfaz.setVisible(true);
        } else {
            cmbAutomoviles.setSelectedIndex(0);
            panelInfoAuto.setVisible(false);
        }
    }//GEN-LAST:event_btnReservarAutoActionPerformed

    private void btnCerrarInfoAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarInfoAutoActionPerformed
        panelInfoAuto.setVisible(false);
        cmbAutomoviles.setSelectedIndex(0);
    }//GEN-LAST:event_btnCerrarInfoAutoActionPerformed

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
            java.util.logging.Logger.getLogger(FrmAuto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAuto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAuto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAuto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAuto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarInfoAuto;
    private javax.swing.JButton btnMostrarInfoAuto;
    public javax.swing.JButton btnReservarAuto;
    private javax.swing.JComboBox<String> cmbAutomoviles;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAutomovil;
    private javax.swing.JLabel lblFondoAuto;
    private javax.swing.JLabel lblImgCarro;
    private javax.swing.JPanel panelInfoAuto;
    private javax.swing.JTextArea txaInfoCarro;
    // End of variables declaration//GEN-END:variables
}
