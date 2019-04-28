/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms.Forms;

import java.awt.Color;
import java.net.InetAddress;
import javax.swing.JOptionPane;

/**
 *
 * @author Pipo
 */
public class Reg extends javax.swing.JFrame {

    /**
     * Creates new form Reg
     */
    public Reg() {
        initComponents();
        TextPrompt hold=new TextPrompt("Usuario", Usuario);
        TextPrompt hold2=new TextPrompt("Contraseña", Contraseña1);
        TextPrompt hold3=new TextPrompt("Contraseña", Contraseña2);
    }
    int xx,xy;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        Usuario = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        Registro_Tag = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        Aceptar = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        Contraseña1 = new javax.swing.JPasswordField();
        Contraseña2 = new javax.swing.JPasswordField();
        Nocturno = new javax.swing.JLabel();
        Diurno = new javax.swing.JLabel();
        Panel2 = new javax.swing.JPanel();
        Minimizar = new javax.swing.JButton();
        Ayuda = new javax.swing.JButton();
        Salir4 = new javax.swing.JButton();
        Minimizar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(460, 488));
        setUndecorated(true);
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

        Usuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Usuario.setToolTipText("Ingrese su nombre de usuario aqui");
        Usuario.setBorder(null);

        Registro_Tag.setFont(new java.awt.Font("Segoe WP Black", 2, 24)); // NOI18N
        Registro_Tag.setForeground(new java.awt.Color(230, 230, 230));
        Registro_Tag.setText("REGISTRATE");

        Aceptar.setBackground(new java.awt.Color(255, 255, 255));
        Aceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Usreg.png"))); // NOI18N
        Aceptar.setToolTipText("Aceptar y continuar");
        Aceptar.setBorder(null);
        Aceptar.setBorderPainted(false);
        Aceptar.setContentAreaFilled(false);
        Aceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Aceptar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Btnclick largo.png"))); // NOI18N
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

        Cancelar.setBackground(new java.awt.Color(255, 255, 255));
        Cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Usregno.png"))); // NOI18N
        Cancelar.setToolTipText("Cancelar y volver atrás");
        Cancelar.setBorder(null);
        Cancelar.setBorderPainted(false);
        Cancelar.setContentAreaFilled(false);
        Cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cancelar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Btnclick largo.png"))); // NOI18N
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        Contraseña1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Contraseña1.setToolTipText("Ingrese su contraseña aqui");
        Contraseña1.setBorder(null);

        Contraseña2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Contraseña2.setToolTipText("Repita su contraseña");
        Contraseña2.setBorder(null);

        Nocturno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz_Avanzada/Modo diurno.png"))); // NOI18N
        Nocturno.setToolTipText("Modo Nocturno");
        Nocturno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Nocturno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NocturnoMouseClicked(evt);
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

        Panel2.setBackground(new java.awt.Color(230, 230, 230));

        Minimizar.setBackground(new java.awt.Color(255, 255, 255));
        Minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Minimizar.png"))); // NOI18N
        Minimizar.setToolTipText("Minimizar");
        Minimizar.setBorder(null);
        Minimizar.setBorderPainted(false);
        Minimizar.setContentAreaFilled(false);
        Minimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Minimizar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Btnclick.png"))); // NOI18N
        Minimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinimizarActionPerformed(evt);
            }
        });

        Ayuda.setBackground(new java.awt.Color(255, 255, 255));
        Ayuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ayuda.png"))); // NOI18N
        Ayuda.setToolTipText("¿Qué es esto?");
        Ayuda.setBorder(null);
        Ayuda.setBorderPainted(false);
        Ayuda.setContentAreaFilled(false);
        Ayuda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Ayuda.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Btnclick.png"))); // NOI18N
        Ayuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AyudaActionPerformed(evt);
            }
        });

        Salir4.setBackground(new java.awt.Color(255, 255, 255));
        Salir4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Salir.png"))); // NOI18N
        Salir4.setToolTipText("Salir");
        Salir4.setBorder(null);
        Salir4.setBorderPainted(false);
        Salir4.setContentAreaFilled(false);
        Salir4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Salir4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Btnclick.png"))); // NOI18N
        Salir4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Salir4ActionPerformed(evt);
            }
        });

        Minimizar1.setBackground(new java.awt.Color(255, 255, 255));
        Minimizar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Usuario.png"))); // NOI18N
        Minimizar1.setToolTipText("Iniciar sesion");
        Minimizar1.setBorder(null);
        Minimizar1.setBorderPainted(false);
        Minimizar1.setContentAreaFilled(false);
        Minimizar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Minimizar1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Btnclick.png"))); // NOI18N
        Minimizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Minimizar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel2Layout = new javax.swing.GroupLayout(Panel2);
        Panel2.setLayout(Panel2Layout);
        Panel2Layout.setHorizontalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Minimizar)
                    .addComponent(Ayuda)
                    .addComponent(Salir4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Minimizar1)
                .addContainerGap())
        );
        Panel2Layout.setVerticalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Salir4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Minimizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Ayuda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Minimizar1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addComponent(Registro_Tag, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(Nocturno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Diurno))
                    .addComponent(Aceptar)
                    .addComponent(Cancelar)
                    .addComponent(Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Contraseña1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Contraseña2, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(Panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Registro_Tag, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Diurno)
                    .addComponent(Nocturno))
                .addGap(18, 18, 18)
                .addComponent(Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Contraseña1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Contraseña2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(Aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Cancelar)
                .addGap(11, 11, 11))
            .addComponent(Panel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinimizarActionPerformed
        this.setState(ICONIFIED);
    }//GEN-LAST:event_MinimizarActionPerformed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
     xy=evt.getY();
     xx=evt.getX();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
    int x=evt.getXOnScreen();
    int y=evt.getYOnScreen();

    this.setLocation(x-xx, y-xy);
    }//GEN-LAST:event_formMouseDragged

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
    Inicio vent=new Inicio();
    vent.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_CancelarActionPerformed

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed
        Cliente cliente = new Cliente();
        try{
            if ((Contraseña1.getText()).equals(Contraseña2.getText())&&Usuario.getText()!=null){
                InetAddress direccion = InetAddress.getLocalHost();
                cliente.Contraseña = Contraseña1.getText();
                cliente.MAC = direccion.getHostAddress();
                cliente.Nombre = Usuario.getText();
                
                if (!Conexion.Datos.Guardar(cliente)){
                    Usuario vent=new Usuario(cliente);
                    vent.setVisible(true);
                    this.dispose();
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_AceptarActionPerformed

    private void AyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AyudaActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Para aceptar y terminar de click en el botón de continuar, para cancelar y volver al inicio de click en cancelar");
    }//GEN-LAST:event_AyudaActionPerformed

    private void Salir4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Salir4ActionPerformed
        Salida salir=new Salida(this, true);
        salir.setVisible(true);
    }//GEN-LAST:event_Salir4ActionPerformed

    private void Minimizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Minimizar1ActionPerformed
    Login vent=new Login();
    vent.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_Minimizar1ActionPerformed

    private void DiurnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DiurnoMouseClicked
    CambioColor JPanel1=new CambioColor(Panel1, 66, 66, 66);
    CambioColor JPanel2=new CambioColor(Panel2, 86, 86, 86);
    CambioColor JUsuario=new CambioColor(Usuario, 66, 66, 66);
    CambioColor JContraseña1=new CambioColor(Contraseña1, 66, 66, 66);
    CambioColor JContraseña2=new CambioColor(Contraseña2, 66, 66, 66);
    CambioColor JUsuarioFuente=new CambioColor(Usuario, 2);
    CambioColor JContraseña1Fuente=new CambioColor(Contraseña1, 2);
    CambioColor JContraseña2Fuente=new CambioColor(Contraseña2, 2);

    }//GEN-LAST:event_DiurnoMouseClicked

    private void AceptarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AceptarMouseEntered
    if((Usuario.getText().isEmpty()||Contraseña1.getText().isEmpty()||Contraseña2.getText().isEmpty()) && Contraseña1.getText().equals(Contraseña2.getText()))
    {
     Aceptar.setEnabled(false);
    }
    }//GEN-LAST:event_AceptarMouseEntered

    private void AceptarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AceptarMouseExited
    Aceptar.setEnabled(true);
    }//GEN-LAST:event_AceptarMouseExited

    private void NocturnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NocturnoMouseClicked
    CambioColor JPanel1=new CambioColor(Panel1, 255, 255, 255);
    CambioColor JPanel2=new CambioColor(Panel2, 230, 230, 230);
    CambioColor JUsuario=new CambioColor(Usuario, 255, 255, 255);
    CambioColor JContraseña1=new CambioColor(Contraseña1, 255, 255, 255);
    CambioColor JContraseña2=new CambioColor(Contraseña2, 255, 255, 255);
    CambioColor JUsuarioFuente=new CambioColor(Usuario, 1);
    CambioColor JContraseña1Fuente=new CambioColor(Contraseña1, 1);
    CambioColor JContraseña2Fuente=new CambioColor(Contraseña2, 1);

    }//GEN-LAST:event_NocturnoMouseClicked

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
            java.util.logging.Logger.getLogger(Reg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reg().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JButton Ayuda;
    private javax.swing.JButton Cancelar;
    private javax.swing.JPasswordField Contraseña1;
    private javax.swing.JPasswordField Contraseña2;
    private javax.swing.JLabel Diurno;
    private javax.swing.JButton Minimizar;
    private javax.swing.JButton Minimizar1;
    private javax.swing.JLabel Nocturno;
    private javax.swing.JPanel Panel1;
    private javax.swing.JPanel Panel2;
    private javax.swing.JLabel Registro_Tag;
    private javax.swing.JButton Salir4;
    private javax.swing.JTextField Usuario;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    // End of variables declaration//GEN-END:variables
}
