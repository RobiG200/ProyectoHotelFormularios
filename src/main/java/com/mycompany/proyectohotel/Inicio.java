/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectohotel;

/**
 *
 * @author Robin Mita
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        RegistroEmpleado = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        RegistroCliente = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        RegistroProveedor = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        RegistroHabitacion = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        NuevoInventario = new javax.swing.JMenuItem();
        RegistroInventario = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Inicio");
        jMenuBar1.add(jMenu1);

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

        jMenu5.setText("Habitacion");

        RegistroHabitacion.setText("Registrar Habitacion");
        RegistroHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistroHabitacionActionPerformed(evt);
            }
        });
        jMenu5.add(RegistroHabitacion);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Inventario");

        NuevoInventario.setText("Ingresar Nuevo Inventario");
        NuevoInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoInventarioActionPerformed(evt);
            }
        });
        jMenu6.add(NuevoInventario);

        RegistroInventario.setText("Registrar en Inventario");
        RegistroInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistroInventarioActionPerformed(evt);
            }
        });
        jMenu6.add(RegistroInventario);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegistroEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistroEmpleadoActionPerformed
        Empleado Empleado1= new Empleado();
        Empleado1.setVisible(true);
    }//GEN-LAST:event_RegistroEmpleadoActionPerformed

    private void RegistroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistroClienteActionPerformed
      Cliente Cliente1= new Cliente();
        Cliente1.setVisible(true);
    }//GEN-LAST:event_RegistroClienteActionPerformed

    private void RegistroProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistroProveedorActionPerformed
        Proveedor Proveedor1= new Proveedor();
        Proveedor1.setVisible(true);
    }//GEN-LAST:event_RegistroProveedorActionPerformed

    private void RegistroHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistroHabitacionActionPerformed
        Habitacion Habitacion1= new Habitacion();
        Habitacion1.setVisible(true);
    }//GEN-LAST:event_RegistroHabitacionActionPerformed

    private void RegistroInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistroInventarioActionPerformed
        RegistroDeInventario Rinventario1= new RegistroDeInventario();
        Rinventario1.setVisible(true);
    }//GEN-LAST:event_RegistroInventarioActionPerformed

    private void NuevoInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoInventarioActionPerformed
        Inventario Inventario1= new Inventario();
        Inventario1.setVisible(true);                                    
    }//GEN-LAST:event_NuevoInventarioActionPerformed

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
    private javax.swing.JMenuItem NuevoInventario;
    private javax.swing.JMenuItem RegistroCliente;
    private javax.swing.JMenuItem RegistroEmpleado;
    private javax.swing.JMenuItem RegistroHabitacion;
    private javax.swing.JMenuItem RegistroInventario;
    private javax.swing.JMenuItem RegistroProveedor;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}