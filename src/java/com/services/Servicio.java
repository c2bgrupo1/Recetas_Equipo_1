package com.services;

import com.recetas.Categoria;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;


@Stateless
public class Servicio implements ServicioLocal {
    
    private List<Categoria> categorias;

    public Servicio() {
        categorias=new ArrayList<Categoria>();
        categorias.add(new Categoria(1,"Ensaladas"));
        categorias.add(new Categoria(2,"Carnes"));
        categorias.add(new Categoria(3,"Pescadod"));
        categorias.add(new Categoria(4,"Postres"));
        
        
    }

    public List<Categoria> getCategorias() {
        return categorias;
    }

    public Categoria getCategoriaPorId(int id){
        return categorias.get(id);
    }
    public Categoria getCategoriaPorNombre(String nombre){
        for ( Categoria categoria:categorias){
            if (categoria.getNombre().equals(nombre)){
                return categoria;
            }
        }
        return null;
    }

   
}
