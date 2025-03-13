package Modelo.Implementaciones;

import Modelo.Interfaces.Media;

public class Juego extends Item implements Media {

    private int numeroVersion;

    public Juego(int id, String titulo, String creador, String genero, int numeroVersion){
        super(id, titulo, creador, genero);
        this.numeroVersion=numeroVersion;
    }

    public int getNumeroVersion() {
        return numeroVersion;
    }

    public void setNumeroVersion(int numeroVersion) {
        this.numeroVersion = numeroVersion;
    }

}
