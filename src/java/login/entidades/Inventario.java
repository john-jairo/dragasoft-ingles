/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login.entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author JOHNJ
 */
@Entity
@Table(name = "inventario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Inventario.findAll", query = "SELECT i FROM Inventario i")
    , @NamedQuery(name = "Inventario.findByCodigo", query = "SELECT i FROM Inventario i WHERE i.codigo = :codigo")
    , @NamedQuery(name = "Inventario.findByCategoria", query = "SELECT i FROM Inventario i WHERE i.categoria = :categoria")
    , @NamedQuery(name = "Inventario.findByReferencia", query = "SELECT i FROM Inventario i WHERE i.referencia = :referencia")
    , @NamedQuery(name = "Inventario.findByAnoFabricacion", query = "SELECT i FROM Inventario i WHERE i.anoFabricacion = :anoFabricacion")
    , @NamedQuery(name = "Inventario.findByCicloVida", query = "SELECT i FROM Inventario i WHERE i.cicloVida = :cicloVida")
    , @NamedQuery(name = "Inventario.findByCantidad", query = "SELECT i FROM Inventario i WHERE i.cantidad = :cantidad")
    , @NamedQuery(name = "Inventario.findByEstadoInventario", query = "SELECT i FROM Inventario i WHERE i.estadoInventario = :estadoInventario")
    , @NamedQuery(name = "Inventario.findByIdUsuario", query = "SELECT i FROM Inventario i WHERE i.idUsuario = :idUsuario")
    , @NamedQuery(name = "Inventario.findByAltura", query = "SELECT i FROM Inventario i WHERE i.altura = :altura")
    , @NamedQuery(name = "Inventario.findByAncho", query = "SELECT i FROM Inventario i WHERE i.ancho = :ancho")
    , @NamedQuery(name = "Inventario.findByProfundidad", query = "SELECT i FROM Inventario i WHERE i.profundidad = :profundidad")
    , @NamedQuery(name = "Inventario.findByPeso", query = "SELECT i FROM Inventario i WHERE i.peso = :peso")
    , @NamedQuery(name = "Inventario.findByColor", query = "SELECT i FROM Inventario i WHERE i.color = :color")
    , @NamedQuery(name = "Inventario.findByMarcasIdMarca", query = "SELECT i FROM Inventario i WHERE i.marcasIdMarca = :marcasIdMarca")
    , @NamedQuery(name = "Inventario.findBySubCategoria", query = "SELECT i FROM Inventario i WHERE i.subCategoria = :subCategoria")})
public class Inventario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "codigo")
    private String codigo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "categoria")
    private int categoria;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "referencia")
    private String referencia;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ano_fabricacion")
    private int anoFabricacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ciclo_vida")
    private int cicloVida;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cantidad")
    private int cantidad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "estado_inventario")
    private int estadoInventario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_usuario")
    private int idUsuario;
    @Column(name = "altura")
    private Integer altura;
    @Column(name = "ancho")
    private Integer ancho;
    @Column(name = "profundidad")
    private Integer profundidad;
    @Column(name = "peso")
    private Integer peso;
    @Size(max = 15)
    @Column(name = "color")
    private String color;
    @Basic(optional = false)
    @NotNull
    @Column(name = "marcas_id_marca")
    private int marcasIdMarca;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sub_categoria")
    private int subCategoria;

    public Inventario() {
    }

    public Inventario(String codigo) {
        this.codigo = codigo;
    }

    public Inventario(String codigo, int categoria, String referencia, int anoFabricacion, int cicloVida, int cantidad, int estadoInventario, int idUsuario, int marcasIdMarca, int subCategoria) {
        this.codigo = codigo;
        this.categoria = categoria;
        this.referencia = referencia;
        this.anoFabricacion = anoFabricacion;
        this.cicloVida = cicloVida;
        this.cantidad = cantidad;
        this.estadoInventario = estadoInventario;
        this.idUsuario = idUsuario;
        this.marcasIdMarca = marcasIdMarca;
        this.subCategoria = subCategoria;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public int getAnoFabricacion() {
        return anoFabricacion;
    }

    public void setAnoFabricacion(int anoFabricacion) {
        this.anoFabricacion = anoFabricacion;
    }

    public int getCicloVida() {
        return cicloVida;
    }

    public void setCicloVida(int cicloVida) {
        this.cicloVida = cicloVida;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getEstadoInventario() {
        return estadoInventario;
    }

    public void setEstadoInventario(int estadoInventario) {
        this.estadoInventario = estadoInventario;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }

    public Integer getAncho() {
        return ancho;
    }

    public void setAncho(Integer ancho) {
        this.ancho = ancho;
    }

    public Integer getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(Integer profundidad) {
        this.profundidad = profundidad;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMarcasIdMarca() {
        return marcasIdMarca;
    }

    public void setMarcasIdMarca(int marcasIdMarca) {
        this.marcasIdMarca = marcasIdMarca;
    }

    public int getSubCategoria() {
        return subCategoria;
    }

    public void setSubCategoria(int subCategoria) {
        this.subCategoria = subCategoria;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Inventario)) {
            return false;
        }
        Inventario other = (Inventario) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "login.entidades.Inventario[ codigo=" + codigo + " ]";
    }
    
}
