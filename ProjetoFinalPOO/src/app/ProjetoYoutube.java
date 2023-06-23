package app;

import java.util.Scanner;

public class ProjetoYoutube {
    public static void main(String[] args) {
        Video video[] = new Video[3];
        video[0] = new Video("Aula de 1 POO");
        video[1] = new Video("Aula 12 de POO");
        video[2] = new Video("Aula 14 de POO");

        Telespectador telespectador[] = new Telespectador[2];
        telespectador[0] = new Telespectador("Raphael", 26, "Masculino", "rafa");
        telespectador[1] = new Telespectador("Gabriel", 22, "Masculino", "gab");

        Visualizacao v = new Visualizacao(telespectador[0], video[0]);
        v.avaliar(8);
        System.out.println(v.toString());

    }
}
