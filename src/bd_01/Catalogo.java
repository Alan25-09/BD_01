/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd_01;
import java.sql.*;
import net.proteanit.sql.DbUtils;
import javax.swing.*;
import conexion.Conexion;
/**
 * 
 *
 * @author Alan
 */
public class Catalogo extends javax.swing.JFrame {
    Conexion cone= new Conexion();
    Connection conexion;
    /**
     * Creates new form Catalogo
     */
    public Catalogo() {
        initComponents();
        this.setLocationRelativeTo(null);
        MostrarCatalogo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbID_Catalogo = new javax.swing.JLabel();
        lbNomCatalogo = new javax.swing.JLabel();
        lbPrecioCatalogo = new javax.swing.JLabel();
        lbExistencia = new javax.swing.JLabel();
        tfID = new javax.swing.JTextField();
        tfNom = new javax.swing.JTextField();
        tfPrecio = new javax.swing.JTextField();
        tfExistencia = new javax.swing.JTextField();
        btSubir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbCatalogo = new javax.swing.JTable();
        btBajar = new javax.swing.JButton();
        btModificar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lbDescripcion = new javax.swing.JLabel();
        tfDescripcion = new javax.swing.JTextField();
        btBuscar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setForeground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 48)); // NOI18N
        jLabel1.setText("CATALOGO");

        lbID_Catalogo.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        lbID_Catalogo.setText("ID");

        lbNomCatalogo.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        lbNomCatalogo.setText("Nombre del Producto");

        lbPrecioCatalogo.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        lbPrecioCatalogo.setText("Precio Unitario");

        lbExistencia.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        lbExistencia.setText("Existencia");

        tfPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPrecioActionPerformed(evt);
            }
        });

        tfExistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfExistenciaActionPerformed(evt);
            }
        });

        btSubir.setText("Subir Datos");
        btSubir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSubirActionPerformed(evt);
            }
        });

        tbCatalogo.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        tbCatalogo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "ID_Articulo", "Nombre", "Precio Unitario", "Existencia", "Descripción"
            }
        ));
        jScrollPane1.setViewportView(tbCatalogo);

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

        jLabel6.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jLabel6.setText("Atras <<<");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        lbDescripcion.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        lbDescripcion.setText("Descripción");

        btBuscar.setText("Buscar");
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        jButton1.setText("Limpiar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 722, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbExistencia)
                            .addComponent(lbPrecioCatalogo)
                            .addComponent(lbNomCatalogo)
                            .addComponent(lbDescripcion))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tfPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                    .addComponent(tfExistencia)
                                    .addComponent(tfNom))
                                .addGap(84, 84, 84)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btBajar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btSubir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btModificar))
                                .addGap(187, 187, 187))
                            .addComponent(tfDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(181, 181, 181)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbID_Catalogo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(17, 17, 17)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbNomCatalogo)
                                    .addComponent(tfNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbPrecioCatalogo)
                                    .addComponent(tfPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbExistencia)
                                    .addComponent(tfExistencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbID_Catalogo))
                                .addGap(18, 18, 18)
                                .addComponent(btBuscar)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btSubir)
                        .addGap(17, 17, 17)
                        .addComponent(btBajar)
                        .addGap(18, 18, 18)
                        .addComponent(btModificar)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDescripcion)
                    .addComponent(tfDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 807, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPrecioActionPerformed

    private void tfExistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfExistenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfExistenciaActionPerformed

    private void btSubirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSubirActionPerformed
        try {
            conexion=cone.getConexion();
            PreparedStatement pst= conexion.prepareStatement("insert into catalogo values(?,?,?,?,?)");
            pst.setString(1, "0");
            pst.setString(2, tfNom.getText().trim());
            pst.setString(3,tfPrecio.getText().trim());
            pst.setString(4, tfExistencia.getText().trim());
            pst.setString(5, tfDescripcion.getText().trim());
            pst.executeUpdate();
            tfNom.setText("");
            tfPrecio.setText("");
            tfExistencia.setText("");
            tfDescripcion.setText("");
            JOptionPane.showMessageDialog(null,"Registro exitoso","Registro exitoso",JOptionPane.INFORMATION_MESSAGE);
            MostrarCatalogo();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error","Error de conexion",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btSubirActionPerformed

    private void btBajarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBajarActionPerformed
        try {
            conexion=cone.getConexion();
            PreparedStatement pst= conexion.prepareStatement("delete from catalogo where id_catalogo=?");
            pst.setString(1,tfID.getText().trim());
            pst.executeUpdate();
            tfNom.setText("");
            tfPrecio.setText("");
            tfExistencia.setText("");
            tfDescripcion.setText("");
            JOptionPane.showMessageDialog(null,"Registro eliminado", "Registro eliminado", JOptionPane.INFORMATION_MESSAGE);
            MostrarCatalogo();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error","Error de conexion",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btBajarActionPerformed

    private void btModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModificarActionPerformed
        try {
            String id= tfID.getText().trim();
            
            conexion=cone.getConexion();
            PreparedStatement pst= conexion.prepareStatement("update catalogo set nombre=?, precioUnitario=?, existencia=?, descripción=? where id_catalogo="+id);
            pst.setString(1,tfNom.getText().trim());
            pst.setString(2,tfPrecio.getText().trim());
            pst.setString(3,tfExistencia.getText().trim());
            pst.setString(4,tfDescripcion.getText().trim());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Registro modificado","Registro modificado",JOptionPane.INFORMATION_MESSAGE);
            MostrarCatalogo();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error","Error de conexion",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btModificarActionPerformed

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        try {
            conexion=cone.getConexion();
            PreparedStatement pst= conexion.prepareStatement("select * from catalogo where id_catalogo= ?");
            pst.setString(1, tfID.getText().trim());
            ResultSet rs= pst.executeQuery();
            if (rs.next()) {
                tfNom.setText(rs.getString("nombre"));
                tfPrecio.setText(rs.getString("precioUnitario"));
                tfExistencia.setText(rs.getString("existencia"));
                tfDescripcion.setText(rs.getString("descripción"));
                
            } else {
                JOptionPane.showMessageDialog(null,"Articulo no registrado", "Articulo no registrado", JOptionPane.INFORMATION_MESSAGE);
            }
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error","Error de conexion",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btBuscarActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
    Interfaz inte= new Interfaz();
    inte.setVisible(true);
    this.setVisible(false);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    tfExistencia.setText("");
    tfPrecio.setText("");
    tfDescripcion.setText("");
    tfID.setText("");
    tfNom.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed
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
            java.util.logging.Logger.getLogger(Catalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Catalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Catalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Catalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Catalogo().setVisible(true);
            }
        });
    }
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBajar;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btModificar;
    private javax.swing.JButton btSubir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbDescripcion;
    private javax.swing.JLabel lbExistencia;
    private javax.swing.JLabel lbID_Catalogo;
    private javax.swing.JLabel lbNomCatalogo;
    private javax.swing.JLabel lbPrecioCatalogo;
    private javax.swing.JTable tbCatalogo;
    private javax.swing.JTextField tfDescripcion;
    private javax.swing.JTextField tfExistencia;
    private javax.swing.JTextField tfID;
    private javax.swing.JTextField tfNom;
    private javax.swing.JTextField tfPrecio;
    // End of variables declaration//GEN-END:variables
}
