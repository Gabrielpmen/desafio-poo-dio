package br.com.dio.desafio.dominio;

public class Curso {
   private String titulo;
   private String descricao;
   private int cargaHoraria;

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
