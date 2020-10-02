/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login.beans;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import login.controlador.UsuarioFacade;
import login.entidades.Usuario;

/**
 *
 * @author JOHNJ
 */
@Named(value = "loginBean")
@SessionScoped
public class LoginBean implements Serializable {
    
    private String nombreUsuario;
    private String password;
    
    @EJB
    private UsuarioFacade usuFacade;
    private Usuario usuarioAutenticado;

    public Usuario getUsuarioAutenticado() {
        return usuarioAutenticado;
    }

    public void setUsuarioAutenticado(Usuario usuarioAutenticado) {
        this.usuarioAutenticado = usuarioAutenticado;
    }
    
    

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    

    /**
     * Creates a new instance of LoginBean
     */
    public LoginBean() {
    }
    
    public String autenticar(){
        Usuario us;
        String redireccion = null;
        
        us = usuarioAutenticado=usuFacade.encontrarUsuarioxLogin(nombreUsuario);
        redireccion = "/protegido/principal?faces-redirect=true";
        
        if (usuarioAutenticado!=null) {
            FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("user", us);
            if (usuarioAutenticado.getClave().equals(password)) {
                return redireccion;
            }
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Incorrect password", "Incorrect password"));
        return null;
        }
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "The mail does not exist", "The mail does not exist"));
        return null;
    }
}
