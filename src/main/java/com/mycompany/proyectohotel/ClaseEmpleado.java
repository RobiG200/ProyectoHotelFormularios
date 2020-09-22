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
        String Apellido;
        String Nit;
        String DPI;
        String Edad;
        String Direccion;
	String Telefono;
        String Puesto;
        String Sucursal;
        
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
        
        public void setPuesto(String p){
	Puesto=p;
	}
        public void setSucursal(String p){
	Sucursal=p;
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
        public String getPuesto(){
		return Puesto;
	}
         public String getSucursal(){
		return Sucursal;
	}
}
