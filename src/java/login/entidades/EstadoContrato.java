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
@Table(name = "estado_contrato")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EstadoContrato.findAll", query = "SELECT e FROM EstadoContrato e")
    , @NamedQuery(name = "EstadoContrato.findByIdEstadoContrato", query = "SELECT e FROM EstadoContrato e WHERE e.idEstadoContrato = :idEstadoContrato")
    , @NamedQuery(name = "EstadoContrato.findByEstadoContrato", query = "SELECT e FROM EstadoContrato e WHERE e.estadoContrato = :estadoContrato")})
public class EstadoContrato implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_estado_contrato")
    private Integer idEstadoContrato;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "estado_contrato")
    private String estadoContrato;

    public EstadoContrato() {
    }

    public EstadoContrato(Integer idEstadoContrato) {
        this.idEstadoContrato = idEstadoContrato;
    }

    public EstadoContrato(Integer idEstadoContrato, String estadoContrato) {
        this.idEstadoContrato = idEstadoContrato;
        this.estadoContrato = estadoContrato;
    }

    public Integer getIdEstadoContrato() {
        return idEstadoContrato;
    }

    public void setIdEstadoContrato(Integer idEstadoContrato) {
        this.idEstadoContrato = idEstadoContrato;
    }

    public String getEstadoContrato() {
        return estadoContrato;
    }

    public void setEstadoContrato(String estadoContrato) {
        this.estadoContrato = estadoContrato;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEstadoContrato != null ? idEstadoContrato.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EstadoContrato)) {
            return false;
        }
        EstadoContrato other = (EstadoContrato) object;
        if ((this.idEstadoContrato == null && other.idEstadoContrato != null) || (this.idEstadoContrato != null && !this.idEstadoContrato.equals(other.idEstadoContrato))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "login.entidades.EstadoContrato[ idEstadoContrato=" + idEstadoContrato + " ]";
    }
    
}
