package Forms.Forms;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @Pipo
 */
public class Usuario extends javax.swing.JFrame {

    int xx,xy;
    public static boolean modo=false;
    
    public Usuario() {
        initComponents();
        TextPrompt usu=new TextPrompt("Busqueda de usuario", Busqueda_Usuario);
        TextPrompt Susu=new TextPrompt("Selección de usuario", Seleccion_Usuario);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel1 = new javax.swing.JPanel();
        Panel2 = new javax.swing.JPanel();
        Busqueda_Usuario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        Nmb_Usuario = new javax.swing.JLabel();
        TXT1 = new javax.swing.JLabel();
        Nocturnoi = new javax.swing.JLabel();
        Diurno = new javax.swing.JLabel();
        Conectar = new javax.swing.JLabel();
        Nocturno2 = new javax.swing.JLabel();
        Diurno1 = new javax.swing.JLabel();
        Seleccion_Usuario = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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

        Panel2.setBackground(new java.awt.Color(230, 230, 230));

        Busqueda_Usuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Busqueda_Usuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Busqueda_Usuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        Busqueda_Usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Busqueda_UsuarioMouseClicked(evt);
            }
        });
        Busqueda_Usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Busqueda_UsuarioKeyTyped(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz_Avanzada/Lupa.png"))); // NOI18N
        jLabel1.setToolTipText("Buscar Usuario");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        Nmb_Usuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Nmb_Usuario.setText("Admin");

        TXT1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        TXT1.setText("Usuario:");

        Nocturnoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz_Avanzada/Modo nocturno.png"))); // NOI18N
        Nocturnoi.setToolTipText("Modo Nocturno");
        Nocturnoi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Nocturnoi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NocturnoiMouseClicked(evt);
            }
        });

        Diurno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz_Avanzada/Modo diurno.png"))); // NOI18N
        Diurno.setToolTipText("Modo Diurno");
        Diurno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Diurno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DiurnoMouseClicked(evt);
            }
        });

        Conectar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz_Avanzada/Conectar.png"))); // NOI18N
        Conectar.setToolTipText("Conectar Con El Usuario");
        Conectar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Conectar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConectarMouseClicked(evt);
            }
        });

        Nocturno2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz_Avanzada/Salir pequeño.png"))); // NOI18N
        Nocturno2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Nocturno2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Nocturno2MouseClicked(evt);
            }
        });

        Diurno1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz_Avanzada/Minimizar pequeño.png"))); // NOI18N
        Diurno1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Diurno1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Diurno1MouseClicked(evt);
            }
        });

        Seleccion_Usuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Seleccion_Usuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Seleccion_Usuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        Seleccion_Usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Seleccion_UsuarioMouseClicked(evt);
            }
        });
        Seleccion_Usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Seleccion_UsuarioKeyTyped(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Uslogout.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Btnclick.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Usuario.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Btnclick.png"))); // NOI18N

        javax.swing.GroupLayout Panel2Layout = new javax.swing.GroupLayout(Panel2);
        Panel2.setLayout(Panel2Layout);
        Panel2Layout.setHorizontalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel2Layout.createSequentialGroup()
                        .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel2Layout.createSequentialGroup()
                                .addComponent(TXT1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Nmb_Usuario))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Diurno1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Nocturno2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel2Layout.createSequentialGroup()
                        .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel2Layout.createSequentialGroup()
                                .addComponent(Nocturnoi, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Diurno, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Panel2Layout.createSequentialGroup()
                                .addComponent(Busqueda_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel2Layout.createSequentialGroup()
                                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Seleccion_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Panel2Layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton2)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Conectar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 4, Short.MAX_VALUE)))
                .addContainerGap())
        );
        Panel2Layout.setVerticalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel2Layout.createSequentialGroup()
                        .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TXT1)
                            .addComponent(Nmb_Usuario))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Diurno1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nocturno2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Nocturnoi, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Diurno, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Busqueda_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Conectar)
                    .addComponent(Seleccion_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void NocturnoiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NocturnoiMouseClicked
    CambioColor JPanel1=new CambioColor(Panel1, 66, 66, 66);
    CambioColor JPanel2=new CambioColor(Panel2, 86, 86, 86);
    CambioColor JBusqueda=new CambioColor(Busqueda_Usuario,86,86,86);
    CambioColor JBusquedaFuente=new CambioColor(Busqueda_Usuario, 2);
    modo=true;
    }//GEN-LAST:event_NocturnoiMouseClicked

    private void DiurnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DiurnoMouseClicked
    CambioColor JPanel1=new CambioColor(Panel1, 255, 255, 255);
    CambioColor JPanel2=new CambioColor(Panel2, 230, 230, 230);
    CambioColor JBusqueda=new CambioColor(Busqueda_Usuario, 230,230,230);
    CambioColor JBusquedaFuente=new CambioColor(Busqueda_Usuario, 1);
    modo=false;
    }//GEN-LAST:event_DiurnoMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
    if(Busqueda_Usuario.getText().isEmpty())
    {
       Busqueda_Usuario.setText("Ingrese un usuario");
       Busqueda_Usuario.setForeground(Color.red);
    }
    else
    {
    }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xx=evt.getX();
        xy=evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        this.setLocation(x-xx, y-xy);
    }//GEN-LAST:event_formMouseDragged

    private void ConectarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConectarMouseClicked
    if(Seleccion_Usuario.getText().isEmpty())
    {
       Seleccion_Usuario.setText("Selecciona un usuario");
       Seleccion_Usuario.setForeground(Color.red);
    }
    }//GEN-LAST:event_ConectarMouseClicked

    private void Nocturno2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Nocturno2MouseClicked
    Salida salir=new Salida(this, true);
    salir.setVisible(true);
    }//GEN-LAST:event_Nocturno2MouseClicked

    private void Diurno1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Diurno1MouseClicked
    this.setState(ICONIFIED);
    }//GEN-LAST:event_Diurno1MouseClicked

    private void Busqueda_UsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Busqueda_UsuarioMouseClicked
        if(modo==true)
    {
     Busqueda_Usuario.setForeground(Color.WHITE);
     Busqueda_Usuario.setText(null);
    }
    else
    {
     Busqueda_Usuario.setForeground(Color.BLACK);
     Busqueda_Usuario.setText(null);
    }
    }//GEN-LAST:event_Busqueda_UsuarioMouseClicked

    private void Seleccion_UsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Seleccion_UsuarioMouseClicked
    if(modo==true)
    {
     Seleccion_Usuario.setForeground(Color.WHITE);
     Seleccion_Usuario.setText(null);
    }
    else
    {
     Seleccion_Usuario.setForeground(Color.BLACK);
     Seleccion_Usuario.setText(null);
    }
    }//GEN-LAST:event_Seleccion_UsuarioMouseClicked

    private void Busqueda_UsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Busqueda_UsuarioKeyTyped
    if(Busqueda_Usuario.getText().equals("Ingrese un usuario"))
    {
     Busqueda_Usuario.setText(null);
     if(modo==true)
     {
      Busqueda_Usuario.setForeground(Color.WHITE);
     }
     else
     {
      Busqueda_Usuario.setForeground(Color.BLACK);
     }
    }
    else
    {
      if(modo==true)
     {
      Busqueda_Usuario.setForeground(Color.WHITE);
     }
      else
     {
      Busqueda_Usuario.setForeground(Color.BLACK);
     }
    }
    }//GEN-LAST:event_Busqueda_UsuarioKeyTyped

    private void Seleccion_UsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Seleccion_UsuarioKeyTyped
    if(Seleccion_Usuario.getText().equals("Selecciona un usuario"))
    {
     Seleccion_Usuario.setText(null);
     if(modo==true)
     {
      Seleccion_Usuario.setForeground(Color.WHITE);
     }
     else
     {
      Seleccion_Usuario.setForeground(Color.BLACK);
     }
    }
    else
    {
      if(modo==true)
     {
      Seleccion_Usuario.setForeground(Color.WHITE);
     }
      else
     {
      Seleccion_Usuario.setForeground(Color.BLACK);
     }
    }
    }//GEN-LAST:event_Seleccion_UsuarioKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    Inicio vent=new Inicio();
    vent.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Busqueda_Usuario;
    private javax.swing.JLabel Conectar;
    private javax.swing.JLabel Diurno;
    private javax.swing.JLabel Diurno1;
    private javax.swing.JLabel Nmb_Usuario;
    private javax.swing.JLabel Nocturno2;
    private javax.swing.JLabel Nocturnoi;
    private javax.swing.JPanel Panel1;
    private javax.swing.JPanel Panel2;
    private javax.swing.JTextField Seleccion_Usuario;
    private javax.swing.JLabel TXT1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
