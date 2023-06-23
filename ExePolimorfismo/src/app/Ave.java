package app;

public class Ave extends Animal {
    private String corPena;

    public void fazerNinho() {

    }

    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Frutas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Assobio");
    }
}
