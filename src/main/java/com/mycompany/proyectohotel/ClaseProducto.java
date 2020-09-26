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
public class ClaseProducto {
    String CodigoProveedor;
    String CodArticulo;
    String Nombre;
    String Cantidad;
    String Precio;
    
    public void setCodProveedor(String cp){
	CodigoProveedor=cp;
	}
    
     public void setCodArticulo(String ca){
	CodArticulo=ca;
	}
      public void setNombre(String n){
	Nombre=n;
	}
      public void setCantidad(String c){
	Cantidad=c;
	}
      public void setPrecio(String p){
	Precio=p;
	}
      
       public String getCodProveedor(){
		return CodigoProveedor;
	}
       
      public String getCodArticulo(){
		return CodArticulo;
	}
       public String getNombre(){
		return Nombre;
	}
       public String getCantidad(){
		return Cantidad;
	}
        public String getPrecio(){
		return Precio;
	}
}


