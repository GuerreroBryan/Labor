/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.principal;

import com.epn.entity.Productos;
import com.epn.session.ProductosJpaController;
import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Aplicaciones D
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Laboratorio2");
        
        ProductosJpaController pjc = new ProductosJpaController(emf);
        
        Productos p = new Productos();
        p.setNombre("Mantequilla");
        p.setPrecio(BigDecimal.valueOf(12.24));
        
        pjc.create(p);
    }
    
}
