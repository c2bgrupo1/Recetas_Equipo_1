package com.services;

import com.recetas.Categoria;
import com.recetas.Receta;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.ejb.Stateless;

@Stateless
public class Servicio implements ServicioLocal {

    private List<Categoria> categorias;
    private List<Receta> recetas;

    public Servicio() {
        // CATEGORIAS
        categorias = new ArrayList<Categoria>();
        Categoria c1 = new Categoria(1, "ensalada");
        Categoria c2 = new Categoria(2, "carne");
        Categoria c3 = new Categoria(3, "pescado");
        Categoria c4 = new Categoria(4, "postre");
       
        categorias.add(c1);
        categorias.add(c2);
        categorias.add(c3);
        categorias.add(c4);
        
        // RECETAS
        recetas = new ArrayList<Receta>();
        // ALTA NUEVAS RECETAS
        // carne
        recetas.add(new Receta(1, "CHULETON ESTILO BERMEANO", "CHULETA A LA PARRILLA HECHA EN BERMEO", 10, "1h. y 15 minutos", c2));
        recetas.add(new Receta(2, "CHULETON ESTILO BILBAINO", "CHULETA A LA PARRILLA HECHA EN BILBAO", 5, "1h. ", c2));
        recetas.add(new Receta(3, "CHULETA ESTILO NAVARRO", "CHULETA A LA PARRILLA HECHA EN DICASTILLO", 1, " 15 minutos", c2));
        //ensalada
        recetas.add(new Receta(4, "ENSALADA MEDITERRANEA", "ENSALADA MEDITERRANEA CON CEBOLLA", 10, "1h. y 15 minutos", c1));
        recetas.add(new Receta(5, "ENSALADA TROPICAL", "ENSALADA TROPICAL CON PIÑA", 5, "1h. ", c1));
        recetas.add(new Receta(6, "ENSALADA DEL NORTE", "ENSALADA DEL NORTE CON BONITO NORTE", 1, " 15 minutos", c1));
        //pescado
        recetas.add(new Receta(7, "BACALAO", "BACALAO AL CLUB RANERO", 10, "1h. y 15 minutos", c3));
        recetas.add(new Receta(8, "LUBINA", "LUBINA AL HORNO", 5, "1h. ", c3));
        recetas.add(new Receta(9, "BESUGO", "BESUGO AL ESTILO BERMEO", 1, " 15 minutos", c3));
        //postre
        recetas.add(new Receta(10, "TARTA SANTIAGO", "TARTA SANTIAGO CON ALMENDRA", 10, "1h. y 15 minutos", c4));
        recetas.add(new Receta(11, "HELADO DE TRUFA", "HELADO DE TRUFA CON CHOCOLATE", 5, "1h. ", c4));
        recetas.add(new Receta(12, "BIZCOCHO", "BIZCOCHO CON CREMA", 1, " 15 minutos", c4));

    }

    public List<Categoria> getCategorias() {
        return categorias;
    }

    public Categoria getCategoriaPorId(int id) {
        return categorias.get(id);
    }

    public Categoria getCategoriaPorNombre(String nombre) {
        for (Categoria categoria : categorias) {
            if (categoria.getNombre().equals(nombre)) {
                return categoria;
            }
        }
        return null;
    }

    public List<Receta> getRecetas() {
        return recetas;
    }

    public Receta getRecetaPorId(int id) {
        return recetas.get(id);
    }
    
    public List<Receta> getRecetasPorCategoria(int idCategoria) {
        List<Receta> listaRecetas=new ArrayList<Receta>();
        for(Receta receta:recetas){
            if (receta.getCategoria().getId()== idCategoria) {
                listaRecetas.add(receta);
            }
        }
        return listaRecetas;
    }

    
    
}
