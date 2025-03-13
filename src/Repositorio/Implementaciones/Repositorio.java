package Repositorio.Implementaciones;

import Modelo.Implementaciones.Item;
import Modelo.Implementaciones.Juego;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Repositorio <T extends Item> implements Repositorio.Interfaces.Repositorio<T> {

    private List<T> items;

    public Repositorio(){
        items = new ArrayList<T>();
    }

    public List<T> getItems() {
        return items;
    }

    @Override
    public void agregar(T item) {
        items.add(item);
    }

    @Override
    public void eliminar(T item) {
        items.remove(item);
    }

    @Override
    public String mostrarItems() {
        StringBuilder retorno = new StringBuilder();
        for(T itemActual : items){
            retorno.append(itemActual.toString());
            retorno.append("");
        }
        return retorno.toString();
    }

    @Override
    public String filtrarPorGenero(String genero) {
        StringBuilder retorno = new StringBuilder();
        for(T itemActual : items){
            if(itemActual.getGenero().equalsIgnoreCase(genero)){
                retorno.append(itemActual.toString());
                retorno.append("");
            }
        }
        return retorno.toString();
    }
    @Override
    public int obtenerIndice(T item){
        int indice=-1;
        for(T itemActual : items){
            indice++;
            if(itemActual.equals(item)){
                break;
            }
        }
        return indice;
    }

}
