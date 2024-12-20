/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectohotel;
import java.util.Vector;
import java.util.Iterator;
import java.util.Objects;
import javax.swing.JOptionPane;

/**
 *
 * @author Robin Mita
 */
public class Reservacion extends javax.swing.JFrame {
   Vector <VectorConsulta>ConsultaVector;
   Vector <ClaseReservacion>Reservaciones;
   Vector <ClaseCliente>ArregloCliente;
    /**
     * Creates new form Reservacion
     */
    public Reservacion(Vector <VectorConsulta>a,Vector <ClaseReservacion>b,Vector <ClaseCliente>ac) {
        initComponents();
        ConsultaVector=a;
        Reservaciones=b;
        ArregloCliente=ac;
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
        JTxtFNoReservacion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JTxtFNumHabitacion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        JTxtFDiaI = new javax.swing.JTextField();
        JTxtFDiaS = new javax.swing.JTextField();
        JTxtFNombreCliente = new javax.swing.JTextField();
        btAgregra = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Reporte = new javax.swing.JTextArea();
        JTxtFMesS = new javax.swing.JTextField();
        JTxtFAñoS = new javax.swing.JTextField();
        JTxtFMesI = new javax.swing.JTextField();
        JTxtFAñoI = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        BtEliminar = new javax.swing.JButton();
        BtBuscar = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButtonVer = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        JTxtFPrecio = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jLabel1.setText("Reservación");

        JTxtFNoReservacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTxtFNoReservacionActionPerformed(evt);
            }
        });

        jLabel2.setText("Numero de Reservacion:");

        jLabel3.setText("No. Habitacion:");

        jLabel4.setText("Fecha de ingreso:");

        jLabel5.setText("Fecha de salida:");

        jLabel6.setText("Nombre de Cliente:");

        btAgregra.setText("Agregar");
        btAgregra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAgregraActionPerformed(evt);
            }
        });

        jButton2.setText("Cerrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        Reporte.setColumns(20);
        Reporte.setRows(5);
        jScrollPane1.setViewportView(Reporte);

        JTxtFMesS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTxtFMesSActionPerformed(evt);
            }
        });

        jLabel7.setText("Día:");

        jLabel8.setText("Mes:");

        jLabel9.setText("Año:");

        BtEliminar.setText("Eliminar");
        BtEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtEliminarActionPerformed(evt);
            }
        });

        BtBuscar.setText("Buscar");
        BtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtBuscarActionPerformed(evt);
            }
        });

        jButton5.setText("Modificar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButtonVer.setText("Ver datos");
        jButtonVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerActionPerformed(evt);
            }
        });

        jLabel10.setText("Precio:");

        JTxtFPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTxtFPrecioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btAgregra)
                        .addComponent(jLabel6))
                    .addComponent(jLabel10))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JTxtFNumHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTxtFNoReservacion, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(JTxtFDiaI, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                                        .addComponent(JTxtFDiaS, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(JTxtFMesS, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                                        .addComponent(JTxtFMesI))
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(JTxtFAñoS, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                                        .addComponent(JTxtFAñoI))))
                            .addComponent(JTxtFNombreCliente)
                            .addComponent(JTxtFPrecio)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jButtonVer)
                        .addGap(28, 28, 28)
                        .addComponent(BtBuscar)))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 11, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BtEliminar)
                        .addGap(36, 36, 36)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addGap(0, 32, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(JTxtFNoReservacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTxtFNumHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(JTxtFDiaI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTxtFMesI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTxtFAñoI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(JTxtFDiaS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTxtFMesS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTxtFAñoS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(JTxtFNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(JTxtFPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAgregra)
                    .addComponent(jButton2)
                    .addComponent(jButtonVer)
                    .addComponent(BtEliminar)
                    .addComponent(BtBuscar)
                    .addComponent(jButton5))
                .addGap(89, 89, 89))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTxtFMesSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTxtFMesSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTxtFMesSActionPerformed

    private void JTxtFPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTxtFPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTxtFPrecioActionPerformed

    private void JTxtFNoReservacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTxtFNoReservacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTxtFNoReservacionActionPerformed

    
    
    private Integer buscarReserva()
    {        
        ClaseReservacion c3;
        Integer cont =0;
        Iterator<ClaseReservacion>itr=Reservaciones.iterator();
        while(itr.hasNext())
            {
                cont++;
                c3=itr.next();
                if (JTxtFNoReservacion.getText().compareTo(c3.getNoReservacion())==0)
                {
                 
                }
            }
        
        return cont;
        
    }
    
    
        private Integer buscarCons()
    {        
        VectorConsulta c3;
        Integer cont =0;
        Iterator<VectorConsulta>itr=ConsultaVector.iterator();
        while(itr.hasNext())
            {
                cont++;
                c3=itr.next();
                
            }
        
        return cont;
        
    }

    
     private void IngresarCons(String z, Integer x, Integer y)
    {
        VectorConsulta co = new VectorConsulta();
        co.setNumHabitacion(z);
        co.setDiaIngreso(x);
        co.setDiaEgreso(y);
        ConsultaVector.add(co);
    }

     
     
     private void IngresarReserva(){
         
      
                     ClaseReservacion emp= new ClaseReservacion();
                     emp.setNoReserva(JTxtFNoReservacion.getText());
                     emp.setNoHabitacion(JTxtFNumHabitacion.getText());
                     int DiaI=Integer.parseInt(JTxtFDiaI.getText());
                     emp.setDiaEntrada(DiaI);
                     int DiaS=Integer.parseInt(JTxtFDiaS.getText());
                     emp.setDiaSalida(DiaS);
                     int MesI=Integer.parseInt(JTxtFMesI.getText());
                     emp.setMesEntrada(MesI);
                     int MesS=Integer.parseInt(JTxtFMesS.getText());
                     emp.setMesSalida(MesS);
                     int AnoI=Integer.parseInt(JTxtFAñoI.getText());
                     emp.setAñoEntrada(AnoI);
                     int AnoS=Integer.parseInt(JTxtFAñoS.getText());
                     emp.setAñoSalida(AnoS);
                     emp.setNombreCli(JTxtFNombreCliente.getText());
                     int PrecioR=Integer.parseInt(JTxtFPrecio.getText());
                     emp.setPrecio(PrecioR);
                     Reservaciones.add(emp);
                     JTxtFNoReservacion.setText("");
                     JTxtFNumHabitacion.setText("");
                     JTxtFDiaI.setText("");
                     JTxtFDiaS.setText("");
                     JTxtFMesI.setText("");
                     JTxtFMesS.setText("");
                     JTxtFAñoI.setText("");
                     JTxtFAñoS.setText("");
                     JTxtFNombreCliente.setText("");  
                     JTxtFPrecio.setText("");
                     Reporte.setText("");
         
     }

    
    private void btAgregraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAgregraActionPerformed
        Integer a= Integer.parseInt(JTxtFDiaI.getText());
        Integer b= Integer.parseInt(JTxtFDiaS.getText());
        Integer c1= Integer.parseInt(JTxtFMesI.getText());
        Integer d= Integer.parseInt(JTxtFMesS.getText());
        Integer e= Integer.parseInt(JTxtFAñoI.getText());
        Integer f= Integer.parseInt(JTxtFAñoS.getText());
        Integer g= Integer.parseInt(JTxtFPrecio.getText());
        Integer cont1=0;
        Integer cont2=0;
        VectorConsulta co=null;
      
        if(buscarReserva()== 0) 
        { 
            
              IngresarReserva();
        }
  
        else
        {
            if(buscarCliente(JTxtFNombreCliente.getText())== true)
            {
            ClaseReservacion c4;
            Iterator<ClaseReservacion>itr=Reservaciones.iterator();
            while(itr.hasNext())
            {              
                c4=itr.next();
                if (JTxtFNumHabitacion.getText().compareTo(c4.getNumeroHabitacion())==0)
                {
                    String z=c4.getNumeroHabitacion();
                    Integer y=c4.getDiaIngreso();
                    Integer x=c4.getMesSalida();
                    IngresarCons(z, y, x);
                }                
            }
            VectorConsulta vc4;
            Iterator<VectorConsulta>itr1=ConsultaVector.iterator();
            while(itr1.hasNext())
            {
                
                vc4=itr1.next();
                if( a < vc4.getDiaIngreso() ||  a > vc4.getDiaEgreso()  )
                    {
                        cont2++;
                    }
                cont1++;
            }
            if (Objects.equals(cont1, cont2))
            {
                IngresarReserva();                
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Habitacion Reservada");
            }
            }
            else
           
           {
               JOptionPane.showMessageDialog(null, "El Nombre del Cliente no existe");
               JTxtFNombreCliente.setText("");
           }
            
 
        }
         ConsultaVector.removeAllElements(); 
    }//GEN-LAST:event_btAgregraActionPerformed

    private void jButtonVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerActionPerformed
        //  Reporte.setText("");
        if(evt.getSource()==jButtonVer)
        {
            ClaseReservacion c2;
            Iterator<ClaseReservacion>itr=Reservaciones.iterator();
            while(itr.hasNext())
            {
                c2=itr.next();
                Reporte.append("No. Reserva: "+c2.getNoReservacion()+"\n Numero de Habitación: "+c2.getNumeroHabitacion()+"\n Fecha de ingreso: "+c2.getDiaIngreso()+"/"+c2.getMesEntrada()+"/"+c2.getAñoEntrada()+"\n Fecha Salida: "+c2.getDiaSalida()+"/"+c2.getMesSalida()+"/"+c2.getAñoSalida()+"\n Nombre Cliente: "+c2.getNombreCli()+"\n Precio: "+c2.getPrecio()+"\n");
            }
        } 
    }//GEN-LAST:event_jButtonVerActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed
        private boolean buscarReserv(String n){
        boolean encontrado = false;
        ClaseReservacion res3;
        Iterator<ClaseReservacion>itr=Reservaciones.iterator();
        while(itr.hasNext())
        {
            res3=itr.next();
            
            if (n.compareTo(res3.getNoReservacion())==0)
            {
                encontrado=true;
            }
        }
        return encontrado;
    }
    
     private ClaseReservacion BuscarReserva(String c)
   {
       ClaseReservacion re2;
       Iterator<ClaseReservacion>itr=Reservaciones.iterator();
       while (itr.hasNext())
       {
           re2=itr.next();
           
           if(JTxtFNoReservacion.getText().equals(re2.getNoReservacion()))
           {
               return re2;
           }
       }
       return null;
   }
     
    private void BtEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtEliminarActionPerformed
        if(evt.getSource()==BtEliminar)
       {
           ClaseReservacion res=BuscarReserva(JTxtFNoReservacion.getText());
           if (res!=null)
               if(Reservaciones.contains(res))
               {
                   Reservaciones.remove(res);
                   JTxtFNoReservacion.setText(" ");
                   JTxtFNumHabitacion.setText("");
                   JTxtFDiaI.setText("");
                   JTxtFMesI.setText("");
                   JTxtFAñoI.setText("");
                   JTxtFDiaS.setText("");
                   JTxtFMesS.setText("");
                   JTxtFAñoS.setText("");
                   JTxtFNombreCliente.setText("");
                   JTxtFPrecio.setText("");
                   JTxtFNoReservacion.requestFocus();
               }
       }
    }//GEN-LAST:event_BtEliminarActionPerformed

    private void BtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtBuscarActionPerformed
      if (evt.getSource()==BtBuscar)
        {
            ClaseReservacion r=BuscarReserva(JTxtFNoReservacion.getText());
            if (r!=null)
                Reporte.setText("No. Reserva:  "+r.getNoReservacion()+"\n Numero de Habitación: "+r.getNumeroHabitacion()+"\n Fecha de ingreso:  "+r.getDiaIngreso()+"/"+r.getMesEntrada()+"/"+r.getAñoEntrada()+"\n Fecha Salida: "+r.getDiaSalida()+"/"+r.getMesSalida()+"/"+r.getAñoSalida()+"\n Nombre Cliente: "+r.getNombreCli()+"\n Precio: "+r.getPrecio()+"\n");
            
            
            
//JOptionPane.showMessageDialog(null, "El campo de nit esta vacio");
        }
    }//GEN-LAST:event_BtBuscarActionPerformed

     private boolean buscarCliente(String n){
        boolean encontrado = false;
        ClaseCliente pro3;
        Iterator<ClaseCliente>itr=ArregloCliente.iterator();
        while(itr.hasNext())
        {
            pro3=itr.next();
            if (n.compareTo(pro3.getNombre())==0)
            {
                encontrado=true;
            }
        }
        return encontrado;
    }
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       if (JTxtFNoReservacion.getText().isEmpty())
       {
           JOptionPane.showMessageDialog(null, "Ingrese un Código");
       }
       else
       {
           
           if(buscarReserv(JTxtFNoReservacion.getText())==true)
           {
               ClaseReservacion res4;
               Integer count=0;
               Iterator<ClaseReservacion>itr=Reservaciones.iterator();
               while(itr.hasNext())
               {
                   count++;
                   res4=itr.next();
                   if(JTxtFNoReservacion.getText().compareTo(res4.getNoReservacion())==0)
                   {
                     res4.setNoReserva(JTxtFNoReservacion.getText());
                     res4.setNoHabitacion(JTxtFNumHabitacion.getText());
                     int DiaI=Integer.parseInt(JTxtFDiaI.getText());
                     res4.setDiaEntrada(DiaI);
                     int MesI=Integer.parseInt(JTxtFMesI.getText());
                     res4.setMesEntrada(MesI);
                     int AñoI=Integer.parseInt(JTxtFAñoI.getText());
                     res4.setAñoEntrada(AñoI);
                     int DiaS=Integer.parseInt(JTxtFDiaS.getText());
                     res4.setDiaSalida(DiaS);
                     int MesS=Integer.parseInt(JTxtFMesS.getText());
                     res4.setMesSalida(MesS);
                     int AñoS=Integer.parseInt(JTxtFAñoS.getText());
                     res4.setAñoSalida(AñoS);
                     res4.setNombreCli(JTxtFNombreCliente.getText());
                     int PrecioR=Integer.parseInt(JTxtFPrecio.getText());
                     res4.setPrecio(PrecioR);
                     Reporte.setText("");
                     ClaseReservacion res3;
                     Iterator<ClaseReservacion>itr1=Reservaciones.iterator();
                     while(itr1.hasNext())
                     {
                         res3=itr1.next();
                         Reporte.append("No. Reserva: "+res3.getNoReservacion()+"\n Numero de Habitación: "+res3.getNumeroHabitacion()+"\n Fecha de ingreso: "+res3.getDiaIngreso()+"/"+res3.getMesEntrada()+"/"+res3.getAñoEntrada()+"\n Fecha Salida: "+res3.getDiaSalida()+"/"+res3.getMesSalida()+"/"+res3.getAñoSalida()+"\n Nombre Cliente: "+res3.getNombreCli()+"\n Precio: "+res3.getPrecio()+"\n");
                     }
                   }
               }
           }
           else
           {
               JOptionPane.showMessageDialog(null, "Nit no existe");
           }
           
           
       }
    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtBuscar;
    private javax.swing.JButton BtEliminar;
    private javax.swing.JTextField JTxtFAñoI;
    private javax.swing.JTextField JTxtFAñoS;
    private javax.swing.JTextField JTxtFDiaI;
    private javax.swing.JTextField JTxtFDiaS;
    private javax.swing.JTextField JTxtFMesI;
    private javax.swing.JTextField JTxtFMesS;
    private javax.swing.JTextField JTxtFNoReservacion;
    private javax.swing.JTextField JTxtFNombreCliente;
    private javax.swing.JTextField JTxtFNumHabitacion;
    private javax.swing.JTextField JTxtFPrecio;
    private javax.swing.JTextArea Reporte;
    private javax.swing.JButton btAgregra;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
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
    // End of variables declaration//GEN-END:variables
}
