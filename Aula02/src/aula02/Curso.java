package aula02;

public class Curso {
    int numAulas;
    int duracao;
    String conteudo;
    String professor;
    boolean pausado;

    void pausar() {
        this.pausado = true;
    }

    void rodar() {
        this.pausado = false;
    }

    void status() {
        System.out.println("Numero de aulas: " + this.numAulas);
        System.out.println("Duracao: " + this.duracao);
        System.out.println("Conteudo: " + this.conteudo);
        System.out.println("Professor: " + this.professor);
        System.out.println("Está pausado? " + this.pausado);
    }

}
