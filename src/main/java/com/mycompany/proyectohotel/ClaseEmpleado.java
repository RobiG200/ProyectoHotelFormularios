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
public class ClaseEmpleado {
    String Nombre;
     String Nit;
     String Direccion;
     String Telefono;
     String Correo;
        
        public void setNonbre(String n){
	Nombre=n;
	}
      
        
        public void setDireccion(String d){
	Direccion=d;
	}
        public void setNit(String n){
	Nit=n;
	}
        
        
        public void setTelefono(String t){
	Telefono=t;
	}
        
        public void setCorreo(String c){
            Correo=c;
        }
     
        
        
        
        
        //Getters
        public String getNombre(){
		return Nombre;
	}
        
        public String getNit(){
		return Nit;
	}
        
        public String getDireccion(){
		return Direccion;
	}
        public String getTelefono(){
		return Telefono;
	}
        
        public String getCorreo(){
            return Correo;
        }
      
}
