
package ProyectoFinal;

import javax.swing.table.DefaultTableModel;


public class pnlVenta extends controladorPanel {

    public pnlVenta() {
        initComponents();
        m=(DefaultTableModel)tblVenta.getModel();
        
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlNombre = new javax.swing.JPanel();
        lblVenta = new javax.swing.JLabel();
        pnlBotones = new javax.swing.JPanel();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        pnlFormulario = new javax.swing.JPanel();
        pnlTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVenta = new javax.swing.JTable();
        pnlBotonesTabla = new javax.swing.JPanel();
        pnlTotal = new javax.swing.JPanel();
        txtMonto = new javax.swing.JFormattedTextField();
        txtTotal = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        lblDescripcion = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        lblNumVenta = new javax.swing.JLabel();
        txtNumVenta = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 102));
        setLayout(new java.awt.BorderLayout());

        pnlNombre.setBackground(new java.awt.Color(102, 255, 204));

        lblVenta.setFont(new java.awt.Font("Times", 0, 36)); // NOI18N
        lblVenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVenta.setText("Venta");
        pnlNombre.add(lblVenta);

        add(pnlNombre, java.awt.BorderLayout.PAGE_START);

        pnlBotones.setBackground(new java.awt.Color(204, 204, 255));

        btnAceptar.setText("Aceptar");

        btnCancelar.setText("Cancelar");

        javax.swing.GroupLayout pnlBotonesLayout = new javax.swing.GroupLayout(pnlBotones);
        pnlBotones.setLayout(pnlBotonesLayout);
        pnlBotonesLayout.setHorizontalGroup(
            pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotonesLayout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlBotonesLayout.setVerticalGroup(
            pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        add(pnlBotones, java.awt.BorderLayout.PAGE_END);

        pnlFormulario.setLayout(new java.awt.BorderLayout());

        pnlTabla.setBackground(new java.awt.Color(51, 255, 51));

        tblVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Artículo", "Cantidad", "Costo Total"
            }
        ));
        jScrollPane1.setViewportView(tblVenta);

        javax.swing.GroupLayout pnlTablaLayout = new javax.swing.GroupLayout(pnlTabla);
        pnlTabla.setLayout(pnlTablaLayout);
        pnlTablaLayout.setHorizontalGroup(
            pnlTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 812, Short.MAX_VALUE)
        );
        pnlTablaLayout.setVerticalGroup(
            pnlTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTablaLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnlFormulario.add(pnlTabla, java.awt.BorderLayout.NORTH);

        pnlBotonesTabla.setBackground(new java.awt.Color(153, 153, 255));
        pnlBotonesTabla.setLayout(new java.awt.BorderLayout());
        pnlFormulario.add(pnlBotonesTabla, java.awt.BorderLayout.SOUTH);

        pnlTotal.setBackground(new java.awt.Color(204, 102, 0));
        pnlTotal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtMonto.setEditable(false);
        txtMonto.setColumns(2);
        txtMonto.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtMonto.setText("Monto total:");
        pnlTotal.add(txtMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 528, -1));

        txtTotal.setEditable(false);
        pnlTotal.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(528, 0, 268, -1));

        btnAgregar.setText("Agregar artículo");
        pnlTotal.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(576, 29, -1, -1));

        btnEliminar.setText("Eliminar");
        pnlTotal.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(714, 29, -1, -1));

        lblDescripcion.setText("Descripción:");
        pnlTotal.add(lblDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 32, -1, -1));
        pnlTotal.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 29, 431, -1));

        lblNumVenta.setText("Número de venta:");
        pnlTotal.add(lblNumVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 61, -1, -1));

        txtNumVenta.setEditable(false);
        txtNumVenta.setText("0");
        pnlTotal.add(txtNumVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 58, 98, -1));

        pnlFormulario.add(pnlTotal, java.awt.BorderLayout.CENTER);

        add(pnlFormulario, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents
    public void llenarTabla(){
    
    
    }
    private DefaultTableModel m;
    controladorPanel tabla=new pnlArticulo();
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblNumVenta;
    private javax.swing.JLabel lblVenta;
    private javax.swing.JPanel pnlBotones;
    private javax.swing.JPanel pnlBotonesTabla;
    private javax.swing.JPanel pnlFormulario;
    private javax.swing.JPanel pnlNombre;
    private javax.swing.JPanel pnlTabla;
    private javax.swing.JPanel pnlTotal;
    private javax.swing.JTable tblVenta;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JFormattedTextField txtMonto;
    private javax.swing.JTextField txtNumVenta;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
