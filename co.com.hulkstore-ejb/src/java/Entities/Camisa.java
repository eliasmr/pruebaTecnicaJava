/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Elías Medina
 */
@Entity
@Table(name = "camisa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Camisa.findAll", query = "SELECT c FROM Camisa c"),
    @NamedQuery(name = "Camisa.findById", query = "SELECT c FROM Camisa c WHERE c.id = :id"),
    @NamedQuery(name = "Camisa.findByNombre", query = "SELECT c FROM Camisa c WHERE c.nombre = :nombre"),
    @NamedQuery(name = "Camisa.findByDescripcion", query = "SELECT c FROM Camisa c WHERE c.descripcion = :descripcion"),
    @NamedQuery(name = "Camisa.findByTalla", query = "SELECT c FROM Camisa c WHERE c.talla = :talla"),
    @NamedQuery(name = "Camisa.findByMarca", query = "SELECT c FROM Camisa c WHERE c.marca = :marca"),
    @NamedQuery(name = "Camisa.findByTipo", query = "SELECT c FROM Camisa c WHERE c.tipo = :tipo"),
    @NamedQuery(name = "Camisa.findByProductoId", query = "SELECT c FROM Camisa c WHERE c.productoId = :productoId")})
public class Camisa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Size(max = 50)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "descripcion")
    private String descripcion;
    @Size(max = 2)
    @Column(name = "talla")
    private String talla;
    @Size(max = 20)
    @Column(name = "marca")
    private String marca;
    @Size(max = 2)
    @Column(name = "tipo")
    private String tipo;
    @Column(name = "producto_id")
    private Integer productoId;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "camisa1")
    private Camisa camisa;
    @JoinColumn(name = "id", referencedColumnName = "id", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Camisa camisa1;
    @JoinColumn(name = "id", referencedColumnName = "Id", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Productos productos;

    public Camisa() {
    }

    public Camisa(Integer id) {
        this.id = id;
    }

    public Camisa(Integer id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getProductoId() {
        return productoId;
    }

    public void setProductoId(Integer productoId) {
        this.productoId = productoId;
    }

    public Camisa getCamisa() {
        return camisa;
    }

    public void setCamisa(Camisa camisa) {
        this.camisa = camisa;
    }

    public Camisa getCamisa1() {
        return camisa1;
    }

    public void setCamisa1(Camisa camisa1) {
        this.camisa1 = camisa1;
    }

    public Productos getProductos() {
        return productos;
    }

    public void setProductos(Productos productos) {
        this.productos = productos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Camisa)) {
            return false;
        }
        Camisa other = (Camisa) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Camisa[ id=" + id + " ]";
    }
    
}
