/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd_01;
import java.sql.*;
import net.proteanit.sql.DbUtils;
import conexion.Conexion;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import conexion.PDF_Fac;

/**
 *
 * @author Alan
 */
public class Venta extends javax.swing.JFrame {
Connection conexion;
Conexion cone= new Conexion();
PDF_Fac pdf= new PDF_Fac();
String ID;

    /**
     * Creates new form Venta
     */
    public Venta() {
        initComponents();
        this.setLocationRelativeTo(null);
        MostrarVendedores();
        MostrarClientes();
        MostrarCatalogo();
        MostrarVenta();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbAtras_C = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbAtras_C1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbCliente = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbVendedores = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbCatalogo = new javax.swing.JTable();
        btPDF = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbFactura = new javax.swing.JTable();
        tfID_Fact = new javax.swing.JTextField();
        tfID_Cliente = new javax.swing.JTextField();
        tfID_Catalogo = new javax.swing.JTextField();
        tfID_Vendedor = new javax.swing.JTextField();
        lbID_factura = new javax.swing.JLabel();
        lbID_cliente = new javax.swing.JLabel();
        lbID_catalogo = new javax.swing.JLabel();
        lbID_vendedor = new javax.swing.JLabel();
        lbFecha = new javax.swing.JLabel();
        lbDescripción = new javax.swing.JLabel();
        lbTotal = new javax.swing.JLabel();
        tfFecha = new javax.swing.JTextField();
        tfDescripción = new javax.swing.JTextField();
        tfTotal = new javax.swing.JTextField();
        btSubir = new javax.swing.JButton();
        btBajar = new javax.swing.JButton();
        btModificar = new javax.swing.JButton();
        btLimpiar = new javax.swing.JButton();
        lbVendedores = new javax.swing.JLabel();
        lbClientes = new javax.swing.JLabel();
        lbCatalogo = new javax.swing.JLabel();
        btBuscar = new javax.swing.JButton();

        lbAtras_C.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        lbAtras_C.setText("Atras <<<");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        lbAtras_C1.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        lbAtras_C1.setText("Atras <<<");
        lbAtras_C1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbAtras_C1MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 48)); // NOI18N
        jLabel2.setText("VENTA");

        tbCliente.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        tbCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID_Cliente", "Nombre", "Apellido", "Telefono"
            }
        ));
        jScrollPane2.setViewportView(tbCliente);

        tbVendedores.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        tbVendedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID_Cliente", "Nombre", "Apellido", "Telefono"
            }
        ));
        jScrollPane3.setViewportView(tbVendedores);

        tbCatalogo.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        tbCatalogo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID_Cliente", "Nombre", "Apellido", "Telefono"
            }
        ));
        jScrollPane4.setViewportView(tbCatalogo);

        btPDF.setText("Generar PDF");
        btPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPDFActionPerformed(evt);
            }
        });

        tbFactura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbFactura);

        lbID_factura.setText("Numero de la factura");

        lbID_cliente.setText("Numero de Cliente");

        lbID_catalogo.setText("ID_Catalogo");

        lbID_vendedor.setText("ID del Vendedor");

        lbFecha.setText("Fecha");

        lbDescripción.setText("Descripción");

        lbTotal.setText("Total");

        btSubir.setText("Subir Datos");
        btSubir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSubirActionPerformed(evt);
            }
        });

        btBajar.setText("Dar de baja");
        btBajar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBajarActionPerformed(evt);
            }
        });

        btModificar.setText("Modificar Datos");
        btModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModificarActionPerformed(evt);
            }
        });

        btLimpiar.setText("Limpiar Campos");
        btLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimpiarActionPerformed(evt);
            }
        });

        lbVendedores.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        lbVendedores.setText("Vendedores");

        lbClientes.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        lbClientes.setText("Clientes");

        lbCatalogo.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        lbCatalogo.setText("Catalogo");

        btBuscar.setText("Buscar Datos");
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbAtras_C1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbVendedores))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(241, 241, 241)
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(391, 391, 391)
                                .addComponent(lbClientes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbCatalogo)
                                .addGap(147, 147, 147))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbID_cliente)
                                    .addComponent(lbID_catalogo)
                                    .addComponent(lbID_vendedor)
                                    .addComponent(lbFecha)
                                    .addComponent(lbDescripción)
                                    .addComponent(lbTotal))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(tfFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                        .addComponent(tfID_Vendedor, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(tfID_Catalogo, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(tfID_Cliente, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(tfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfDescripción, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btBajar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btSubir, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(btLimpiar)
                                        .addGap(48, 48, 48)
                                        .addComponent(lbID_factura)
                                        .addGap(34, 34, 34)
                                        .addComponent(tfID_Fact)
                                        .addGap(41, 41, 41)
                                        .addComponent(btPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, 0)
                        .addComponent(btBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbAtras_C1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbVendedores)
                    .addComponent(lbClientes)
                    .addComponent(lbCatalogo))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfID_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbID_cliente))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbID_catalogo)
                                    .addComponent(tfID_Catalogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbID_vendedor)
                                    .addComponent(tfID_Vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(btSubir)
                                .addGap(18, 18, 18)
                                .addComponent(btBajar)
                                .addGap(18, 18, 18)
                                .addComponent(btModificar)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbFecha)
                            .addComponent(tfFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbDescripción)
                            .addComponent(tfDescripción, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTotal)
                            .addComponent(tfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbID_factura)
                            .addComponent(tfID_Fact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPDFActionPerformed
        ID=tfID_Fact.getText().trim();
        pdf.pdf(ID);
       JOptionPane.showMessageDialog(null, "si","si",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btPDFActionPerformed

    private void btSubirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSubirActionPerformed
        
    try {
        conexion= cone.getConexion();
        PreparedStatement pst= conexion.prepareStatement("insert into facturacion values(?,?,?,?,?,?,?)");
        pst.setString(1, "0");
        pst.setString(2, tfID_Cliente.getText().trim());
        pst.setString(3, tfID_Catalogo.getText().trim());
        pst.setString(4, tfID_Vendedor.getText().trim());
        pst.setString(5, tfFecha.getText().trim());
        pst.setString(6, tfDescripción.getText().trim());
        pst.setString(7, tfTotal.getText().trim());
        pst.executeUpdate();
        tfID_Cliente.setText("");
        tfID_Catalogo.setText("");
        tfID_Vendedor.setText("");
        tfFecha.setText("");
        tfDescripción.setText("");
        tfTotal.setText("");
        JOptionPane.showMessageDialog(null,"Registro Exitoso", "Registro Exitoso", JOptionPane.INFORMATION_MESSAGE);
    } catch (SQLException ex) {
        Logger.getLogger(Venta.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "Error","Error de conexion",JOptionPane.ERROR_MESSAGE);
    }
        
    }//GEN-LAST:event_btSubirActionPerformed

    private void lbAtras_C1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAtras_C1MouseClicked
    Interfaz inte= new Interfaz();
    inte.setVisible(true);
    this.setVisible(false);
    }//GEN-LAST:event_lbAtras_C1MouseClicked

    private void btLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimpiarActionPerformed
    tfDescripción.setText("");
    tfID_Catalogo.setText("");
    tfID_Cliente.setText("");
    tfFecha.setText("");
    tfID_Vendedor.setText("");
    tfTotal.setText("");
    tfID_Fact.setText("");
    }//GEN-LAST:event_btLimpiarActionPerformed

    private void btBajarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBajarActionPerformed
    conexion=cone.getConexion();
    try {
        PreparedStatement pst= conexion.prepareStatement("delete from facturacion where id_factura=?");
        pst.setString(1, tfID_Fact.getText().trim());
        pst.executeQuery();
        tfDescripción.setText("");
        tfID_Catalogo.setText("");
        tfID_Cliente.setText("");
        tfFecha.setText("");
        tfID_Vendedor.setText("");
        tfTotal.setText("");
        tfID_Fact.setText("");
        JOptionPane.showMessageDialog(null,"Registro eliminado", "Registro eliminado", JOptionPane.INFORMATION_MESSAGE);
        
        
    } catch (SQLException ex) {
        Logger.getLogger(Venta.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null,"Error","Error de conexion",JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btBajarActionPerformed

    private void btModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModificarActionPerformed
    conexion= cone.getConexion();
    String ID= tfID_Fact.getText().trim();
        try {
         PreparedStatement pst= conexion.prepareStatement("update facturacion set id_factura=?, id_cliente=?, id_catalogo=?, id_vendedor=?, fecha=?, descripción=?, total=? where id_facturacion="+ID);
         pst.setString(1, tfID_Fact.getText().trim());
         pst.setString(2, tfID_Cliente.getText().trim());
         pst.setString(3, tfID_Catalogo.getText().trim());
         pst.setString(4, tfID_Vendedor.getText().trim());
         
        } catch (Exception e) {
        }
    
    }//GEN-LAST:event_btModificarActionPerformed

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
    try {
        conexion= cone.getConexion();
        PreparedStatement pst= conexion.prepareStatement("select * from facturacion where id_facturacion= ?");
        pst.setString(1, tfID_Fact.getText().trim());
        ResultSet rs=pst.executeQuery();
            if (rs.next()) {
                tfID_Cliente.setText(rs.getString("id_cliente"));
                tfID_Catalogo.setText(rs.getString("id_catalogo"));
                tfID_Vendedor.setText(rs.getString("id_vendedor"));
                tfFecha.setText(rs.getString("fecha"));
                tfDescripción.setText(rs.getString("descripción"));
                tfTotal.setText(rs.getString("total"));
            } else{
                JOptionPane.showMessageDialog(null,"Cliente no encontrado","Cliente no encontrado",JOptionPane.INFORMATION_MESSAGE);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error","Error de conexion",JOptionPane.ERROR_MESSAGE);
        } 
        
    }//GEN-LAST:event_btBuscarActionPerformed


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
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Venta().setVisible(true);
            }
        });
    }
    public void MostrarVendedores(){
        try {
            
            conexion=cone.getConexion();
            Statement stm=conexion.createStatement();
            ResultSet rs =stm.executeQuery("select * from vendedor");
            tbVendedores.setModel(DbUtils.resultSetToTableModel(rs));
            
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error","Error de conexion",JOptionPane.ERROR_MESSAGE);
        }
  }
    public void MostrarVenta(){
        try {
            conexion=cone.getConexion();
            Statement stm=conexion.createStatement();
            ResultSet rs =stm.executeQuery("select * from facturacion");
            tbFactura.setModel(DbUtils.resultSetToTableModel(rs));
              
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error","Error de conexion",JOptionPane.ERROR_MESSAGE);
        }
         
    }
    public void MostrarClientes(){
        try {
            conexion=cone.getConexion();
            Statement stm=conexion.createStatement();
            ResultSet rs =stm.executeQuery("select * from clientes");
            tbCliente.setModel(DbUtils.resultSetToTableModel(rs));
            
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error","Error de conexion",JOptionPane.ERROR_MESSAGE);
        }
        
        
        
    }
    public void MostrarCatalogo(){
        try {
            
            conexion=cone.getConexion();
            Statement stm=conexion.createStatement();
            ResultSet rs =stm.executeQuery("select * from catalogo");
            tbCatalogo.setModel(DbUtils.resultSetToTableModel(rs));
            
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error","Error de conexion",JOptionPane.ERROR_MESSAGE);
        }
  }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBajar;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btLimpiar;
    private javax.swing.JButton btModificar;
    private javax.swing.JButton btPDF;
    private javax.swing.JButton btSubir;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lbAtras_C;
    private javax.swing.JLabel lbAtras_C1;
    private javax.swing.JLabel lbCatalogo;
    private javax.swing.JLabel lbClientes;
    private javax.swing.JLabel lbDescripción;
    private javax.swing.JLabel lbFecha;
    private javax.swing.JLabel lbID_catalogo;
    private javax.swing.JLabel lbID_cliente;
    private javax.swing.JLabel lbID_factura;
    private javax.swing.JLabel lbID_vendedor;
    private javax.swing.JLabel lbTotal;
    private javax.swing.JLabel lbVendedores;
    private javax.swing.JTable tbCatalogo;
    private javax.swing.JTable tbCliente;
    private javax.swing.JTable tbFactura;
    private javax.swing.JTable tbVendedores;
    private javax.swing.JTextField tfDescripción;
    private javax.swing.JTextField tfFecha;
    private javax.swing.JTextField tfID_Catalogo;
    private javax.swing.JTextField tfID_Cliente;
    private javax.swing.JTextField tfID_Fact;
    private javax.swing.JTextField tfID_Vendedor;
    private javax.swing.JTextField tfTotal;
    // End of variables declaration//GEN-END:variables
}
