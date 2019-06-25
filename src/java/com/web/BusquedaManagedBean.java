
package com.web;

import com.recetas.Categoria;
import com.services.ServicioLocal;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.faces.view.ViewScoped;


@Named(value = "busquedaMB")
@ViewScoped
public class BusquedaManagedBean implements Serializable{

    @EJB private ServicioLocal servicio;
    private List<Categoria> categorias;
    
    public BusquedaManagedBean() {
    }

    public List<Categoria> getCategorias() {
        return categorias;
    }
    
   
}
