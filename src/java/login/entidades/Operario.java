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
@Table(name = "operario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Operario.findAll", query = "SELECT o FROM Operario o")
    , @NamedQuery(name = "Operario.findByNumeroDocumentoOp", query = "SELECT o FROM Operario o WHERE o.numeroDocumentoOp = :numeroDocumentoOp")
    , @NamedQuery(name = "Operario.findByPrimerNombre", query = "SELECT o FROM Operario o WHERE o.primerNombre = :primerNombre")
    , @NamedQuery(name = "Operario.findBySegundoNombre", query = "SELECT o FROM Operario o WHERE o.segundoNombre = :segundoNombre")
    , @NamedQuery(name = "Operario.findByPrimerApellido", query = "SELECT o FROM Operario o WHERE o.primerApellido = :primerApellido")
    , @NamedQuery(name = "Operario.findBySegundoApellido", query = "SELECT o FROM Operario o WHERE o.segundoApellido = :segundoApellido")
    , @NamedQuery(name = "Operario.findByEmail", query = "SELECT o FROM Operario o WHERE o.email = :email")
    , @NamedQuery(name = "Operario.findByTelefono", query = "SELECT o FROM Operario o WHERE o.telefono = :telefono")
    , @NamedQuery(name = "Operario.findByTipoDocumentoIdTipoDoc", query = "SELECT o FROM Operario o WHERE o.tipoDocumentoIdTipoDoc = :tipoDocumentoIdTipoDoc")
    , @NamedQuery(name = "Operario.findByUsuariosIdUsuario", query = "SELECT o FROM Operario o WHERE o.usuariosIdUsuario = :usuariosIdUsuario")})
public class Operario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "numero_documento_op")
    private Integer numeroDocumentoOp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "primer_nombre")
    private String primerNombre;
    @Size(max = 15)
    @Column(name = "segundo_nombre")
    private String segundoNombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "primer_apellido")
    private String primerApellido;
    @Size(max = 15)
    @Column(name = "segundo_apellido")
    private String segundoApellido;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 30)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @NotNull
    @Column(name = "telefono")
    private int telefono;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "tipo_documento_id_tipo_doc")
    private String tipoDocumentoIdTipoDoc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "usuarios_id_usuario")
    private int usuariosIdUsuario;

    public Operario() {
    }

    public Operario(Integer numeroDocumentoOp) {
        this.numeroDocumentoOp = numeroDocumentoOp;
    }

    public Operario(Integer numeroDocumentoOp, String primerNombre, String primerApellido, int telefono, String tipoDocumentoIdTipoDoc, int usuariosIdUsuario) {
        this.numeroDocumentoOp = numeroDocumentoOp;
        this.primerNombre = primerNombre;
        this.primerApellido = primerApellido;
        this.telefono = telefono;
        this.tipoDocumentoIdTipoDoc = tipoDocumentoIdTipoDoc;
        this.usuariosIdUsuario = usuariosIdUsuario;
    }

    public Integer getNumeroDocumentoOp() {
        return numeroDocumentoOp;
    }

    public void setNumeroDocumentoOp(Integer numeroDocumentoOp) {
        this.numeroDocumentoOp = numeroDocumentoOp;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getTipoDocumentoIdTipoDoc() {
        return tipoDocumentoIdTipoDoc;
    }

    public void setTipoDocumentoIdTipoDoc(String tipoDocumentoIdTipoDoc) {
        this.tipoDocumentoIdTipoDoc = tipoDocumentoIdTipoDoc;
    }

    public int getUsuariosIdUsuario() {
        return usuariosIdUsuario;
    }

    public void setUsuariosIdUsuario(int usuariosIdUsuario) {
        this.usuariosIdUsuario = usuariosIdUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numeroDocumentoOp != null ? numeroDocumentoOp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Operario)) {
            return false;
        }
        Operario other = (Operario) object;
        if ((this.numeroDocumentoOp == null && other.numeroDocumentoOp != null) || (this.numeroDocumentoOp != null && !this.numeroDocumentoOp.equals(other.numeroDocumentoOp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "login.entidades.Operario[ numeroDocumentoOp=" + numeroDocumentoOp + " ]";
    }
    
}
