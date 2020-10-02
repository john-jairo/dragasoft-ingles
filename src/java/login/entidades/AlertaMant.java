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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author JOHNJ
 */
@Entity
@Table(name = "alerta_mant")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AlertaMant.findAll", query = "SELECT a FROM AlertaMant a")
    , @NamedQuery(name = "AlertaMant.findByIdalertaMant", query = "SELECT a FROM AlertaMant a WHERE a.idalertaMant = :idalertaMant")})
public class AlertaMant implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idalerta_mant")
    private Integer idalertaMant;
    @JoinColumn(name = "mantenimiento_codigo", referencedColumnName = "codigo")
    @ManyToOne
    private Mantenimiento mantenimientoCodigo;

    public AlertaMant() {
    }

    public AlertaMant(Integer idalertaMant) {
        this.idalertaMant = idalertaMant;
    }

    public Integer getIdalertaMant() {
        return idalertaMant;
    }

    public void setIdalertaMant(Integer idalertaMant) {
        this.idalertaMant = idalertaMant;
    }

    public Mantenimiento getMantenimientoCodigo() {
        return mantenimientoCodigo;
    }

    public void setMantenimientoCodigo(Mantenimiento mantenimientoCodigo) {
        this.mantenimientoCodigo = mantenimientoCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idalertaMant != null ? idalertaMant.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AlertaMant)) {
            return false;
        }
        AlertaMant other = (AlertaMant) object;
        if ((this.idalertaMant == null && other.idalertaMant != null) || (this.idalertaMant != null && !this.idalertaMant.equals(other.idalertaMant))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "login.entidades.AlertaMant[ idalertaMant=" + idalertaMant + " ]";
    }
    
}
