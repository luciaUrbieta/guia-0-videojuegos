package Modelo.Implementaciones;

public abstract class Item {

    //inicializo un contador que me servirá para generar ids únicos
    private static int contador = 0;

    private final int id;
    private String titulo;
    private String creador;
    private String genero;

    public Item(String titulo, String creador, String genero) {
        this.id = ++contador;
        this.titulo=titulo;
        this.creador=creador;
        this.genero=genero;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


}

