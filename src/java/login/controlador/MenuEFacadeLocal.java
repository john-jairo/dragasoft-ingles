/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login.controlador;

import java.util.List;
import javax.ejb.Local;
import login.entidades.MenuE;

/**
 *
 * @author JOHNJ
 */
@Local
public interface MenuEFacadeLocal {

    void create(MenuE menuE);

    void edit(MenuE menuE);

    void remove(MenuE menuE);

    MenuE find(Object id);

    List<MenuE> findAll();

    List<MenuE> findRange(int[] range);

    int count();
    
}
