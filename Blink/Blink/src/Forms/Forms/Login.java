/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms.Forms;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author pc
 */
public class Login extends javax.swing.JFrame {

     public Cliente cliente;
    public Login() {
        initComponents();
        TextPrompt hold2=new TextPrompt("Usuario", Usuario);
        TextPrompt hold1=new TextPrompt("Contraseña", Contra);
    }

    int xx,xy;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        Panel1 = new javax.swing.JPanel();
        Panel2 = new javax.swing.JPanel();
        Contra = new javax.swing.JPasswordField();
        Usuario = new javax.swing.JTextField();
        Aceptar = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        Min = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        Nocturno = new javax.swing.JLabel();
        Diurno = new javax.swing.JLabel();

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
        setMaximumSize(getPreferredSize());
        setUndecorated(true);
        setResizable(false);
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

        Panel1.setBackground(new java.awt.Color(255, 255, 255));

        Panel2.setBackground(new java.awt.Color(230, 230, 230));

        Contra.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Contra.setBorder(null);

        Usuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Usuario.setBorder(null);

        javax.swing.GroupLayout Panel2Layout = new javax.swing.GroupLayout(Panel2);
        Panel2.setLayout(Panel2Layout);
        Panel2Layout.setHorizontalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Usuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
                    .addComponent(Contra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE))
                .addContainerGap())
        );
        Panel2Layout.setVerticalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Contra, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        Aceptar.setBackground(new java.awt.Color(255, 255, 255));
        Aceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Uslogin.png"))); // NOI18N
        Aceptar.setToolTipText("Iniciar sesion");
        Aceptar.setBorder(null);
        Aceptar.setBorderPainted(false);
        Aceptar.setContentAreaFilled(false);
        Aceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Aceptar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Btnclick.png"))); // NOI18N
        Aceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AceptarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AceptarMouseExited(evt);
            }
        });
        Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarActionPerformed(evt);
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

        Cancelar.setBackground(new java.awt.Color(255, 255, 255));
        Cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Uslogin2.png"))); // NOI18N
        Cancelar.setToolTipText("Registrarse");
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

        Nocturno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz_Avanzada/Modo diurno.png"))); // NOI18N
        Nocturno.setToolTipText("Modo Nocturno");
        Nocturno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Nocturno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                NocturnoMousePressed(evt);
            }
        });

        Diurno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz_Avanzada/Modo nocturno.png"))); // NOI18N
        Diurno.setToolTipText("Modo Diurno");
        Diurno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Diurno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DiurnoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(Salir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Min)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Cancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Aceptar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Diurno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Nocturno)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(Panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Cancelar)
                    .addComponent(Aceptar)
                    .addComponent(Min)
                    .addComponent(Salir)
                    .addComponent(Nocturno)
                    .addComponent(Diurno))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed
        try{
            cliente = Conexion.Datos.Buscar(Usuario.getText(), Contra.getText());
            if (!cliente.Error){
                Usuario x = new Usuario();
                x.setVisible(true);
                dispose();
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_AceptarActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
    Reg vent=new Reg();
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

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        Salida salir=new Salida(this, true);
        salir.setVisible(true);
    }//GEN-LAST:event_SalirActionPerformed

    private void NocturnoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NocturnoMousePressed
        CambioColor JPanel1=new CambioColor(Panel1, 255, 255, 255);
        CambioColor JPanel2=new CambioColor(Panel2, 230, 230, 230);
        CambioColor JUsuario=new CambioColor(Usuario, 255, 255, 255);
        CambioColor JContraseña1=new CambioColor(Contra, 255, 255, 255);
        CambioColor JUsuarioFuente=new CambioColor(Usuario, 1);
        CambioColor JContraseña1Fuente=new CambioColor(Contra, 1);
    }//GEN-LAST:event_NocturnoMousePressed

    private void DiurnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DiurnoMouseClicked
        CambioColor JPanel1=new CambioColor(Panel1, 66, 66, 66);
        CambioColor JPanel2=new CambioColor(Panel2, 86, 86, 86);
        CambioColor JUsuario=new CambioColor(Usuario, 66, 66, 66);
        CambioColor JContraseña1=new CambioColor(Contra, 66, 66, 66);
        CambioColor JContraseña2=new CambioColor(Contra, 66, 66, 66);
        CambioColor JUsuarioFuente=new CambioColor(Usuario, 2);
        CambioColor JContraseña1Fuente=new CambioColor(Contra, 2);
    }//GEN-LAST:event_DiurnoMouseClicked

    private void AceptarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AceptarMouseEntered
    if(Usuario.getText().isEmpty()||Contra.getText().isEmpty())
    {
     Aceptar.setEnabled(false);
    }
    }//GEN-LAST:event_AceptarMouseEntered

    private void AceptarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AceptarMouseExited
     Aceptar.setEnabled(true);
    }//GEN-LAST:event_AceptarMouseExited

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
    private javax.swing.JPasswordField Contra;
    private javax.swing.JLabel Diurno;
    private javax.swing.JButton Min;
    private javax.swing.JLabel Nocturno;
    private javax.swing.JPanel Panel1;
    private javax.swing.JPanel Panel2;
    private javax.swing.JButton Salir;
    private javax.swing.JTextField Usuario;
    private javax.swing.JLayeredPane jLayeredPane1;
    // End of variables declaration//GEN-END:variables
}
