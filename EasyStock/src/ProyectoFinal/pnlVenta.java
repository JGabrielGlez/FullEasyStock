
package ProyectoFinal;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class pnlVenta extends controladorPanel implements Observador{

    
     @Override
    public void actualizar() {
        llenarTabla();
    }
    
    public pnlVenta() {
        initComponents();
        m=(DefaultTableModel)tblVenta.getModel();
        modelVenta=(DefaultTableModel) tblTotal.getModel();
        leerArticulos();
    }
   //Es buena idea poner un botón de actualizar que se traiga la tabla tal cuál está en el panel de artículos
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
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTotal = new javax.swing.JTable();
        pnlBotonesTabla = new javax.swing.JPanel();
        pnlTotal = new javax.swing.JPanel();
        txtMonto = new javax.swing.JFormattedTextField();
        txtTotal = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        lblDescripcion = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        btnGetTotal = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 102));
        setLayout(new java.awt.BorderLayout());

        pnlNombre.setBackground(new java.awt.Color(102, 102, 255));
        pnlNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlNombreMouseClicked(evt);
            }
        });

        lblVenta.setFont(new java.awt.Font("Book Antiqua", 1, 36)); // NOI18N
        lblVenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVenta.setText("Venta");
        pnlNombre.add(lblVenta);

        add(pnlNombre, java.awt.BorderLayout.PAGE_START);

        pnlBotones.setBackground(new java.awt.Color(51, 102, 255));
        pnlBotones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlBotonesMouseClicked(evt);
            }
        });

        btnAceptar.setBackground(new java.awt.Color(153, 153, 255));
        btnAceptar.setText("Aceptar");

        btnCancelar.setBackground(new java.awt.Color(153, 153, 255));
        btnCancelar.setText("Cancelar");

        javax.swing.GroupLayout pnlBotonesLayout = new javax.swing.GroupLayout(pnlBotones);
        pnlBotones.setLayout(pnlBotonesLayout);
        pnlBotonesLayout.setHorizontalGroup(
            pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotonesLayout.createSequentialGroup()
                .addContainerGap(851, Short.MAX_VALUE)
                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlBotonesLayout.setVerticalGroup(
            pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 6, Short.MAX_VALUE))
            .addGroup(pnlBotonesLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(pnlBotones, java.awt.BorderLayout.PAGE_END);

        pnlFormulario.setLayout(new java.awt.BorderLayout());

        pnlTabla.setBackground(new java.awt.Color(153, 153, 255));

        tblVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Artículo", "ID", "Costo Total", "Disponibles"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblVenta);
        if (tblVenta.getColumnModel().getColumnCount() > 0) {
            tblVenta.getColumnModel().getColumn(0).setResizable(false);
            tblVenta.getColumnModel().getColumn(1).setResizable(false);
            tblVenta.getColumnModel().getColumn(2).setResizable(false);
            tblVenta.getColumnModel().getColumn(3).setResizable(false);
        }

        tblTotal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "ID", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblTotal);
        if (tblTotal.getColumnModel().getColumnCount() > 0) {
            tblTotal.getColumnModel().getColumn(0).setResizable(false);
            tblTotal.getColumnModel().getColumn(1).setResizable(false);
            tblTotal.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout pnlTablaLayout = new javax.swing.GroupLayout(pnlTabla);
        pnlTabla.setLayout(pnlTablaLayout);
        pnlTablaLayout.setHorizontalGroup(
            pnlTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTablaLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE))
        );
        pnlTablaLayout.setVerticalGroup(
            pnlTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTablaLayout.createSequentialGroup()
                .addGroup(pnlTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlFormulario.add(pnlTabla, java.awt.BorderLayout.NORTH);

        pnlBotonesTabla.setBackground(new java.awt.Color(153, 153, 255));
        pnlBotonesTabla.setLayout(new java.awt.BorderLayout());
        pnlFormulario.add(pnlBotonesTabla, java.awt.BorderLayout.SOUTH);

        pnlTotal.setBackground(new java.awt.Color(102, 102, 255));
        pnlTotal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlTotalMouseClicked(evt);
            }
        });

        txtMonto.setEditable(false);
        txtMonto.setBackground(new java.awt.Color(102, 102, 255));
        txtMonto.setColumns(2);
        txtMonto.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtMonto.setText("Monto total:");
        txtMonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMontoActionPerformed(evt);
            }
        });

        txtTotal.setEditable(false);

        btnAgregar.setBackground(new java.awt.Color(153, 153, 255));
        btnAgregar.setText("Agregar artículo");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(153, 153, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        lblDescripcion.setText("Descripción:");

        btnGetTotal.setBackground(new java.awt.Color(153, 153, 255));
        btnGetTotal.setText("Obtener total");
        btnGetTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetTotalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlTotalLayout = new javax.swing.GroupLayout(pnlTotal);
        pnlTotal.setLayout(pnlTotalLayout);
        pnlTotalLayout.setHorizontalGroup(
            pnlTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTotalLayout.createSequentialGroup()
                .addGroup(pnlTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTotalLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlTotalLayout.createSequentialGroup()
                        .addGroup(pnlTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlTotalLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lblDescripcion))
                            .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlTotalLayout.createSequentialGroup()
                                .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 429, Short.MAX_VALUE)
                                .addGroup(pnlTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnGetTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(pnlTotalLayout.createSequentialGroup()
                                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        pnlTotalLayout.setVerticalGroup(
            pnlTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTotalLayout.createSequentialGroup()
                .addGroup(pnlTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGetTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(pnlTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTotalLayout.createSequentialGroup()
                        .addGroup(pnlTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlTotalLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(lblDescripcion))
                            .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlFormulario.add(pnlTotal, java.awt.BorderLayout.CENTER);

        add(pnlFormulario, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents
 private int getSelectedRow(JTable tabla){
    int row=0;
    row=tabla.getSelectedRow();
    return row;
    }
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        //tengo que obtener la posición de la tabla para sacar del arreglo dicho artículo y poner solo el nombre y por default agregar 1 en cantidad
        String nom; double costo; int id;
        int pos=getSelectedRow(tblVenta);
        
        
        
        if(pos!=-1){
            nom=articulos[pos].getName();
            id=articulos[pos].getId();
            
          if(filaValida(id, modelVenta)==true){
            
            Object[] o=new Object[3];
            o[0]=nom;
            o[1]=id;
            o[2]=1;
            modelVenta.addRow(o);
            numArt++;
                }else{msg("Este artículo ya está agregado");}
        }
        
    }//GEN-LAST:event_btnAgregarActionPerformed
public boolean filaValida(int id, DefaultTableModel m) {
        boolean valido = true;
        for (int i = 0; i < m.getRowCount(); i++) {
            if ((int)(m.getValueAt(i, 1))==id) {
                valido = false;
            }
        }
        return valido;
    }

public void quitarSeleccion(){
    tblTotal.clearSelection();
    tblTotal.transferFocus();
    tblVenta.clearSelection();
    tblVenta.transferFocus();
}
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
       int pos=getSelectedRow(tblTotal);
       
       if(pos!=-1){
       
           modelVenta.removeRow(pos);
           quitarSeleccion();
           numArt--;
       }else{msg("No hay fila seleccionada");}
        
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void pnlNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlNombreMouseClicked
        quitarSeleccion();
    }//GEN-LAST:event_pnlNombreMouseClicked

    private void pnlTotalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlTotalMouseClicked

                quitarSeleccion();

    }//GEN-LAST:event_pnlTotalMouseClicked

    private void pnlBotonesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBotonesMouseClicked
        quitarSeleccion();
    }//GEN-LAST:event_pnlBotonesMouseClicked

    //método que recorra toda la columna de los articulos, identifique su id y lo busqie en la tabla de ventas, para despues
    //multiplciar su costo por la cantidad, verificando a su vez que no exceda la disponibilidad
    //también validad que sea algún número negativo o una letra
    public void sumaTotal(){
        
        int disponible, cantidadVendida;
        
      for(int i=0; i<numArt;i++){
          
          if(existencia==true){
        
            for(int i=0; i<numArt; i++){
                
            }
            
        }else{msg("No hay stock suficiente para el artículo "+id);}
        
      }
    }
    
    
    public boolean existencia(int disponible, int cantidadVenta){
       
        if(cantidadVenta>disponible){
           return false; 
        }
        return true;
    }
    
    
    private void btnGetTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGetTotalActionPerformed

    private void txtMontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMontoActionPerformed
   
        public void llenarTabla() {
        m.setRowCount(0);
        articulos = comunicador.getArticulo();
        int a = comunicador.getA();//esto me da el numero de filas de la tabla de articulos
        //a es hasta donde está lleno el arreglo, la cantidad de filas.


        if (a != -1) {
                    m.setRowCount(a+1);

            for (int i = 0; i < a+1; i++) {

                Object[] datos = new Object[4];
                datos[0] = articulos[i].getName();
                datos[1] = articulos[i].getId();
                datos[2] = articulos[i].getCosto();
                datos[3] = articulos[i].getCant();
                m.setValueAt(datos[0], i, 0);
                m.setValueAt(datos[1], i, 1);
                m.setValueAt(datos[2], i, 2);
                m.setValueAt(datos[3], i, 3);

            }
        }

        //m.fireTableDataChanged();
    }

    private void msg(String m){
        JOptionPane.showMessageDialog(this,m);
    }
    
    private void leerArticulos(){
        String nom; int id, cantidad; double costo;
        //new Articulo(nom, id, cantidad, costo);
        try{
        fce=new FileReader("DatosArticulos.NoBorrar");
        bce=new BufferedReader(fce);
        String linea="";
        
        while((linea=bce.readLine())!=null){//esto es para crear el arreglo
            String R[]=linea.split("\\|"); m.addRow(R);
           // msg(""+R[0]+R[1]+R[2]+R[3]);
            nom=R[0]; id=Integer.parseInt(R[1]); costo=Double.parseDouble(R[2]); cantidad=Integer.parseInt(R[3]);
            articulos[++a]=new Articulo(nom, id, cantidad, costo);
        }
        
            comunicador.setArticulo(articulos,a);
        
        }catch(Exception e){}
        
    }
    
    //variables de los archivos
    private FileWriter fcs;//flujo de escritura
    private FileReader fce;//flujo de lectura
    private BufferedReader bce;//
    private DefaultTableModel m,modelVenta;
    private Articulo[] articulos=new Articulo[5];
    private Articulo[] venta=new Articulo[5];
    private int a = -1, numArt=0;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGetTotal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblVenta;
    private javax.swing.JPanel pnlBotones;
    private javax.swing.JPanel pnlBotonesTabla;
    private javax.swing.JPanel pnlFormulario;
    private javax.swing.JPanel pnlNombre;
    private javax.swing.JPanel pnlTabla;
    private javax.swing.JPanel pnlTotal;
    private javax.swing.JTable tblTotal;
    private javax.swing.JTable tblVenta;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JFormattedTextField txtMonto;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables

   

   
}
