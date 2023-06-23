package aula02;

public class Aula02extra {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.numAulas = 10;
        curso1.conteudo = "POO";
        curso1.professor = "Guanabara";
        curso1.duracao = 50;

        curso1.pausar();
        curso1.status();

    }
}
