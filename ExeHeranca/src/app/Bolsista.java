package app;

public class Bolsista extends Aluno {
    private int bolsa;

    public void renovarBolsa() {
        this.getBolsa();
        System.out.println("A bolsa é de " + this.getBolsa());
    }

    @Override
    public void pagarMensalidade() {
        System.out.println("Pagando a mensalidade de um bolsista");
    }

    public Bolsista(String nome, int idade, String sexo, int matric, String curso, int bolsa) {
        super(nome, idade, sexo, matric, curso);
        this.bolsa = bolsa;
    }

    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }
}
