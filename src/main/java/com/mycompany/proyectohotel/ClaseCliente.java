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
public class ClaseCliente {
    
  
	String Nombre;
        String Apellido;
        String Direccion;
        String Nit;
        String DPI;
        String Edad;
	String Telefono;
        String Correo;
        
        //Setters 
	public void setNonbre(String n){
	Nombre=n;
	}
        
	public void setApellido(String a){
	Apellido=a;
	}
        
        public void setDireccion(String d){
	Direccion=d;
	}
        public void setNit(String n){
	Nit=n;
	}
        public void setDPI(String d){
	DPI=d;
	}
        
        public void setEdad(String e){
	Edad=e;
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
        public String getApellido(){
		return Apellido;
	}
        public String getNit(){
		return Nit;
	}
        public String getDpi(){
		return DPI;
	}
        public String getEdad(){
		return Edad;
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
