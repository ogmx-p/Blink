package Forms.Forms;

import java.awt.Color;
import java.util.ArrayList;
import java.util.TimerTask;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @Pipo
 */
public class Usuario extends javax.swing.JFrame{

    int xx,xy;
    public static boolean modo=false;
    public Cliente cliente;

    public Usuario(Cliente cliente) {
        Status1.setVisible(false);
        Status2.setVisible(false);
        ArrayList<String> result;
        this.cliente = cliente;
        initComponents();
        Base();
        TextPrompt usu=new TextPrompt("Busqueda de usuario", Busqueda_Usuario);
        TextPrompt Mensaje=new TextPrompt("Escriba su mensaje aqui", MSJ);
        Actulizar();
        Nmb_Usuario.setText(cliente.Nombre);
    }

    private void Actulizar(){
        ArrayList<String> result;
        result = Conexion.Datos.BuscarClientesGuardados();
        jComboBox1.removeAllItems();
        result.forEach(x->{
            if (!cliente.Nombre.equals(x))
            jComboBox1.addItem(x);
        });
    }

    private void Actulizar(String indicio){
        ArrayList<String> result;
        result = Conexion.Datos.BuscarClientesGuardados();
        jComboBox1.removeAllItems();
        result.forEach(x->{
            if (!cliente.Nombre.equals(x))
                if ((x.indexOf(indicio))!=-1)
                    jComboBox1.addItem(x);
        });
    }

    private void Base()
    {
        Cliente Base=new Cliente();
        String NombreUsuario=Base.Nombre;

        Nmb_Usuario.setText(NombreUsuario);
    }

    public void ModoNocturnoTecla()
    {
      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel1 = new javax.swing.JPanel();
        Panel2 = new javax.swing.JPanel();
        Busqueda_Usuario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        Nmb_Usuario = new javax.swing.JLabel();
        TXT1 = new javax.swing.JLabel();
        Nocturnoi = new javax.swing.JLabel();
        Diurno = new javax.swing.JLabel();
        Nocturno2 = new javax.swing.JLabel();
        Diurno1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        MSJ = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        Historial = new javax.swing.JTextArea();
        Busqueda = new javax.swing.JButton();
        Panel3 = new javax.swing.JPanel();
        Desconectar = new javax.swing.JButton();
        Conectar = new javax.swing.JButton();
        EnviarMSJ = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Conectado = new javax.swing.JLabel();
        Conectado_Con = new javax.swing.JLabel();
        Status = new javax.swing.JLabel();
        Status1 = new javax.swing.JLabel();
        Status2 = new javax.swing.JLabel();

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
        Busqueda_Usuario.setBorder(null);
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

        Nmb_Usuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Nmb_Usuario.setText("Usuario");

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

        jComboBox1.setBackground(new java.awt.Color(230, 230, 230));
        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setBorder(null);
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        MSJ.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        MSJ.setBorder(null);

        Historial.setEditable(false);
        Historial.setColumns(20);
        Historial.setRows(5);
        Historial.setBorder(null);
        Historial.setFocusable(false);
        jScrollPane1.setViewportView(Historial);

        jScrollPane2.setViewportView(jScrollPane1);

        Busqueda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz_Avanzada/Lupa.png"))); // NOI18N
        Busqueda.setBorder(null);
        Busqueda.setContentAreaFilled(false);
        Busqueda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Busqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BusquedaActionPerformed(evt);
            }
        });

        Panel3.setBackground(new java.awt.Color(204, 204, 204));

        Desconectar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz_Avanzada/Desconectar.png"))); // NOI18N
        Desconectar.setBorder(null);
        Desconectar.setContentAreaFilled(false);
        Desconectar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Desconectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DesconectarActionPerformed(evt);
            }
        });

        Conectar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz_Avanzada/Conectar.png"))); // NOI18N
        Conectar.setBorder(null);
        Conectar.setContentAreaFilled(false);
        Conectar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Conectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConectarActionPerformed(evt);
            }
        });

        EnviarMSJ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz_Avanzada/Enviar MSJ.png"))); // NOI18N
        EnviarMSJ.setBorder(null);
        EnviarMSJ.setContentAreaFilled(false);
        EnviarMSJ.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EnviarMSJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnviarMSJActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz_Avanzada/Uslogout2.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Btnclick.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz_Avanzada/Usuario2.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Btnclick.png"))); // NOI18N

        Conectado.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Conectado.setText("Conectado con:");

        Conectado_Con.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Conectado_Con.setText("Desconectado");

        Status.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz_Avanzada/Status espera.png"))); // NOI18N

        Status1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz_Avanzada/Status Ok.png"))); // NOI18N

        Status2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz_Avanzada/Status null.png"))); // NOI18N

        javax.swing.GroupLayout Panel3Layout = new javax.swing.GroupLayout(Panel3);
        Panel3.setLayout(Panel3Layout);
        Panel3Layout.setHorizontalGroup(
            Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel3Layout.createSequentialGroup()
                        .addComponent(Status, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Status1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Status2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Desconectar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Conectar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EnviarMSJ, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2))
                    .addGroup(Panel3Layout.createSequentialGroup()
                        .addComponent(Conectado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Conectado_Con, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE))))
        );
        Panel3Layout.setVerticalGroup(
            Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel3Layout.createSequentialGroup()
                .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel3Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(Conectar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EnviarMSJ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Desconectar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Status, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Status1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Status2, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Conectado_Con, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(Conectado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout Panel2Layout = new javax.swing.GroupLayout(Panel2);
        Panel2.setLayout(Panel2Layout);
        Panel2Layout.setHorizontalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(MSJ, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Panel2Layout.createSequentialGroup()
                        .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel2Layout.createSequentialGroup()
                                .addComponent(TXT1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Nmb_Usuario))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                        .addComponent(Diurno1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Nocturno2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel2Layout.createSequentialGroup()
                        .addComponent(Nocturnoi, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(Diurno, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Busqueda_Usuario))
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(Panel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(Panel2Layout.createSequentialGroup()
                        .addComponent(Nocturnoi, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))
                    .addGroup(Panel2Layout.createSequentialGroup()
                        .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Busqueda_Usuario)
                            .addComponent(Diurno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Busqueda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(MSJ, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addComponent(Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    CambioColor JPanel3=new CambioColor(Panel3, 75, 75, 75);
    CambioColor JBusqueda=new CambioColor(Busqueda_Usuario,66,66,66);
    CambioColor JBusquedaFuente=new CambioColor(Busqueda_Usuario, 2);
    CambioColor JMSJ=new CambioColor(MSJ,66,66,66);
    CambioColor JMSJFuente=new CambioColor(MSJ, 2);
    modo=true;
    }//GEN-LAST:event_NocturnoiMouseClicked

    private void DiurnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DiurnoMouseClicked
    CambioColor JPanel1=new CambioColor(Panel1, 255, 255, 255);
    CambioColor JPanel2=new CambioColor(Panel2, 230, 230, 230);
    CambioColor JPanel3=new CambioColor(Panel3, 204, 204, 204);
    CambioColor JBusqueda=new CambioColor(Busqueda_Usuario, 255,255,255);
    CambioColor JBusquedaFuente=new CambioColor(Busqueda_Usuario, 1);
    CambioColor JMSJ=new CambioColor(MSJ,255,255,255);
    CambioColor JMSJFuente=new CambioColor(MSJ, 1);
    modo=false;
    }//GEN-LAST:event_DiurnoMouseClicked

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xx=evt.getX();
        xy=evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        this.setLocation(x-xx, y-xy);
    }//GEN-LAST:event_formMouseDragged

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    Inicio vent=new Inicio();
    vent.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        Actulizar(Busqueda_Usuario.getText());
    }//GEN-LAST:event_jLabel1MousePressed

    private void ConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConectarActionPerformed
    Historial.setText(null);
    String Usuario=(String) jComboBox1.getSelectedItem();
    Conectado_Con.setText(Usuario);
    }//GEN-LAST:event_ConectarActionPerformed

    private void DesconectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DesconectarActionPerformed
    Conectado_Con.setText("Desconectado");
    }//GEN-LAST:event_DesconectarActionPerformed

    private void EnviarMSJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnviarMSJActionPerformed
    if(Conectado_Con.getText().equals("Desconectado"))
    {
     CambioColor Msj=new CambioColor(MSJ,255,117,102);
     CambioColor MsjT=new CambioColor(MSJ, 4);
     MSJ.setText("No esta conectado con nadie");
    }
    else if(MSJ.getText().equals("No esta conectado con nadie"))
    {
     CambioColor Msj=new CambioColor(MSJ,255,255,255);
     CambioColor MsjT=new CambioColor(MSJ, 1);
     MSJ.setText("");
    }
    else if(MSJ.getText().equals(""))
    {
     JOptionPane.showMessageDialog(rootPane, "Ingrese texto antes de enviar un mensaje");
    }
    else
    {
     Historial.append(MSJ.getText()+"\n");
    }
    }//GEN-LAST:event_EnviarMSJActionPerformed

    private void BusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BusquedaActionPerformed
    int canti=jComboBox1.getItemCount();
    int x,pos;
    for(x=0;x<=canti;x++)
    {
       pos=x+1;
       if(jComboBox1.getItemAt(x).equals(Busqueda_Usuario.getText()))
       {
        jComboBox1.setSelectedItem(Busqueda_Usuario.getText());
        Historial.append("Usuario Encontrado En El Espacio:" +pos +"\n");
        Status1.setVisible(true);
        Status.setVisible(false);
        break;
       }
       else if(x==canti && jComboBox1.getItemAt(x)!=Busqueda_Usuario.getText())
       {
           
       }
       else
       {
        Historial.append("Usuario No Encontrado En El Espacio:" +pos +"\n");
        Status2.setVisible(true);
        Status.setVisible(false);
       }
    }       
    }//GEN-LAST:event_BusquedaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Busqueda;
    private javax.swing.JTextField Busqueda_Usuario;
    private javax.swing.JLabel Conectado;
    private javax.swing.JLabel Conectado_Con;
    private javax.swing.JButton Conectar;
    private javax.swing.JButton Desconectar;
    private javax.swing.JLabel Diurno;
    private javax.swing.JLabel Diurno1;
    private javax.swing.JButton EnviarMSJ;
    private javax.swing.JTextArea Historial;
    private javax.swing.JTextField MSJ;
    private javax.swing.JLabel Nmb_Usuario;
    private javax.swing.JLabel Nocturno2;
    private javax.swing.JLabel Nocturnoi;
    private javax.swing.JPanel Panel1;
    private javax.swing.JPanel Panel2;
    private javax.swing.JPanel Panel3;
    private javax.swing.JLabel Status;
    private javax.swing.JLabel Status1;
    private javax.swing.JLabel Status2;
    private javax.swing.JLabel TXT1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

    private Object indexOf(String Cliente_Busqueda) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
