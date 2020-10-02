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
@Table(name = "contratos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Contratos.findAll", query = "SELECT c FROM Contratos c")
    , @NamedQuery(name = "Contratos.findByCodigoContrato", query = "SELECT c FROM Contratos c WHERE c.codigoContrato = :codigoContrato")
    , @NamedQuery(name = "Contratos.findBySedeEntrega", query = "SELECT c FROM Contratos c WHERE c.sedeEntrega = :sedeEntrega")
    , @NamedQuery(name = "Contratos.findByDuracion", query = "SELECT c FROM Contratos c WHERE c.duracion = :duracion")
    , @NamedQuery(name = "Contratos.findByEstadoContratoIdEstadoContrato", query = "SELECT c FROM Contratos c WHERE c.estadoContratoIdEstadoContrato = :estadoContratoIdEstadoContrato")
    , @NamedQuery(name = "Contratos.findByCiudadesCodigoMunicipio", query = "SELECT c FROM Contratos c WHERE c.ciudadesCodigoMunicipio = :ciudadesCodigoMunicipio")
    , @NamedQuery(name = "Contratos.findByTipoContratoIdTipoContrato", query = "SELECT c FROM Contratos c WHERE c.tipoContratoIdTipoContrato = :tipoContratoIdTipoContrato")
    , @NamedQuery(name = "Contratos.findByJefeAdministrativoUsuariosIdUsuario", query = "SELECT c FROM Contratos c WHERE c.jefeAdministrativoUsuariosIdUsuario = :jefeAdministrativoUsuariosIdUsuario")
    , @NamedQuery(name = "Contratos.findByInventarioCodigo", query = "SELECT c FROM Contratos c WHERE c.inventarioCodigo = :inventarioCodigo")})
public class Contratos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "codigo_contrato")
    private String codigoContrato;
    @Size(max = 30)
    @Column(name = "sede_entrega")
    private String sedeEntrega;
    @Column(name = "duracion")
    private Integer duracion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "estado_contrato_id_estado_contrato")
    private int estadoContratoIdEstadoContrato;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ciudades_codigo_municipio")
    private int ciudadesCodigoMunicipio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tipo_contrato_id_tipo_contrato")
    private int tipoContratoIdTipoContrato;
    @Basic(optional = false)
    @NotNull
    @Column(name = "jefe_administrativo_usuarios_id_usuario")
    private int jefeAdministrativoUsuariosIdUsuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "inventario_codigo")
    private String inventarioCodigo;

    public Contratos() {
    }

    public Contratos(String codigoContrato) {
        this.codigoContrato = codigoContrato;
    }

    public Contratos(String codigoContrato, int estadoContratoIdEstadoContrato, int ciudadesCodigoMunicipio, int tipoContratoIdTipoContrato, int jefeAdministrativoUsuariosIdUsuario, String inventarioCodigo) {
        this.codigoContrato = codigoContrato;
        this.estadoContratoIdEstadoContrato = estadoContratoIdEstadoContrato;
        this.ciudadesCodigoMunicipio = ciudadesCodigoMunicipio;
        this.tipoContratoIdTipoContrato = tipoContratoIdTipoContrato;
        this.jefeAdministrativoUsuariosIdUsuario = jefeAdministrativoUsuariosIdUsuario;
        this.inventarioCodigo = inventarioCodigo;
    }

    public String getCodigoContrato() {
        return codigoContrato;
    }

    public void setCodigoContrato(String codigoContrato) {
        this.codigoContrato = codigoContrato;
    }

    public String getSedeEntrega() {
        return sedeEntrega;
    }

    public void setSedeEntrega(String sedeEntrega) {
        this.sedeEntrega = sedeEntrega;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public int getEstadoContratoIdEstadoContrato() {
        return estadoContratoIdEstadoContrato;
    }

    public void setEstadoContratoIdEstadoContrato(int estadoContratoIdEstadoContrato) {
        this.estadoContratoIdEstadoContrato = estadoContratoIdEstadoContrato;
    }

    public int getCiudadesCodigoMunicipio() {
        return ciudadesCodigoMunicipio;
    }

    public void setCiudadesCodigoMunicipio(int ciudadesCodigoMunicipio) {
        this.ciudadesCodigoMunicipio = ciudadesCodigoMunicipio;
    }

    public int getTipoContratoIdTipoContrato() {
        return tipoContratoIdTipoContrato;
    }

    public void setTipoContratoIdTipoContrato(int tipoContratoIdTipoContrato) {
        this.tipoContratoIdTipoContrato = tipoContratoIdTipoContrato;
    }

    public int getJefeAdministrativoUsuariosIdUsuario() {
        return jefeAdministrativoUsuariosIdUsuario;
    }

    public void setJefeAdministrativoUsuariosIdUsuario(int jefeAdministrativoUsuariosIdUsuario) {
        this.jefeAdministrativoUsuariosIdUsuario = jefeAdministrativoUsuariosIdUsuario;
    }

    public String getInventarioCodigo() {
        return inventarioCodigo;
    }

    public void setInventarioCodigo(String inventarioCodigo) {
        this.inventarioCodigo = inventarioCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoContrato != null ? codigoContrato.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contratos)) {
            return false;
        }
        Contratos other = (Contratos) object;
        if ((this.codigoContrato == null && other.codigoContrato != null) || (this.codigoContrato != null && !this.codigoContrato.equals(other.codigoContrato))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "login.entidades.Contratos[ codigoContrato=" + codigoContrato + " ]";
    }
    
}
