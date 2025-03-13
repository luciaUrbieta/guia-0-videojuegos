package Repositorio.Interfaces;

import Modelo.Implementaciones.Item;

import java.time.LocalDate;

public interface Repositorio <T> {

    void agregar(T item);
    public void eliminar(T item);
    public String mostrarItems();
    public String filtrarPorGenero(String genero);
    public int obtenerIndice(T item);
    /*
    public void modificarTitulo(T item, String titulo);
    public void modificarCreador(T item, String creador);
    public void modificarGenero(T item, String genero);
     */
}
