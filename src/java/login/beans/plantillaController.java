
package login.beans;

import java.io.IOException;
import java.io.Serializable;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import login.entidades.Usuario;

@Named
@ViewScoped
public class plantillaController implements Serializable{
 
   public void verificarSesion(){
       try {
           Usuario us = (Usuario) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("user");
           if (us == null) {
               FacesContext.getCurrentInstance().getExternalContext().redirect("/dragasoft-ingles/faces/permisos.xhtml");
           }
       } catch (IOException e) {
           //
       }
   } 
}
