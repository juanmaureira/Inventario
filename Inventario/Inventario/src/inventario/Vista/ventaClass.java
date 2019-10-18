/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventario.Vista;

import java.util.Calendar;

/**
 *
 * @author Alumno
 */
public class ventaClass {
    
    private String id;   
    private Calendar fecha;
    private String nombre;
    private Float  descuento;
    private Float montoFinal;
    
    public void ventaClass(){
        id = null;   
        fecha = null;
        nombre = null;
        descuento = 0f;
        montoFinal = 0f;           
    }
    
    public void ventaClass(String id, Calendar fecha,String nombre,Float descuento,Float montoFinal ){
        this.id = id;
        this.fecha = fecha;
        this.descuento = descuento;
        this.montoFinal = montoFinal;
        this.nombre = nombre;
    }
    
    public String getId(){
        return id;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public Calendar getFecha(){
        return fecha;
    }
    
    public Float getDescuento(){
        return descuento;
    }
    
    public Float getMontoFinal(){
        return montoFinal;
    }
}
