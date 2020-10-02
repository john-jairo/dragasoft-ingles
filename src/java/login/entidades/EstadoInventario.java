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
@Table(name = "estado_inventario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EstadoInventario.findAll", query = "SELECT e FROM EstadoInventario e")
    , @NamedQuery(name = "EstadoInventario.findByIdEstadoInventario", query = "SELECT e FROM EstadoInventario e WHERE e.idEstadoInventario = :idEstadoInventario")
    , @NamedQuery(name = "EstadoInventario.findByEstadoInventario", query = "SELECT e FROM EstadoInventario e WHERE e.estadoInventario = :estadoInventario")})
public class EstadoInventario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_estado_inventario")
    private Integer idEstadoInventario;
    @Size(max = 20)
    @Column(name = "estado_inventario")
    private String estadoInventario;

    public EstadoInventario() {
    }

    public EstadoInventario(Integer idEstadoInventario) {
        this.idEstadoInventario = idEstadoInventario;
    }

    public Integer getIdEstadoInventario() {
        return idEstadoInventario;
    }

    public void setIdEstadoInventario(Integer idEstadoInventario) {
        this.idEstadoInventario = idEstadoInventario;
    }

    public String getEstadoInventario() {
        return estadoInventario;
    }

    public void setEstadoInventario(String estadoInventario) {
        this.estadoInventario = estadoInventario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEstadoInventario != null ? idEstadoInventario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EstadoInventario)) {
            return false;
        }
        EstadoInventario other = (EstadoInventario) object;
        if ((this.idEstadoInventario == null && other.idEstadoInventario != null) || (this.idEstadoInventario != null && !this.idEstadoInventario.equals(other.idEstadoInventario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "login.entidades.EstadoInventario[ idEstadoInventario=" + idEstadoInventario + " ]";
    }
    
}
