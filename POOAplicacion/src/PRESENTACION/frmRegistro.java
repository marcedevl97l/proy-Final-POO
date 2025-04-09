/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package PRESENTACION;

import DATOS.Conexion;
import java.util.ArrayList;
import java.util.List;
import LOGICA.Logica;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class frmRegistro extends javax.swing.JFrame {

    Logica logica = new Logica();
    DefaultTableModel modelo = new DefaultTableModel();

    public frmRegistro() {
        initComponents();
        
        modelo.addColumn("ID Producto");
        modelo.addColumn("Nombre");
        modelo.addColumn("Precio");
        modelo.addColumn("Stock");
        modelo.addColumn("Lote");
        modelo.addColumn("Usuario");
        modelo.addColumn("Fecha Ingreso");
        
        this.Tabla2.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        txtLote = new javax.swing.JTextField();
        txtFechaIngreso = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        Tabla2 = new javax.swing.JTable();
        btnMostrar = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Almacen La Colmena");
        setBackground(new java.awt.Color(228, 180, 87));

        jLabel1.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        jLabel1.setText("Almacén \"La Colmena\"");

        jPanel1.setBackground(new java.awt.Color(255, 189, 78));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Registro de Producto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sitka Banner", 1, 14))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 189, 78));

        jLabel2.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        jLabel3.setText("Precio:");

        jLabel4.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        jLabel4.setText("Cantidad:");

        jLabel5.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        jLabel5.setText("Lote:");

        jLabel6.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        jLabel6.setText("Fecha de Ingreso:");

        btnRegistrar.setBackground(new java.awt.Color(240, 165, 111));
        btnRegistrar.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnModificar.setBackground(new java.awt.Color(240, 165, 111));
        btnModificar.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        jLabel7.setText("ID:");

        txtid.setEnabled(false);

        btnEliminar.setBackground(new java.awt.Color(240, 165, 111));
        btnEliminar.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        jLabel8.setText("Usuario:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtid, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPrecio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCantidad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtLote, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(80, 80, 80))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel7)
                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel2)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel3)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel4)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel5)
                            .addComponent(txtLote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel8)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(btnRegistrar)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel6)
                    .addComponent(txtFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        jPanel4.setBackground(new java.awt.Color(255, 189, 78));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Stock", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sitka Banner", 1, 14))); // NOI18N
        jPanel4.setForeground(new java.awt.Color(255, 189, 78));

        Tabla2.setBackground(new java.awt.Color(240, 165, 111));
        Tabla2.setBorder(new javax.swing.border.MatteBorder(null));
        Tabla2.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        Tabla2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Tabla2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabla2MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(Tabla2);

        btnMostrar.setBackground(new java.awt.Color(240, 165, 111));
        btnMostrar.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        btnMostrar.setText("Mostrar");
        btnMostrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(btnMostrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnCerrarSesion.setBackground(new java.awt.Color(240, 165, 111));
        btnCerrarSesion.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        btnCerrarSesion.setText("Cerrar Sesion");
        btnCerrarSesion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(43, 43, 43)
                        .addComponent(btnCerrarSesion)
                        .addGap(28, 28, 28))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCerrarSesion)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        modificarRegistro();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        insertarRegistros();
        mostrarRegistros();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int filaSeleccionada = Tabla2.getSelectedRow();
        if (filaSeleccionada != -1) {
            //Obtener el ID del registro de la columna 0
            int id_producto = Integer.parseInt(modelo.getValueAt(filaSeleccionada,0).toString());
            
            //Llamar al metodo para eliminar el registro
            logica.eliminarRegistro(id_producto);
            
            //Mostrar los registros actualizados despues de la eliminacion
            mostrarRegistros();
        } else {
            JOptionPane.showMessageDialog(this, "Selecciona una fila para eliminar.");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        mostrarRegistros();
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void Tabla2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla2MouseClicked
        int filaSeleccionada = Tabla2.getSelectedRow();
        if (filaSeleccionada != -1) {
            txtid.setText(modelo.getValueAt(filaSeleccionada,0).toString());
            txtNombre.setText(modelo.getValueAt(filaSeleccionada,1).toString());
            txtPrecio.setText(modelo.getValueAt(filaSeleccionada,2).toString());
            txtCantidad.setText(modelo.getValueAt(filaSeleccionada,3).toString());
            txtLote.setText(modelo.getValueAt(filaSeleccionada,4).toString());
            txtUsuario.setText(modelo.getValueAt(filaSeleccionada,5).toString());
            txtFechaIngreso.setText(modelo.getValueAt(filaSeleccionada,6).toString());
        }
    }//GEN-LAST:event_Tabla2MouseClicked

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        int i=JOptionPane.showConfirmDialog(null, "¿Seguro que deseas cerrar sesión?",
                "Cerrar Sesión", JOptionPane.YES_NO_OPTION,
                JOptionPane.INFORMATION_MESSAGE);
        if (i==0) {
        frmInicioSesion abrir = new frmInicioSesion();
        abrir.setVisible(true);
        this.setVisible(false);
        }
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void mostrarRegistros(){
        //Limpiar la tabla
        modelo.setRowCount(0);
        //Obtener los registros de la capa lógica
        List<String[]> registros = logica.obtenerRegistros();
        //Agregar cada registro a la tabla
        for(String[] registro : registros){
            modelo.addRow(registro);
        }
    }
    
    private void insertarRegistros(){
        String nombre = txtNombre.getText();
        String precio = txtPrecio.getText();
        String stock = txtCantidad.getText();
        String lote = txtLote.getText();
        String usuario = txtUsuario.getText();
        String fecha_ingreso = txtFechaIngreso.getText();
        //Insertar los valores en la tabla
        logica.insertarRegistros(nombre, precio, stock, lote, usuario, fecha_ingreso);
        //limpiar las cajas
        txtNombre.setText("");
        txtPrecio.setText("");
        txtCantidad.setText("");
        txtLote.setText("");
        txtUsuario.setText("");
        txtFechaIngreso.setText("");
    }
    
    private void modificarRegistro(){
        //Obtenemos los datos
        String nombre = txtNombre.getText();
        String precio = txtPrecio.getText();
        String stock = txtCantidad.getText();
        String lote = txtLote.getText();
        String usuario = txtUsuario.getText();
        String fecha_ingreso = txtFechaIngreso.getText();
        
        //Obtenemos el ID del registro seleccionado
            //(Asumimos que el ID está en la primera columna)
        int filaSeleccionada = Tabla2.getSelectedRow();
        if (filaSeleccionada != -1) {
            int id_producto = Integer.parseInt(modelo.getValueAt(
                    filaSeleccionada,0).toString());
            
            //Llamamos al método en la capa lógica para actualizar el registro
            logica.actualizarRegistro(id_producto,nombre,precio,stock,lote,usuario,fecha_ingreso);
            
            //Actualizamos la tabla despues de modificar
            mostrarRegistros();
        } else {
            JOptionPane.showMessageDialog(null,"Selecciona un registro para modificar");
        }
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new frmRegistro().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla2;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtFechaIngreso;
    private javax.swing.JTextField txtLote;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JTextField txtid;
    // End of variables declaration//GEN-END:variables
}
