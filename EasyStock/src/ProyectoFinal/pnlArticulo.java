
package ProyectoFinal;


import java.lang.reflect.Constructor;
import javax.swing.table.DefaultTableModel;
import static javax.swing.JOptionPane.*;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class pnlArticulo extends controladorPanel {

    public pnlArticulo(frmMenu menu) {
        super(menu);
        initComponents();
        m=(DefaultTableModel) tblArticulos.getModel();
       
        //Este método detecta si hay una fila seleccionada para hacer ciertos procedimientos.
        tblArticulos.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                boolean filaSeleccionada;
                if(tblArticulos.getSelectedRow()==-1){
                    filaSeleccionada=false;
                } else {filaSeleccionada=true;}
                
                btnEditar.setEnabled(filaSeleccionada);
                btnEliminar.setEnabled(filaSeleccionada);
            }
        }
       
        ); 
     
    }
    public pnlArticulo() {initComponents();
    }

    
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFormulario = new javax.swing.JPanel();
        pnlBotones = new javax.swing.JPanel();
        btnEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        pnlColor = new javax.swing.JPanel();
        lblArticulos = new javax.swing.JLabel();
        pnlFromulario = new javax.swing.JPanel();
        pnlTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblArticulos = new javax.swing.JTable();
        pnlIngresoDatos = new javax.swing.JPanel();
        lblNom = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        lblCosto = new javax.swing.JLabel();
        lblCantidad = new javax.swing.JLabel();
        txtNom = new javax.swing.JTextField();
        txtCosto = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));
        setLayout(new java.awt.GridLayout(1, 0));

        pnlFormulario.setBackground(new java.awt.Color(255, 255, 153));
        pnlFormulario.setLayout(new java.awt.BorderLayout());

        pnlBotones.setBackground(new java.awt.Color(102, 255, 153));

        btnEliminar.setText("Eliminar");
        btnEliminar.setEnabled(false);
        btnEliminar.setPreferredSize(new java.awt.Dimension(70, 25));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.setEnabled(false);
        btnEditar.setPreferredSize(new java.awt.Dimension(70, 25));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.setPreferredSize(new java.awt.Dimension(70, 25));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBotonesLayout = new javax.swing.GroupLayout(pnlBotones);
        pnlBotones.setLayout(pnlBotonesLayout);
        pnlBotonesLayout.setHorizontalGroup(
            pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotonesLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );
        pnlBotonesLayout.setVerticalGroup(
            pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlBotonesLayout.createSequentialGroup()
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(7, 7, 7))
        );

        pnlFormulario.add(pnlBotones, java.awt.BorderLayout.PAGE_END);

        pnlColor.setBackground(new java.awt.Color(255, 51, 0));
        pnlColor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlColorMouseClicked(evt);
            }
        });

        lblArticulos.setFont(new java.awt.Font("Times", 0, 36)); // NOI18N
        lblArticulos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblArticulos.setText("Artículos");
        pnlColor.add(lblArticulos);

        pnlFormulario.add(pnlColor, java.awt.BorderLayout.PAGE_START);

        pnlTabla.setBackground(new java.awt.Color(204, 204, 255));

        tblArticulos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "ID", "Costo", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblArticulos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tblArticulosFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tblArticulosFocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(tblArticulos);
        if (tblArticulos.getColumnModel().getColumnCount() > 0) {
            tblArticulos.getColumnModel().getColumn(0).setResizable(false);
            tblArticulos.getColumnModel().getColumn(1).setResizable(false);
            tblArticulos.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout pnlTablaLayout = new javax.swing.GroupLayout(pnlTabla);
        pnlTabla.setLayout(pnlTablaLayout);
        pnlTablaLayout.setHorizontalGroup(
            pnlTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        pnlTablaLayout.setVerticalGroup(
            pnlTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
        );

        pnlIngresoDatos.setBackground(new java.awt.Color(153, 255, 204));
        pnlIngresoDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlIngresoDatosMouseClicked(evt);
            }
        });

        lblNom.setText("Nombre:");

        lblId.setText("ID");

        lblCosto.setText("Costo unitario $:");

        lblCantidad.setText("Cantidad");

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.setEnabled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.setEnabled(false);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlIngresoDatosLayout = new javax.swing.GroupLayout(pnlIngresoDatos);
        pnlIngresoDatos.setLayout(pnlIngresoDatosLayout);
        pnlIngresoDatosLayout.setHorizontalGroup(
            pnlIngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIngresoDatosLayout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(pnlIngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNom)
                    .addComponent(lblId)
                    .addComponent(lblCosto)
                    .addComponent(lblCantidad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlIngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlIngresoDatosLayout.createSequentialGroup()
                        .addGroup(pnlIngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
                        .addGroup(pnlIngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(32, 32, 32))
                    .addGroup(pnlIngresoDatosLayout.createSequentialGroup()
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnActualizar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pnlIngresoDatosLayout.setVerticalGroup(
            pnlIngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIngresoDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlIngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNom)
                    .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar))
                .addGap(18, 18, 18)
                .addGroup(pnlIngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblId)
                    .addComponent(btnCancelar))
                .addGap(18, 18, 18)
                .addGroup(pnlIngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCosto))
                .addGap(22, 22, 22)
                .addGroup(pnlIngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCantidad)
                    .addComponent(btnActualizar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlFromularioLayout = new javax.swing.GroupLayout(pnlFromulario);
        pnlFromulario.setLayout(pnlFromularioLayout);
        pnlFromularioLayout.setHorizontalGroup(
            pnlFromularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlIngresoDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlFromularioLayout.setVerticalGroup(
            pnlFromularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFromularioLayout.createSequentialGroup()
                .addComponent(pnlIngresoDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(pnlTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlFormulario.add(pnlFromulario, java.awt.BorderLayout.CENTER);

        add(pnlFormulario);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        menu.mostrarPanelVenta();
        menu.activarBotones();
        borrarDatos();
        
       
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
         int cantidad=0;
         String nom="";
         int id=0;double costo=0;
        
         nom=txtNom.getText().toUpperCase();
        if(validarLetras(nom)==false){
            vaciar(txtNom); 
            msg("Ingrese un nombre válido");
            return;
        }
        try{
        if((id=tryInt(txtId))<=0){
            throw new numException("Ingrese un ID válido");
        }
        
        if((costo=tryDouble(txtCosto))<=0){
            throw new numException("Ingrese un costo válido");
        }
        
        if((cantidad=tryInt(txtCantidad))<0){
            throw new numException("Ingrese una cantidad de artículos válida");
        }
        }catch (numException e ){msg(e.getMessage()); return;}
        
        
        //Creo el arrelo de artíclos para agregar a la tabla en la posición a, y luego le incremento
        //mando mensaje al usuario de que ya se agregó y borro todos los datos , en caso de llegar al máximo 
        //de articulos (10), mandar mensaje de que compre la opción premium para agregar ciera cantidad más
        
            if (a < limiteArticulos) {
                articulo[a++] = new Articulo(nom, id, cantidad, costo);
                Object[] datos = new Object[4];
                datos[0] = nom;
                datos[1] = id;
                datos[2] = costo;
                datos[3] = cantidad;

                m.addRow(datos);
                //borrarDatos();
                msg("Artículo agregado");

            }else if(a==limiteArticulos){msg("Ha alcanzado el máximo de artículos para esta aplicación demo...");}

            
        

        //Al momento de editar un artículo para agregarle más elementos, sería bueno desactivar los 
        //campos de texto para solo agregar la cantidad de articulo que llegaron
        //o hacerlo desde otro boton para solo agregar los articulos
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        //este será mejor para la opción de editar
        btnAgregar.setEnabled(true);
        btnActualizar.setEnabled(false);
        btnCancelar.setEnabled(false);
        borrarDatos();
        msg("Operación cancelada");
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        //Solo eliminará cuando haya algún artículo seleccionado, del contrario permanecerá desactivado el botón
        Object[] opciones = {"SÍ", "NO"};
        String mensaje = "¿Está seguro que quiere eliminar el artículo?";
        
        try {
            int boton = showOptionDialog(this, mensaje, "Confirmación", YES_NO_OPTION, QUESTION_MESSAGE, null, opciones, 1);

            if (boton == 0) {
                //se elimina la fila solo de la tabla
                int pos = tblArticulos.getSelectedRow();
                if(pos==0 || pos==limiteArticulos-1){
                    a--;
                }else{
                for(int i=pos; i<limiteArticulos-1; i++){
                    articulo[i]= articulo[i+1];
                }  
                a--;        
                }
                m.removeRow(pos);
                //a es el contador de objetos dentro del arreglo, después de crear el primer ibjeto, a = 1
                //si posición es antes del ultimo, se recorren desde la posición un espacio antes, para eliminar el último espacio.

                   
            }
        } catch (Exception e) {
            msg(e.getMessage());
            return;
        }
//habilitar y deshabilitar ciertos botones para qquitar el problema de agregar un elemento de más  a la tabla. 
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        //Botón para editar los datos de una fila seleccionada, sacar los datos del arreglo en la posición de la tabla
        //programar para cuando se selecciona la misma fila
        try {
             posActual = getSelectedRow(tblArticulos);
             if (posActual > -1) {
                actual = new Object[m.getColumnCount()];
                for (int i = 0; i < actual.length; i++) {
                    actual[i] = m.getValueAt(posActual, i).toString();
                }//en este momento ya tengo el arreglo correspondiente con los datos.
                //nom id, costo, cant
                txtNom.setText(actual[0].toString());
                txtId.setText(actual[1].toString());
                txtCosto.setText(actual[2].toString());
                txtCantidad.setText(actual[3].toString());
            }
            btnActualizar.setEnabled(true);
            btnAgregar.setEnabled(false);
        }catch (ArrayIndexOutOfBoundsException e){msg("No hay fila seleccionada");return;}
        
        btnCancelar.setEnabled(true);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        
        int cantidad;
         String nom="";
         int id=0 ;double costo=0;
        
       // nom=txtNom.getText();
         nom=txtNom.getText().toUpperCase();
        if(validarLetras(nom)==false){
            vaciar(txtNom); 
            msg("Ingrese un nombre válido");
            return;
        }
        
       try{
        if((id=tryInt(txtId))<=0){
            throw new numException("Ingrese un ID válido");
        }
        
        if((costo=tryDouble(txtCosto))<=0){
            throw new numException("Ingrese un costo válido");
        }
        
        if((cantidad=tryInt(txtCantidad))<0){
            throw new numException("Ingrese una cantidad de artículos válida");
        }
        }catch (numException e ){msg(e.getMessage()); return;}
                
                actual[0] = nom;
                actual[1] = id;
                actual[2] = costo;
                actual[3] = cantidad;
                    
                llenarTabla(actual, posActual);
                borrarDatos();
                msg("Artículo actualizado");

            
       btnActualizar.setEnabled(false);
       btnAgregar.setEnabled(true);
       btnCancelar.setEnabled(false);
       tblArticulos.clearSelection();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void tblArticulosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tblArticulosFocusGained
    }//GEN-LAST:event_tblArticulosFocusGained

    private void tblArticulosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tblArticulosFocusLost

    }//GEN-LAST:event_tblArticulosFocusLost

    private void pnlIngresoDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlIngresoDatosMouseClicked
        tblArticulos.clearSelection();
        tblArticulos.transferFocus();
    }//GEN-LAST:event_pnlIngresoDatosMouseClicked

    private void pnlColorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlColorMouseClicked
        tblArticulos.clearSelection();
        tblArticulos.transferFocus();
    }//GEN-LAST:event_pnlColorMouseClicked

public boolean validarLetras(String nom) {
        char blank;
        boolean valido = false;//* CERO O VARIOS , + UNA O MÁS, ^ (forza estrictacmente el orden dentro) $ {n,x} se repite de n a x veces
        //Este matches me valido que haya acentos y letras 
        if(nom.length()>0){
            blank=nom.charAt(0);
                if (nom.matches("([A-Z]*[ ]*[Á|É|Í|Ú|Ó|Ñ]*)+") && blank!=' ') {
                    valido = true;
                }
        }
        return valido;
    }
        
    
    public boolean validarNumeros(String nc) {
        boolean valido = false;

        if (nc.matches("[0-9]*") && nc.length() >1) {
            valido = true;
        }
        return valido;
    }
    
    
    
    private void msg(String m){
        showMessageDialog(this,m,"Información", INFORMATION_MESSAGE);
    }
    
    private void vaciar(JTextField celda){
       celda.requestFocus();
       celda.setText("");
    }
    
    private int getSelectedRow(JTable tabla){
    int row=0;
    row=tabla.getSelectedRow();
    return row;
    }
    
    
    
    //Podría englobar estas dos numéricas en una genérica para solo llamar a una, pero sería más delante. 
    
    private int tryInt(JTextField celda){
        int ret=-1;
        try{
            ret=Integer.parseInt(celda.getText());
            //podríamos agregar una excepcion creada por nosotros para espacio en blanco 
        }catch(NumberFormatException e){
            vaciar(celda);
        }
        return ret;
    }
    
    private double tryDouble(JTextField celda){
        double ret=-1;
        try{
            ret=Double.parseDouble(celda.getText());
        }catch(NumberFormatException e){
            celda.setText("");
            celda.requestFocus();
        }
        
        return ret;
    }
    
    
     public int GetCantParam(Constructor<?> constructor){
        return constructor.getParameterCount();
    }  
    private <T> void traerDatos(T[] arreglo, int pos){
        //obtiene la cantidad de parámetros de la clase del constructor. 
        int param=GetCantParam(Articulo.class.getConstructors()[0]);
        Object[] O=new Object[param];
        //orden de los datos: nombre id costo cantidad
        for(int i=0; i<param;i++){
            O[i]=arreglo[i];
        }
        
    }
    //hacerla genérica más delante
    
    private void llenarTabla(Object O[], int pos){
        //ocupo que me llente los valores de la celda, no de la tabla. 
            for(int i=0; i<O.length; i++){
              m.setValueAt(O[i], pos, i);
            }
               
    }
    
    
    private void borrarDatos(){
        txtCantidad.setText("");
        txtCosto.setText("");
        txtId.setText("");
        txtNom.setText("");  
        txtNom.requestFocus();
    }
    
    private boolean seleccion(JTable tabla){
        boolean valido=true;
        if(tabla.getSelectedRow()==-1){
            valido=false;
        }
        return valido;
    }
    
    public Articulo[] getArreglo(){
        return articulo;
    }
    
    private DefaultTableModel m;
    private boolean rowSelected;
    //Esto determinar el limite de los articulos que se pueden agregar
    private Object[] actual;
    private int posActual,a=0,limiteArticulos=5;
    public Articulo[] articulo=new Articulo[limiteArticulos];
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblArticulos;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblCosto;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblNom;
    private javax.swing.JPanel pnlBotones;
    private javax.swing.JPanel pnlColor;
    private javax.swing.JPanel pnlFormulario;
    private javax.swing.JPanel pnlFromulario;
    private javax.swing.JPanel pnlIngresoDatos;
    private javax.swing.JPanel pnlTabla;
    private javax.swing.JTable tblArticulos;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNom;
    // End of variables declaration//GEN-END:variables
}
