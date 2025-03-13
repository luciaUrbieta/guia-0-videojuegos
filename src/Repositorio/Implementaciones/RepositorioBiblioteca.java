package Repositorio.Implementaciones;

import Modelo.Implementaciones.Expansion;
import Modelo.Implementaciones.Item;
import Modelo.Implementaciones.Juego;

import java.time.LocalDate;

public class RepositorioBiblioteca {

    private Repositorio<Item> items;

    public RepositorioBiblioteca(){
        items = new Repositorio<>();
    }

    public void modificarTitulo(Item item, String titulo) {
        int indice = items.obtenerIndice(item);
        items.getItems().get(indice).setTitulo(titulo);
    }

    public void modificarCreador(Item item, String creador) {
        int indice = items.obtenerIndice(item);
        items.getItems().get(indice).setCreador(creador);
    }

    public void modificarGenero(Item item, String genero) {
        int indice = items.obtenerIndice(item);
        items.getItems().get(indice).setGenero(genero);
    }

    //me queda ver como manejar modificaciones de atributos especificos de juego y expansion utilizando listas de genericos

    //no sé si debería pedir por parámetro un juego o un item

    public void modificarNumeroVersion(Juego juego, int numeroVersion) {
        int indice = items.obtenerIndice(juego);
        Juego cast = (Juego)items.getItems().get(indice);
        cast.setNumeroVersion(numeroVersion);
    }

    public void modificarFechaLanzamiento(Item item, LocalDate fechaLanzamiento) {
        int indice = items.obtenerIndice(item);
        Expansion cast = (Expansion)items.getItems().get(indice);
        cast.setFechaLanzamiento(fechaLanzamiento);
    }

}
