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
@Table(name = "estado_entrega")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EstadoEntrega.findAll", query = "SELECT e FROM EstadoEntrega e")
    , @NamedQuery(name = "EstadoEntrega.findByIdestadoEntrega", query = "SELECT e FROM EstadoEntrega e WHERE e.idestadoEntrega = :idestadoEntrega")
    , @NamedQuery(name = "EstadoEntrega.findByEstadoEntrega", query = "SELECT e FROM EstadoEntrega e WHERE e.estadoEntrega = :estadoEntrega")})
public class EstadoEntrega implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idestado_entrega")
    private Integer idestadoEntrega;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "estado_entrega")
    private String estadoEntrega;

    public EstadoEntrega() {
    }

    public EstadoEntrega(Integer idestadoEntrega) {
        this.idestadoEntrega = idestadoEntrega;
    }

    public EstadoEntrega(Integer idestadoEntrega, String estadoEntrega) {
        this.idestadoEntrega = idestadoEntrega;
        this.estadoEntrega = estadoEntrega;
    }

    public Integer getIdestadoEntrega() {
        return idestadoEntrega;
    }

    public void setIdestadoEntrega(Integer idestadoEntrega) {
        this.idestadoEntrega = idestadoEntrega;
    }

    public String getEstadoEntrega() {
        return estadoEntrega;
    }

    public void setEstadoEntrega(String estadoEntrega) {
        this.estadoEntrega = estadoEntrega;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idestadoEntrega != null ? idestadoEntrega.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EstadoEntrega)) {
            return false;
        }
        EstadoEntrega other = (EstadoEntrega) object;
        if ((this.idestadoEntrega == null && other.idestadoEntrega != null) || (this.idestadoEntrega != null && !this.idestadoEntrega.equals(other.idestadoEntrega))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "login.entidades.EstadoEntrega[ idestadoEntrega=" + idestadoEntrega + " ]";
    }
    
}
