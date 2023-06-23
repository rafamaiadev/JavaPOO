package app;

public class ProjetoLivro {
    public static void main(String[] args) {
        Pessoa[] pessoas = new Pessoa[2];
        Livro[] livros = new Livro[3];

        pessoas[0] = new Pessoa("Raphael", 26, "Masculino");
        pessoas[1] = new Pessoa("Gabriel", 22, "Masculino");

        livros[0] = new Livro("CleanCode", "UncleBob", 300, pessoas[0]);
        livros[1] = new Livro("CleanArchitecture", "Robert", 400, pessoas[1]);
        livros[2] = new Livro("Algoritmos", "Loiane Groner", 600, pessoas[0]);

        livros[0].folhear(200);
        livros[0].avancarPag();
        System.out.println(livros[0].detalhes());

        System.out.println(livros[1].detalhes());
    }
}
