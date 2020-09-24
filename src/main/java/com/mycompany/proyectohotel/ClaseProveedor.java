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
public class ClaseProveedor {
    String Nombre;
    String Telefono;
    String Correo;
    String Direccion;
    String Nit;
    public void setNonbre(String n){
	Nombre=n;
	}
    
     public void setTelefono(String t){
	Telefono=t;
	}
      public void setCorreo(String c){
	Correo=c;
	}
      public void setDireccion(String d){
	Direccion=d;
	}
      public void setNit(String n){
	Nit=n;
	}
      
       public String getNit(){
		return Nit;
	}
       
      public String getNombre(){
		return Nombre;
	}
       public String getTelefono(){
		return Telefono;
	}
       public String getCorreo(){
		return Correo;
	}
        public String getDireccion(){
		return Direccion;
	}
}
