/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectohotel;

/**
 *
 * @author PC Familiar
 */
public class ClaseReserva {
    
    String NoReserva;
    String NoHabitacion;
    String DiaEntrada;
    String MesEntrada;
    String AñoEntrada;
    String DiaSalida;
    String MesSalida;
    String AñoSalida;
    String NombreCli;
    Integer Precio;
    
    public void setNoReserva(String nr)
    {
        NoReserva=nr;
    }
    
    public void setNoHabitacion(String nh)
    {
        NoHabitacion=nh;
    }
    
    public void setDiaEntrada(String de)
    {
        DiaEntrada=de;
    }
    
    public void setMesEntrada(String me)
    {
        MesEntrada=me;
    }
     
    public void setAñoEntrada(String ae)
    {
        AñoEntrada=ae;
    }
     
    public void setDiaSalida(String ds)
    {
        DiaSalida=ds;
    }
    
    public void setMesSalida(String ms)
    {
        MesSalida=ms;
    }
    
    public void setAñoSalida(String as)
    {
        AñoSalida=as;
    }
    
    public void setNombreCli (String nc)
    {
        NombreCli=nc;
    }

    public void setPrecio(Integer Precio) {
        this.Precio = Precio;
    }

    public String getNoReserva() {
        return NoReserva;
    }

    public String getNoHabitacion() {
        return NoHabitacion;
    }

    public String getDiaEntrada() {
        return DiaEntrada;
    }

    public String getMesEntrada() {
        return MesEntrada;
    }

    public String getAñoEntrada() {
        return AñoEntrada;
    }

    public String getDiaSalida() {
        return DiaSalida;
    }

    public String getMesSalida() {
        return MesSalida;
    }

    public String getAñoSalida() {
        return AñoSalida;
    }

    public String getNombreCli() {
        return NombreCli;
    }

    public Integer getPrecio() {
        return Precio;
    }
    
    
}
