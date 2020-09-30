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
public class ClaseReservacion {
    
    String NoReserva;
    String NoHabitacion;
    Integer DiaEntrada;
    Integer MesEntrada;
    Integer AñoEntrada;
    Integer DiaSalida;
    Integer MesSalida;
    Integer AñoSalida;
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
    
    public void setDiaEntrada(Integer de)
    {
        DiaEntrada=de;
    }
    
    public void setMesEntrada(Integer me)
    {
        MesEntrada=me;
    }
     
    public void setAñoEntrada(Integer ae)
    {
        AñoEntrada=ae;
    }
     
    public void setDiaSalida(Integer ds)
    {
        DiaSalida=ds;
    }
    
    public void setMesSalida(Integer ms)
    {
        MesSalida=ms;
    }
    
    public void setAñoSalida(Integer as)
    {
        AñoSalida=as;
    }
    
    public void setNombreCli(String nc)
    {
        NombreCli=nc;
    }

    public void setPrecio(Integer Precio) {
        this.Precio = Precio;
    }

    public String getNoReservacion() {
        return NoReserva;
    }

    public String getNumeroHabitacion() {
        return NoHabitacion;
    }

    public Integer getDiaIngreso() {
        return DiaEntrada;
    }

    public Integer getMesEntrada() {
        return MesEntrada;
    }

    public Integer getAñoEntrada() {
        return AñoEntrada;
    }

    public Integer getDiaSalida() {
        return DiaSalida;
    }

    public Integer getMesSalida() {
        return MesSalida;
    }

    public Integer getAñoSalida() {
        return AñoSalida;
    }

    public String getNombreCli() {
        return NombreCli;
    }

    public Integer getPrecio() {
        return Precio;
    }
    
    
}
