/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package br.jsf;

import br.ejb.EjbHelloDeluca;
import jakarta.ejb.EJB;
import jakarta.inject.Named;
import jakarta.enterprise.context.RequestScoped;

/**
 *
 * @author rafael
 */
@Named(value = "jsfSaudation")
@RequestScoped
public class JsfSaudation {

   @EJB
   private EjbHelloDeluca ejbHelloDeluca;
    
    public JsfSaudation() {        
        
    }
    
    public String getSaudation () {
        return ejbHelloDeluca.getSaudation();
    }
    
    public String getName() {
        return ejbHelloDeluca.getNameAndAge("Rafael", 35);
    }
    
    
}
