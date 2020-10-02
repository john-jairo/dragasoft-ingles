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
@Table(name = "estado_mantenimiento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EstadoMantenimiento.findAll", query = "SELECT e FROM EstadoMantenimiento e")
    , @NamedQuery(name = "EstadoMantenimiento.findByIdEstadoMantenimiento", query = "SELECT e FROM EstadoMantenimiento e WHERE e.idEstadoMantenimiento = :idEstadoMantenimiento")
    , @NamedQuery(name = "EstadoMantenimiento.findByEstadoMantenimiento", query = "SELECT e FROM EstadoMantenimiento e WHERE e.estadoMantenimiento = :estadoMantenimiento")})
public class EstadoMantenimiento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_estado_mantenimiento")
    private Integer idEstadoMantenimiento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "estado_mantenimiento")
    private String estadoMantenimiento;

    public EstadoMantenimiento() {
    }

    public EstadoMantenimiento(Integer idEstadoMantenimiento) {
        this.idEstadoMantenimiento = idEstadoMantenimiento;
    }

    public EstadoMantenimiento(Integer idEstadoMantenimiento, String estadoMantenimiento) {
        this.idEstadoMantenimiento = idEstadoMantenimiento;
        this.estadoMantenimiento = estadoMantenimiento;
    }

    public Integer getIdEstadoMantenimiento() {
        return idEstadoMantenimiento;
    }

    public void setIdEstadoMantenimiento(Integer idEstadoMantenimiento) {
        this.idEstadoMantenimiento = idEstadoMantenimiento;
    }

    public String getEstadoMantenimiento() {
        return estadoMantenimiento;
    }

    public void setEstadoMantenimiento(String estadoMantenimiento) {
        this.estadoMantenimiento = estadoMantenimiento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEstadoMantenimiento != null ? idEstadoMantenimiento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EstadoMantenimiento)) {
            return false;
        }
        EstadoMantenimiento other = (EstadoMantenimiento) object;
        if ((this.idEstadoMantenimiento == null && other.idEstadoMantenimiento != null) || (this.idEstadoMantenimiento != null && !this.idEstadoMantenimiento.equals(other.idEstadoMantenimiento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "login.entidades.EstadoMantenimiento[ idEstadoMantenimiento=" + idEstadoMantenimiento + " ]";
    }
    
}
