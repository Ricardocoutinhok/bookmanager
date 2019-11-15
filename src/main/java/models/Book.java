package models;

public class Book {
    private String titulo;
    private int versao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getVersao() {
        return versao;
    }

    public void setVersao(int versao) {
        this.versao = versao;
    }

    public void incrementaversao() {
        versao = versao + 1;
    }
}


