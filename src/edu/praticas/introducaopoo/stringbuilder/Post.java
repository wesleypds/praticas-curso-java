package edu.praticas.introducaopoo.stringbuilder;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Post {
    private static DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    private LocalDateTime momento;
    private String titulo;
    private String conteudo;
    private Integer likes;
    private List<Comentario> listComentario = new ArrayList<>();

    public Post(LocalDateTime momento, String titulo, String conteudo, Integer likes) {
        this.momento = momento;
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.likes = likes;
    }

    public LocalDateTime getMomento() {
        return momento;
    }

    public void setMomento(LocalDateTime momento) {
        this.momento = momento;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public void addComentario(Comentario comentario) {
        listComentario.add(comentario);
    }

    public void removeComentario(Comentario comentario) {
        listComentario.remove(comentario);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(titulo + "\n");
        sb.append(likes + " Likes - " + formatoData.format(momento) + "\n");
        sb.append(conteudo + "\n");
        sb.append("Comentários: \n");
        for (Comentario comentario : listComentario) {
            sb.append(comentario.getTexto() + "\n");
        }
        return sb.toString();
    }
}
