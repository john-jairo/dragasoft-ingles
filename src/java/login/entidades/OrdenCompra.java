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
@Table(name = "orden_compra")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OrdenCompra.findAll", query = "SELECT o FROM OrdenCompra o")
    , @NamedQuery(name = "OrdenCompra.findByIdordenCompra", query = "SELECT o FROM OrdenCompra o WHERE o.idordenCompra = :idordenCompra")
    , @NamedQuery(name = "OrdenCompra.findByInventarioCodigo", query = "SELECT o FROM OrdenCompra o WHERE o.inventarioCodigo = :inventarioCodigo")
    , @NamedQuery(name = "OrdenCompra.findByUsuariosIdUsuario", query = "SELECT o FROM OrdenCompra o WHERE o.usuariosIdUsuario = :usuariosIdUsuario")
    , @NamedQuery(name = "OrdenCompra.findByEstadoOrdenIdestadoOrden", query = "SELECT o FROM OrdenCompra o WHERE o.estadoOrdenIdestadoOrden = :estadoOrdenIdestadoOrden")
    , @NamedQuery(name = "OrdenCompra.findByObservacionOc", query = "SELECT o FROM OrdenCompra o WHERE o.observacionOc = :observacionOc")})
public class OrdenCompra implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idorden_compra")
    private Integer idordenCompra;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "inventario_codigo")
    private String inventarioCodigo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "usuarios_id_usuario")
    private int usuariosIdUsuario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "estado_orden_idestado_orden")
    private int estadoOrdenIdestadoOrden;
    @Size(max = 100)
    @Column(name = "observacion_oc")
    private String observacionOc;

    public OrdenCompra() {
    }

    public OrdenCompra(Integer idordenCompra) {
        this.idordenCompra = idordenCompra;
    }

    public OrdenCompra(Integer idordenCompra, String inventarioCodigo, int usuariosIdUsuario, int estadoOrdenIdestadoOrden) {
        this.idordenCompra = idordenCompra;
        this.inventarioCodigo = inventarioCodigo;
        this.usuariosIdUsuario = usuariosIdUsuario;
        this.estadoOrdenIdestadoOrden = estadoOrdenIdestadoOrden;
    }

    public Integer getIdordenCompra() {
        return idordenCompra;
    }

    public void setIdordenCompra(Integer idordenCompra) {
        this.idordenCompra = idordenCompra;
    }

    public String getInventarioCodigo() {
        return inventarioCodigo;
    }

    public void setInventarioCodigo(String inventarioCodigo) {
        this.inventarioCodigo = inventarioCodigo;
    }

    public int getUsuariosIdUsuario() {
        return usuariosIdUsuario;
    }

    public void setUsuariosIdUsuario(int usuariosIdUsuario) {
        this.usuariosIdUsuario = usuariosIdUsuario;
    }

    public int getEstadoOrdenIdestadoOrden() {
        return estadoOrdenIdestadoOrden;
    }

    public void setEstadoOrdenIdestadoOrden(int estadoOrdenIdestadoOrden) {
        this.estadoOrdenIdestadoOrden = estadoOrdenIdestadoOrden;
    }

    public String getObservacionOc() {
        return observacionOc;
    }

    public void setObservacionOc(String observacionOc) {
        this.observacionOc = observacionOc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idordenCompra != null ? idordenCompra.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrdenCompra)) {
            return false;
        }
        OrdenCompra other = (OrdenCompra) object;
        if ((this.idordenCompra == null && other.idordenCompra != null) || (this.idordenCompra != null && !this.idordenCompra.equals(other.idordenCompra))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "login.entidades.OrdenCompra[ idordenCompra=" + idordenCompra + " ]";
    }
    
}
