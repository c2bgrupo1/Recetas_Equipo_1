/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web;

import com.recetas.Categoria;
import com.recetas.Receta;
import com.services.ServicioLocal;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author SISTEMAS
 */
@Named(value = "recetasMB")
@SessionScoped 
public class RecetasManagedBean implements Serializable {

     @EJB private ServicioLocal servicio;
     
    private List<Receta> recetas;
    private Receta recetaBuscar;
    public RecetasManagedBean() {
    }

    public List<Receta> getRecetas() {
        return servicio.getRecetas();
    }

    public void setRecetas(List<Receta> recetas) {
        this.recetas = recetas;
    }

    public Receta getRecetaBuscar() {
        return recetaBuscar;
    }

    public void setRecetaBuscar(Receta recetaBuscar) {
        this.recetaBuscar = recetaBuscar;
    }
    
    public Receta getRecetaPorId (int id){
        return servicio.getRecetaPorId(id);
        
    }
     public List<Receta> getRecetasPorCategoria(int idCategoria) {
         return servicio.getRecetasPorCategoria(idCategoria);
     }
     
public String ventanaPorReceta(int idReceta){
        this.recetaBuscar=servicio.getRecetaPorId(idReceta);
        return "detallesReceta";
    }
}