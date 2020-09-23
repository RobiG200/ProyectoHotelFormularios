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
public class ClaseFactura {
    String Correlativo;
    String NitCliente;
    String NitEmpleado;
    String Fecha;
    String MontoTotal;
    
        public void setCorrelativo(String c){
	Correlativo=c;
	}
        public void setNitCliente(String n){
    	NitCliente=n;
	}
          public void setNitEmpleado(String n){
	NitEmpleado=n;
	}
        public void setFecha(String f){
	Fecha=f;
	}
        public void setMontoTotal(String m){
	MontoTotal=m;
	}
        
         public String getCorrelativo(){
		return Correlativo;
	}
          public String getNitEmpleado(){
		return NitEmpleado;
	}
         public String getNitCliente(){
		return NitCliente;
	}
          public String getFecha(){
            	return Fecha;
	}
        public String getMontoTotal(){
		return MontoTotal;
	}
    
}
