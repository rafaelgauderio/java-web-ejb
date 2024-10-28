/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB40/StatelessEjbClass.java to edit this template
 */
package br.ejb;

import jakarta.ejb.Stateless;
import jakarta.ejb.LocalBean;

/**
 *
 * @author rafael
 */
@Stateless
public class EjbHelloDeluca {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    public String getSaudation () {
        return "Hello Rafael de Luca. Everybody use EBJ\n";
    }
    
    public String getNameAndAge(String name, int age) {
        return "The name is " + name + ", and the age " + age + "\n";
    }
            
}
