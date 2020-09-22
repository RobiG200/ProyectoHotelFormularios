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
public class CllaseProveedor {
    String Nombre;
    String Telefono;
    String Correo;
    String Direccion;
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
