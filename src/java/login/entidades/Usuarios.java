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
@Table(name = "usuarios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuarios.findAll", query = "SELECT u FROM Usuarios u")
    , @NamedQuery(name = "Usuarios.findByIdUsuario", query = "SELECT u FROM Usuarios u WHERE u.idUsuario = :idUsuario")
    , @NamedQuery(name = "Usuarios.findByNomUsuario", query = "SELECT u FROM Usuarios u WHERE u.nomUsuario = :nomUsuario")
    , @NamedQuery(name = "Usuarios.findByNodocumento", query = "SELECT u FROM Usuarios u WHERE u.nodocumento = :nodocumento")
    , @NamedQuery(name = "Usuarios.findByPerfilesidPerfil", query = "SELECT u FROM Usuarios u WHERE u.perfilesidPerfil = :perfilesidPerfil")
    , @NamedQuery(name = "Usuarios.findByEmail", query = "SELECT u FROM Usuarios u WHERE u.email = :email")
    , @NamedQuery(name = "Usuarios.findByEstadoUsuarioIdEstadoUsuario", query = "SELECT u FROM Usuarios u WHERE u.estadoUsuarioIdEstadoUsuario = :estadoUsuarioIdEstadoUsuario")
    , @NamedQuery(name = "Usuarios.findByContrase\u00f1a", query = "SELECT u FROM Usuarios u WHERE u.contrase\u00f1a = :contrase\u00f1a")})
public class Usuarios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_usuario")
    private Integer idUsuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "nom_usuario")
    private String nomUsuario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "No_documento")
    private int nodocumento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "perfiles_idPerfil")
    private int perfilesidPerfil;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "Email")
    private String email;
    @Basic(optional = false)
    @NotNull
    @Column(name = "estado_usuario_id_estado_usuario")
    private int estadoUsuarioIdEstadoUsuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "contrase\u00f1a")
    private String contraseña;

    public Usuarios() {
    }

    public Usuarios(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Usuarios(Integer idUsuario, String nomUsuario, int nodocumento, int perfilesidPerfil, String email, int estadoUsuarioIdEstadoUsuario, String contraseña) {
        this.idUsuario = idUsuario;
        this.nomUsuario = nomUsuario;
        this.nodocumento = nodocumento;
        this.perfilesidPerfil = perfilesidPerfil;
        this.email = email;
        this.estadoUsuarioIdEstadoUsuario = estadoUsuarioIdEstadoUsuario;
        this.contraseña = contraseña;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNomUsuario() {
        return nomUsuario;
    }

    public void setNomUsuario(String nomUsuario) {
        this.nomUsuario = nomUsuario;
    }

    public int getNodocumento() {
        return nodocumento;
    }

    public void setNodocumento(int nodocumento) {
        this.nodocumento = nodocumento;
    }

    public int getPerfilesidPerfil() {
        return perfilesidPerfil;
    }

    public void setPerfilesidPerfil(int perfilesidPerfil) {
        this.perfilesidPerfil = perfilesidPerfil;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEstadoUsuarioIdEstadoUsuario() {
        return estadoUsuarioIdEstadoUsuario;
    }

    public void setEstadoUsuarioIdEstadoUsuario(int estadoUsuarioIdEstadoUsuario) {
        this.estadoUsuarioIdEstadoUsuario = estadoUsuarioIdEstadoUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsuario != null ? idUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuarios)) {
            return false;
        }
        Usuarios other = (Usuarios) object;
        if ((this.idUsuario == null && other.idUsuario != null) || (this.idUsuario != null && !this.idUsuario.equals(other.idUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "login.entidades.Usuarios[ idUsuario=" + idUsuario + " ]";
    }
    
}
