/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dto;

import java.io.Serializable;

/**
 *
 * @author Elías Medina
 */
public class CamisetaDto implements Serializable {
    
    private static final long serialVersionUID = 1L;
 
    public Integer id;
    public  String nombre;
    public String descripcion;
    public  String talla;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }
        public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
