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
        jLabel10 = new javax.swing.JLabel();
        tfTelefono = new javax.swing.JTextField();
        tfCorreoElectronico = new javax.swing.JTextField();
        jRadioButtonHobre = new javax.swing.JRadioButton();
        jRadioButtonMujer = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Reporte = new javax.swing.JTextArea();
        jButtonVer = new javax.swing.JButton();
        BtBuscar = new javax.swing.JButton();
        BtEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Registro de cliente");

        jLabel2.setText("Nombres");

        jLabel3.setText("Apellidos");

        jLabel4.setText("Nit");

        jLabel5.setText("DPI");

        jLabel6.setText("Telefono");

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

        btGuardar.setText("Guardar");
        btGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarActionPerformed(evt);
            }
        });

        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        jLabel8.setText("Direccion");

        jLabel9.setText("edad");

        jLabel10.setText("Sexo");

        jRadioButtonHobre.setText("Hombre");
        jRadioButtonHobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonHobreActionPerformed(evt);
            }
        });

        jRadioButtonMujer.setText("Mujer");

        Reporte.setColumns(20);
        Reporte.setRows(5);
        jScrollPane1.setViewportView(Reporte);

        jButtonVer.setText("Ver Registros");
        jButtonVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerActionPerformed(evt);
            }
        });

        BtBuscar.setText("Buscar");
        BtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtBuscarActionPerformed(evt);
            }
        });

        BtEliminar.setText("Eliminar");
        BtEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(rfApellido))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8))
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfNit, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(rfDpi, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tfEdad, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tfDireccion, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btGuardar)
                                        .addGap(26, 26, 26)
                                        .addComponent(jButtonVer)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jRadioButtonHobre)
                                        .addGap(17, 17, 17))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel6)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jRadioButtonMujer)
                                    .addComponent(tfTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                                    .addComponent(tfCorreoElectronico)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(BtBuscar)
                        .addGap(41, 41, 41)
                        .addComponent(Cancelar)
                        .addGap(73, 73, 73)))
                .addGap(36, 36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(tfCorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(rfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(tfNit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jRadioButtonHobre)
                                    .addComponent(jRadioButtonMujer))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                        .addGap(43, 43, 43))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(45, 45, 45)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel9)
                                            .addComponent(tfEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(rfDpi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(tfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel8))
                        .addGap(127, 127, 127)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btGuardar)
                    .addComponent(Cancelar)
                    .addComponent(jButtonVer)
                    .addComponent(BtBuscar)
                    .addComponent(BtEliminar))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonHobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonHobreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonHobreActionPerformed

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
                     cli.setNonbre(tfNombre.getText());
                     cli.setApellido(rfApellido.getText());
                     cli.setNit(tfNit.getText());
                     cli.setDPI(rfDpi.getText());
                     cli.setEdad(tfEdad.getText());
                     cli.setDireccion(tfDireccion.getText());
                     cli.setTelefono(tfTelefono.getText());
                     cli.setCorreo(tfCorreoElectronico.getText());
                     ArregloCliente.add(cli);
                     tfNombre.setText("");
                     rfApellido.setText("");
                     tfNit.setText("");
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

    private void jButtonVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerActionPerformed

        Reporte.setText("");
        if(evt.getSource()==jButtonVer)
        {
            ClaseCliente c2;
            Iterator<ClaseCliente>itr=ArregloCliente.iterator();
            while(itr.hasNext())
            {
                c2=itr.next();
                Reporte.append(c2.getNombre()+" "+c2.getApellido()+" "+c2.getNit()+" "+c2.getDpi()+" "+c2.getEdad()+" "+c2.getDireccion()+" "+c2.getTelefono()+" "+c2.getCorreo()+"\n");
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonVerActionPerformed

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
    
    
    private void BtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtBuscarActionPerformed
       if (tfNit.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "El campo de nit esta vascio");
        }
        else
        {
            Reporte.setText("");
            ClaseCliente c3;        
            Integer cont1=0;
            Integer cont2=0;
            Iterator<ClaseCliente>itr=ArregloCliente.iterator();
            while(itr.hasNext())
            {   
                cont1++;
                c3=itr.next();
                if (tfNit.getText().compareTo(c3.getNit())== 0)
                {                    
                    Reporte.append(c3.getNit()+" "+c3.getNombre()+"  "+c3.getApellido()+" "+c3.getDireccion()+" "+c3.getDpi()+" "+c3.getNit()+""+c3.getTelefono()+""+c3.getCorreo()+" "+c3.getDireccion()+"\n");
                    
                }              
                else{
                    cont2++;
                }             
            }    
            if(cont1==cont2)
            {
                JOptionPane.showMessageDialog(null, "Nit no existe en los registros.");
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
    
    }//GEN-LAST:event_BtBuscarActionPerformed

    
    private void BtEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtEliminarActionPerformed
             if (tfNit.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Nit no existe en los registros.");
        }
        else
        {
            if (buscarNit(tfNit.getText())== true)
                {
                    ClaseCliente c3;
                    Integer cont=0;
                    Iterator<ClaseCliente>itr=ArregloCliente.iterator();
                    while(itr.hasNext())
                    {
                        cont++;
                        c3=itr.next();
                        if (tfNit.getText().compareTo(c3.getNit())== 0)
                        {
                            ArregloCliente.removeElementAt(cont-1);
                            Reporte.setText("");
                            ClaseCliente c2;
                            Iterator<ClaseCliente>itr1=ArregloCliente.iterator();
                            while(itr1.hasNext())
                            {
                                c2=itr1.next();
                                Reporte.append(c2.getNit()+" "+c2.getNombre()+"  "+c2.getApellido()+" "+c2.getDireccion()+" "+c2.getDpi()+" "+c2.getNit()+""+c2.getTelefono()+""+c2.getCorreo()+" "+c2.getDireccion()+"\n");
                            }
                        }                
                    } 
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Nit no existe en los registros");
                }
        }
   
        
        
        
    }//GEN-LAST:event_BtEliminarActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtBuscar;
    private javax.swing.JButton BtEliminar;
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
    private javax.swing.JRadioButton jRadioButtonHobre;
    private javax.swing.JRadioButton jRadioButtonMujer;
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
