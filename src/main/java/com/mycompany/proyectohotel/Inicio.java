/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectohotel;
import java.util.Vector;

/**
 *
 * @author Robin Mita
 */
public class Inicio extends javax.swing.JFrame {
 Vector <ClaseCliente> ArregloCliente=new Vector<>();
 Vector <ClaseProducto> ArregloProducto=new Vector<>();
 Vector <ClaseEmpleado> ArregloEmpleado=new Vector<>();
 Vector <ClaseFactura> ArregloFactura=new Vector<>();
 Vector <ClaseDetalleFactura> ArregloDetalle=new Vector<>();
 Vector <ClaseProveedor> ArregloProveedor=new Vector<>();
 Vector <VectorConsulta>ConsultaVector=new Vector<>();
 Vector <ClaseReservacion>Reservaciones=new Vector<>();


    /**
     * Creates new form Inicio
     */
    public Inicio() {
        ArregloCliente=new  Vector<ClaseCliente>();
        ArregloProducto=new  Vector<ClaseProducto>();
        ArregloEmpleado=new  Vector<ClaseEmpleado>();
        ArregloFactura=new  Vector<ClaseFactura>();
        ArregloDetalle=new  Vector<ClaseDetalleFactura>();
        ArregloProveedor=new  Vector<ClaseProveedor>();
        ConsultaVector=new Vector<VectorConsulta>();
        Reservaciones=new Vector<ClaseReservacion>();
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        RegistroEmpleado = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        RegistroCliente = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        RegistroProveedor = new javax.swing.JMenuItem();
        Factura = new javax.swing.JMenu();
        Facturacion = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        Reportes = new javax.swing.JMenuItem();
        MenuProducto = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuItemReservacion = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jLabel1.setText("\"BIG FOOT\"");

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jLabel2.setText("HOTEL");

        jMenu2.setText("Empleado");

        RegistroEmpleado.setText("Registrar Empleado");
        RegistroEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistroEmpleadoActionPerformed(evt);
            }
        });
        jMenu2.add(RegistroEmpleado);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Cliente");

        RegistroCliente.setText("Registrar Clientes");
        RegistroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistroClienteActionPerformed(evt);
            }
        });
        jMenu3.add(RegistroCliente);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Proveedor");

        RegistroProveedor.setText("Registrar Proveedor");
        RegistroProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistroProveedorActionPerformed(evt);
            }
        });
        jMenu4.add(RegistroProveedor);

        jMenuBar1.add(jMenu4);

        Factura.setText("Factura");

        Facturacion.setText("Facturacion");
        Facturacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FacturacionActionPerformed(evt);
            }
        });
        Factura.add(Facturacion);

        jMenuBar1.add(Factura);

        jMenu7.setText("Reportes");

        Reportes.setText("Reportes");
        Reportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReportesActionPerformed(evt);
            }
        });
        jMenu7.add(Reportes);

        jMenuBar1.add(jMenu7);

        MenuProducto.setText("Producto");

        jMenuItem1.setText("Producto");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        MenuProducto.add(jMenuItem1);

        jMenuBar1.add(MenuProducto);
        jMenuBar1.add(jMenu1);

        jMenu6.setText("Reservacion");

        jMenuItemReservacion.setText("Reservacion");
        jMenuItemReservacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemReservacionActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItemReservacion);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel3)
                        .addGap(77, 77, 77)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegistroEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistroEmpleadoActionPerformed
        Empleado Empleado1= new Empleado(ArregloEmpleado);
        Empleado1.setVisible(true);
    }//GEN-LAST:event_RegistroEmpleadoActionPerformed

    private void RegistroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistroClienteActionPerformed
      Cliente Cliente1= new Cliente(ArregloCliente);
        Cliente1.setVisible(true);
    }//GEN-LAST:event_RegistroClienteActionPerformed

    private void RegistroProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistroProveedorActionPerformed
        Proveedor Proveedor1= new Proveedor(ArregloProveedor);
        Proveedor1.setVisible(true);
    }//GEN-LAST:event_RegistroProveedorActionPerformed

    private void FacturacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FacturacionActionPerformed
         Factura Factura1= new Factura(ArregloFactura,ArregloDetalle,ArregloProducto,ArregloEmpleado,ArregloCliente,Reservaciones);
        Factura1.setVisible(true);  
    }//GEN-LAST:event_FacturacionActionPerformed

    private void ReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReportesActionPerformed
        Reporte Reporte1=new Reporte(ArregloCliente,ArregloProveedor,ArregloProducto,ArregloEmpleado,Reservaciones);
        Reporte1.setVisible(true);
    }//GEN-LAST:event_ReportesActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Producto Reporte1=new Producto(ArregloProducto,ArregloProveedor);
        Reporte1.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItemReservacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemReservacionActionPerformed
        Reservacion Reservacion1=new Reservacion(ConsultaVector,Reservaciones,ArregloCliente);
        Reservacion1.setVisible(true);
    }//GEN-LAST:event_jMenuItemReservacionActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Factura;
    private javax.swing.JMenuItem Facturacion;
    private javax.swing.JMenu MenuProducto;
    private javax.swing.JMenuItem RegistroCliente;
    private javax.swing.JMenuItem RegistroEmpleado;
    private javax.swing.JMenuItem RegistroProveedor;
    private javax.swing.JMenuItem Reportes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemReservacion;
    // End of variables declaration//GEN-END:variables
}
