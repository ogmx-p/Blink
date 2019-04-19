/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms.Forms;

import java.awt.Color;

/**
 *
 * @author pc
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        TextPrompt hold=new TextPrompt("Usuario", Usuario);
        TextPrompt hold1=new TextPrompt("Contraseña", Contraseña);
    }

    int xx,xy;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Usuario = new javax.swing.JTextField();
        Contraseña = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Sesion = new javax.swing.JLabel();
        Salir = new javax.swing.JButton();
        Min = new javax.swing.JButton();
        Aceptar = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(493, 295));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(230, 230, 230));

        Usuario.setBackground(new java.awt.Color(204, 204, 204));
        Usuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Usuario.setBorder(null);

        Contraseña.setBackground(new java.awt.Color(204, 204, 204));
        Contraseña.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Contraseña.setBorder(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("¿No estas registrado?");

        Sesion.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        Sesion.setForeground(new java.awt.Color(0, 0, 255));
        Sesion.setText("Haz click aqui");
        Sesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SesionMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                SesionMouseReleased(evt);
            }
        });

        Salir.setBackground(new java.awt.Color(255, 255, 255));
        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Salir.png"))); // NOI18N
        Salir.setToolTipText("Salir");
        Salir.setBorder(null);
        Salir.setBorderPainted(false);
        Salir.setContentAreaFilled(false);
        Salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Salir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Btnclick.png"))); // NOI18N
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        Min.setBackground(new java.awt.Color(255, 255, 255));
        Min.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Minimizar.png"))); // NOI18N
        Min.setToolTipText("Minimizar");
        Min.setBorder(null);
        Min.setBorderPainted(false);
        Min.setContentAreaFilled(false);
        Min.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Min.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Btnclick.png"))); // NOI18N
        Min.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinActionPerformed(evt);
            }
        });

        Aceptar.setBackground(new java.awt.Color(255, 255, 255));
        Aceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Usreg.png"))); // NOI18N
        Aceptar.setToolTipText("Aceptar y continuar");
        Aceptar.setBorder(null);
        Aceptar.setBorderPainted(false);
        Aceptar.setContentAreaFilled(false);
        Aceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Aceptar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Btnclick.png"))); // NOI18N
        Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarActionPerformed(evt);
            }
        });

        Cancelar.setBackground(new java.awt.Color(255, 255, 255));
        Cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Usregno.png"))); // NOI18N
        Cancelar.setToolTipText("Cancelar y volver atrás");
        Cancelar.setBorder(null);
        Cancelar.setBorderPainted(false);
        Cancelar.setContentAreaFilled(false);
        Cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cancelar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Btnclick.png"))); // NOI18N
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Usuario)
                    .addComponent(Contraseña)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Sesion, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Salir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Min)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Aceptar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Cancelar)))
                        .addGap(0, 33, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Salir, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Min, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Aceptar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Cancelar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sesion, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(107, 107, 107))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 500, 300);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed

    }//GEN-LAST:event_AceptarActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        Inicio vent=new Inicio();
        vent.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CancelarActionPerformed

    private void MinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinActionPerformed
        this.setState(ICONIFIED);
    }//GEN-LAST:event_MinActionPerformed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
    xx=evt.getX();
    xy=evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
    int x=evt.getXOnScreen();
    int y=evt.getYOnScreen();
    
    this.setLocation(x-xx, y-xy);
    }//GEN-LAST:event_formMouseDragged

    private void SesionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SesionMousePressed
    Sesion.setForeground(Color.red);
    }//GEN-LAST:event_SesionMousePressed

    private void SesionMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SesionMouseReleased
    Sesion.setForeground(Color.blue);
    Reg vent=new Reg();
    vent.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_SesionMouseReleased

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        Salida salir=new Salida(this, true);
        salir.setVisible(true);
    }//GEN-LAST:event_SalirActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JButton Cancelar;
    private javax.swing.JTextField Contraseña;
    private javax.swing.JButton Min;
    private javax.swing.JButton Salir;
    private javax.swing.JLabel Sesion;
    private javax.swing.JTextField Usuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
