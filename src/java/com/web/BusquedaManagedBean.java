
package com.web;

import com.recetas.Categoria;
import com.services.ServicioLocal;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.faces.view.ViewScoped;


@Named(value = "busquedaMB")
@SessionScoped
public class BusquedaManagedBean implements Serializable{

    @EJB private ServicioLocal servicio;
    private List<Categoria> categorias;
    private Categoria categoriaBuscar;
    
    public BusquedaManagedBean() {
        
    }

    public List<Categoria> getCategorias() {
        categorias = servicio.getCategorias();
        return categorias;
    }

    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }

    public Categoria getCategoriaBuscar() {
        return categoriaBuscar;
    }

    public void setCategoriaBuscar(Categoria categoriaBuscar) {
        this.categoriaBuscar = categoriaBuscar;
    }
    
    public String ventanaPorCategoria(int idCategoria){
        this.categoriaBuscar=servicio.getCategoriaPorId(idCategoria);
        return "listaRecetas";
    }
   
}
