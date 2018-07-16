/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Session.UsersFacade;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author mason
 */
@Named
@RequestScoped
public class Web {
    
    @EJB
    private UsersFacade uf;
    
    private String id;
    private String name;
    private String lastName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void save() {
        try{
            uf.Save(id, name, lastName);
        }catch(Exception e){
            
        }
    }
           
    
}
