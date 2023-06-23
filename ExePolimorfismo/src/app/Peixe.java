package app;

public class Peixe extends Animal{
    private String corEscama;
    public void soltarBolha() {
        System.out.println("Soltando bolha");
    }

    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Microorganismos");
    }

    @Override
    public void emitirSom() {
        System.out.println("Não emite som");
    }
}
