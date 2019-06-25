package com.services;

import com.recetas.Categoria;
import java.util.List;
import javax.ejb.Local;


@Local
public interface ServicioLocal {
     public List<Categoria> getCategorias() ;
     public Categoria getCategoriaPorId(int id);
     public Categoria getCategoriaPorNombre(String nombre);
    
}
