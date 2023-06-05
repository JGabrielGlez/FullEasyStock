
package ProyectoFinal;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JButton;
import static javax.swing.JOptionPane.*;


public class frmMenu extends javax.swing.JFrame{
        
    //zona de inicialiación de clases 
        pnlVenta venta=new pnlVenta(); 
        pnlArticulo articulo=new pnlArticulo(this);
        pnlInventario inventario=new pnlInventario(this);
        
    
    public frmMenu() {//este es el constructor del menu
        initComponents();
        MostrarHyF();
        articulo.enlazarObservador(venta);

        this.setExtendedState(this.MAXIMIZED_BOTH);//da el tamaño máximo según el tamaño de ventana. 
        this.setResizable(false);
        this.setLocationRelativeTo(null);//con esto aparecerá centrado.
        this.setTitle("Bienvenido a EasyStock, actualmente estás en la versión gratuita");
        pnlContenedor.add(venta);
        venta.setVisible(true);
        
        
    }

    ////gafedsf
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlDatosTienda = new javax.swing.JPanel();
        lnlNombreTienda = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        pnlDatos = new javax.swing.JPanel();
        pnlBotones = new javax.swing.JPanel();
        btnArticulos = new javax.swing.JButton();
        btnInventario = new javax.swing.JButton();
        btnPedidos = new javax.swing.JButton();
        btnDistribuidor = new javax.swing.JButton();
        btnSalirSistema = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        lblFechayHora = new javax.swing.JLabel();
        pnlContenedor = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);

        pnlDatosTienda.setBackground(new java.awt.Color(153, 153, 255));

        lnlNombreTienda.setFont(new java.awt.Font("Bookman Old Style", 1, 60)); // NOI18N
        lnlNombreTienda.setText("EasyStock");

        lblDireccion.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        lblDireccion.setText("Ubicada Allende #239, col. Centro  ");

        lblTelefono.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        lblTelefono.setText("Teléfono: 311 234 3434");

        javax.swing.GroupLayout pnlDatosTiendaLayout = new javax.swing.GroupLayout(pnlDatosTienda);
        pnlDatosTienda.setLayout(pnlDatosTiendaLayout);
        pnlDatosTiendaLayout.setHorizontalGroup(
            pnlDatosTiendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosTiendaLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lnlNombreTienda, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(578, 578, 578)
                .addGroup(pnlDatosTiendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTelefono)
                    .addComponent(lblDireccion)))
        );
        pnlDatosTiendaLayout.setVerticalGroup(
            pnlDatosTiendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lnlNombreTienda, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(pnlDatosTiendaLayout.createSequentialGroup()
                .addComponent(lblDireccion)
                .addGap(18, 18, 18)
                .addComponent(lblTelefono))
        );

        getContentPane().add(pnlDatosTienda, java.awt.BorderLayout.NORTH);

        pnlDatos.setBackground(new java.awt.Color(153, 153, 255));
        pnlDatos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(pnlDatos, java.awt.BorderLayout.LINE_END);

        pnlBotones.setBackground(new java.awt.Color(153, 153, 255));

        btnArticulos.setBackground(new java.awt.Color(102, 102, 255));
        btnArticulos.setFont(new java.awt.Font("Segoe UI Emoji", 2, 18)); // NOI18N
        btnArticulos.setText("Artículos");
        btnArticulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArticulosActionPerformed(evt);
            }
        });

        btnInventario.setBackground(new java.awt.Color(102, 102, 255));
        btnInventario.setFont(new java.awt.Font("Segoe UI Emoji", 2, 18)); // NOI18N
        btnInventario.setText("Inventario");
        btnInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventarioActionPerformed(evt);
            }
        });

        btnPedidos.setBackground(new java.awt.Color(102, 102, 255));
        btnPedidos.setFont(new java.awt.Font("Segoe UI Emoji", 2, 18)); // NOI18N
        btnPedidos.setText("Pedidos");
        btnPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedidosActionPerformed(evt);
            }
        });

        btnDistribuidor.setBackground(new java.awt.Color(102, 102, 255));
        btnDistribuidor.setFont(new java.awt.Font("Segoe UI Emoji", 2, 18)); // NOI18N
        btnDistribuidor.setText("Distribuidor");
        btnDistribuidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDistribuidorActionPerformed(evt);
            }
        });

        btnSalirSistema.setBackground(new java.awt.Color(204, 0, 255));
        btnSalirSistema.setText("Salir del sistema");
        btnSalirSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirSistemaActionPerformed(evt);
            }
        });

        jTextField2.setBackground(new java.awt.Color(204, 204, 255));
        jTextField2.setText("Datos del usuario");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        lblFechayHora.setText("Fecha:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblFechayHora, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(lblFechayHora)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout pnlBotonesLayout = new javax.swing.GroupLayout(pnlBotones);
        pnlBotones.setLayout(pnlBotonesLayout);
        pnlBotonesLayout.setHorizontalGroup(
            pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotonesLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDistribuidor, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                    .addComponent(btnInventario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnArticulos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPedidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField2)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalirSistema, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        pnlBotonesLayout.setVerticalGroup(
            pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotonesLayout.createSequentialGroup()
                .addComponent(btnArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDistribuidor, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalirSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(pnlBotones, java.awt.BorderLayout.LINE_START);

        pnlContenedor.setBackground(new java.awt.Color(102, 102, 255));
        pnlContenedor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlContenedor.setPreferredSize(new java.awt.Dimension(560, 645));
        pnlContenedor.setLayout(new java.awt.BorderLayout());
        getContentPane().add(pnlContenedor, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnArticulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArticulosActionPerformed
       mostrarPanelArticulo();
       desactivarBoton(evt); 
    }//GEN-LAST:event_btnArticulosActionPerformed

    private void btnSalirSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirSistemaActionPerformed
            this.dispose();
            
    }//GEN-LAST:event_btnSalirSistemaActionPerformed

    private void btnInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventarioActionPerformed
        mostrarPanelInventario();
        desactivarBoton(evt);
    }//GEN-LAST:event_btnInventarioActionPerformed

    private void btnPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPedidosActionPerformed

    private void btnDistribuidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDistribuidorActionPerformed
        showMessageDialog(this,"Disponible en la aplicación PREMIUM");
    }//GEN-LAST:event_btnDistribuidorActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    
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
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
            
        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenu().setVisible(true);
                
            }
        });
    }
    
    
    //zona de métodos
    public void actualizarPanel(){
        pnlContenedor.revalidate();
        pnlContenedor.repaint();
        activarBotones();
        
    }
     
   public void desactivarBoton(ActionEvent e){
       JButton botonPresionado=(JButton)e.getSource();
       botonPresionado.setEnabled(false);
   }
    
    public void mostrarPanelArticulo() {
        pnlContenedor.remove(panelActual());
        pnlContenedor.add(articulo);
        actualizarPanel();
        

    }

    public void mostrarPanelVenta() {
        pnlContenedor.remove(panelActual());
        pnlContenedor.add(venta);
        actualizarPanel();

    }

    public void mostrarPanelInventario() {
        pnlContenedor.remove(panelActual());
        pnlContenedor.add(inventario);
        actualizarPanel();
    }

    public Component panelActual() {
        Component actual;
        actual = pnlContenedor.getComponent(0);
        return actual;
    }

    public void activarBotones() {
        btnArticulos.setEnabled(true);
        btnDistribuidor.setEnabled(true);
        btnInventario.setEnabled(true);
        btnPedidos.setEnabled(true);
    }
    
    
    public controladorPanel getArticulo() {
        return articulo;
    }
     
    
    private void MostrarHyF(){
        String timestamp = ZonedDateTime.now(ZoneId.of("Mexico/BajaNorte")).format(DateTimeFormatter.ofPattern("dd.MM.yyy, hh:mm a"));
        lblFechayHora.setText(String.valueOf(timestamp));
    }
        
    
        
        
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArticulos;
    private javax.swing.JButton btnDistribuidor;
    private javax.swing.JButton btnInventario;
    private javax.swing.JButton btnPedidos;
    private javax.swing.JButton btnSalirSistema;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblFechayHora;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lnlNombreTienda;
    private javax.swing.JPanel pnlBotones;
    private javax.swing.JPanel pnlContenedor;
    private javax.swing.JPanel pnlDatos;
    private javax.swing.JPanel pnlDatosTienda;
    // End of variables declaration//GEN-END:variables

    
    
}
