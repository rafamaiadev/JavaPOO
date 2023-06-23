package app;

public class Principal {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Raphael", 26, "Masculino", 2301, "ADS");

        Professor prof1 = new Professor("Sombra", 40, "Masculino", "Algoritmos", 8500);

        Funcionario func = new Funcionario("Carlos", 30, "Masculino", "Marketing", true);

        Visitante v1 = new Visitante("Chico", 25, "Masculino");

        Bolsista b1 = new Bolsista("Antonio", 22, "Masculino", 2032, "SI", 400);

        System.out.println(v1.toString());

        System.out.println(a1.toString());

        System.out.println(b1.toString());
        b1.renovarBolsa();
        b1.pagarMensalidade();
    }
}
