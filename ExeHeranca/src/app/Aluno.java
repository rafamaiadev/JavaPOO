package app;

public class Aluno extends Pessoa {
    private int matric;
    private String curso;

    public Aluno(String nome, int idade, String sexo, int matric, String curso) {
        super(nome, idade, sexo);
        this.matric = matric;
        this.curso = curso;
    }

    public int getMatric() {
        return matric;
    }

    public void setMatric(int matric) {
        this.matric = matric;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    public void cancelarMatric() {
        System.out.println("Matrícula cancelada");
    }
    public void pagarMensalidade() {
        System.out.println("Pagando a mensalidade de um aluno");
    }
}
