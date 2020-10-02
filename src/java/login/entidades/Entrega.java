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
@Table(name = "entrega")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Entrega.findAll", query = "SELECT e FROM Entrega e")
    , @NamedQuery(name = "Entrega.findByIdentrega", query = "SELECT e FROM Entrega e WHERE e.identrega = :identrega")
    , @NamedQuery(name = "Entrega.findByEstadoEntregaIdestadoEntrega", query = "SELECT e FROM Entrega e WHERE e.estadoEntregaIdestadoEntrega = :estadoEntregaIdestadoEntrega")
    , @NamedQuery(name = "Entrega.findByUsuariosIdUsuario", query = "SELECT e FROM Entrega e WHERE e.usuariosIdUsuario = :usuariosIdUsuario")
    , @NamedQuery(name = "Entrega.findByPuntoInicio", query = "SELECT e FROM Entrega e WHERE e.puntoInicio = :puntoInicio")
    , @NamedQuery(name = "Entrega.findByUbicacionActual", query = "SELECT e FROM Entrega e WHERE e.ubicacionActual = :ubicacionActual")
    , @NamedQuery(name = "Entrega.findByContratosCodigoContrato", query = "SELECT e FROM Entrega e WHERE e.contratosCodigoContrato = :contratosCodigoContrato")})
public class Entrega implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "identrega")
    private Integer identrega;
    @Basic(optional = false)
    @NotNull
    @Column(name = "estado_entrega_idestado_entrega")
    private int estadoEntregaIdestadoEntrega;
    @Basic(optional = false)
    @NotNull
    @Column(name = "usuarios_id_usuario")
    private int usuariosIdUsuario;
    @Size(max = 25)
    @Column(name = "punto_inicio")
    private String puntoInicio;
    @Size(max = 25)
    @Column(name = "ubicacion_actual")
    private String ubicacionActual;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "contratos_codigo_contrato")
    private String contratosCodigoContrato;

    public Entrega() {
    }

    public Entrega(Integer identrega) {
        this.identrega = identrega;
    }

    public Entrega(Integer identrega, int estadoEntregaIdestadoEntrega, int usuariosIdUsuario, String contratosCodigoContrato) {
        this.identrega = identrega;
        this.estadoEntregaIdestadoEntrega = estadoEntregaIdestadoEntrega;
        this.usuariosIdUsuario = usuariosIdUsuario;
        this.contratosCodigoContrato = contratosCodigoContrato;
    }

    public Integer getIdentrega() {
        return identrega;
    }

    public void setIdentrega(Integer identrega) {
        this.identrega = identrega;
    }

    public int getEstadoEntregaIdestadoEntrega() {
        return estadoEntregaIdestadoEntrega;
    }

    public void setEstadoEntregaIdestadoEntrega(int estadoEntregaIdestadoEntrega) {
        this.estadoEntregaIdestadoEntrega = estadoEntregaIdestadoEntrega;
    }

    public int getUsuariosIdUsuario() {
        return usuariosIdUsuario;
    }

    public void setUsuariosIdUsuario(int usuariosIdUsuario) {
        this.usuariosIdUsuario = usuariosIdUsuario;
    }

    public String getPuntoInicio() {
        return puntoInicio;
    }

    public void setPuntoInicio(String puntoInicio) {
        this.puntoInicio = puntoInicio;
    }

    public String getUbicacionActual() {
        return ubicacionActual;
    }

    public void setUbicacionActual(String ubicacionActual) {
        this.ubicacionActual = ubicacionActual;
    }

    public String getContratosCodigoContrato() {
        return contratosCodigoContrato;
    }

    public void setContratosCodigoContrato(String contratosCodigoContrato) {
        this.contratosCodigoContrato = contratosCodigoContrato;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (identrega != null ? identrega.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Entrega)) {
            return false;
        }
        Entrega other = (Entrega) object;
        if ((this.identrega == null && other.identrega != null) || (this.identrega != null && !this.identrega.equals(other.identrega))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "login.entidades.Entrega[ identrega=" + identrega + " ]";
    }
    
}
