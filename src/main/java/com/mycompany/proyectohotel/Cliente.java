/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectohotel;
import java.util.Vector;
import java.util.Iterator;
import javax.swing.JOptionPane;
/**
 *
 * @author Robin Mita
 */
public class Cliente extends javax.swing.JFrame {

    /**
     * Creates new form cliente
     */Vector <ClaseCliente>ArregloCliente;

    public Cliente(Vector <ClaseCliente>a) 
    {
        initComponents();
        ArregloCliente=a;
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        rfApellido = new javax.swing.JTextField();
        tfNit = new javax.swing.JTextField();
        rfDpi = new javax.swing.JTextField();
        tfEdad = new javax.swing.JTextField();
        tfDireccion = new javax.swing.JTextField();
        btGuardar = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tfTelefono = new javax.swing.JTextField();
        tfCorreoElectronico = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Reporte = new javax.swing.JTextArea();
        jButtonVer = new javax.swing.JButton();
        BtBuscar = new javax.swing.JButton();
        BtEliminar = new javax.swing.JButton();
        BtModificar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jLabel1.setText("Registro de cliente");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Nombres");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Apellidos");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Nit");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("DPI");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Telefono");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Correo Electronico");

        tfNombre.setName(""); // NOI18N
        tfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNombreActionPerformed(evt);
            }
        });

        tfNit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNitActionPerformed(evt);
            }
        });

        btGuardar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btGuardar.setText("Guardar");
        btGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarActionPerformed(evt);
            }
        });

        Cancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Direccion");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Edad");

        Reporte.setColumns(20);
        Reporte.setRows(5);
        jScrollPane1.setViewportView(Reporte);

        jButtonVer.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonVer.setText("Ver Registros");
        jButtonVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerActionPerformed(evt);
            }
        });

        BtBuscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtBuscar.setText("Buscar");
        BtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtBuscarActionPerformed(evt);
            }
        });

        BtEliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtEliminar.setText("Eliminar");
        BtEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtEliminarActionPerformed(evt);
            }
        });

        BtModificar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtModificar.setText("Modificar");
        BtModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(51, 51, 51)
                                        .addComponent(tfNit, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel8))
                                        .addGap(29, 29, 29)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(rfDpi, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(rfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(BtModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BtBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonVer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                                    .addComponent(BtEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(tfCorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(77, 77, 77)
                                        .addComponent(tfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(27, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfNit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(tfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 68, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(rfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rfDpi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(tfEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(tfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btGuardar)
                            .addComponent(jButtonVer))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtBuscar)
                            .addComponent(BtEliminar))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtModificar)
                            .addComponent(Cancelar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(tfCorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(87, 87, 87))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNombreActionPerformed

    private void tfNitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNitActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_CancelarActionPerformed

    private void btGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarActionPerformed
      if(evt.getSource()==btGuardar)
      {
         if (tfNit.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Ingrese un Nit");
        }
        else
        {
            if(evt.getSource()==btGuardar)
            {
                if (buscarNit(tfNit.getText())== false)
                    {
                     ClaseCliente cli= new ClaseCliente();
                     cli.setNit(tfNit.getText());
                     cli.setNonbre(tfNombre.getText());
                     cli.setApellido(rfApellido.getText());
                     cli.setDPI(rfDpi.getText());
                     cli.setEdad(tfEdad.getText());
                     cli.setDireccion(tfDireccion.getText());
                     cli.setTelefono(tfTelefono.getText());
                     cli.setCorreo(tfCorreoElectronico.getText());
                     ArregloCliente.add(cli);
                     tfNit.setText("");
                     tfNombre.setText("");
                     rfApellido.setText("");
                     rfDpi.setText("");
                     tfEdad.setText("");
                     tfDireccion.setText("");
                     tfTelefono.setText("");
                     tfCorreoElectronico.setText("");

                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Nit ya existe.");
                        tfNit.setText("");
                        tfNombre.setText("");
                        tfTelefono.setText("");
                        tfDireccion.setText("");
                        rfApellido.setText("");
                        rfDpi.setText("");
                        tfEdad.setText("");
                        tfCorreoElectronico.setText("");
                                                

                                                

                    }            
            }
        }        

          
          
      }
    }//GEN-LAST:event_btGuardarActionPerformed

      private boolean buscarNit(String n){
        boolean encontrado = false;
        ClaseCliente cli3;
        Iterator<ClaseCliente>itr=ArregloCliente.iterator();
        while(itr.hasNext())
        {
            cli3=itr.next();
            
            if (n.compareTo(cli3.getNit())==0)
            {
                encontrado=true;
            }
        }
        return encontrado;
    }
      
    private void jButtonVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerActionPerformed

        Reporte.setText("");
        if(evt.getSource()==jButtonVer)
        {
            ClaseCliente c2;
            Iterator<ClaseCliente>itr=ArregloCliente.iterator();
            while(itr.hasNext())
            {
                c2=itr.next();
                Reporte.append("Nombre: "+c2.getNombre()+"\n Apellido: "+c2.getApellido()+"\n NIT: "+c2.getNit()+"\n DPI: "+c2.getDpi()+"\n EDAD: "+c2.getEdad()+"\n Dirección: "+c2.getDireccion()+"\n Telefono: "+c2.getTelefono()+"\n Correo: "+c2.getCorreo()+"\n\n");
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonVerActionPerformed

   private ClaseCliente BuscarCliente(String c)
   {
       ClaseCliente cli2;
       Iterator<ClaseCliente>itr=ArregloCliente.iterator();
       while (itr.hasNext())
       {
           cli2=itr.next();
           
           if(tfNit.getText().equals(cli2.getNit()))
           {
               return cli2;
           }
       }
       return null;
   }
    
    
    private void BtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtBuscarActionPerformed
       if (evt.getSource()==BtBuscar)
        {
            ClaseCliente c=BuscarCliente(tfNit.getText());
            if (c!=null)
                Reporte.setText("Nombre: "+c.getNombre()+"\n Apellido: "+c.getApellido()+"\n NIT: "+c.getNit()+"\n DPI: "+c.getDpi()+"\n EDAD: "+c.getEdad()+"\n Dirección: "+c.getDireccion()+"\n Telefono: "+c.getTelefono()+"\n Correo: "+c.getCorreo()+"\n");
            
            
            
//JOptionPane.showMessageDialog(null, "El campo de nit esta vacio");
        }
      
    
    }//GEN-LAST:event_BtBuscarActionPerformed

    
    private void BtEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtEliminarActionPerformed
       if(evt.getSource()==BtEliminar)
       {
           ClaseCliente cli=BuscarCliente(tfNit.getText());
           if (cli!=null)
               if(ArregloCliente.contains(cli))
               {
                   ArregloCliente.remove(cli);
                   tfNit.setText(" ");
                   tfNombre.setText("");
                   tfTelefono.setText("");
                   tfDireccion.setText("");
                   rfApellido.setText("");
                   rfDpi.setText("");
                   tfEdad.setText("");
                   tfCorreoElectronico.setText("");
                   tfNit.requestFocus();
               }
       }
   
        
        
        
    }//GEN-LAST:event_BtEliminarActionPerformed

    private void BtModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtModificarActionPerformed
       if (tfNit.getText().isEmpty())
       {
           JOptionPane.showMessageDialog(null, "Ingrese un Código");
       }
       else
       {
           if(buscarNit(tfNit.getText())==true)
           {
               ClaseCliente cli4;
               Integer count=0;
               Iterator<ClaseCliente>itr=ArregloCliente.iterator();
               while(itr.hasNext())
               {
                   count++;
                   cli4=itr.next();
                   if(tfNit.getText().compareTo(cli4.getNit())==0)
                   {
                     cli4.setNit(tfNit.getText());
                     cli4.setNonbre(tfNombre.getText());
                     cli4.setApellido(rfApellido.getText());
                     cli4.setDPI(rfDpi.getText());
                     cli4.setEdad(tfEdad.getText());
                     cli4.setDireccion(tfDireccion.getText());
                     cli4.setTelefono(tfTelefono.getText());
                     cli4.setCorreo(tfCorreoElectronico.getText());
                     
                     Reporte.setText("");
                     ClaseCliente cli3;
                     Iterator<ClaseCliente>itr1=ArregloCliente.iterator();
                     while(itr1.hasNext())
                     {
                         cli3=itr1.next();
                         Reporte.append("Nombre: "+cli3.getNombre()+"\n Apellido: "+cli3.getApellido()+"\n NIT: "+cli3.getNit()+"\n DPI: "+cli3.getDpi()+"\n EDAD: "+cli3.getEdad()+"\n Dirección: "+cli3.getDireccion()+"\n Telefono: "+cli3.getTelefono()+"\n Correo: "+cli3.getCorreo()+"\n");
                     }
                   }
               }
           }
           else
           {
               JOptionPane.showMessageDialog(null, "Nit no existe");
           }
       }
    }//GEN-LAST:event_BtModificarActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtBuscar;
    private javax.swing.JButton BtEliminar;
    private javax.swing.JButton BtModificar;
    private javax.swing.JButton Cancelar;
    private javax.swing.JTextArea Reporte;
    private javax.swing.JButton btGuardar;
    private javax.swing.JButton jButtonVer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField rfApellido;
    private javax.swing.JTextField rfDpi;
    private javax.swing.JTextField tfCorreoElectronico;
    private javax.swing.JTextField tfDireccion;
    private javax.swing.JTextField tfEdad;
    private javax.swing.JTextField tfNit;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfTelefono;
    // End of variables declaration//GEN-END:variables
}
