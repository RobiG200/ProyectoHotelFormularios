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
public class ClaseProductoHabitacion {
     String CodigoHabitacion;
     String CodigoProducto;
     String Cantidad;
     
     public void setCodigoHabitacion(String n){
	CodigoHabitacion=n;
	}
     public void setCodigoPrecio(String n){
	CodigoProducto=n;
	}
     public void setNonbre(String n){
	Cantidad=n;
	}
     public String getodigoHabitacion(){
		return CodigoHabitacion;
	}
      public String getCodigoProducto(){
		return CodigoProducto;
        }
           public String getCantidad(){
		return Cantidad;
	}
           
     
     
     
    
}
