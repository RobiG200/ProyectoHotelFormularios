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
public class VectorConsulta {
    String NumHabitacion;
    Integer DiaIngreso;
    Integer DiaEgreso;
    
    
    public void setNumHabitacion(String nr)
    {
        NumHabitacion=nr;
    }
    
    public void setDiaIngreso(Integer nr)
    {
        DiaIngreso=nr;
    }
    
    public void setDiaEgreso(Integer nr)
    {
        DiaEgreso=nr;
    }
    
      public String getNumHabitacion() {
        return NumHabitacion;
    }
     public Integer getDiaIngreso() {
        return DiaIngreso;
    }
          public Integer getDiaEgreso() {
        return DiaEgreso;
    }
        
    
    
    
    
}
