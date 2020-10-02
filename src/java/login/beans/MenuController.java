package login.beans;

import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.component.FacesComponent;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import login.controlador.MenuEFacadeLocal;
import login.entidades.MenuE;
import login.entidades.Usuario;
import org.primefaces.model.menu.DefaultMenuItem;
import org.primefaces.model.menu.DefaultMenuModel;
import org.primefaces.model.menu.DefaultSubMenu;
import org.primefaces.model.menu.MenuModel;

@Named
@SessionScoped
public class MenuController implements Serializable{
    
    @EJB
    private MenuEFacadeLocal EJBMenu;
    private List<MenuE> lista;
    private MenuModel model;
    
    
    
    @PostConstruct
    public void init(){
        this.listarMenus();
        model = new DefaultMenuModel();
        this.establecerPermisos();
    }
    
    public void listarMenus(){
        try{
        lista = EJBMenu.findAll();    
        }catch(Exception e){
            //mensaje jsf
        }
        
    }

    public MenuModel getModel() {
        return model;
    }

    public void setModel(MenuModel model) {
        this.model = model;
    }
    
    
    
    public void establecerPermisos(){
        Usuario us = (Usuario) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("user");
        
        for(MenuE m : lista){
            if (m.getType().equals("S") && m.getUsertype().equals(us.getTipo())) {
                DefaultSubMenu firstSubmenu = new DefaultSubMenu(m.getName());
                for(MenuE i : lista){
                    MenuE submenu = i.getSubmenu();
                    if(submenu != null){
                        if (submenu.getCode()== m.getCode()) {
                            DefaultMenuItem item = new DefaultMenuItem(i.getName());  
                            item.setUrl(i.getUrl());
                            firstSubmenu.addElement(item);
                        }
                    }
                }
                model.addElement(firstSubmenu);
            }else{
                if (m.getSubmenu() == null  && m.getUsertype().equals(us.getTipo())) {
                DefaultMenuItem item = new DefaultMenuItem(m.getName());
                item.setUrl(m.getUrl());
                model.addElement(item);    
                }
                
            }
        }
    }
    public void cerrarSesion(){
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
    }
}
