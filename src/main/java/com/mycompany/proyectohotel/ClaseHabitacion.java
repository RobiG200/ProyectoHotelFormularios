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
public class ClaseHabitacion {
    
    String Codigo;
    String Nombre;
    String Precio;
    
     public void setCodigo(String t){
     Codigo=t;
	}
     public void setNombre(String t){
     Nombre=t;
        }
     
    public void setPrecio(String t){
     Precio=t;
        }
   
    
    public String getCodigo(){
    return Codigo;
	}
    public String getNombre(){
    return Nombre;
	}
    public String getPrecio(){
    return Precio;
	}
    
    
    
}
