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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "estado_orden")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EstadoOrden.findAll", query = "SELECT e FROM EstadoOrden e")
    , @NamedQuery(name = "EstadoOrden.findByIdestadoOrden", query = "SELECT e FROM EstadoOrden e WHERE e.idestadoOrden = :idestadoOrden")
    , @NamedQuery(name = "EstadoOrden.findByEstadoOrdel", query = "SELECT e FROM EstadoOrden e WHERE e.estadoOrdel = :estadoOrdel")})
public class EstadoOrden implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idestado_orden")
    private Integer idestadoOrden;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 16)
    @Column(name = "estado_ordel")
    private String estadoOrdel;

    public EstadoOrden() {
    }

    public EstadoOrden(Integer idestadoOrden) {
        this.idestadoOrden = idestadoOrden;
    }

    public EstadoOrden(Integer idestadoOrden, String estadoOrdel) {
        this.idestadoOrden = idestadoOrden;
        this.estadoOrdel = estadoOrdel;
    }

    public Integer getIdestadoOrden() {
        return idestadoOrden;
    }

    public void setIdestadoOrden(Integer idestadoOrden) {
        this.idestadoOrden = idestadoOrden;
    }

    public String getEstadoOrdel() {
        return estadoOrdel;
    }

    public void setEstadoOrdel(String estadoOrdel) {
        this.estadoOrdel = estadoOrdel;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idestadoOrden != null ? idestadoOrden.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EstadoOrden)) {
            return false;
        }
        EstadoOrden other = (EstadoOrden) object;
        if ((this.idestadoOrden == null && other.idestadoOrden != null) || (this.idestadoOrden != null && !this.idestadoOrden.equals(other.idestadoOrden))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "login.entidades.EstadoOrden[ idestadoOrden=" + idestadoOrden + " ]";
    }
    
}
