package edu.exercicios.introducaopoo.stringbuilder;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) throws ParseException {
        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        Post post = new Post(LocalDateTime.parse("21/06/2023 17:35:22", formatoData),
                "Viajando para Nova Zelândia",
                "Estou animado para visitar este lindo país!",
                12);
        Comentario c1 = new Comentario("Tenha uma boa viagem");
        Comentario c2 = new Comentario("Ual, isso é incrível!");

        post.addComentario(c1);
        post.addComentario(c2);

        Post post2 = new Post(LocalDateTime.parse("21/06/2023 17:35:22", formatoData),
                "Boa noite pessoal",
                "Vejo vocês amanhã!",
                5);

        Comentario c3 = new Comentario("Boa noite");
        Comentario c4 = new Comentario("Que a força esteja com você");

        post2.addComentario(c3);
        post2.addComentario(c4);

        System.out.println(post);
        System.out.println();
        System.out.println(post2);
    }
}
