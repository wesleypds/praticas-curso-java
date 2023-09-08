package edu.exercicios.introducaopoo.stringbuilder;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class App {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Post post = new Post(formatoData.parse("21/06/2023 17:35:22"),
                "Traveling to New Zealand",
                "I'm going to visit this wonderful country!",
                12);
        Comentario c1 = new Comentario("Have a nice trip");
        Comentario c2 = new Comentario("Wow that's awesome!");

        post.addComentario(c1);
        post.addComentario(c2);

        System.out.println(post);
    }
}
