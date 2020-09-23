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
public class ClaseDetalleFactura {
    
   String CodFactura;
   String CodigoServicio;
   Integer Cantidad;
   Float SubTotal;
    
   public void setCodFactura(String n){
	CodFactura=n;
	}
   public void setCodgoServicio(String c){
	CodigoServicio=c;
	}
   public void setCantidad(Integer c){
	Cantidad=c;
	}
   public void setSubTotal(Float s){
	SubTotal=s;
	}
   
        public String getCodFactura(){
		return CodFactura;
	}
        public String getCodigoCodServicio(){
		return CodigoServicio;
	}
        public Integer getCantidad(){
		return Cantidad;
	}
        public float getSubtotal(){
		return SubTotal;
	}
   
   
}
